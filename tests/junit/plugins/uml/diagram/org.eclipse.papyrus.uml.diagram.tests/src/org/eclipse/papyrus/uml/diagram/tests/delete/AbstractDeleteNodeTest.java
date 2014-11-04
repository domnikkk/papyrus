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
 *  Christian W. Damus (CEA) - bug 431618
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.tests.delete;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ResizableCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.IMaskManagedLabelEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editparts.NamedElementEditPart;
import org.eclipse.papyrus.uml.diagram.common.editparts.UMLCompartmentEditPart;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.uml2.uml.Element;
import org.junit.Assert;
import org.junit.Before;

/**
 * Abstract class to test nodes
 */
public abstract class AbstractDeleteNodeTest extends org.eclipse.papyrus.uml.diagram.tests.canonical.AbstractPapyrusTestCase {

	/** <code>true</code> if semantic tests should be run on graphical manipulation */
	private boolean testSemantic;

	/** command computed on the ui thread */
	protected Command command;

	/**
	 * @see org.eclipse.papyrus.diagram.clazz.test.canonical.AbstractPapyrusTestCase#setUp()
	 *
	 * @throws Exception
	 */
	@Before
	@Override
	public void setUp() throws Exception {
		super.setUp();
		testSemantic = isSemanticTest();
	}

	/**
	 * Returns <code>true</code> if semantic tests should be also performed
	 *
	 * @return <code>true</code> if semantic tests should be also performed
	 */
	protected boolean isSemanticTest() {
		return false;
	}

	/**
	 * @see org.eclipse.papyrus.diagram.clazz.test.canonical.AbstractPapyrusTestCase#getRootView()
	 *
	 * @return
	 */
	@Override
	protected abstract View getRootView();

	public abstract DiagramUpdater getDiagramUpdater();

	/**
	 * Returns the container edit part
	 */
	protected abstract IGraphicalEditPart getContainerEditPart();



	/**
	 * Test to manage child node.
	 *
	 * @param type
	 *        the type
	 * @param containerType
	 *        the container type
	 */
	public void testToDeleteNode(IElementType type, EClass eClass, IElementType containerType, boolean containerMove, String initialName,int  numberSemanticChildreen) {
		// create a node
		testToCreateANode(type, 0, 0, 1, 1, false, initialName, numberSemanticChildreen);
		// destroy the first element
		testDestroy(type, 2, 2, 1, 1);
		
	}

	/**
	 * Test to manage child node.
	 *
	 * @param type
	 *        the type
	 * @param containerType
	 *        the container type
	 */
	public void testToDeleteNode(IElementType type, EClass eClass, IElementType containerType, boolean containerMove, int numberSemanticChildreen) {
		testToDeleteNode(type, eClass, containerType, containerMove, null, numberSemanticChildreen);
	}

	/**
	 * Test to manage child node.
	 *
	 * @param type
	 *        the type
	 * @param containerType
	 *        the container type
	 */
	public void testToDeleteNode(IElementType type, EClass eClass, IElementType containerType, boolean containerMove) {
		testToDeleteNode(type, eClass, containerType, containerMove, null, 0);
	}

	/**
	 * Test destroy.
	 *
	 * @param type
	 *        the type
	 */
	public void testDestroy(IElementType type) {
		testDestroy(type, 1, 1, 1, 1);
	}

	/**
	 * Test destroy.
	 *
	 * @param type
	 *        the type
	 */
	public void testDestroy(IElementType type, int expectedGraphicalChildren, int expectedSemanticChildren, int removedGraphicalChildren, int removedSemanticChildren) {
		// DESTROY SEMANTIC + VIEW
		assertEquals(DESTROY_DELETION + INITIALIZATION_TEST, expectedGraphicalChildren, getRootView().getChildren().size());
		if(testSemantic) {
			assertEquals(DESTROY_DELETION + INITIALIZATION_TEST, expectedSemanticChildren, getRootSemanticModel().getOwnedElements().size());
		}
		Request deleteViewRequest = new EditCommandRequestWrapper(new DestroyElementRequest(false));
		EditPart currentEditPart= ((GraphicalEditPart)getContainerEditPart().getChildren().get(getContainerEditPart().getChildren().size()-1));
		Command command = currentEditPart.getCommand(deleteViewRequest);
		assertNotNull(DESTROY_DELETION + COMMAND_NULL, command);
		assertTrue(DESTROY_DELETION + TEST_IF_THE_COMMAND_IS_CREATED, command != UnexecutableCommand.INSTANCE);
		assertTrue(DESTROY_DELETION + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute());
		testEnableForDeleteFromModel();
		executeOnUIThread(command);
		assertEquals(DESTROY_DELETION + TEST_THE_EXECUTION, expectedGraphicalChildren - removedGraphicalChildren,getRootView().getChildren().size());
		if(testSemantic) {
			assertEquals(DESTROY_DELETION + INITIALIZATION_TEST, expectedSemanticChildren - removedSemanticChildren, getRootSemanticModel().getOwnedElements().size());
		}
		undoOnUIThread();
		assertEquals(DESTROY_DELETION + TEST_THE_UNDO, expectedGraphicalChildren,getRootView().getChildren().size());
		if(testSemantic) {
			assertEquals(DESTROY_DELETION + TEST_THE_UNDO, expectedSemanticChildren, getRootSemanticModel().getOwnedElements().size());
		}
		redoOnUIThread();
		assertEquals(DESTROY_DELETION + TEST_THE_REDO, expectedGraphicalChildren - removedGraphicalChildren,getRootView().getChildren().size());
		if(testSemantic) {
			assertEquals(DESTROY_DELETION + TEST_THE_REDO, expectedSemanticChildren - removedSemanticChildren, getRootSemanticModel().getOwnedElements().size());
		}
	}

	/**
	 * test id the handler delete from model is enable
	 */
	protected void testEnableForDeleteFromModel() {
		ICommandService commandService = (ICommandService)PlatformUI.getWorkbench().getService(ICommandService.class);
		org.eclipse.core.commands.Command cmd = commandService.getCommand("org.eclipse.ui.edit.delete"); //$NON-NLS-1$
		IHandler handler = cmd.getHandler();
		if(handler instanceof AbstractHandler) {
			((AbstractHandler)handler).setEnabled("org.eclipse.ui.edit.delete"); //$NON-NLS-1$
		}
		boolean res = handler.isEnabled();
		assertTrue("Delete from model handler must be enable",res); //$NON-NLS-1$
	}


	/**
	 * Test to create a node.
	 *
	 * @param type
	 *        the type
	 */
	public void testToCreateANode(IElementType type, int expectedGraphicalChildren, int expectedSemanticChildren, int addedGraphicalChildren, int addedSemanticChildren, boolean maskmanaged, String initialName, int numberSemanticChildreen) {
		command = null;
		//CREATION
		assertEquals(CREATION + INITIALIZATION_TEST, expectedGraphicalChildren, getRootView().getChildren().size());
		Element root = getRootSemanticModel();
		List<Element> ownedElements = root.getOwnedElements();
		if( isSemanticTest()){
			assertEquals(CREATION + INITIALIZATION_TEST, expectedSemanticChildren, ownedElements.size());
		}
		final CreateViewRequest requestcreation = CreateViewRequestFactory.getCreateShapeRequest(type, getContainerEditPart().getDiagramPreferencesHint());
		Display.getDefault().syncExec(new Runnable() {

			public void run() {
				command = getContainerEditPart().getCommand(requestcreation);
			}
		});
		assertNotNull(CREATION + COMMAND_NULL, command);
		assertTrue(CREATION + TEST_IF_THE_COMMAND_IS_CREATED, command != UnexecutableCommand.INSTANCE);
		assertTrue("CREATION: " + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute()); //$NON-NLS-1$
		// execute the creation
		executeOnUIThread(command);
		assertEquals(CREATION + TEST_THE_EXECUTION, expectedGraphicalChildren + addedGraphicalChildren, getRootView().getChildren().size());
		if(addedGraphicalChildren>=1){
			Assert.assertTrue("Node must be  org.eclipse.gmf.runtime.notation.Shape",getRootView().getChildren().get(expectedGraphicalChildren + addedGraphicalChildren-1) instanceof Shape); //$NON-NLS-1$
		}

		if(testSemantic) {
			assertEquals(CREATION + TEST_THE_EXECUTION, expectedSemanticChildren + addedSemanticChildren, getRootSemanticModel().getOwnedElements().size());
		}
		// undo the creation
		undoOnUIThread();
		assertEquals(CREATION + TEST_THE_UNDO, expectedGraphicalChildren, getRootView().getChildren().size());
		if(testSemantic) {
			assertEquals(CREATION + TEST_THE_UNDO, expectedSemanticChildren, getRootSemanticModel().getOwnedElements().size());
		}
		// redo the creation test
		redoOnUIThread();
		assertEquals(CREATION + TEST_THE_REDO, expectedGraphicalChildren + addedGraphicalChildren, getRootView().getChildren().size());
		if(testSemantic) {
			assertEquals(CREATION + TEST_THE_REDO, expectedSemanticChildren + addedSemanticChildren, getRootSemanticModel().getOwnedElements().size());
		}

		EditPart createdEditPart= (EditPart)getContainerEditPart().getChildren().get((getContainerEditPart().getChildren().size()-1));
		Assert.assertNotNull("The editpart must be created", createdEditPart); //$NON-NLS-1$
		testNodeEditPart(maskmanaged, createdEditPart, initialName);


		// test diagram updater
		if(getDiagramUpdater()!=null){
			Assert.assertNotEquals("Diagram updater must detect that children has been created",0,getDiagramUpdater().getSemanticChildren(getRootView()).size()); //$NON-NLS-1$
			Assert.assertEquals("Diagram updater must detect that no link has been created",0,getDiagramUpdater().getContainedLinks(getRootView()).size()); //$NON-NLS-1$
			Assert.assertEquals ("Diagram updater must detect that no link are incoming",0,getDiagramUpdater().getIncomingLinks((View)getRootView().getChildren().get(expectedGraphicalChildren + addedGraphicalChildren-1)).size()); //$NON-NLS-1$
			Assert.assertEquals ("Diagram updater must detect that no link are outgoing",0,getDiagramUpdater().getOutgoingLinks((View)getRootView().getChildren().get(expectedGraphicalChildren + addedGraphicalChildren-1)).size()); //$NON-NLS-1$
			Assert.assertEquals ("Diagram updater must detect that no children has ben created in the new element",numberSemanticChildreen,getDiagramUpdater().getSemanticChildren((View)getRootView().getChildren().get(expectedGraphicalChildren + addedGraphicalChildren-1)).size()); //$NON-NLS-1$
			Assert.assertEquals ("Diagram updater must detect that no link has been created in the new element",0,getDiagramUpdater().getContainedLinks((View)getRootView().getChildren().get(expectedGraphicalChildren + addedGraphicalChildren-1)).size()); //$NON-NLS-1$
		}
		createdEditPart.getChildren();
		for(Iterator<?> iteratorEditPart = createdEditPart.getChildren().iterator(); iteratorEditPart.hasNext();) {
			Object subEditPart = iteratorEditPart.next();
			if( subEditPart instanceof UMLCompartmentEditPart){
				Assert.assertEquals("Diagram updater must detect that children has been created",0,getDiagramUpdater().getSemanticChildren(((CompartmentEditPart)subEditPart).getNotationView()).size()); //$NON-NLS-1$
			}

		}
	}

	/**
	 * this method is used to test the created editpart
	 * @param maskmanaged
	 * @param createdEditPart
	 */
	protected void testNodeEditPart(boolean maskmanaged, EditPart createdEditPart,String initialName) {
		if( maskmanaged){
			Assert.assertNotNull("the created editpolicy must have as MASK_MANAGED_LABEL_EDIT_POLICY", createdEditPart.getEditPolicy(IMaskManagedLabelEditPolicy.MASK_MANAGED_LABEL_EDIT_POLICY)); //$NON-NLS-1$
		}
		int index=0;
		while(index < createdEditPart.getChildren().size()) {
			if((createdEditPart.getChildren().get(index)) instanceof ResizableCompartmentEditPart ) {
				ResizableCompartmentEditPart compartment = (ResizableCompartmentEditPart)(createdEditPart.getChildren().get(index));
				Assert.assertFalse("compartment must not be selectable",compartment.isSelectable()); //$NON-NLS-1$
			}
			index++;
		}
		testNameLabel(createdEditPart, initialName);
	}

	protected void testNameLabel(EditPart createdEditPart, String initialName) {
		if( createdEditPart instanceof NamedElementEditPart){
			GraphicalEditPart namedEditPart=(GraphicalEditPart)((NamedElementEditPart)createdEditPart).getPrimaryChildEditPart();
			Assert.assertTrue("the primary editpart must be the namelabelEditpart",namedEditPart instanceof ITextAwareEditPart); //$NON-NLS-1$
			String name=namedEditPart.resolveSemanticElement().eClass().getName();
			if( initialName!=null){
				name=initialName;
			}
			if(name.length()<((ITextAwareEditPart)namedEditPart).getEditText().length()){
				Assert.assertEquals(" the name must contain the name of the metaclass",name, ((ITextAwareEditPart)namedEditPart).getEditText().substring(0,name.length())); //$NON-NLS-1$
			}
			else{
				//not the same it sure but display the mistake is important
				Assert.assertEquals(" the name must contain the name of the metaclass",name, ((ITextAwareEditPart)namedEditPart).getEditText()); //$NON-NLS-1$
			}
			if(namedEditPart instanceof CompartmentEditPart ){
				Assert.assertTrue("the primary editpart must be the namelabelEditpart",namedEditPart instanceof CompartmentEditPart); //$NON-NLS-1$
				Assert.assertTrue("namelabelEditpart must be editable",((CompartmentEditPart)namedEditPart).isEditModeEnabled());} //$NON-NLS-1$
			else{
				Assert.assertTrue("the primary editpart must be the namelabelEditpart",namedEditPart instanceof LabelEditPart); //$NON-NLS-1$

			}
		}
	}

}
