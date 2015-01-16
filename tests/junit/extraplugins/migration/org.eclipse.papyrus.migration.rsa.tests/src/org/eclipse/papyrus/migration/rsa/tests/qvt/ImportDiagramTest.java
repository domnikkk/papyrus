/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Thibault Le Ouay (Sherpa Engineering) t.leouay@sherpa-eng.com - Initial API and implementation
 * 	Camille Letavernier (CEA LIST) camille.letavernier@cea.fr
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.tests.qvt;

import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.commands.OpenDiagramCommand;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.resource.ModelMultiException;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.ModelsReader;
import org.eclipse.papyrus.infra.core.services.ExtensionServicesRegistry;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationUtils;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.junit.utils.EditorUtils;
import org.eclipse.papyrus.junit.utils.FilesUtils;
import org.eclipse.papyrus.junit.utils.ProjectUtils;
import org.eclipse.papyrus.migration.rsa.tests.Activator;
import org.eclipse.papyrus.migration.rsa.transformation.ImportTransformation;
import org.eclipse.papyrus.uml.diagram.common.util.DiagramEditPartsUtil;
import org.eclipse.papyrus.uml.tools.commands.ApplyProfileCommand;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ImportDiagramTest extends AbstractPapyrusTest {

	private static IProject targetProject;

	protected static IMultiDiagramEditor editor;

	protected static URI fileDiagram, fileProfile;


	@AfterClass
	public static void dispose() throws Exception {

		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchPage page = wb.getActiveWorkbenchWindow().getActivePage();
		page.closeAllEditors(false);
		targetProject.delete(true, new NullProgressMonitor());
	}


	@BeforeClass
	public static void init() throws Exception {
		targetProject = ProjectUtils.createProject(Activator.PLUGIN_ID + ".testProject");
		URI rsaDiagramModelUri = URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/resources/ModelTestClass.emx", true);
		URI rsaProfileModelUri = URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/resources/Profile.epx", true);

		FilesUtils.copyFiles(targetProject, "ModelTestClass.emx", new URL(rsaDiagramModelUri.toString()));
		FilesUtils.copyFiles(targetProject, "Profile.epx", new URL(rsaProfileModelUri.toString()));

		fileDiagram = URI.createPlatformResourceURI(Activator.PLUGIN_ID + ".testProject" + "/ModelTestClass.emx", true);
		ImportTransformation transfoDiagram = new ImportTransformation(fileDiagram);

		fileProfile = URI.createPlatformResourceURI(Activator.PLUGIN_ID + ".testProject" + "/Profile.epx", true);
		ImportTransformation transfoProfile = new ImportTransformation(fileProfile);

		transfoDiagram.run(false);
		transfoProfile.run(false);

		transfoDiagram.waitForCompletion();
		transfoProfile.waitForCompletion();
	}



	// Test should be more generic

	@Test
	public void openModelTest() throws Exception {
		ModelSet modelSet = new ModelSet();
		ModelsReader reader = new ModelsReader();
		reader.readModel(modelSet);
		try {
			modelSet.loadModels(fileDiagram.trimFileExtension().appendFileExtension("di"));
		} catch (ModelMultiException e) {
			e.printStackTrace();
		}
		final ServicesRegistry registry = new ExtensionServicesRegistry(org.eclipse.papyrus.infra.core.Activator.PLUGIN_ID);
		try {
			registry.add(ModelSet.class, Integer.MAX_VALUE, modelSet);
			registry.startRegistry();
		} catch (ServiceException ex) {
			// Ignored: we don't need all services
		}



		TransactionalEditingDomain editingDomain = modelSet.getTransactionalEditingDomain();
		Resource umlResource = UmlUtils.getUmlResource(modelSet);

		// Profile should be applied during the transformation

		if (umlResource instanceof UMLResource) {
			EList<EObject> umlresourceContent = umlResource.getContents();
			Iterator<EObject> umlite = umlresourceContent.iterator();
			while (umlite.hasNext()) {
				Object currentobject = umlite.next();
				if (currentobject instanceof org.eclipse.uml2.uml.Package) {
					URI uri = URI.createURI(UMLResource.STANDARD_PROFILE_URI, true);
					Resource resource = modelSet.getResource(uri, true);
					Profile profile = (Profile) EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.Literals.PROFILE);
					Command command = new ApplyProfileCommand((org.eclipse.uml2.uml.Package) currentobject, profile, editingDomain);
					try {
						editingDomain.getCommandStack().execute(command);
					} catch (Exception ex) {
						ex.printStackTrace();
					}

				}
			}
		}

		final AtomicReference<Exception> exception = new AtomicReference<Exception>();
		Display.getDefault().syncExec(new Runnable() {

			public void run() {
				try {
					IFile fileToOpen = (IFile) ResourcesPlugin.getWorkspace().getRoot().findMember(fileDiagram.trimFileExtension().appendFileExtension("di").toPlatformString(true));
					editor = EditorUtils.openPapyrusEditor(fileToOpen);
				} catch (Exception ex) {
					exception.set(ex);
				}
			}
		});

		// Throw exception to get a proper JUnit report
		if (exception.get() != null) {
			throw exception.get();
		}

		Assert.assertNotNull("Cannot open the Papyrus editor", editor);

		Resource notationResource = NotationUtils.getNotationModel(editor.getServicesRegistry().getService(ModelSet.class)).getResource();
		List<EObject> listcontent = notationResource.getContents();

		// Expected is 7 valid migrated diagrams.
		// FIXME: Sequence Diagram import is currently disabled, so 6 is the new expected number
		Assert.assertEquals(6, listcontent.size()); // Expected is 7 valid migrated diagrams

		for (EObject cont : listcontent) {
			Assert.assertTrue(cont instanceof Diagram);

			Diagram currentDia = (Diagram) cont;
			editingDomain.getCommandStack().execute(new GMFtoEMFCommandWrapper(new OpenDiagramCommand(editingDomain, currentDia)));
			IEditorPart currentEditor = editor.getActiveEditor();
			Assert.assertNotNull("could not open the  diagram editor", currentEditor);
			Assert.assertTrue("The active editor should be a GMF Diagram Editor. Received " + editor.getActiveEditor().getClass().getCanonicalName(), editor.getActiveEditor() instanceof IDiagramWorkbenchPart);
			Object temp = currentEditor.getAdapter(EditPart.class);
			Assert.assertNotNull(temp);
			EditPart editPart = (EditPart) temp;
			List<IGraphicalEditPart> listEditPart = DiagramEditPartsUtil.getAllEditParts(editPart);
			for (EditPart currentEditPart : listEditPart) {
				Assert.assertNotNull("should not be invalid view", currentEditPart);
			}
		}

		try {
			registry.disposeRegistry();
		} catch (ServiceException ex) {
			// Ignore
		}
	}

	@Test
	public void openProfileTest() throws Exception {
		ModelSet modelSet = new ModelSet();
		ModelsReader reader = new ModelsReader();
		reader.readModel(modelSet);
		try {
			modelSet.loadModels(fileProfile.trimFileExtension().appendFileExtension("profile.di"));
		} catch (ModelMultiException e) {
			e.printStackTrace();
		}
		final ServicesRegistry registry = new ExtensionServicesRegistry(org.eclipse.papyrus.infra.core.Activator.PLUGIN_ID);
		try {
			registry.add(ModelSet.class, Integer.MAX_VALUE, modelSet);
			registry.startRegistry();
		} catch (ServiceException ex) {
			// Ignored: we don't need all services
		}

		TransactionalEditingDomain editingDomain = modelSet.getTransactionalEditingDomain();
		Resource umlResource = UmlUtils.getUmlResource(modelSet);

		// Profile should be applied during the transformation

		if (umlResource instanceof UMLResource) {
			EList<EObject> umlresourceContent = umlResource.getContents();
			Iterator<EObject> umlite = umlresourceContent.iterator();
			while (umlite.hasNext()) {
				Object currentobject = umlite.next();
				if (currentobject instanceof org.eclipse.uml2.uml.Package) {
					URI uri = URI.createURI(UMLResource.STANDARD_PROFILE_URI, true);
					Resource resource = modelSet.getResource(uri, true);
					Profile profile = (Profile) EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.Literals.PROFILE);
					Command command = new ApplyProfileCommand((org.eclipse.uml2.uml.Package) currentobject, profile, editingDomain);
					try {
						editingDomain.getCommandStack().execute(command);
					} catch (Exception ex) {
						ex.printStackTrace();
					}

				}
			}
		}

		Display.getDefault().syncExec(new Runnable() {

			public void run() {
				try {
					IFile fileToOpen = (IFile) ResourcesPlugin.getWorkspace().getRoot().findMember(fileProfile.trimFileExtension().appendFileExtension("profile.di").toPlatformString(true));
					editor = EditorUtils.openPapyrusEditor(fileToOpen);
				} catch (PartInitException ex) {
					Activator.log.error(ex);
					Assert.fail(ex.getMessage());
				}
			}
		});
		Assert.assertNotNull("Cannot open the Papyrus editor", editor);

		Resource notationResource = NotationUtils.getNotationModel(editor.getServicesRegistry().getService(ModelSet.class)).getResource();
		List<EObject> listcontent = notationResource.getContents();
		Assert.assertEquals(1, listcontent.size());
		for (EObject cont : listcontent) {
			Assert.assertTrue(cont instanceof Diagram);

			Diagram currentDia = (Diagram) cont;
			editingDomain.getCommandStack().execute(new GMFtoEMFCommandWrapper(new OpenDiagramCommand(editingDomain, currentDia)));
			IEditorPart currentEditor = editor.getActiveEditor();
			Assert.assertNotNull("could not open the  diagram editor", currentEditor);
			Assert.assertTrue("The active editor should be a GMF Diagram Editor", editor.getActiveEditor() instanceof IDiagramWorkbenchPart);
			Object temp = currentEditor.getAdapter(EditPart.class);
			Assert.assertNotNull(temp);
			EditPart editPart = (EditPart) temp;
			List<IGraphicalEditPart> listEditPart = DiagramEditPartsUtil.getAllEditParts(editPart);
			for (EditPart currentEditPart : listEditPart) {
				Assert.assertNotNull("should not be invalid view", currentEditPart);
			}
		}

		try {
			registry.disposeRegistry();
		} catch (ServiceException ex) {
			// Ignore
		}
	}

}
