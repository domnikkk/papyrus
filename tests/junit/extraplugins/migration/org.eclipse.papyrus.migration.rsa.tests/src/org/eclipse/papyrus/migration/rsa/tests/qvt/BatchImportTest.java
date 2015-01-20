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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.junit.framework.classification.FailingTest;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersFactory;
import org.eclipse.papyrus.migration.rsa.transformation.ImportTransformationLauncher;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Stereotype;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class BatchImportTest extends AbstractTransformationTest {

	protected void prepareTestRepairDependencies() throws Exception {

		final String prefix = "resources/dependencies/"; //$NON-NLS-1$

		mainModelFiles = new IFile[3];
		List<URI> urisToImport = new LinkedList<URI>();

		// //// Create the main project //////

		String[] sourcePath = new String[] { "Libraries.emx", "Library.emx" };//$NON-NLS-1$ //$NON-NLS-2$
		String[] sourceFragments = new String[] { "ModelFragment_1.efx", "ModelFragment_2.efx" };//$NON-NLS-1$ //$NON-NLS-2$

		int i = 0;
		for (String mainModelPath : sourcePath) {
			mainModelFiles[i] = houseKeeper.createFile(project, mainModelPath, prefix + mainModelPath);
			URI uri = URI.createPlatformResourceURI(mainModelFiles[i].getFullPath().toString(), true);

			urisToImport.add(uri);

			i++;
		}

		mainModelFile = mainModelFiles[0];

		for (String path : sourceFragments) {
			houseKeeper.createFile(project, path, prefix + path);
		}

		// //////////////////////////////////

		// ////// Create the referenced project ///////

		final String referencedProjectName = "RSA To Papyrus - Workspace Library - Test"; //$NON-NLS-1$

		IProject referencedProject = houseKeeper.createProject(referencedProjectName);
		String referencedProjectPath = prefix + "project/" + referencedProjectName + "/";//$NON-NLS-1$ //$NON-NLS-2$
		mainModelFiles[i] = houseKeeper.createFile(referencedProject, "ProjectLibrary.emx", referencedProjectPath + "ProjectLibrary.emx");//$NON-NLS-1$ //$NON-NLS-2$
		URI uri = URI.createPlatformResourceURI(mainModelFiles[i].getFullPath().toString(), true);
		urisToImport.add(uri);
		houseKeeper.createFile(referencedProject, "ModelFragment_1.efx", referencedProjectPath + "ModelFragment_1.efx");//$NON-NLS-1$ //$NON-NLS-2$

		// ////////////////////////////////////////////

		// /////// Execute the transformation ////////

		Config config = RSAToPapyrusParametersFactory.eINSTANCE.createConfig();
		config.setMaxThreads(4);
		config.setAlwaysAcceptSuggestedMappings(true);
		ImportTransformationLauncher launcher = new ImportTransformationLauncher(config);
		launcher.run(urisToImport);

		launcher.waitForCompletion();

		Assert.assertTrue("The transformation didn't complete normally", launcher.getResult().isOK());

		// ///////////////////////////////////////////
	}

	// dependencies/*
	@Test
	public void testRepairDependencies() throws Exception {
		// Don't use the superclass because we need two different projects, to test cross-project references in the workspace
		// The super class automatically creates a single project
		prepareTestRepairDependencies();

		openEditor();

		Assert.assertEquals("Libraries", rootPackage.getName());

		assertRSAModelsRemoved(true);

		URI expectedRootURI = URI.createPlatformResourceURI(project.getName() + "/Libraries.uml", true).appendFragment("_4L1kB5_bEeSMStbbPSeZNQ"); // The fragment should be unchanged
		Assert.assertEquals(expectedRootURI, EcoreUtil.getURI(rootPackage));

		Package package1 = (Package) rootPackage.getPackagedElement("Package1");
		URI expectedURI = URI.createPlatformResourceURI(project.getName() + "/ModelFragment_2.uml", true).appendFragment("_44LsoJ_bEeSMStbbPSeZNQ"); // The fragment should be unchanged
		Assert.assertEquals(expectedURI, EcoreUtil.getURI(package1));

		PackageImport projectLibraryPackageImport = rootPackage.getPackageImports().get(2);
		Package workspaceProjectPackage = projectLibraryPackageImport.getImportedPackage();

		Assert.assertEquals("ProjectLibrary", workspaceProjectPackage.getName());
	}

	// deployed/*;
	@Test
	@Ignore("Not implemented")
	public void testRepairDeployedLibrary() throws Exception {

	}

	// resources/profile+fragments/*
	@Test
	@FailingTest("The Stereotype Migration tool doesn't detect that EPX stereotypes are broken and doesn't repair them")
	public void testProfiledFragmentedModel() throws Exception {
		String path = "resources/profile+fragments/";
		String[] mainModels = new String[] {
				path + "Blank Package.emx",
				path + "TestProfile - Fragments.epx"
		};

		String[] fragments = new String[] {
				path + "ModelFragment_1.efx",
				path + "ModelFragment_2.efx"
		};

		batchImport(mainModels, fragments);
		openEditor();

		assertRSAModelsRemoved(true); // Breaks: the EPX profile is still applied

		Class class1 = (Class) rootPackage.getPackagedElement("Class1");
		Stereotype stereotype1 = class1.getAppliedStereotype("TestProfile::Stereotype1");
		Assert.assertNotNull("Class1 should be stereotyped with Stereotype1", stereotype1);
		Assert.assertEquals("uml", EcoreUtil.getURI(stereotype1.getProfile()).fileExtension());

		Package fragment2 = (Package) rootPackage.getPackagedElement("Fragment2");
		Class f2c1 = (Class) fragment2.getPackagedElement("Class1");
		Stereotype fragmentStereotype1 = f2c1.getAppliedStereotype("TestProfile::Stereotype1");
		Assert.assertNotNull("Class1 should be stereotyped with Stereotype1", fragmentStereotype1);
		Assert.assertEquals("uml", EcoreUtil.getURI(fragmentStereotype1.getProfile()).fileExtension());

		Stereotype fragmentStereotype2 = f2c1.getAppliedStereotype("TestProfile::Stereotype2");
		Assert.assertNotNull("Class1 should be stereotyped with Stereotype1", fragmentStereotype2);
		Assert.assertEquals("uml", EcoreUtil.getURI(fragmentStereotype2.getProfile()).fileExtension());
	}
}
