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
package org.eclipse.papyrus.uml.diagram.composite.test.drop;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.composite.CreateCompositeDiagramCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ActorEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.AnyReceiveEventEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ArtifactEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.CallEventEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ChangeEventEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DataTypeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DeploymentSpecificationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DurationConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DurationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DurationIntervalEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DurationObservationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.EnumerationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ExpressionEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.InformationItemEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.InstanceValueEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.InteractionConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.InterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.IntervalConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.IntervalEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.LiteralBooleanEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.LiteralIntegerEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.LiteralNullEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.LiteralStringEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.LiteralUnlimitedNaturalEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.OpaqueExpressionEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.PrimitiveTypeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.SignalEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.SignalEventEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.StringExpressionEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeEventEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeExpressionEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeIntervalEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeObservationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.UseCaseEditPart;
import org.eclipse.papyrus.uml.diagram.composite.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.composite.test.ICompositeDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.drop.AbstractDropNodeTest;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

/**
 * The Class TestCompositeStructureDropGen.
 */
public class TestCompositeStructureDropGen extends AbstractDropNodeTest {

	@Override
	public GraphicalEditPart getContainerEditPart() {
		return getDiagramEditPart();
	}
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateCompositeDiagramCommand();
	}
	
	@Override
	protected String getProjectName() {
		return ICompositeDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return ICompositeDiagramTestsConstants.FILE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected View getRootView() {
		return (View)getContainerEditPart().getModel();
	}

	/**
	 * Test to manage component Constraint.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeConstraintEditPart() {
		testToDropNode(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getConstraint()
		, true);
	}
	/**
	 * Test to manage component Comment.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeCommentEditPart() {
		testToDropNode(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getComment()
		, true);
	}
	/**
	 * Test to manage component LiteralUnlimitedNatural.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeLiteralUnlimitedNaturalEditPart() {
		testToDropNode(UMLElementTypes.getElementType(LiteralUnlimitedNaturalEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getLiteralUnlimitedNatural()
		, true);
	}
	/**
	 * Test to manage component StringExpression.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeStringExpressionEditPart() {
		testToDropNode(UMLElementTypes.getElementType(StringExpressionEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getStringExpression()
		, true);
	}
	/**
	 * Test to manage component OpaqueExpression.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeOpaqueExpressionEditPart() {
		testToDropNode(UMLElementTypes.getElementType(OpaqueExpressionEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getOpaqueExpression()
		, true);
	}
	/**
	 * Test to manage component LiteralInteger.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeLiteralIntegerEditPart() {
		testToDropNode(UMLElementTypes.getElementType(LiteralIntegerEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getLiteralInteger()
		, true);
	}
	/**
	 * Test to manage component DurationConstraint.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeDurationConstraintEditPart() {
		testToDropNode(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getDurationConstraint()
		, true);
	}
	/**
	 * Test to manage component Artifact.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeArtifactEditPart() {
		testToDropNode(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getArtifact()
		, true);
	}
	/**
	 * Test to manage component DeploymentSpecification.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeDeploymentSpecificationEditPart() {
		testToDropNode(UMLElementTypes.getElementType(DeploymentSpecificationEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getDeploymentSpecification()
		, true);
	}
	/**
	 * Test to manage component LiteralString.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeLiteralStringEditPart() {
		testToDropNode(UMLElementTypes.getElementType(LiteralStringEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getLiteralString()
		, true);
	}
	/**
	 * Test to manage component Duration.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeDurationEditPart() {
		testToDropNode(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getDuration()
		, true);
	}
	/**
	 * Test to manage component TimeEvent.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeTimeEventEditPart() {
		testToDropNode(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getTimeEvent()
		, true);
	}
	/**
	 * Test to manage component DurationObservation.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeDurationObservationEditPart() {
		testToDropNode(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getDurationObservation()
		, true);
	}
	/**
	 * Test to manage component SignalEvent.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeSignalEventEditPart() {
		testToDropNode(UMLElementTypes.getElementType(SignalEventEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getSignalEvent()
		, true);
	}
	/**
	 * Test to manage component TimeConstraint.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeTimeConstraintEditPart() {
		testToDropNode(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getTimeConstraint()
		, true);
	}
	/**
	 * Test to manage component Interface.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeInterfaceEditPart() {
		testToDropNode(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getInterface()
		, true);
	}
	/**
	 * Test to manage component InteractionConstraint.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeInteractionConstraintEditPart() {
		testToDropNode(UMLElementTypes.getElementType(InteractionConstraintEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getInteractionConstraint()
		, true);
	}
	/**
	 * Test to manage component TimeInterval.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeTimeIntervalEditPart() {
		testToDropNode(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getTimeInterval()
		, true);
	}
	/**
	 * Test to manage component Interval.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeIntervalEditPart() {
		testToDropNode(UMLElementTypes.getElementType(IntervalEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getInterval()
		, true);
	}
	/**
	 * Test to manage component Expression.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeExpressionEditPart() {
		testToDropNode(UMLElementTypes.getElementType(ExpressionEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getExpression()
		, true);
	}
	/**
	 * Test to manage component Enumeration.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeEnumerationEditPart() {
		testToDropNode(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getEnumeration()
		, true);
	}
	/**
	 * Test to manage component PrimitiveType.
	 */
	@Test
	@GeneratedTest
	public void testDropNodePrimitiveTypeEditPart() {
		testToDropNode(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getPrimitiveType()
		, true);
	}
	/**
	 * Test to manage component UseCase.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeUseCaseEditPart() {
		testToDropNode(UMLElementTypes.getElementType(UseCaseEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getUseCase()
		, true);
	}
	/**
	 * Test to manage component Signal.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeSignalEditPart() {
		testToDropNode(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getSignal()
		, true);
	}
	/**
	 * Test to manage component TimeObservation.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeTimeObservationEditPart() {
		testToDropNode(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getTimeObservation()
		, true);
	}
	/**
	 * Test to manage component InformationItem.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeInformationItemEditPart() {
		testToDropNode(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getInformationItem()
		, true);
	}
	/**
	 * Test to manage component CallEvent.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeCallEventEditPart() {
		testToDropNode(UMLElementTypes.getElementType(CallEventEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getCallEvent()
		, true);
	}
	/**
	 * Test to manage component IntervalConstraint.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeIntervalConstraintEditPart() {
		testToDropNode(UMLElementTypes.getElementType(IntervalConstraintEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getIntervalConstraint()
		, true);
	}
	/**
	 * Test to manage component LiteralNull.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeLiteralNullEditPart() {
		testToDropNode(UMLElementTypes.getElementType(LiteralNullEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getLiteralNull()
		, true);
	}
	/**
	 * Test to manage component DurationInterval.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeDurationIntervalEditPart() {
		testToDropNode(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getDurationInterval()
		, true);
	}
	/**
	 * Test to manage component InstanceValue.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeInstanceValueEditPart() {
		testToDropNode(UMLElementTypes.getElementType(InstanceValueEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getInstanceValue()
		, true);
	}
	/**
	 * Test to manage component AnyReceiveEvent.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeAnyReceiveEventEditPart() {
		testToDropNode(UMLElementTypes.getElementType(AnyReceiveEventEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getAnyReceiveEvent()
		, true);
	}
	/**
	 * Test to manage component ChangeEvent.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeChangeEventEditPart() {
		testToDropNode(UMLElementTypes.getElementType(ChangeEventEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getChangeEvent()
		, true);
	}
	/**
	 * Test to manage component LiteralBoolean.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeLiteralBooleanEditPart() {
		testToDropNode(UMLElementTypes.getElementType(LiteralBooleanEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getLiteralBoolean()
		, true);
	}
	/**
	 * Test to manage component DataType.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeDataTypeEditPart() {
		testToDropNode(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getDataType()
		, true);
	}
	/**
	 * Test to manage component TimeExpression.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeTimeExpressionEditPart() {
		testToDropNode(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getTimeExpression()
		, true);
	}
	/**
	 * Test to manage component Actor.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeActorEditPart() {
		testToDropNode(UMLElementTypes.getElementType(ActorEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getActor()
		, true);
	}
	
}
