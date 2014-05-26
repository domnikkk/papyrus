/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.tests.canonical;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ResizableCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.IMaskManagedLabelEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editparts.NamedElementEditPart;
import org.eclipse.uml2.uml.Element;
import org.junit.Assert;

// TODO: Auto-generated Javadoc
/**
 * The Class TestChildLabel.
 */
public abstract class TestChildLabel extends org.eclipse.papyrus.diagram.tests.canonical.AbstractPapyrusTestCase {

	/** The Constant CREATION. */
	protected static final String CREATION = "CREATION:";

	/** The Constant CONTAINER_CREATION. */
	protected static final String CONTAINER_CREATION = "CONTAINER CREATION: ";

	/** The Constant DROP. */
	protected static final String DROP = "DROP: ";

	/** The Constant DESTROY_DELETION. */
	protected static final String DESTROY_DELETION = "DESTROY DELETION: ";

	/** The Constant COMMAND_NULL. */
	protected static final String COMMAND_NULL = " command null";

	/** The Constant VIEW_DELETION. */
	protected static final String VIEW_DELETION = "VIEW DELETION: ";

	/** The Constant TEST_THE_REDO. */
	protected static final String TEST_THE_REDO = "test the redo";

	/** The Constant TEST_THE_UNDO. */
	protected static final String TEST_THE_UNDO = "test the undo";

	/** The Constant TEST_THE_EXECUTION. */
	protected static final String TEST_THE_EXECUTION = "test the execution";

	/** The Constant TEST_IF_THE_COMMAND_CAN_BE_EXECUTED. */
	protected static final String TEST_IF_THE_COMMAND_CAN_BE_EXECUTED = "test if the command can be executed";

	/** The Constant TEST_IF_THE_COMMAND_IS_CREATED. */
	protected static final String TEST_IF_THE_COMMAND_IS_CREATED = "test if the command is created";

	/** The Constant INITIALIZATION_TEST. */
	protected static final String INITIALIZATION_TEST = "Intitial State";

	/** The Constant CHANGE_CONTAINER. */
	protected static final String CHANGE_CONTAINER = "CHANGE CONTAINER";

	/** The top node. */
	protected GraphicalEditPart topNode;

	public abstract DiagramUpdater getDiagramUpdater();
	
	/**
	 * Test view deletion.
	 *
	 * @param type
	 *        the type
	 * @param containerType
	 *        the container type
	 */
	public void testViewDeletion(IElementType type, int containerType) {
		ListCompartmentEditPart compartment = null;
		int index = 0;
		while(compartment == null && index < getTopEditPart().getChildren().size()) {
			if((getTopEditPart().getChildren().get(index)) instanceof ListCompartmentEditPart && (((View)((ListCompartmentEditPart)(getTopEditPart().getChildren().get(index))).getModel()).getType().equals("" + containerType))) {
				compartment = (ListCompartmentEditPart)(getTopEditPart().getChildren().get(index));
			}
			index++;
		}
		assertTrue("Container not found", compartment != null);
		//DELETION OF THE VIEW
		assertTrue(VIEW_DELETION + INITIALIZATION_TEST, compartment.getChildren().size() == 1);
		assertTrue(VIEW_DELETION + INITIALIZATION_TEST, ((Element)((View)getTopEditPart().getModel()).getElement()).getOwnedElements().size() == 1);
		Request deleteViewRequest = new GroupRequest(RequestConstants.REQ_DELETE);
		Command command = ((GraphicalEditPart)compartment.getChildren().get(0)).getCommand(deleteViewRequest);
		assertNotNull(VIEW_DELETION + COMMAND_NULL, command);
		assertTrue(VIEW_DELETION + TEST_IF_THE_COMMAND_IS_CREATED, command != UnexecutableCommand.INSTANCE);
		assertTrue(VIEW_DELETION + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute() == true);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().execute(command);
		assertTrue(VIEW_DELETION + TEST_THE_EXECUTION, compartment.getChildren().size() == 0);
		assertTrue(VIEW_DELETION + TEST_THE_EXECUTION, ((Element)((View)getTopEditPart().getModel()).getElement()).getOwnedElements().size() == 1);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().undo();
		assertTrue(VIEW_DELETION + TEST_THE_UNDO, compartment.getChildren().size() == 1);
		assertTrue(VIEW_DELETION + TEST_THE_UNDO, ((Element)((View)getTopEditPart().getModel()).getElement()).getOwnedElements().size() == 1);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().redo();
		assertTrue(VIEW_DELETION + TEST_THE_REDO, compartment.getChildren().size() == 0);
		assertTrue(VIEW_DELETION + TEST_THE_REDO, ((Element)((View)getTopEditPart().getModel()).getElement()).getOwnedElements().size() == 1);
	}

	/**
	 * Test destroy.
	 *
	 * @param type
	 *        the type
	 * @param containerType
	 *        the container type
	 */
	public void testDestroy(IElementType type, int containerType) {
		ListCompartmentEditPart compartment = null;
		int index = 0;
		while(compartment == null && index < getTopEditPart().getChildren().size()) {
			if((getTopEditPart().getChildren().get(index)) instanceof ListCompartmentEditPart && (((View)((ListCompartmentEditPart)(getTopEditPart().getChildren().get(index))).getModel()).getType().equals("" + containerType))) {
				compartment = (ListCompartmentEditPart)(getTopEditPart().getChildren().get(index));
			}
			index++;
		}
		assertTrue("Container not found", compartment != null);
		//DESTROY SEMANTIC+ VIEW
		assertTrue(DESTROY_DELETION + INITIALIZATION_TEST, compartment.getChildren().size() == 1);
		assertTrue(DESTROY_DELETION + INITIALIZATION_TEST, ((Element)((View)getTopEditPart().getModel()).getElement()).getOwnedElements().size() == 1);
		Request deleteViewRequest = new EditCommandRequestWrapper(new DestroyElementRequest(false));
		Command command = ((GraphicalEditPart)compartment.getChildren().get(0)).getCommand(deleteViewRequest);
		assertNotNull(DESTROY_DELETION + COMMAND_NULL, command);
		assertTrue(DESTROY_DELETION + TEST_IF_THE_COMMAND_IS_CREATED, command != UnexecutableCommand.INSTANCE);
		assertTrue(DESTROY_DELETION + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute() == true);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().execute(command);
		assertTrue(DESTROY_DELETION + TEST_THE_EXECUTION, compartment.getChildren().size() == 0);
		assertTrue(DESTROY_DELETION + TEST_THE_EXECUTION, ((Element)((View)getTopEditPart().getModel()).getElement()).getOwnedElements().size() == 0);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().undo();
		//assertTrue(DESTROY_DELETION +TEST_THE_UNDO,compartment.getChildren().size()==1);
		assertTrue(DESTROY_DELETION + TEST_THE_UNDO, ((Element)((View)getTopEditPart().getModel()).getElement()).getOwnedElements().size() == 1);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().redo();
		assertTrue(DESTROY_DELETION + TEST_THE_REDO, compartment.getChildren().size() == 0);
		assertTrue(DESTROY_DELETION + TEST_THE_REDO, ((Element)((View)getTopEditPart().getModel()).getElement()).getOwnedElements().size() == 0);
	}

	/**
	 * Test drop.
	 *
	 * @param type
	 *        the type
	 * @param containerType
	 *        the container type
	 */
	public void testDrop(IElementType type, int containerType) {
		ListCompartmentEditPart compartment = null;
		int index = 0;
		while(compartment == null && index < getTopEditPart().getChildren().size()) {
			if((getTopEditPart().getChildren().get(index)) instanceof ListCompartmentEditPart && (((View)((ListCompartmentEditPart)(getTopEditPart().getChildren().get(index))).getModel()).getType().equals("" + containerType))) {
				compartment = (ListCompartmentEditPart)(getTopEditPart().getChildren().get(index));
			}
			index++;
		}
		assertTrue("Container not found", compartment != null);
		//DROP
		assertTrue(DROP + INITIALIZATION_TEST, compartment.getChildren().size() == 0);
		assertTrue(DROP + INITIALIZATION_TEST, ((Element)((View)getTopEditPart().getModel()).getElement()).getOwnedElements().size() == 1);
		DropObjectsRequest dropObjectsRequest = new DropObjectsRequest();
		ArrayList<Element> list = new ArrayList<Element>();
		list.add(getRootSemanticModel().getOwnedElements().get(0));
		dropObjectsRequest.setObjects(list);
		dropObjectsRequest.setLocation(new Point(20, 20));
		Command command = compartment.getCommand(dropObjectsRequest);
		assertNotNull(DROP + COMMAND_NULL, command);
		assertTrue(DROP + TEST_IF_THE_COMMAND_IS_CREATED, command != UnexecutableCommand.INSTANCE);
		assertTrue(DROP + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute() == true);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().execute(command);
		assertTrue(DROP + TEST_THE_EXECUTION, compartment.getChildren().size() != 0);
		assertTrue(DROP + TEST_THE_EXECUTION, ((Element)((View)getTopEditPart().getModel()).getElement()).getOwnedElements().size() != 0);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().undo();
		assertTrue(DROP + TEST_THE_UNDO, compartment.getChildren().size() == 0);
		assertTrue(DROP + TEST_THE_UNDO, ((Element)((View)getTopEditPart().getModel()).getElement()).getOwnedElements().size() != 0);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().redo();
		assertTrue(DROP + TEST_THE_REDO, compartment.getChildren().size() != 0);
		assertTrue(DROP + TEST_THE_REDO, ((Element)((View)getTopEditPart().getModel()).getElement()).getOwnedElements().size() != 0);
	}

	/**
	 * Test change container.
	 *
	 * @param topNodeType
	 *        the top node type
	 * @param type
	 *        the type
	 * @param containerType
	 *        the container type
	 */
	public void testChangeContainer(IElementType topNodeType, IElementType type, int containerType) {
		ListCompartmentEditPart compartment = null;
		int index = 0;
		while(compartment == null && index < getTopEditPart().getChildren().size()) {
			if((getTopEditPart().getChildren().get(index)) instanceof ListCompartmentEditPart && (((View)((ListCompartmentEditPart)(getTopEditPart().getChildren().get(index))).getModel()).getType().equals("" + containerType))) {
				compartment = (ListCompartmentEditPart)(getTopEditPart().getChildren().get(index));
			}
			index++;
		}
		assertTrue("Container not found", compartment != null);
		//CHANGE CONTAINER
		assertTrue(CHANGE_CONTAINER + INITIALIZATION_TEST, compartment.getChildren().size() == 1);
		assertTrue(CHANGE_CONTAINER + INITIALIZATION_TEST, ((Element)((View)getTopEditPart().getModel()).getElement()).getOwnedElements().size() == 1);
		Request requestcreation = CreateViewRequestFactory.getCreateShapeRequest(topNodeType, getDiagramEditPart().getDiagramPreferencesHint());
		Command command = getDiagramEditPart().getCommand(requestcreation);
		assertNotNull(CONTAINER_CREATION + COMMAND_NULL, command);
		assertTrue(CONTAINER_CREATION + TEST_IF_THE_COMMAND_IS_CREATED, command != UnexecutableCommand.INSTANCE);
		assertTrue(CONTAINER_CREATION + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute() == true);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().execute(command);
		assertTrue(CONTAINER_CREATION + TEST_THE_EXECUTION, getRootView().getChildren().size() == 2);
		GraphicalEditPart newContainerEditPart = (GraphicalEditPart)getDiagramEditPart().getChildren().get(1);
		ChangeBoundsRequest changeBoundsRequest = new ChangeBoundsRequest(RequestConstants.REQ_ADD);
		changeBoundsRequest.setEditParts((EditPart)compartment.getChildren().get(0));
		changeBoundsRequest.setLocation(new Point(30, 30));
		ListCompartmentEditPart newCompartment = null;
		index = 0;
		while(newCompartment == null && index < newContainerEditPart.getChildren().size()) {
			if((newContainerEditPart.getChildren().get(index)) instanceof ListCompartmentEditPart && (((View)((ListCompartmentEditPart)(getTopEditPart().getChildren().get(index))).getModel()).getType().equals("" + containerType))) {
				newCompartment = (ListCompartmentEditPart)(newContainerEditPart.getChildren().get(index));
			}
			index++;
		}
		assertTrue("NewContainer not found", newCompartment != null);
		command = newCompartment.getCommand(changeBoundsRequest);
		assertNotNull(CHANGE_CONTAINER, command);
		assertTrue(CHANGE_CONTAINER + TEST_IF_THE_COMMAND_IS_CREATED, command != UnexecutableCommand.INSTANCE);
		assertTrue(CHANGE_CONTAINER + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute() == true);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().execute(command);
		assertTrue(CHANGE_CONTAINER + TEST_THE_EXECUTION, compartment.getChildren().size() == 0);
		assertTrue(CHANGE_CONTAINER + TEST_THE_EXECUTION, ((Element)((View)getTopEditPart().getModel()).getElement()).getOwnedElements().size() == 0);
		assertTrue(CHANGE_CONTAINER + TEST_THE_EXECUTION, newCompartment.getChildren().size() == 1);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().undo();
		assertTrue(CHANGE_CONTAINER + TEST_THE_UNDO, compartment.getChildren().size() == 1);
		assertTrue(CHANGE_CONTAINER + TEST_THE_UNDO, ((Element)((View)getTopEditPart().getModel()).getElement()).getOwnedElements().size() == 1);
		assertTrue(CHANGE_CONTAINER + TEST_THE_EXECUTION, newCompartment.getChildren().size() == 0);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().redo();
		assertTrue(CHANGE_CONTAINER + TEST_THE_REDO, compartment.getChildren().size() == 0);
		assertTrue(CHANGE_CONTAINER + TEST_THE_REDO, ((Element)((View)getTopEditPart().getModel()).getElement()).getOwnedElements().size() == 0);
		assertTrue(CHANGE_CONTAINER + TEST_THE_EXECUTION, newCompartment.getChildren().size() == 1);
	}

	/**
	 * Test to create a node.
	 *
	 * @param type
	 *        the type
	 * @param containerType
	 *        the container type
	 * @param maskmanaged used to test if the editpart must have a mask managed edit policy
	 */
	public void testToCreateANode(IElementType type, int containerType, boolean maskmanaged, String initialName) {
		ListCompartmentEditPart compartment = null;
		int index = 0;
		while(compartment == null && index < getTopEditPart().getChildren().size()) {
			if((getTopEditPart().getChildren().get(index)) instanceof ListCompartmentEditPart && (((View)((ListCompartmentEditPart)(getTopEditPart().getChildren().get(index))).getModel()).getType().equals("" + containerType))) {
				compartment = (ListCompartmentEditPart)(getTopEditPart().getChildren().get(index));
			}
			index++;
		}
		assertTrue("Container not found", compartment != null);
		//CREATION
		assertTrue(CREATION + INITIALIZATION_TEST, compartment.getChildren().size() == 0);
		assertTrue(CREATION + INITIALIZATION_TEST, getRootSemanticModel().getOwnedElements().size() == 0);
		CreateViewRequest requestcreation = CreateViewRequestFactory.getCreateShapeRequest(type, getDiagramEditPart().getDiagramPreferencesHint());
		Command command = compartment.getCommand(requestcreation);
		assertNotNull(CREATION + COMMAND_NULL, command);
		assertTrue(CREATION + TEST_IF_THE_COMMAND_IS_CREATED, command != UnexecutableCommand.INSTANCE);
		assertTrue("CREATION: " + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute() == true);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().execute(command);
		assertTrue(CREATION + TEST_THE_EXECUTION, compartment.getChildren().size() == 1);
		Assert.assertTrue("Node must be org.eclipse.gmf.runtime.notation.Shape",((EditPart)compartment.getChildren().get(0)).getModel() instanceof Shape);
		EditPart createdEditPart= (EditPart)compartment.getChildren().get(0);
		testNodeEditPart(maskmanaged, createdEditPart, initialName);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().undo();
		assertTrue(CREATION + TEST_THE_UNDO, compartment.getChildren().size() == 0);
		assertTrue(CREATION + TEST_THE_UNDO, ((Element)((View)getTopEditPart().getModel()).getElement()).getOwnedElements().size() == 0);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().redo();
		assertTrue("CREATION: " + TEST_THE_REDO, compartment.getChildren().size() == 1);
		
		Assert.assertNotEquals("Diagram updater must detect that children has been created",0,getDiagramUpdater().getSemanticChildren(getRootView()).size());
		Assert.assertEquals("Diagram updater must detect that no link has been created",0,getDiagramUpdater().getContainedLinks(getRootView()).size());
		Assert.assertEquals ("Diagram updater must detect that no link are incoming",0,getDiagramUpdater().getIncomingLinks(((GraphicalEditPart) compartment.getChildren().get(0)).getNotationView()).size());
		Assert.assertEquals ("Diagram updater must detect that no link are outgoing",0,getDiagramUpdater().getOutgoingLinks(((GraphicalEditPart) compartment.getChildren().get(0)).getNotationView()).size());
		Assert.assertEquals ("Diagram updater must detect that no children has ben created in the new element",0,getDiagramUpdater().getSemanticChildren(((GraphicalEditPart) compartment.getChildren().get(0)).getNotationView()).size());
		Assert.assertEquals ("Diagram updater must detect that no link has been created in the new element",0,getDiagramUpdater().getContainedLinks(((GraphicalEditPart) compartment.getChildren().get(0)).getNotationView()).size());
		
		
		
	}
	/**
	 * this method is used to test the created editpart
	 * @param maskmanaged
	 * @param createdEditPart
	 */
	protected void testNodeEditPart(boolean maskmanaged, EditPart createdEditPart, String initialName) {
		Assert.assertNotNull("The editpart must be created", createdEditPart);
		if( maskmanaged){
			Assert.assertNotNull("the created editpolicy must have as MASK_MANAGED_LABEL_EDIT_POLICY", createdEditPart.getEditPolicy(IMaskManagedLabelEditPolicy.MASK_MANAGED_LABEL_EDIT_POLICY));
		}
		Assert.assertTrue("the primary editpart must be the namelabelEditpart",createdEditPart instanceof ITextAwareEditPart);
		Assert.assertTrue("the primary editpart must be the namelabelEditpart",createdEditPart instanceof GraphicalEditPart);
		String name=((GraphicalEditPart)createdEditPart).resolveSemanticElement().eClass().getName();
		if(initialName!=null){
			name= initialName;
		}
		if(name.length()<((ITextAwareEditPart)createdEditPart).getEditText().length()){
			Assert.assertEquals(" the name must contain the name of the metaclass",name, ((ITextAwareEditPart)createdEditPart).getEditText().substring(0,name.length()));
		}
		else{
			//not the same it sure but display the mistake is important
			Assert.assertEquals(" the name must contain the name of the metaclass",name, ((ITextAwareEditPart)createdEditPart).getEditText());
		}
		Assert.assertTrue("the primary editpart must be the namelabelEditpart",createdEditPart instanceof CompartmentEditPart);
		Assert.assertTrue("namelabelEditpart must be editable",((CompartmentEditPart)createdEditPart).isEditModeEnabled());
	}

	/**
	 * Test to create a top node.
	 *
	 * @param type
	 *        the type
	 */
	public void testToCreateATopNode(IElementType type) {
		//CREATION
		assertTrue(CREATION + INITIALIZATION_TEST, getDiagramEditPart().getChildren().size() == 0);
		assertTrue(CREATION + INITIALIZATION_TEST, ((Element)((View)getDiagramEditPart().getModel()).getElement()).getOwnedElements().size() == 0);
		CreateViewRequest requestcreation = CreateViewRequestFactory.getCreateShapeRequest(type, getDiagramEditPart().getDiagramPreferencesHint());
		Command command = getDiagramEditPart().getCommand(requestcreation);
		assertNotNull(CREATION + COMMAND_NULL, command);
		assertTrue(CREATION + TEST_IF_THE_COMMAND_IS_CREATED, command != UnexecutableCommand.INSTANCE);
		assertTrue(CREATION + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute() == true);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().execute(command);
		assertTrue(CREATION + TEST_THE_EXECUTION, getRootView().getChildren().size() == 1);
		topNode = (GraphicalEditPart)getDiagramEditPart().getChildren().get(0);
	}

	/**
	 * Gets the top edit part.
	 *
	 * @return the top edit part
	 */
	public GraphicalEditPart getTopEditPart() {
		return topNode;
	}

	/**
	 * @see org.eclipse.papyrus.diagram.clazz.test.canonical.AbstractPapyrusTestCase#getRootSemanticModel()
	 *
	 * @return
	 */
	@Override
	protected Element getRootSemanticModel() {
		// TODO Auto-generated method stub
		return (Element)((View)getTopEditPart().getModel()).getElement();
	}

	/**
	 * Test to manage top node.
	 *
	 * @param topNodeType
	 *        the top node type
	 * @param type
	 *        the type
	 * @param containerType
	 *        the container type
	 */
	public void testToManageTopNode(IElementType topNodeType, IElementType type, int containerType,String initialName) {
		testToCreateATopNode(topNodeType);
		testToCreateANode(type, containerType, false, initialName);
		testDestroy(type, containerType);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().undo();
		testViewDeletion(type, containerType);
		testDrop(type, containerType);
		testChangeContainer(topNodeType, type, containerType);
	}
	
	/**
	 * Test to manage top node.
	 *
	 * @param topNodeType
	 *        the top node type
	 * @param type
	 *        the type
	 * @param containerType
	 *        the container type
	 */
	public void testToManageTopNode(IElementType topNodeType, IElementType type, int containerType) {
		testToManageTopNode(topNodeType, type, containerType, null);
	}

	/**
	 * Test to manage top node and test if an editpolicy mask managed is applied.
	 *
	 * @param topNodeType
	 *        the top node type
	 * @param type
	 *        the type
	 * @param containerType
	 *        the container type
	 */
	public void testToManageTopNodeWithMask(IElementType topNodeType, IElementType type, int containerType,String initialName) {
		testToCreateATopNode(topNodeType);
		testToCreateANode(type, containerType, true, initialName);
		testDestroy(type, containerType);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().undo();
		testViewDeletion(type, containerType);
		testDrop(type, containerType);
		testChangeContainer(topNodeType, type, containerType);
	}
}
