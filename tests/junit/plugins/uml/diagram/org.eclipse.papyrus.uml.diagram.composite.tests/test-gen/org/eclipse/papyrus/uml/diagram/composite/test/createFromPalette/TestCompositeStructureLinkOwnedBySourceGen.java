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
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ClassCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.CollaborationCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DurationConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DurationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DurationIntervalEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DurationObservationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.GeneralizationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.InformationItemEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.InteractionCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.OpaqueBehaviorCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.StateMachineCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.SubstitutionEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeEventEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeExpressionEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeIntervalEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeObservationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.composite.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.composite.test.ICompositeDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateLinkOwnedBySourceFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestCompositeStructureLinkOwnedBySourceGen.
 */
public class TestCompositeStructureLinkOwnedBySourceGen extends CreateLinkOwnedBySourceFromPaletteTest {
	
	
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
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeIntervalToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeEventToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeIntervalToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationIntervalToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeEventToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeEventToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeIntervalToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationIntervalToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeIntervalToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCommentToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeIntervalToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeExpressionToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCommentToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeIntervalToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeExpressionToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeIntervalToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeExpressionToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeEventToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationIntervalToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeIntervalToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeIntervalToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeExpressionToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeEventToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationIntervalToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeEventToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationIntervalToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationIntervalToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeIntervalToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationIntervalToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCommentToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationIntervalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeIntervalToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeIntervalToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationIntervalToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeIntervalToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationIntervalToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationIntervalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeIntervalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeExpressionToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeExpressionToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationIntervalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeExpressionToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeExpressionToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeEventToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeIntervalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeEventToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationIntervalToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationIntervalToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationIntervalToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeIntervalToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationIntervalToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCommentToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationIntervalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCommentToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeEventToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeExpressionToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeEventToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationIntervalToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeIntervalToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationIntervalToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationIntervalToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeIntervalToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeEventToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationIntervalToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeIntervalToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeIntervalToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationIntervalToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeExpressionToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeExpressionToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationIntervalToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeIntervalToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCommentToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeEventToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeEventToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeExpressionToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeExpressionToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeIntervalToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeIntervalToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeEventToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeIntervalToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeExpressionToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeExpressionToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeExpressionToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCommentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeIntervalToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeIntervalToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationIntervalToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeExpressionToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeEventToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeExpressionToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeEventToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeEventToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCommentToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeExpressionToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationIntervalToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeExpressionToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeExpressionToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeExpressionToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeIntervalToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationIntervalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeExpressionToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationIntervalToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeEventToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCommentToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeIntervalToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeEventToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeEventToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeEventToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeIntervalToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeExpressionToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeEventToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeEventToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCommentToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationIntervalToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationIntervalToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeEventToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeExpressionToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeExpressionToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeExpressionToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationIntervalToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeIntervalToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationIntervalToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationIntervalToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeEventToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeExpressionToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationIntervalToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeEventToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationIntervalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeIntervalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeExpressionToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeExpressionToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeEventToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeIntervalToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeEventToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeExpressionToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeExpressionToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeEventToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeExpressionToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeEventToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationIntervalToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeExpressionToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeIntervalToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeEventToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeIntervalToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeIntervalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationIntervalToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationIntervalToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeExpressionToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeIntervalToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeEventToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationIntervalToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeEventToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeIntervalToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeExpressionToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeEventToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeExpressionToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeEventToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeEventToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeIntervalToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeIntervalToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationConstraintToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeEventToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeIntervalToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationIntervalToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCommentToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeEventToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeIntervalToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeEventToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeEventToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeIntervalToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeEventToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationConstraintToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeExpressionToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeExpressionToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromConstraintToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCommentToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationIntervalToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeExpressionToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeExpressionToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeIntervalToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCommentToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeIntervalToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationIntervalToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationIntervalToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationIntervalToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeIntervalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeExpressionToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeEventToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeIntervalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationIntervalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationIntervalToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeExpressionToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeExpressionToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationIntervalToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeIntervalToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeEventToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationConstraintToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeEventToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeIntervalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeEventToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCommentToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeIntervalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeExpressionToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationIntervalToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeEventToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeEventToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeEventToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeExpressionToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationConstraintToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeEventToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeExpressionToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeEventToTimeEvent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeExpressionToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationIntervalToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToCollaborationComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeExpressionToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToDurationConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationIntervalToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeExpressionToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToTimeExpression() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeConstraintToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeIntervalToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeEventToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationIntervalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromCommentToClassComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromConstraintToStateMachineComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationConstraintToDurationObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToOpaqueBehaviorComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromTimeIntervalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromDurationConstraintToDuration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToInteractionComposite() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDurationConstraintToDurationInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromTimeExpressionToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToTimeInterval() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationIntervalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
}	
