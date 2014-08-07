/*****************************************************************************
 * Copyright (c) 2012, 2014 CEA LIST and others.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   Sergey Boyko - bug 430552
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.sequence.tests.bug;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.commands.wrappers.GEFtoEMFCommandWrapper;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.LifelineEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.sequence.tests.ISequenceDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.sequence.tests.canonical.CreateSequenceDiagramCommand;
import org.eclipse.papyrus.uml.diagram.sequence.tests.canonical.TestLink;
import org.eclipse.uml2.uml.BehaviorExecutionSpecification;
import org.junit.Test;

/**
 * The deletion of an ExecutionSpecification (and consequently the deletion of OccurrenceSpecification(s))
 * should involve the deletion of dependents that require its existence.
 * 
 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=430552
 * 
 */
public class TestOccurrenceSpecificationDeletion_430552 extends TestLink {

	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateSequenceDiagramCommand();
	}

	@Override
	protected String getProjectName() {
		return ISequenceDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return ISequenceDiagramTestsConstants.FILE_NAME;
	}

	@Test
	public void testGeneralOrderingDeletion() {
		createNode(UMLElementTypes.Lifeline_3001, getRootEditPart(), new Point(100, 100), new Dimension(62, 200));
		createNode(UMLElementTypes.Lifeline_3001, getRootEditPart(), new Point(300, 100), new Dimension(62, 200));
		final LifelineEditPart lifeline1 = (LifelineEditPart)getRootEditPart().getChildren().get(0);
		final LifelineEditPart lifeline2 = (LifelineEditPart)getRootEditPart().getChildren().get(1);
		waitForComplete();

		createNode(UMLElementTypes.BehaviorExecutionSpecification_3003, lifeline1, new Point(131, 140), new Dimension(20, 60));
		createNode(UMLElementTypes.BehaviorExecutionSpecification_3003, lifeline2, new Point(331, 200), new Dimension(20, 60));
		createNode(UMLElementTypes.DestructionOccurrenceSpecification_3022, lifeline1, getAbsoluteBounds(lifeline1).getBottom(), null);
		waitForComplete();

		IGraphicalEditPart source = (IGraphicalEditPart)lifeline1.getChildren().get(1);
		IGraphicalEditPart target = (IGraphicalEditPart)lifeline2.getChildren().get(1);
		IGraphicalEditPart target2 = (IGraphicalEditPart)lifeline1.getChildren().get(2);

		createLink(UMLElementTypes.GeneralOrdering_4012, source, target, getAbsoluteBounds(source).getTop(), getAbsoluteBounds(target).getTop());
		createLink(UMLElementTypes.GeneralOrdering_4012, target, target2, getAbsoluteBounds(target).getBottom(), getAbsoluteBounds(target2).getTop());
		waitForComplete();
		assertTrue(CREATION + TEST_THE_EXECUTION, source.getSourceConnections().size() == 1);
		assertTrue(CREATION + TEST_THE_EXECUTION, target.getSourceConnections().size() == 1);
		
		BehaviorExecutionSpecification execSpec1 = (BehaviorExecutionSpecification)source.resolveSemanticElement();
		BehaviorExecutionSpecification execSpec2 = (BehaviorExecutionSpecification)target.resolveSemanticElement();
		assertTrue(CREATION + TEST_THE_EXECUTION, execSpec1.getGeneralOrderings().size() == 1);
		assertTrue(CREATION + TEST_THE_EXECUTION, execSpec2.getGeneralOrderings().size() == 1);

		Request deleteViewRequest = new EditCommandRequestWrapper(new DestroyElementRequest(false));
		Command command = target.getCommand(deleteViewRequest);
		assertNotNull(DESTROY_DELETION + COMMAND_NULL, command);
		assertTrue(DESTROY_DELETION + TEST_IF_THE_COMMAND_IS_CREATED, command != UnexecutableCommand.INSTANCE);
		assertTrue(DESTROY_DELETION + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute() == true);
		getEMFCommandStack().execute(new GEFtoEMFCommandWrapper(command));

		assertTrue(DESTROY_DELETION + TEST_THE_EXECUTION, execSpec1.getGeneralOrderings().size() == 0);
		assertTrue(DESTROY_DELETION + TEST_THE_EXECUTION, execSpec2.getGeneralOrderings().size() == 0);
	}
	
	public void createNode(IElementType type, GraphicalEditPart parent, Point location, Dimension size) {
		//CREATION
		CreateViewRequest requestcreation = CreateViewRequestFactory.getCreateShapeRequest(type, getRootEditPart().getDiagramPreferencesHint());
		requestcreation.setLocation(location);
		requestcreation.setSize(size);
		Command command = parent.getCommand(requestcreation);
		assertNotNull(CREATION + COMMAND_NULL, command);
		assertTrue(CREATION + TEST_IF_THE_COMMAND_IS_CREATED, command != UnexecutableCommand.INSTANCE);
		assertTrue(CREATION + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute() == true);

		getDiagramCommandStack().execute(command);
	}

	public void createLink(IElementType linkType, EditPart source, EditPart target, Point sourcePoint, Point targetPoint) {
		CreateConnectionViewRequest req = createConnectionViewRequest(linkType, source, target, sourcePoint, targetPoint);
		Command command = target.getCommand(req);
		assertNotNull(CREATION + COMMAND_NULL, command);
		assertTrue(CONTAINER_CREATION + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute() == true);

		getDiagramCommandStack().execute(command);
	}

	CreateConnectionViewRequest createConnectionViewRequest(IElementType type, EditPart source, EditPart target, Point sourcePoint, Point targetPoint) {
		CreateConnectionViewRequest connectionRequest = CreateViewRequestFactory.getCreateConnectionRequest(type, ((IGraphicalEditPart)getDiagramEditPart()).getDiagramPreferencesHint());
		connectionRequest.setLocation(sourcePoint);

		connectionRequest.setSourceEditPart(null);
		connectionRequest.setTargetEditPart(source);
		connectionRequest.setType(RequestConstants.REQ_CONNECTION_START);
		Command cmd = source.getCommand(connectionRequest);

		// get the connection end command
		connectionRequest.setSourceEditPart(source);
		connectionRequest.setTargetEditPart(target);
		connectionRequest.setType(RequestConstants.REQ_CONNECTION_END);
		connectionRequest.setLocation(targetPoint);

		EObject container = getRootEditPart().resolveSemanticElement();
		connectionRequest.getExtendedData().put(SOURCE_MODEL_CONTAINER, container);
		connectionRequest.getExtendedData().put(TARGET_MODEL_CONTAINER, container);
		return connectionRequest;
	}

}
