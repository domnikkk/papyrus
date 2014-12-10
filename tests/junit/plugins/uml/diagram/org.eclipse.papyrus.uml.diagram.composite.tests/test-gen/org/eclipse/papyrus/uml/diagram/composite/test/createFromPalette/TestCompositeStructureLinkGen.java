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
package org.eclipse.papyrus.uml.diagram.composite.test.createFromPalette;

import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.composite.CreateCompositeDiagramCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.AbstractionEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ClassCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.CollaborationCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DependencyEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DeploymentEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DurationConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DurationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DurationIntervalEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DurationObservationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.InformationItemEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.InteractionCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.OpaqueBehaviorCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.RealizationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.StateMachineCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeEventEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeExpressionEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeIntervalEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeObservationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.UsageEditPart;
import org.eclipse.papyrus.uml.diagram.composite.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.composite.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.composite.test.ICompositeDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateLinkFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestCompositeStructureLinkGen.
 */
public class TestCompositeStructureLinkGen extends CreateLinkFromPaletteTest {
	
	
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
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationIntervalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInteractionCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInteractionCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromOpaqueBehaviorCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInteractionCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeObservationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInteractionCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeExpressionToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInteractionCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeExpressionToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromStateMachineCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeIntervalToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInteractionCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationObservationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCollaborationCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeEventToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationObservationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeExpressionToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationIntervalToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromStateMachineCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromOpaqueBehaviorCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInteractionCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStateMachineCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationIntervalToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromStateMachineCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeEventToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromStateMachineCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeExpressionToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeExpressionToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationIntervalToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCollaborationCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationIntervalToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeEventToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeIntervalToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationObservationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeIntervalToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromOpaqueBehaviorCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInteractionCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeEventToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeExpressionToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInformationItemToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInteractionCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationIntervalToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCollaborationCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationObservationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeExpressionToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeObservationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationObservationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromOpaqueBehaviorCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationObservationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationObservationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInteractionCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeExpressionToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeObservationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeEventToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCollaborationCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCollaborationCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCollaborationCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromStateMachineCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationIntervalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInteractionCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeIntervalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromOpaqueBehaviorCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeIntervalToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeObservationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromStateMachineCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeObservationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInteractionCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationIntervalToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCollaborationCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromStateMachineCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromClassCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeExpressionToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromOpaqueBehaviorCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationIntervalToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeEventToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInteractionCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationIntervalToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromStateMachineCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeEventToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStateMachineCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationIntervalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeExpressionToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCollaborationCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationIntervalToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeEventToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeObservationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromOpaqueBehaviorCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromClassCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeExpressionToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeIntervalToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeEventToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeIntervalToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromStateMachineCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeExpressionToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInteractionCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeEventToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeIntervalToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInformationItemToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeIntervalToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeIntervalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInteractionCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCollaborationCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeIntervalToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationIntervalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationIntervalToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromClassCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeObservationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeExpressionToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromOpaqueBehaviorCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromStateMachineCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeEventToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationObservationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationIntervalToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInformationItemToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeIntervalToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInteractionCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeIntervalToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeEventToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationObservationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeEventToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeExpressionToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromStateMachineCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationObservationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeObservationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationObservationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromStateMachineCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeExpressionToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationObservationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromOpaqueBehaviorCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeIntervalToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCollaborationCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromOpaqueBehaviorCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromStateMachineCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationIntervalToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInformationItemToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInteractionCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromOpaqueBehaviorCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromStateMachineCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCollaborationCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeObservationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStateMachineCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationObservationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromStateMachineCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeEventToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeObservationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromOpaqueBehaviorCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInteractionCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromStateMachineCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationObservationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromStateMachineCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCollaborationCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCollaborationCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCollaborationCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCollaborationCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationObservationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeExpressionToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeExpressionToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeObservationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationObservationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeIntervalToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeObservationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromOpaqueBehaviorCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeIntervalToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromOpaqueBehaviorCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromStateMachineCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeObservationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeEventToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationIntervalToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeExpressionToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeObservationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationObservationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInteractionCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeObservationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeIntervalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeObservationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationObservationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeEventToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeObservationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInteractionCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationObservationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationObservationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeIntervalToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromClassCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromOpaqueBehaviorCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeIntervalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInteractionCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInteractionCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromStateMachineCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeExpressionToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromOpaqueBehaviorCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromStateMachineCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInteractionCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromStateMachineCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationIntervalToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeIntervalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromOpaqueBehaviorCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeObservationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationIntervalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeIntervalToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromOpaqueBehaviorCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromStateMachineCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromStateMachineCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationObservationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCollaborationCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromOpaqueBehaviorCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromStateMachineCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationObservationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationObservationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeEventToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromOpaqueBehaviorCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationIntervalToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromOpaqueBehaviorCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInteractionCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromStateMachineCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationIntervalToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeIntervalToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeObservationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInteractionCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInteractionCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCollaborationCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInteractionCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationObservationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCollaborationCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeIntervalToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCollaborationCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInteractionCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeIntervalToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromOpaqueBehaviorCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationIntervalToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeExpressionToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInteractionCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCollaborationCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCollaborationCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeIntervalToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromOpaqueBehaviorCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeExpressionToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeExpressionToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationIntervalToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromStateMachineCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationIntervalToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeEventToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromStateMachineCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeExpressionToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromOpaqueBehaviorCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeExpressionToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromClassCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeExpressionToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCollaborationCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeExpressionToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationIntervalToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationObservationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeObservationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeExpressionToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCollaborationCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromStateMachineCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeEventToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeIntervalToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeExpressionToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeIntervalToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeIntervalToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromStateMachineCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationIntervalToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationObservationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInteractionCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationIntervalToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeExpressionToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeIntervalToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStateMachineCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromOpaqueBehaviorCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeEventToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeEventToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeObservationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationObservationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeIntervalToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationObservationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeObservationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeObservationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationIntervalToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromStateMachineCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInteractionCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeEventToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInformationItemToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeIntervalToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationIntervalToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromStateMachineCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeIntervalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStateMachineCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationIntervalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCollaborationCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeExpressionToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeEventToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationIntervalToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeIntervalToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCollaborationCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeEventToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationIntervalToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInteractionCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationIntervalToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeIntervalToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromOpaqueBehaviorCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeIntervalToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromOpaqueBehaviorCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationObservationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInteractionCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeObservationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationIntervalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeObservationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeObservationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeExpressionToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeIntervalToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromOpaqueBehaviorCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCollaborationCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationIntervalToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeIntervalToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationIntervalToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromStateMachineCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeExpressionToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInteractionCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromStateMachineCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationIntervalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromStateMachineCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeObservationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeIntervalToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeExpressionToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationObservationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeIntervalToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeIntervalToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationObservationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationObservationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeEventToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromClassCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeEventToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromOpaqueBehaviorCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeExpressionToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCollaborationCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInteractionCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeIntervalToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeExpressionToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeExpressionToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationIntervalToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromStateMachineCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeEventToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeIntervalToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationIntervalToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromStateMachineCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeIntervalToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCollaborationCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromOpaqueBehaviorCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeObservationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromOpaqueBehaviorCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeExpressionToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInteractionCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeIntervalToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeIntervalToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCollaborationCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeEventToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeObservationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationIntervalToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInformationItemToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStateMachineCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCollaborationCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeExpressionToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCollaborationCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeObservationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStateMachineCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInteractionCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeEventToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeEventToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeEventToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromOpaqueBehaviorCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeObservationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInformationItemToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeIntervalToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeEventToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStateMachineCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInteractionCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromStateMachineCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInteractionCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeObservationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeObservationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeEventToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationIntervalToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCollaborationCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromStateMachineCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeExpressionToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInformationItemToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCollaborationCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromOpaqueBehaviorCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeIntervalToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCollaborationCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeObservationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeExpressionToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCollaborationCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromStateMachineCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCollaborationCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromStateMachineCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromOpaqueBehaviorCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCollaborationCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeEventToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationObservationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeIntervalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeEventToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeExpressionToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromOpaqueBehaviorCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeExpressionToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCollaborationCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationIntervalToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromStateMachineCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationObservationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromStateMachineCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeIntervalToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeObservationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeEventToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationIntervalToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromStateMachineCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationIntervalToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInteractionCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInteractionCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCollaborationCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCollaborationCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInteractionCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeEventToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInteractionCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeExpressionToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInteractionCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeIntervalToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeExpressionToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStateMachineCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeEventToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInteractionCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationObservationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeObservationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromOpaqueBehaviorCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromOpaqueBehaviorCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationIntervalToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeObservationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeObservationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationObservationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInformationItemToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStateMachineCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCollaborationCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeExpressionToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationObservationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationIntervalToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromOpaqueBehaviorCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationIntervalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeExpressionToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromStateMachineCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationIntervalToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInteractionCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeObservationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCollaborationCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCollaborationCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeEventToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromOpaqueBehaviorCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeIntervalToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromClassCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromStateMachineCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationObservationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationObservationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCollaborationCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeObservationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeEventToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeIntervalToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationIntervalToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStateMachineCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromOpaqueBehaviorCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeIntervalToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCollaborationCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInteractionCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCollaborationCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeObservationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeObservationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationIntervalToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeExpressionToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationIntervalToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCollaborationCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromOpaqueBehaviorCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromOpaqueBehaviorCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCollaborationCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeEventToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInteractionCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCollaborationCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInteractionCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationObservationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeObservationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationIntervalToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationIntervalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationObservationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeObservationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeIntervalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromStateMachineCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationObservationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInteractionCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeIntervalToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeEventToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInformationItemToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeEventToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeObservationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeEventToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeObservationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeEventToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeEventToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromStateMachineCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCollaborationCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationObservationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeObservationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromStateMachineCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInteractionCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationIntervalToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromStateMachineCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromStateMachineCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromStateMachineCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromStateMachineCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInteractionCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeIntervalToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeEventToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationIntervalToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeObservationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCollaborationCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeExpressionToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInteractionCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCollaborationCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationObservationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromStateMachineCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationIntervalToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeEventToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeEventToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationObservationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationIntervalToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeObservationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromStateMachineCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeExpressionToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInteractionCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromStateMachineCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationIntervalToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInteractionCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromStateMachineCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeObservationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationIntervalToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInteractionCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCollaborationCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeEventToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCollaborationCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationIntervalToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeEventToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeObservationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeExpressionToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeIntervalToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromOpaqueBehaviorCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeObservationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCollaborationCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeIntervalToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInteractionCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeEventToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromOpaqueBehaviorCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCollaborationCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationIntervalToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromOpaqueBehaviorCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationIntervalToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromOpaqueBehaviorCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromOpaqueBehaviorCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeIntervalToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeEventToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeEventToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationIntervalToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeObservationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromClassCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeEventToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCollaborationCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCollaborationCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromOpaqueBehaviorCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationObservationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStateMachineCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeEventToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromOpaqueBehaviorCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCollaborationCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationIntervalToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInteractionCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeEventToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeExpressionToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeExpressionToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInteractionCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeIntervalToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromStateMachineCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationIntervalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeEventToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInformationItemToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCollaborationCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromOpaqueBehaviorCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationObservationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromOpaqueBehaviorCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCollaborationCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeObservationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromStateMachineCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationObservationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeObservationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCollaborationCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeObservationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeIntervalToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromStateMachineCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeObservationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeExpressionToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeEventToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationObservationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCollaborationCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInteractionCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationIntervalToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStateMachineCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeIntervalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationObservationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationObservationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationIntervalToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeEventToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromOpaqueBehaviorCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeObservationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeExpressionToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeEventToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCollaborationCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeObservationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInteractionCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromStateMachineCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCollaborationCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationIntervalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInteractionCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeIntervalToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCollaborationCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeEventToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCollaborationCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeObservationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationIntervalToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationObservationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeExpressionToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeExpressionToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeExpressionToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromOpaqueBehaviorCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeExpressionToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCollaborationCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationObservationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeIntervalToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationObservationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeIntervalToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeEventToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInteractionCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationIntervalToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInteractionCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromOpaqueBehaviorCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeObservationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationObservationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromOpaqueBehaviorCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeExpressionToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeEventToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationObservationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInteractionCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCollaborationCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCollaborationCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCollaborationCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeExpressionToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeEventToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeExpressionToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationObservationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeExpressionToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeObservationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeObservationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeExpressionToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationIntervalToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromStateMachineCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInteractionCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationObservationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromOpaqueBehaviorCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationIntervalToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromStateMachineCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeExpressionToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeIntervalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromStateMachineCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInformationItemToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeEventToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeExpressionToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeObservationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInteractionCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromOpaqueBehaviorCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInteractionCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeEventToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromOpaqueBehaviorCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCollaborationCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeExpressionToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationIntervalToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromClassCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromOpaqueBehaviorCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationObservationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCollaborationCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCollaborationCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationObservationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInteractionCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromClassCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeObservationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeEventToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInteractionCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCollaborationCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationIntervalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromClassCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromStateMachineCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeExpressionToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeExpressionToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStateMachineCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeExpressionToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInformationItemToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationObservationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeIntervalToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCollaborationCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeEventToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationObservationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationObservationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeIntervalToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeExpressionToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeIntervalToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInformationItemToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeEventToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationIntervalToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromClassCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStateMachineCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCollaborationCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeExpressionToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeObservationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInteractionCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInformationItemToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromOpaqueBehaviorCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationIntervalToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeEventToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCollaborationCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeEventToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInformationItemToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeEventToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInteractionCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromOpaqueBehaviorCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeEventToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeIntervalToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeEventToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCollaborationCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCollaborationCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeExpressionToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeIntervalToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeExpressionToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeIntervalToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInteractionCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeObservationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeIntervalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeEventToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeExpressionToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeExpressionToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeEventToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromClassCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromStateMachineCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStateMachineCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeExpressionToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeIntervalToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationObservationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeIntervalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInteractionCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInteractionCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeEventToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationIntervalToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCollaborationCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDurationIntervalToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeExpressionToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationIntervalToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationIntervalToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInteractionCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeEventToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeEventToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeExpressionToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationObservationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromOpaqueBehaviorCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeObservationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeEventToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromOpaqueBehaviorCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeExpressionToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromOpaqueBehaviorCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromStateMachineCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeObservationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationIntervalToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationObservationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromClassCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeObservationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationObservationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromClassCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationObservationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationIntervalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationObservationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeExpressionToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeIntervalToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationObservationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromOpaqueBehaviorCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeObservationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInformationItemToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeIntervalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCollaborationCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInteractionCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromClassCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromStateMachineCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromOpaqueBehaviorCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeExpressionToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationIntervalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationObservationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeExpressionToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInteractionCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationIntervalToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeIntervalToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationObservationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeObservationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeEventToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeExpressionToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStateMachineCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeExpressionToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCollaborationCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeIntervalToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInteractionCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromStateMachineCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDurationObservationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInteractionCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromOpaqueBehaviorCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInteractionCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeExpressionToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeIntervalToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDurationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeObservationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromOpaqueBehaviorCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInteractionCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationObservationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInteractionCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeIntervalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeIntervalToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInteractionCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeEventToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeIntervalToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCollaborationCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromInteractionCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromOpaqueBehaviorCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDurationIntervalToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromClassCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeEventToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeIntervalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDurationObservationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCollaborationCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeObservationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromTimeConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromTimeObservationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromTimeConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromTimeIntervalToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromTimeEventToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
}	
