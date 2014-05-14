/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * This file has been generated automatically in the Papyrus Test Framework.
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.composite.test.canonical;

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.papyrus.commands.ICreationCommand;

import org.eclipse.papyrus.uml.diagram.composite.test.ICompositeStructureTestsConstants;
import org.eclipse.papyrus.diagram.tests.canonical.TestTopNode;
import org.eclipse.papyrus.uml.diagram.composite.CreateCompositeStructureCommand;
import org.eclipse.papyrus.uml.diagram.composite.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.FunctionBehaviorCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.InteractionCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ProtocolStateMachineCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeObservationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.StateMachineCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ClassCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DurationObservationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ActivityCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.InformationItemEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.OpaqueBehaviorCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.CollaborationCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestCompositeStructureTopNodeGen.
 */
public class TestCompositeStructureTopNodeGen extends TestTopNode {
	
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateCompositeStructureCommand();
	}
	 
	@Override
	protected String getProjectName() {
		return ICompositeStructureTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return ICompositeStructureTestsConstants.FILE_NAME;
	}

	/**
	 * Test to manage component Class.
	 */
	@Test
	public void testTopNodeClassCompositeEditPart() {
		testToManageNode(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getClass_()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationItem.
	 */
	@Test
	public void testTopNodeInformationItemEditPart() {
		testToManageNode(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getInformationItem()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component FunctionBehavior.
	 */
	@Test
	public void testTopNodeFunctionBehaviorCompositeEditPart() {
		testToManageNode(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getFunctionBehavior()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component OpaqueBehavior.
	 */
	@Test
	public void testTopNodeOpaqueBehaviorCompositeEditPart() {
		testToManageNode(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getOpaqueBehavior()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Collaboration.
	 */
	@Test
	public void testTopNodeCollaborationCompositeEditPart() {
		testToManageNode(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getCollaboration()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component StateMachine.
	 */
	@Test
	public void testTopNodeStateMachineCompositeEditPart() {
		testToManageNode(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getStateMachine()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component TimeObservation.
	 */
	@Test
	public void testTopNodeTimeObservationEditPart() {
		testToManageNode(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getTimeObservation()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Activity.
	 */
	@Test
	public void testTopNodeActivityCompositeEditPart() {
		testToManageNode(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getActivity()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Interaction.
	 */
	@Test
	public void testTopNodeInteractionCompositeEditPart() {
		testToManageNode(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getInteraction()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Constraint.
	 */
	@Test
	public void testTopNodeConstraintEditPart() {
		testToManageNode(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getConstraint()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component DurationObservation.
	 */
	@Test
	public void testTopNodeDurationObservationEditPart() {
		testToManageNode(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getDurationObservation()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Comment.
	 */
	@Test
	public void testTopNodeCommentEditPart() {
		testToManageNode(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getComment()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProtocolStateMachine.
	 */
	@Test
	public void testTopNodeProtocolStateMachineCompositeEditPart() {
		testToManageNode(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getProtocolStateMachine()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override 
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), getDiagramEditPart().getDiagramPreferencesHint());
	}
	
}	
