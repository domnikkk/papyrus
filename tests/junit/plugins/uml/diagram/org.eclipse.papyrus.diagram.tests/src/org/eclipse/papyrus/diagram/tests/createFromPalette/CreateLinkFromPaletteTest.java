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
package org.eclipse.papyrus.diagram.tests.createFromPalette;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.IHandler;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.diagram.tests.canonical.AbstractPapyrusTestCase;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.uml2.uml.Element;
import org.junit.Assert;

// TODO: Auto-generated Javadoc
/**
 * The Class TestTopLink to test when this is link . The link is attached to a semantic element that has to be contained by the source and the target.
 * To adapt when source owns the created link
 */
public abstract class CreateLinkFromPaletteTest extends AbstractPapyrusTestCase {

	protected static final String THE_LINK_RECONNECT_EXISTS = "The Link exist"; //$NON-NLS-1$

	protected static final String RECONNECTION_TARGET = "Reconnection of target"; //$NON-NLS-1$

	protected static final String LINK_EXISTS_RECONNECTION_ON_TARGET = "Link exist on the target"; //$NON-NLS-1$

	protected static final String THE_LINK_TO_RECONNECT_EXISTS = "The Link exist"; //$NON-NLS-1$

	protected static final String RECONNECTION_SOURCE = "Reconnection of source"; //$NON-NLS-1$

	protected static final String LINK_EXISTS_RECONNECTION_ON_SOURCE = "Link exist on the source"; //$NON-NLS-1$

	protected GraphicalEditPart source = null;

	protected GraphicalEditPart sourcePlayer = null;

	protected GraphicalEditPart target = null;

	protected GraphicalEditPart targetPlayer = null;

	public abstract DiagramUpdater getDiagramUpdater();

	/**
	 * Test to create a link.
	 *
	 * @param linkType
	 *        the type
	 */
	public void testToCreateALink(IElementType linkType,String initialName) {
		assertTrue(CREATION + INITIALIZATION_TEST, getDiagramEditPart().getChildren().size() == 4);
		assertTrue(CREATION + INITIALIZATION_TEST, getRootSemanticModel().getOwnedElements().size() == 4);
		Command command = target.getCommand(createConnectionViewRequest(linkType, source, target));
		assertNotNull(CREATION + COMMAND_NULL, command);
		assertTrue(CONTAINER_CREATION + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute() == true);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().execute(command);
		assertTrue(CREATION + INITIALIZATION_TEST, ((Diagram)getRootView()).getEdges().size() == 1);
		assertTrue(CREATION + INITIALIZATION_TEST, getRootSemanticModel().getOwnedElements().size() == 5);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().undo();
		assertTrue(CREATION + TEST_THE_UNDO, getRootView().getChildren().size() == 4);
		assertTrue(CREATION + TEST_THE_UNDO, getRootSemanticModel().getOwnedElements().size() == 4);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().redo();
		assertTrue(CREATION + TEST_THE_REDO, ((Diagram)getRootView()).getEdges().size() == 1);
		assertTrue(CREATION + TEST_THE_REDO, getRootSemanticModel().getOwnedElements().size() == 5);
		ConnectionEditPart linkEditPart= (ConnectionEditPart)getDiagramEditPart().getConnections().get(0);
		testLinkEditPart(linkEditPart, initialName);
		
		Assert.assertEquals("Diagram updater must detect that node children has been created",4,getDiagramUpdater().getSemanticChildren(getRootView()).size()); //$NON-NLS-1$
		Assert.assertEquals("Diagram updater must detect that no link has been created",1,getDiagramUpdater().getContainedLinks(getRootView()).size()); //$NON-NLS-1$
		Assert.assertEquals ("Diagram updater must detect that no link are incoming",0,getDiagramUpdater().getIncomingLinks((View)((Diagram)getRootView()).getEdges().get(0)).size()); //$NON-NLS-1$
		Assert.assertEquals ("Diagram updater must detect that no link are outgoing",0,getDiagramUpdater().getOutgoingLinks((View)((Diagram)getRootView()).getEdges().get(0)).size()); //$NON-NLS-1$
		Assert.assertEquals ("Diagram updater must detect that no children has ben created in the new element",0,getDiagramUpdater().getSemanticChildren(((View)((Diagram)getRootView()).getEdges().get(0))).size()); //$NON-NLS-1$
		Assert.assertEquals ("Diagram updater must detect that no link has been created in the new element",0,getDiagramUpdater().getContainedLinks(((View)((Diagram)getRootView()).getEdges().get(0))).size()); //$NON-NLS-1$

		Assert.assertEquals ("Diagram updater must detect that no link are incoming",1,getDiagramUpdater().getIncomingLinks(target.getNotationView()).size()); //$NON-NLS-1$
		Assert.assertEquals ("Diagram updater must detect that no link are OutgoingLinks",0,getDiagramUpdater().getOutgoingLinks(target.getNotationView()).size()); //$NON-NLS-1$
		Assert.assertEquals ("Diagram updater must detect that no link are IncomingLinks",0,getDiagramUpdater().getIncomingLinks(source.getNotationView()).size()); //$NON-NLS-1$
		Assert.assertEquals ("Diagram updater must detect that no link are OutgoingLinks",1,getDiagramUpdater().getOutgoingLinks(source.getNotationView()).size()); //$NON-NLS-1$
		
		
	}

	/**
	 * htis method is used to test the created link editpart
	 * @param linkEditPart
	 */
	protected void testLinkEditPart(ConnectionEditPart linkEditPart, String initialName) {
		Assert.assertNotNull("the editpart of the link must exist",linkEditPart); //$NON-NLS-1$
		EditPolicy policy=linkEditPart.getEditPolicy(org.eclipse.papyrus.uml.diagram.common.editpolicies.ShowHideLabelEditPolicy.SHOW_HIDE_LABEL_ROLE);
		Assert.assertNotNull("the link must have an edipolicy that to show or hide label",policy); //$NON-NLS-1$
		Assert.assertTrue("the policy of the link must be an instance of ShowHideLabelEditPolicy", policy instanceof org.eclipse.papyrus.uml.diagram.common.editpolicies.ShowHideLabelEditPolicy); //$NON-NLS-1$
		//get text aware
		ITextAwareEditPart namedEditPart=null;
		for(Iterator iteratorChildren = linkEditPart.getChildren().iterator(); iteratorChildren.hasNext();) {
			Object children = iteratorChildren.next();
			if (children instanceof ITextAwareEditPart&&(((ITextAwareEditPart)children).getEditText()!=null)&&(!((ITextAwareEditPart)children).getEditText().trim().equals(""))){ //$NON-NLS-1$
				namedEditPart=(ITextAwareEditPart)children;
			}
		}
		if(namedEditPart!=null){
			testNameLabel(namedEditPart,initialName);
		}

	}

	protected void testNameLabel(ITextAwareEditPart namedEditPart, String initialName) {
		Assert.assertTrue("the primary editpart must be the namelabelEditpart",namedEditPart instanceof GraphicalEditPart); //$NON-NLS-1$
		String name=((GraphicalEditPart)namedEditPart).resolveSemanticElement().eClass().getName();
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
	}

	public void installEnvironment(IElementType sourceType, IElementType targetType) {
		assertEquals(CREATION + INITIALIZATION_TEST, 0, getDiagramEditPart().getChildren().size());
		assertEquals(CREATION + INITIALIZATION_TEST, 0, getRootSemanticModel().getOwnedElements().size());
		//create the source
		CreateViewRequest requestcreation = CreateViewRequestFactory.getCreateShapeRequest(sourceType, getDiagramEditPart().getDiagramPreferencesHint());
		requestcreation.setLocation(new Point(100, 100));
		Command command = getDiagramEditPart().getCommand(requestcreation);
		assertNotNull(CREATION + COMMAND_NULL, command);
		assertTrue(CREATION + TEST_IF_THE_COMMAND_IS_CREATED, command != UnexecutableCommand.INSTANCE);
		assertTrue("CREATION: " + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute() == true); //$NON-NLS-1$
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().execute(command);
		//create the source player to test reconnect
		requestcreation = CreateViewRequestFactory.getCreateShapeRequest(sourceType, getDiagramEditPart().getDiagramPreferencesHint());
		requestcreation.setLocation(new Point(100, 300));
		command = getDiagramEditPart().getCommand(requestcreation);
		assertNotNull(CREATION + COMMAND_NULL, command);
		assertTrue(CREATION + TEST_IF_THE_COMMAND_IS_CREATED, command != UnexecutableCommand.INSTANCE);
		assertTrue("CREATION: " + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute() == true); //$NON-NLS-1$
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().execute(command);
		//create the target
		requestcreation = CreateViewRequestFactory.getCreateShapeRequest(targetType, getDiagramEditPart().getDiagramPreferencesHint());
		requestcreation.setLocation(new Point(300, 100));
		command = getDiagramEditPart().getCommand(requestcreation);
		assertNotNull(CREATION + COMMAND_NULL, command);
		assertTrue(CREATION + TEST_IF_THE_COMMAND_IS_CREATED, command != UnexecutableCommand.INSTANCE);
		assertTrue("CREATION: " + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute() == true); //$NON-NLS-1$
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().execute(command);
		//create the target player to test reconnect
		requestcreation = CreateViewRequestFactory.getCreateShapeRequest(targetType, getDiagramEditPart().getDiagramPreferencesHint());
		requestcreation.setLocation(new Point(300, 300));
		command = getDiagramEditPart().getCommand(requestcreation);
		assertNotNull(CREATION + COMMAND_NULL, command);
		assertTrue(CREATION + TEST_IF_THE_COMMAND_IS_CREATED, command != UnexecutableCommand.INSTANCE);
		assertTrue("CREATION: " + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute() == true); //$NON-NLS-1$
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().execute(command);
		source = (GraphicalEditPart)getDiagramEditPart().getChildren().get(0);
		sourcePlayer = (GraphicalEditPart)getDiagramEditPart().getChildren().get(1);
		target = (GraphicalEditPart)getDiagramEditPart().getChildren().get(2);
		targetPlayer = (GraphicalEditPart)getDiagramEditPart().getChildren().get(3);
	}

	public CreateConnectionViewRequest createConnectionViewRequest(IElementType type, EditPart source, EditPart target) {
		CreateConnectionViewRequest connectionRequest = CreateViewRequestFactory.getCreateConnectionRequest(type, ((IGraphicalEditPart)getDiagramEditPart()).getDiagramPreferencesHint());
		connectionRequest.setSourceEditPart(null);
		connectionRequest.setTargetEditPart(source);
		connectionRequest.setType(RequestConstants.REQ_CONNECTION_START);
		source.getCommand(connectionRequest);
		// Now, setup the request in preparation to get the
		// connection end
		// command.
		connectionRequest.setSourceEditPart(source);
		connectionRequest.setTargetEditPart(target);
		connectionRequest.setType(RequestConstants.REQ_CONNECTION_END);
		return connectionRequest;
	}

	/**
	 * Test to create a link.
	 *
	 * @param type
	 *        the type
	 * @param containerType
	 *        the container type
	 */
	public void testCreateLinkFromPalette(IElementType sourceType, IElementType targetType, IElementType linkType, IElementType containerType, boolean allowedOntheSame, String initialName) {
		installEnvironment(sourceType, targetType);
		testToCreateALink(linkType, initialName);
		
	}
	/**
	 * Test to manage top node.
	 *
	 * @param type
	 *        the type
	 * @param containerType
	 *        the container type
	 */
	public void testCreateLinkFromPalette(IElementType sourceType, IElementType targetType, IElementType linkType, IElementType containerType, boolean allowedOntheSame) {
	testCreateLinkFromPalette(sourceType, targetType, linkType, containerType, allowedOntheSame, null);
	}

	/**
	 * test the drop of a link where the source and the target are the same objects
	 *
	 * @param linkType
	 * @param allowed
	 */
	protected void testToDropAlinkOnTheSame(IElementType linkType, boolean allowed) {
		//DROP
		if(allowed) {
			assertTrue(DROP + INITIALIZATION_TEST, getDiagramEditPart().getChildren().size() == 4);
			assertTrue(DROP + INITIALIZATION_TEST, getRootSemanticModel().getOwnedElements().size() == 6);
			assertTrue(CREATION + INITIALIZATION_TEST, ((Diagram)getRootView()).getEdges().size() == 2);
			DropObjectsRequest dropObjectsRequest = new DropObjectsRequest();
			ArrayList<Element> list = new ArrayList<Element>();
			list.add(getRootSemanticModel().getOwnedElements().get(5));
			dropObjectsRequest.setObjects(list);
			dropObjectsRequest.setLocation(new Point(20, 20));
			Command command = getDiagramEditPart().getCommand(dropObjectsRequest);
			assertNotNull(DROP + COMMAND_NULL, command);
			assertTrue(DROP + TEST_IF_THE_COMMAND_IS_CREATED, command != UnexecutableCommand.INSTANCE);
			assertTrue(DROP + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute() == true);
			diagramEditor.getDiagramEditDomain().getDiagramCommandStack().execute(command);
			assertTrue(DROP + TEST_THE_EXECUTION, getDiagramEditPart().getChildren().size() == 4);
			assertTrue(DROP + TEST_THE_EXECUTION, getRootSemanticModel().getOwnedElements().size() == 6);
			assertTrue(DROP + TEST_THE_EXECUTION, ((Diagram)getRootView()).getEdges().size() == 3);
			diagramEditor.getDiagramEditDomain().getDiagramCommandStack().undo();
			assertTrue(DROP + TEST_THE_UNDO, getDiagramEditPart().getChildren().size() == 4);
			assertTrue(DROP + TEST_THE_UNDO, getRootSemanticModel().getOwnedElements().size() == 6);
			assertTrue(DROP + TEST_THE_UNDO, ((Diagram)getRootView()).getEdges().size() == 2);
			diagramEditor.getDiagramEditDomain().getDiagramCommandStack().redo();
			assertTrue(DROP + TEST_THE_REDO, getDiagramEditPart().getChildren().size() == 4);
			assertTrue(DROP + TEST_THE_REDO, getRootSemanticModel().getOwnedElements().size() == 6);
			assertTrue(DROP + TEST_THE_REDO, ((Diagram)getRootView()).getEdges().size() == 3);
		}
	}

	/**
	 * test the creation of a link where the source and the target are the same objects
	 *
	 * @param linkType
	 * @param allowed
	 */
	protected void testToCreateAlinkOnTheSame(IElementType linkType, boolean allowed) {
		assertTrue(CREATION + INITIALIZATION_TEST, getDiagramEditPart().getChildren().size() == 4);
		assertTrue(CREATION + INITIALIZATION_TEST, getRootSemanticModel().getOwnedElements().size() == 5);
		Command command = target.getCommand(createConnectionViewRequest(linkType, source, source));
		assertNotNull(CREATION + COMMAND_NULL, command);
		assertTrue(CONTAINER_CREATION + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute() == allowed);
		if(allowed) {
			diagramEditor.getDiagramEditDomain().getDiagramCommandStack().execute(command);
			assertTrue(CREATION + INITIALIZATION_TEST, ((Diagram)getRootView()).getEdges().size() == 2);
			assertTrue(CREATION + INITIALIZATION_TEST, getRootSemanticModel().getOwnedElements().size() == 6);
			diagramEditor.getDiagramEditDomain().getDiagramCommandStack().undo();
			assertTrue(CREATION + TEST_THE_UNDO, getRootView().getChildren().size() == 4);
			assertTrue(CREATION + TEST_THE_UNDO, getRootSemanticModel().getOwnedElements().size() == 5);
			diagramEditor.getDiagramEditDomain().getDiagramCommandStack().redo();
			assertTrue(CREATION + TEST_THE_REDO, ((Diagram)getRootView()).getEdges().size() == 2);
			assertTrue(CREATION + TEST_THE_REDO, getRootSemanticModel().getOwnedElements().size() == 6);
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
}
