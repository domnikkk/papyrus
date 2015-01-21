/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.tests.qvt;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersFactory;
import org.eclipse.papyrus.migration.rsa.transformation.ImportTransformation;
import org.eclipse.papyrus.migration.rsa.transformation.ImportTransformationLauncher;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.uml2.uml.Package;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;

public class AbstractTransformationTest extends AbstractPapyrusTest {

	@Rule
	public final HouseKeeper houseKeeper = new HouseKeeper();

	public IProject project;

	public IFile mainModelFile;

	public IFile[] mainModelFiles;

	public Package rootPackage;

	public IMultiDiagramEditor editor;

	@Before
	public void createProject() {
		project = houseKeeper.createProject("org.eclipse.papyrus.migration.rsa.test.project");
	}

	protected void simpleImport(String modelToImportPath, String[] additionalResourcesPath, boolean useBatchLauncher) throws Exception {
		// Import the main model file
		mainModelFile = houseKeeper.createFile(project, modelToImportPath, modelToImportPath);

		// Import the fragments

		for (String path : additionalResourcesPath) {
			houseKeeper.createFile(project, path, path);
		}

		URI sourceURI = URI.createPlatformResourceURI(mainModelFile.getFullPath().toString(), true);

		if (useBatchLauncher) {
			Config config = RSAToPapyrusParametersFactory.eINSTANCE.createConfig();
			config.setAlwaysAcceptSuggestedMappings(true);

			ImportTransformationLauncher launcher = new ImportTransformationLauncher(config);
			launcher.run(Collections.singletonList(sourceURI));

			launcher.waitForCompletion();

			Assert.assertTrue("The transformation didn't complete normally", launcher.getResult().isOK());
		} else {
			ImportTransformation transformation = new ImportTransformation(sourceURI);
			transformation.run(false);
			transformation.waitForCompletion();

			Assert.assertTrue("The transformation didn't complete normally", transformation.getStatus().isOK());
		}

	}

	protected void simpleImport(String modelToImportPath, String[] additionalResourcesPath) throws Exception {
		simpleImport(modelToImportPath, additionalResourcesPath, false);
	}

	protected void openEditor() throws Exception {
		editor = houseKeeper.openPapyrusEditor(mainModelFile);
		ModelSet modelSet = ServiceUtils.getInstance().getModelSet(editor.getServicesRegistry());

		UmlModel umlModel = (UmlModel) modelSet.getModel(UmlModel.MODEL_ID);
		rootPackage = (Package) umlModel.getResource().getContents().get(0);
	}

	protected void batchImport(String[] modelsToImportPath, String[] additionalResourcesPath) throws Exception {

		mainModelFiles = new IFile[modelsToImportPath.length];
		List<URI> urisToImport = new LinkedList<URI>();

		int i = 0;
		for (String mainModelPath : modelsToImportPath) {
			mainModelFiles[i] = houseKeeper.createFile(project, mainModelPath, mainModelPath);
			URI uri = URI.createPlatformResourceURI(mainModelFiles[i].getFullPath().toString(), true);

			urisToImport.add(uri);

			i++;
		}

		for (String path : additionalResourcesPath) {
			houseKeeper.createFile(project, path, path);
		}

		mainModelFile = mainModelFiles[0];

		Config config = RSAToPapyrusParametersFactory.eINSTANCE.createConfig();
		config.setMaxThreads(4);
		config.setAlwaysAcceptSuggestedMappings(true);
		ImportTransformationLauncher launcher = new ImportTransformationLauncher(config);
		launcher.run(urisToImport);

		launcher.waitForCompletion();

		Assert.assertTrue("The transformation didn't complete normally", launcher.getResult().isOK());
	}

	protected void assertRSAModelsRemoved(boolean resolveAll) {
		EcoreUtil.resolveAll(rootPackage);

		// General test: After resolving everything, we should only have Papyrus resources in the scope
		for (Resource resource : rootPackage.eResource().getResourceSet().getResources()) {
			String fileExtension = resource.getURI().fileExtension();
			Assert.assertNotEquals("RSA resources should not be referenced anymore", "emx", fileExtension);
			Assert.assertNotEquals("RSA resources should not be referenced anymore", "efx", fileExtension);
			Assert.assertNotEquals("RSA Profiles should not be reference anymore", "epx", fileExtension);
		}
	}
}
