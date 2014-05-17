/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 434993
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.service.types.tests.creation;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.ModelUtils;
import org.eclipse.papyrus.infra.core.resource.NotFoundException;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.junit.utils.PapyrusProjectUtils;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper;
import org.eclipse.papyrus.junit.utils.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.uml.service.types.element.UMLElementTypes;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;

/**
 * Test creation of UML elements (Creation / Undo / redo)
 */
public class CreateElementTest extends AbstractPapyrusTest {

	@ClassRule
	public static final HouseKeeper.Static houseKeeper = new HouseKeeper.Static();
	
	private static IProject createProject;

	private static IFile copyPapyrusModel;

	private static IMultiDiagramEditor openPapyrusEditor;

	private static ModelSet modelset;

	private static UmlModel umlIModel;

	private static Model rootModel;

	private static Activity testActivity;

	private static TransactionalEditingDomain transactionalEditingDomain;

	private static Class testClass;

	private static Activity testActivityWithNode;

	/**
	 * Init test class
	 */
	@BeforeClass
	public static void initCreateElementTest() {

		// create Project
		createProject = houseKeeper.createProject("UMLServiceTypesTest");

		// import test model
		try {
			copyPapyrusModel = PapyrusProjectUtils.copyPapyrusModel(createProject, Platform.getBundle("org.eclipse.papyrus.uml.service.types"), "/resource/", "TestModel");
		} catch (CoreException e) {
			fail(e.getMessage());
		} catch (IOException e) {
			fail(e.getMessage());
		}

		// open project
		openPapyrusEditor = houseKeeper.openPapyrusEditor(copyPapyrusModel);

		transactionalEditingDomain = (TransactionalEditingDomain)openPapyrusEditor.getAdapter(TransactionalEditingDomain.class);
		assertTrue("Impossible to init editing domain", transactionalEditingDomain instanceof TransactionalEditingDomain);

		// retrieve UML model from this editor
		try {
			modelset = ModelUtils.getModelSetChecked(openPapyrusEditor.getServicesRegistry());
			umlIModel = UmlUtils.getUmlModel(modelset);
			rootModel = (Model)umlIModel.lookupRoot();
		} catch (ServiceException e) {
			fail(e.getMessage());
		} catch (NotFoundException e) {
			fail(e.getMessage());
		} catch (ClassCastException e) {
			fail(e.getMessage());
		}
		try {
			initExistingElements();
		} catch (Exception e) {
			fail(e.getMessage());
		}

	}

	/**
	 * Init fields corresponding to element in the test model
	 */
	private static void initExistingElements() throws Exception {
		// existing test activity
		testActivity = (Activity)rootModel.getOwnedMember("TestActivity");
		testClass = (Class)rootModel.getOwnedMember("TestClass");
		testActivityWithNode = (Activity)rootModel.getOwnedMember("TestActivityWithNode");
	}



	@Test
	public void testCreateClassInModel() throws Exception {
		runCreationTest(rootModel, UMLElementTypes.CLASS, true);
	}

	@Test
	public void testCreateModelInClass() throws Exception {
		// runs a test to see if unexecutable commands are really unexecutable
		runCreationTest(testClass, UMLElementTypes.MODEL, false);
	}

	@Test
	public void testCreateCentralBufferNodeInActivity() throws Exception {
		int initialNumberOfNodes = 0;
		Assert.assertTrue("Editor should not be dirty before test", !openPapyrusEditor.isDirty());
		Command command = getCreateChildCommand(testActivity, UMLElementTypes.CENTRAL_BUFFER_NODE, true);
		Assert.assertEquals("Wrong number of nodes before creation", initialNumberOfNodes, testActivity.getNodes().size());

		transactionalEditingDomain.getCommandStack().execute(command);
		Assert.assertEquals("Wrong number of nodes after creation", initialNumberOfNodes + 1, testActivity.getNodes().size());
		Assert.assertEquals("Wrong number of owned nodes after creation", initialNumberOfNodes + 1, testActivity.getOwnedNodes().size());

		transactionalEditingDomain.getCommandStack().undo();
		Assert.assertTrue("Editor should not be dirty after undo", !openPapyrusEditor.isDirty());
		Assert.assertEquals("Wrong number of owned nodes after undo", initialNumberOfNodes, testActivity.getOwnedNodes().size());
		Assert.assertEquals("Wrong number of nodes after undo", initialNumberOfNodes, testActivity.getNodes().size());

		transactionalEditingDomain.getCommandStack().redo();
		Assert.assertEquals("Wrong number of nodes after redo", initialNumberOfNodes + 1, testActivity.getNodes().size());

		transactionalEditingDomain.getCommandStack().undo();
		Assert.assertEquals("Wrong number of nodes after 2nd undo", initialNumberOfNodes, testActivity.getNodes().size());

		// assert editor is not dirty
		Assert.assertTrue("Editor should not be dirty after undo", !openPapyrusEditor.isDirty());
	}

	@Test
	public void testCreateCentralBufferNodeInActivityWithNode() throws Exception {
		int initialNumberOfNodes = 1;
		Assert.assertTrue("Editor should not be dirty before test", !openPapyrusEditor.isDirty());
		Command command = getCreateChildCommand(testActivityWithNode, UMLElementTypes.CENTRAL_BUFFER_NODE, true);
		Assert.assertEquals("Wrong number of nodes before creation", initialNumberOfNodes, testActivityWithNode.getNodes().size());

		transactionalEditingDomain.getCommandStack().execute(command);
		Assert.assertEquals("Wrong number of nodes after creation", initialNumberOfNodes + 1, testActivityWithNode.getNodes().size());
		Assert.assertEquals("Wrong number of owned nodes after creation", initialNumberOfNodes + 1, testActivityWithNode.getOwnedNodes().size());

		transactionalEditingDomain.getCommandStack().undo();
		Assert.assertTrue("Editor should not be dirty after undo", !openPapyrusEditor.isDirty());
		Assert.assertEquals("Wrong number of owned nodes after undo", initialNumberOfNodes, testActivityWithNode.getOwnedNodes().size());
		Assert.assertEquals("Wrong number of nodes after undo", initialNumberOfNodes, testActivityWithNode.getNodes().size());

		transactionalEditingDomain.getCommandStack().redo();
		Assert.assertEquals("Wrong number of nodes after redo", initialNumberOfNodes + 1, testActivityWithNode.getNodes().size());

		transactionalEditingDomain.getCommandStack().undo();
		Assert.assertEquals("Wrong number of nodes after 2nd undo", initialNumberOfNodes, testActivityWithNode.getNodes().size());

		// assert editor is not dirty
		Assert.assertTrue("Editor should not be dirty after undo", !openPapyrusEditor.isDirty());
	}

	protected void runCreationTest(EObject owner, IHintedType hintedType, boolean canCreate) throws Exception {
		Assert.assertTrue("Editor should not be dirty before test", !openPapyrusEditor.isDirty());
		Command command = getCreateChildCommand(owner, hintedType, canCreate);

		// command has been tested when created. Runs the test if it is possible
		if(canCreate) {
			transactionalEditingDomain.getCommandStack().execute(command);
			transactionalEditingDomain.getCommandStack().undo();
			Assert.assertTrue("Editor should not be dirty after undo", !openPapyrusEditor.isDirty());
			transactionalEditingDomain.getCommandStack().redo();
			transactionalEditingDomain.getCommandStack().undo();
			// assert editor is not dirty
			Assert.assertTrue("Editor should not be dirty after undo", !openPapyrusEditor.isDirty());
		}

	}

	/**
	 * Creates the element in the given owner element, undo and redo the action
	 *
	 * @param owner
	 *        owner of the new element
	 * @param hintedType
	 *        type of the new element
	 * @param canCreate
	 *        <code>true</code> if new element can be created in the specified owner
	 */
	protected Command getCreateChildCommand(EObject owner, IHintedType hintedType, boolean canCreate) throws Exception {
		IElementEditService elementEditService = ElementEditServiceUtils.getCommandProvider(owner);
		ICommand command = elementEditService.getEditCommand(new CreateElementRequest(owner, hintedType));
		assertTrue("Command should be a CreationCommand", command instanceof CreateElementCommand);
		// test if the command is enable and compare with the canCreate parameter
		boolean canExecute = command.canExecute();
		if(canExecute) {
			// executable but was expected as not executable
			if(!canCreate) {
				fail("Creation command is executable but it was expected as not executable");
			} else {
				// command is executable, and it was expected to => run the creation
				Command emfCommand = new org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper(command);
				return emfCommand;
			}
		} else {
			if(canCreate) {
				fail("Creation command is not executable but it was expected to be executable");
			}
		}
		return null;
	}

}
