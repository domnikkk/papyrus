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
import org.eclipse.papyrus.diagram.tests.canonical.TestLink;
import org.eclipse.papyrus.uml.diagram.composite.CreateCompositeStructureCommand;
import org.eclipse.papyrus.uml.diagram.composite.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.RealizationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.RoleBindingEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DependencyEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ConnectorEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.InformationFlowEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.AbstractionEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.UsageEditPart;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestCompositeStructureLinkGen.
 */
public class TestCompositeStructureLinkGen extends TestLink {
	
	
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
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromConstraintToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromProtocolStateMachineCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCollaborationCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromOpaqueBehaviorCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCollaborationCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCollaborationCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInteractionCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromTimeObservationToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromClassCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromStateMachineCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromConstraintToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromProtocolStateMachineCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromStateMachineCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromOpaqueBehaviorCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromDurationObservationToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromProtocolStateMachineCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromTimeObservationToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromOpaqueBehaviorCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInteractionCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromOpaqueBehaviorCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromDurationObservationToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromActivityCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromFunctionBehaviorCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDurationObservationToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInteractionCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromProtocolStateMachineCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCollaborationCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromOpaqueBehaviorCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromDurationObservationToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromFunctionBehaviorCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCollaborationCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromProtocolStateMachineCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromTimeObservationToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromFunctionBehaviorCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromTimeObservationToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCommentToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDurationObservationToComment() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInteractionCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromActivityCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromStateMachineCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromProtocolStateMachineCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromActivityCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromProtocolStateMachineCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromFunctionBehaviorCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromActivityCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromConstraintToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromOpaqueBehaviorCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInteractionCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromOpaqueBehaviorCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromStateMachineCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromClassCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInteractionCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromTimeObservationToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromProtocolStateMachineCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCommentToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromFunctionBehaviorCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInformationItemToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCommentToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromActivityCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromClassCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCollaborationCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromFunctionBehaviorCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromFunctionBehaviorCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInteractionCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromActivityCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromTimeObservationToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInteractionCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromStateMachineCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromStateMachineCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCollaborationCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromStateMachineCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInformationItemToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInteractionCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInformationItemToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDurationObservationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInteractionCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDurationObservationToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCommentToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInteractionCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCommentToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromConstraintToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDurationObservationToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromActivityCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromTimeObservationToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromOpaqueBehaviorCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromStateMachineCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCollaborationCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInteractionCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCommentToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInteractionCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromTimeObservationToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromActivityCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromDurationObservationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromClassCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromTimeObservationToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCollaborationCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromOpaqueBehaviorCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromClassCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromProtocolStateMachineCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromActivityCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDurationObservationToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCommentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromFunctionBehaviorCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCollaborationCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromActivityCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInteractionCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromStateMachineCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromActivityCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInteractionCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromTimeObservationToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromProtocolStateMachineCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromOpaqueBehaviorCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromFunctionBehaviorCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCollaborationCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCommentToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromOpaqueBehaviorCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromProtocolStateMachineCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromOpaqueBehaviorCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDurationObservationToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCollaborationCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromOpaqueBehaviorCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromProtocolStateMachineCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInteractionCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromActivityCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInformationItemToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromOpaqueBehaviorCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCollaborationCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCollaborationCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCollaborationCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromTimeObservationToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromProtocolStateMachineCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromFunctionBehaviorCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromStateMachineCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromTimeObservationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromClassCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromFunctionBehaviorCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromStateMachineCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromActivityCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInteractionCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCollaborationCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromStateMachineCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromOpaqueBehaviorCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCommentToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromClassCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromFunctionBehaviorCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromTimeObservationToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromClassCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromConstraintToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromFunctionBehaviorCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromOpaqueBehaviorCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromFunctionBehaviorCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromDurationObservationToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromFunctionBehaviorCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCollaborationCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromTimeObservationToComment() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromClassCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromTimeObservationToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromActivityCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDurationObservationToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInformationItemToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromOpaqueBehaviorCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromActivityCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromOpaqueBehaviorCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromTimeObservationToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromTimeObservationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromFunctionBehaviorCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromProtocolStateMachineCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromOpaqueBehaviorCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromStateMachineCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromFunctionBehaviorCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromClassCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromFunctionBehaviorCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCollaborationCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromActivityCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromProtocolStateMachineCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromStateMachineCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromFunctionBehaviorCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCollaborationCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromProtocolStateMachineCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInformationItemToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCommentToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromProtocolStateMachineCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCollaborationCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCollaborationCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCollaborationCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromTimeObservationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromProtocolStateMachineCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromFunctionBehaviorCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromTimeObservationToComment() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromDurationObservationToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInteractionCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromStateMachineCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromTimeObservationToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInteractionCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromStateMachineCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCommentToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromDurationObservationToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromClassCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromStateMachineCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromActivityCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromFunctionBehaviorCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromOpaqueBehaviorCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromProtocolStateMachineCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromConstraintToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromActivityCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromStateMachineCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromStateMachineCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromTimeObservationToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromTimeObservationToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCollaborationCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromClassCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromStateMachineCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromStateMachineCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCommentToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromConstraintToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInteractionCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDurationObservationToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromTimeObservationToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCommentToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromProtocolStateMachineCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCommentToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromFunctionBehaviorCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromTimeObservationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromProtocolStateMachineCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInformationItemToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromDurationObservationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromOpaqueBehaviorCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromConstraintToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCollaborationCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromActivityCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCommentToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCollaborationCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromTimeObservationToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInformationItemToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromDurationObservationToComment() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromStateMachineCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromActivityCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromOpaqueBehaviorCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInformationItemToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromStateMachineCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInteractionCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromOpaqueBehaviorCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInteractionCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromClassCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInteractionCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCollaborationCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCollaborationCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromOpaqueBehaviorCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInteractionCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromConstraintToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromDurationObservationToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInformationItemToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromFunctionBehaviorCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCollaborationCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromDurationObservationToComment() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCollaborationCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromActivityCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromClassCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromClassCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInformationItemToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromConstraintToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromFunctionBehaviorCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromFunctionBehaviorCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInteractionCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCommentToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromProtocolStateMachineCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromTimeObservationToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromActivityCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromActivityCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInteractionCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromConstraintToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInteractionCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCommentToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDurationObservationToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromClassCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInteractionCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInformationItemToComment() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromActivityCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromProtocolStateMachineCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCollaborationCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromClassCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInformationItemToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromProtocolStateMachineCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromFunctionBehaviorCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromOpaqueBehaviorCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCollaborationCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInteractionCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCollaborationCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromDurationObservationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCollaborationCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromDurationObservationToComment() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromActivityCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCommentToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromProtocolStateMachineCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromActivityCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromStateMachineCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromStateMachineCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromProtocolStateMachineCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCommentToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromProtocolStateMachineCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromOpaqueBehaviorCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCollaborationCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCollaborationCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromTimeObservationToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInteractionCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInteractionCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInformationItemToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromActivityCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromStateMachineCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromOpaqueBehaviorCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromActivityCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromStateMachineCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromProtocolStateMachineCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromProtocolStateMachineCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromOpaqueBehaviorCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCollaborationCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromClassCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCollaborationCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromFunctionBehaviorCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromTimeObservationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromFunctionBehaviorCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromConstraintToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromFunctionBehaviorCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCollaborationCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromActivityCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInteractionCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromFunctionBehaviorCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromOpaqueBehaviorCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDurationObservationToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromStateMachineCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromStateMachineCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromStateMachineCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromClassCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInformationItemToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromTimeObservationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDurationObservationToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromStateMachineCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromStateMachineCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromFunctionBehaviorCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCommentToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromDurationObservationToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInteractionCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromDurationObservationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDurationObservationToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromConstraintToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInteractionCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromOpaqueBehaviorCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCollaborationCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromConstraintToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromStateMachineCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInteractionCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCollaborationCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromProtocolStateMachineCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromDurationObservationToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInformationItemToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCommentToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCommentToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromOpaqueBehaviorCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromActivityCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromActivityCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInteractionCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromOpaqueBehaviorCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromConstraintToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromConstraintToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromOpaqueBehaviorCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromStateMachineCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromTimeObservationToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromFunctionBehaviorCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromStateMachineCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInteractionCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromActivityCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromDurationObservationToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromTimeObservationToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCollaborationCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInformationItemToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInteractionCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromConstraintToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromTimeObservationToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCollaborationCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromStateMachineCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromClassCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromProtocolStateMachineCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCollaborationCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromStateMachineCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromActivityCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromFunctionBehaviorCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromOpaqueBehaviorCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromStateMachineCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromStateMachineCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCommentToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInteractionCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromProtocolStateMachineCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCollaborationCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromTimeObservationToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromClassCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInteractionCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromStateMachineCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromFunctionBehaviorCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInteractionCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromOpaqueBehaviorCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromConstraintToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromTimeObservationToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromProtocolStateMachineCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInteractionCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromTimeObservationToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromActivityCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromDurationObservationToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromFunctionBehaviorCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromFunctionBehaviorCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInformationItemToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromActivityCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInformationItemToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromTimeObservationToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromConstraintToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromActivityCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInformationItemToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromProtocolStateMachineCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCollaborationCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCollaborationCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromProtocolStateMachineCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromTimeObservationToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromFunctionBehaviorCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromProtocolStateMachineCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromTimeObservationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromDurationObservationToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromActivityCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDurationObservationToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromActivityCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromOpaqueBehaviorCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInteractionCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCollaborationCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromTimeObservationToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCollaborationCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromStateMachineCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromOpaqueBehaviorCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCommentToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromDurationObservationToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromConstraintToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInteractionCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromProtocolStateMachineCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromClassCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromConstraintToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCollaborationCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDurationObservationToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromTimeObservationToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromActivityCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromTimeObservationToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInteractionCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromTimeObservationToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromOpaqueBehaviorCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromActivityCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromActivityCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromProtocolStateMachineCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromClassCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromProtocolStateMachineCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromStateMachineCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromDurationObservationToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromFunctionBehaviorCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromFunctionBehaviorCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromOpaqueBehaviorCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromStateMachineCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCollaborationCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromStateMachineCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCommentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromStateMachineCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromProtocolStateMachineCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromFunctionBehaviorCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromFunctionBehaviorCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromActivityCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromProtocolStateMachineCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInformationItemToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromProtocolStateMachineCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromActivityCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromStateMachineCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromProtocolStateMachineCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInteractionCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromDurationObservationToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromOpaqueBehaviorCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromTimeObservationToComment() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCollaborationCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInteractionCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInteractionCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromDurationObservationToComment() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromActivityCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInteractionCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromTimeObservationToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromOpaqueBehaviorCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromOpaqueBehaviorCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromOpaqueBehaviorCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCommentToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromActivityCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromActivityCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInteractionCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromStateMachineCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDurationObservationToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromConstraintToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromStateMachineCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromOpaqueBehaviorCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromStateMachineCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromFunctionBehaviorCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromTimeObservationToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromStateMachineCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromConstraintToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInformationItemToComment() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromActivityCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromProtocolStateMachineCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCommentToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromStateMachineCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromProtocolStateMachineCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDurationObservationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromFunctionBehaviorCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInteractionCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromDurationObservationToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromProtocolStateMachineCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromDurationObservationToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCollaborationCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromFunctionBehaviorCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromTimeObservationToComment() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromOpaqueBehaviorCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCommentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromTimeObservationToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInteractionCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromDurationObservationToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromProtocolStateMachineCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromProtocolStateMachineCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromTimeObservationToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromClassCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromConstraintToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCollaborationCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromOpaqueBehaviorCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCollaborationCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromClassCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromStateMachineCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromOpaqueBehaviorCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCollaborationCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInteractionCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromDurationObservationToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromTimeObservationToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromDurationObservationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCommentToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromClassCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromConstraintToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromFunctionBehaviorCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromTimeObservationToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromActivityCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromOpaqueBehaviorCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInformationItemToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToComment() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromProtocolStateMachineCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCommentToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCommentToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInteractionCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCollaborationCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromProtocolStateMachineCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromDurationObservationToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromStateMachineCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCommentToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromConstraintToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromTimeObservationToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromTimeObservationToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCollaborationCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromStateMachineCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromStateMachineCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromDurationObservationToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCommentToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInteractionCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromDurationObservationToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInteractionCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromTimeObservationToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromProtocolStateMachineCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromProtocolStateMachineCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDurationObservationToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInteractionCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromStateMachineCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromDurationObservationToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCommentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromActivityCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCollaborationCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromTimeObservationToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInteractionCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromActivityCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromTimeObservationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromStateMachineCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromActivityCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromConstraintToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromProtocolStateMachineCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromStateMachineCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromProtocolStateMachineCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromClassCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromFunctionBehaviorCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromClassCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromActivityCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromOpaqueBehaviorCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInteractionCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCollaborationCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromDurationObservationToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInteractionCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInformationItemToComment() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromDurationObservationToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromActivityCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromProtocolStateMachineCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInformationItemToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInformationItemToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInformationItemToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromFunctionBehaviorCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromClassCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromStateMachineCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromStateMachineCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToComment() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromTimeObservationToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCollaborationCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromActivityCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCollaborationCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromTimeObservationToComment() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInformationItemToComment() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDurationObservationToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromProtocolStateMachineCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCollaborationCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInteractionCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromTimeObservationToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromFunctionBehaviorCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromFunctionBehaviorCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInteractionCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromFunctionBehaviorCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromClassCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInteractionCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromOpaqueBehaviorCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInteractionCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromTimeObservationToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromConstraintToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromTimeObservationToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCommentToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromFunctionBehaviorCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromActivityCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromActivityCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromClassCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromProtocolStateMachineCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromFunctionBehaviorCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromProtocolStateMachineCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCommentToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromTimeObservationToComment() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromTimeObservationToComment() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromActivityCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCommentToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromProtocolStateMachineCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromProtocolStateMachineCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInteractionCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromProtocolStateMachineCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromClassCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromActivityCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInteractionCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromOpaqueBehaviorCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromOpaqueBehaviorCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromTimeObservationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromProtocolStateMachineCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromDurationObservationToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCollaborationCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromActivityCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInteractionCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromFunctionBehaviorCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromClassCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromActivityCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromTimeObservationToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDurationObservationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromTimeObservationToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromTimeObservationToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromOpaqueBehaviorCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromActivityCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromOpaqueBehaviorCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCollaborationCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromTimeObservationToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInteractionCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromStateMachineCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromFunctionBehaviorCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCollaborationCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromActivityCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromFunctionBehaviorCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromFunctionBehaviorCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromFunctionBehaviorCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromStateMachineCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromStateMachineCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInteractionCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromConstraintToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCollaborationCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromDurationObservationToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDurationObservationToComment() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromProtocolStateMachineCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInformationItemToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInteractionCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromProtocolStateMachineCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromStateMachineCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromFunctionBehaviorCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDurationObservationToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInteractionCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDurationObservationToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCollaborationCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromTimeObservationToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromStateMachineCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromOpaqueBehaviorCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromFunctionBehaviorCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCollaborationCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromProtocolStateMachineCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromOpaqueBehaviorCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromTimeObservationToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCommentToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCollaborationCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDurationObservationToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCollaborationCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromTimeObservationToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromProtocolStateMachineCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromFunctionBehaviorCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromActivityCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInteractionCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInformationItemToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromClassCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromTimeObservationToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCollaborationCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromProtocolStateMachineCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromProtocolStateMachineCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromStateMachineCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCollaborationCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromFunctionBehaviorCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromActivityCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromActivityCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromFunctionBehaviorCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInformationItemToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromStateMachineCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInformationItemToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCollaborationCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromStateMachineCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromDurationObservationToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInteractionCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCollaborationCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromClassCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCollaborationCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInteractionCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromConstraintToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInformationItemToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInteractionCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromTimeObservationToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCollaborationCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromProtocolStateMachineCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromConstraintToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromDurationObservationToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInformationItemToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromActivityCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInformationItemToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromOpaqueBehaviorCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromProtocolStateMachineCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromActivityCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInformationItemToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromProtocolStateMachineCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromConstraintToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInformationItemToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromActivityCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromDurationObservationToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromClassCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromTimeObservationToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromTimeObservationToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromFunctionBehaviorCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInteractionCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromProtocolStateMachineCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCommentToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromDurationObservationToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromFunctionBehaviorCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromOpaqueBehaviorCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromClassCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromActivityCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDurationObservationToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDurationObservationToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromClassCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromActivityCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromStateMachineCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromTimeObservationToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCollaborationCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromActivityCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromFunctionBehaviorCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromStateMachineCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInformationItemToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInteractionCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDurationObservationToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromProtocolStateMachineCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInteractionCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromConstraintToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromFunctionBehaviorCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromClassCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromClassCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInformationItemToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromOpaqueBehaviorCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromOpaqueBehaviorCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInteractionCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromOpaqueBehaviorCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInformationItemToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromConstraintToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromProtocolStateMachineCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromFunctionBehaviorCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInteractionCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromConstraintToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInformationItemToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInformationItemToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDurationObservationToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromFunctionBehaviorCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromStateMachineCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromActivityCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromProtocolStateMachineCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromProtocolStateMachineCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromClassCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromOpaqueBehaviorCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInformationItemToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromDurationObservationToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInteractionCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromActivityCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromConstraintToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromClassCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromOpaqueBehaviorCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromActivityCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromOpaqueBehaviorCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromOpaqueBehaviorCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromStateMachineCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromFunctionBehaviorCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromProtocolStateMachineCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCollaborationCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDurationObservationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromActivityCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInformationItemToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromStateMachineCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromClassCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInteractionCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCollaborationCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCollaborationCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromStateMachineCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToComment() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCommentToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromConstraintToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromProtocolStateMachineCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromActivityCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInteractionCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromDurationObservationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromOpaqueBehaviorCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCollaborationCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromActivityCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromOpaqueBehaviorCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromFunctionBehaviorCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromTimeObservationToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromFunctionBehaviorCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromDurationObservationToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromActivityCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromClassCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInteractionCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCollaborationCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromTimeObservationToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInteractionCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromOpaqueBehaviorCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromDurationObservationToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromActivityCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCollaborationCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromStateMachineCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInteractionCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromFunctionBehaviorCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromDurationObservationToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromStateMachineCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromFunctionBehaviorCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromTimeObservationToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromDurationObservationToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromOpaqueBehaviorCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInformationItemToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromTimeObservationToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromOpaqueBehaviorCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromInformationItemToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromActivityCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromOpaqueBehaviorCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromOpaqueBehaviorCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromStateMachineCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInformationItemToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDurationObservationToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromClassCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInteractionCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromOpaqueBehaviorCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromDurationObservationToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromProtocolStateMachineCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromDurationObservationToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromDurationObservationToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromTimeObservationToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCommentToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromStateMachineCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromProtocolStateMachineCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInformationItemToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromOpaqueBehaviorCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromOpaqueBehaviorCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCommentToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInteractionCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromStateMachineCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromConstraintToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromClassCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDurationObservationToComment() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromProtocolStateMachineCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromDurationObservationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCommentToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDurationObservationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDurationObservationToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromTimeObservationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromOpaqueBehaviorCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromConstraintToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDurationObservationToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromTimeObservationToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromProtocolStateMachineCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromFunctionBehaviorCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromProtocolStateMachineCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromTimeObservationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromFunctionBehaviorCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromActivityCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromFunctionBehaviorCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromTimeObservationToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDurationObservationToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromConstraintToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromActivityCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromClassCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromFunctionBehaviorCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromProtocolStateMachineCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromDurationObservationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromFunctionBehaviorCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInteractionCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromActivityCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromActivityCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromProtocolStateMachineCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromClassCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromTimeObservationToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromFunctionBehaviorCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromConstraintToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromDurationObservationToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromFunctionBehaviorCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromTimeObservationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromTimeObservationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCollaborationCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInformationItemToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromFunctionBehaviorCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromStateMachineCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromStateMachineCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCollaborationCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromStateMachineCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInformationItemToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromProtocolStateMachineCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromClassCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCollaborationCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromFunctionBehaviorCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromTimeObservationToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromProtocolStateMachineCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromFunctionBehaviorCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromStateMachineCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromStateMachineCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromProtocolStateMachineCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromActivityCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromTimeObservationToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromProtocolStateMachineCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromStateMachineCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromActivityCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCollaborationCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromFunctionBehaviorCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromActivityCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromActivityCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromConstraintToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromClassCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromStateMachineCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromOpaqueBehaviorCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCollaborationCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInteractionCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromOpaqueBehaviorCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromFunctionBehaviorCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromTimeObservationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromActivityCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromFunctionBehaviorCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromFunctionBehaviorCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCollaborationCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromClassCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromInformationItemToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromCommentToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDurationObservationToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCollaborationCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromFunctionBehaviorCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromStateMachineCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromCollaborationCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromTimeObservationToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromConstraintToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromProtocolStateMachineCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromFunctionBehaviorCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromConstraintToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromFunctionBehaviorCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Connector.
	 */
	@Test
	public void testLinkConnectorFromStateMachineCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConnectorEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDurationObservationToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromStateMachineCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInteractionCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkRoleBindingFromClassCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RoleBindingEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDurationObservationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromActivityCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromInformationItemToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromFunctionBehaviorCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromActivityCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	public void testLinkRealizationFromStateMachineCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromStateMachineCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDurationObservationToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromProtocolStateMachineCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
}	
