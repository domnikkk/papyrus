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
package org.eclipse.papyrus.uml.diagram.composite.test.appearance;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
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
import org.eclipse.papyrus.uml.diagram.tests.appearance.AppearanceNodeTest;
import org.junit.Test;

/**
 * The Class TestCompositeStructureAppearanceGen.
 */
public class TestCompositeStructureAppearanceGen extends AppearanceNodeTest {

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
	 * Test to manage component LiteralNull.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeLiteralNullEditPart() {
		testAppearance(UMLElementTypes.getElementType(LiteralNullEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component CallEvent.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeCallEventEditPart() {
		testAppearance(UMLElementTypes.getElementType(CallEventEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component PrimitiveType.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodePrimitiveTypeEditPart() {
		testAppearance(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component LiteralUnlimitedNatural.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeLiteralUnlimitedNaturalEditPart() {
		testAppearance(UMLElementTypes.getElementType(LiteralUnlimitedNaturalEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component OpaqueExpression.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeOpaqueExpressionEditPart() {
		testAppearance(UMLElementTypes.getElementType(OpaqueExpressionEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component InstanceValue.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeInstanceValueEditPart() {
		testAppearance(UMLElementTypes.getElementType(InstanceValueEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component TimeExpression.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeTimeExpressionEditPart() {
		testAppearance(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component TimeEvent.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeTimeEventEditPart() {
		testAppearance(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Actor.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeActorEditPart() {
		testAppearance(UMLElementTypes.getElementType(ActorEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component StringExpression.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeStringExpressionEditPart() {
		testAppearance(UMLElementTypes.getElementType(StringExpressionEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component LiteralString.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeLiteralStringEditPart() {
		testAppearance(UMLElementTypes.getElementType(LiteralStringEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component LiteralInteger.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeLiteralIntegerEditPart() {
		testAppearance(UMLElementTypes.getElementType(LiteralIntegerEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component InformationItem.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeInformationItemEditPart() {
		testAppearance(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component TimeInterval.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeTimeIntervalEditPart() {
		testAppearance(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component SignalEvent.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeSignalEventEditPart() {
		testAppearance(UMLElementTypes.getElementType(SignalEventEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component DurationInterval.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeDurationIntervalEditPart() {
		testAppearance(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Enumeration.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeEnumerationEditPart() {
		testAppearance(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component UseCase.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeUseCaseEditPart() {
		testAppearance(UMLElementTypes.getElementType(UseCaseEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component IntervalConstraint.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeIntervalConstraintEditPart() {
		testAppearance(UMLElementTypes.getElementType(IntervalConstraintEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Interface.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeInterfaceEditPart() {
		testAppearance(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component DataType.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeDataTypeEditPart() {
		testAppearance(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component InteractionConstraint.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeInteractionConstraintEditPart() {
		testAppearance(UMLElementTypes.getElementType(InteractionConstraintEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component LiteralBoolean.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeLiteralBooleanEditPart() {
		testAppearance(UMLElementTypes.getElementType(LiteralBooleanEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component DurationObservation.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeDurationObservationEditPart() {
		testAppearance(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Artifact.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeArtifactEditPart() {
		testAppearance(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component DurationConstraint.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeDurationConstraintEditPart() {
		testAppearance(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Constraint.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeConstraintEditPart() {
		testAppearance(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component TimeObservation.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeTimeObservationEditPart() {
		testAppearance(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component TimeConstraint.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeTimeConstraintEditPart() {
		testAppearance(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component DeploymentSpecification.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeDeploymentSpecificationEditPart() {
		testAppearance(UMLElementTypes.getElementType(DeploymentSpecificationEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Signal.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeSignalEditPart() {
		testAppearance(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Interval.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeIntervalEditPart() {
		testAppearance(UMLElementTypes.getElementType(IntervalEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Duration.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeDurationEditPart() {
		testAppearance(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component ChangeEvent.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeChangeEventEditPart() {
		testAppearance(UMLElementTypes.getElementType(ChangeEventEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component AnyReceiveEvent.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeAnyReceiveEventEditPart() {
		testAppearance(UMLElementTypes.getElementType(AnyReceiveEventEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Comment.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeCommentEditPart() {
		testAppearance(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Expression.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeExpressionEditPart() {
		testAppearance(UMLElementTypes.getElementType(ExpressionEditPart.VISUAL_ID));
	}
}
