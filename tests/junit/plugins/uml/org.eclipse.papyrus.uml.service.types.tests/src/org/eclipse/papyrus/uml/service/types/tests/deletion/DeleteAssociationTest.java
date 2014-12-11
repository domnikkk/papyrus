/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.uml.service.types.tests.deletion;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author Camille Letavernier
 *
 */
public class DeleteAssociationTest {

	@ClassRule
	public static final HouseKeeper.Static staticHouseKeeper = new HouseKeeper.Static();

	@Rule
	public HouseKeeper houseKeeper = new HouseKeeper();

	private static IProject createProject;

	private static IFile copyPapyrusModel;

	private Model rootModel;

	private Resource resource;

	private TransactionalEditingDomain domain;

	private Association association;

	private Property end1, end2;

	private IMultiDiagramEditor papyrusEditor;

	@BeforeClass
	public static void initProject() {
		// create Project
		createProject = staticHouseKeeper.createProject("AssociationTestModel");

		// create UML resource
		// import test model
		staticHouseKeeper.createFile(createProject, "AssociationTestModel.uml", "/resource/AssociationTestModel.uml");
		staticHouseKeeper.createFile(createProject, "AssociationTestModel.notation", "/resource/AssociationTestModel.notation");
		copyPapyrusModel = staticHouseKeeper.createFile(createProject, "AssociationTestModel.di", "/resource/AssociationTestModel.di");
	}

	@Before
	public void openModel() throws Exception {
		papyrusEditor = houseKeeper.openPapyrusEditor(copyPapyrusModel);
		ModelSet modelSet = ServiceUtils.getInstance().getModelSet(papyrusEditor.getServicesRegistry());
		resource = ((UmlModel) modelSet.getModel(UmlModel.MODEL_ID)).getResource();

		rootModel = (Model) resource.getContents().get(0);

		domain = ServiceUtils.getInstance().getTransactionalEditingDomain(papyrusEditor.getServicesRegistry());

		association = (Association) rootModel.getPackagedElement("TestAssociation");

		end1 = association.getMemberEnds().get(0);
		end2 = association.getMemberEnds().get(1);
	}

	@Test
	public void deleteAssociation() {
		deleteAndTest(association);
	}

	@Test
	public void deleteAssociationTarget() {
		Classifier source = (Classifier) rootModel.getPackagedElement("Class2"); // Delete class2, which doesn't own any member end
		deleteAndTest(source);
	}

	// Deletes the element, and verify that the Association and its properties have been removed from model. Also test Undo/Redo
	protected void deleteAndTest(EObject elementToDelete) {

		assertInitialState();

		IElementEditService elementEditService = ElementEditServiceUtils.getCommandProvider(elementToDelete);
		ICommand command = elementEditService.getEditCommand(new DestroyElementRequest(elementToDelete, false));

		Command emfCommand = new GMFtoEMFCommandWrapper(command);
		domain.getCommandStack().execute(emfCommand);

		assertFinalState();

		domain.getCommandStack().undo();

		assertInitialState();

		domain.getCommandStack().redo();

		assertFinalState();
	}

	protected void assertInitialState() {
		Assert.assertEquals(resource, association.eResource());
		Assert.assertEquals(resource, end1.eResource());
		Assert.assertEquals(resource, end2.eResource());

		Assert.assertEquals(association.getMemberEnds().get(0), end1);
		Assert.assertEquals(association.getMemberEnds().get(1), end2);

		Assert.assertEquals(association, end1.eContainer());
		Assert.assertEquals("Class1", ((Classifier) end2.eContainer()).getName());
	}

	protected void assertFinalState() {
		Assert.assertNull(association.eResource());
		Assert.assertNull(end1.eResource());
		Assert.assertNull(end2.eResource());
	}
}
