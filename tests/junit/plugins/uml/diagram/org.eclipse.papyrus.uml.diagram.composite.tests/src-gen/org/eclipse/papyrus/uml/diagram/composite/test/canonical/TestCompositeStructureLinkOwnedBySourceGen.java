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
import org.eclipse.papyrus.diagram.tests.canonical.TestLinkOwnedBySource;
import org.eclipse.papyrus.uml.diagram.composite.CreateCompositeStructureCommand;
import org.eclipse.papyrus.uml.diagram.composite.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.SubstitutionEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.GeneralizationEditPart;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestCompositeStructureLinkOwnedBySourceGen.
 */
public class TestCompositeStructureLinkOwnedBySourceGen extends TestLinkOwnedBySource {
	
	
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
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromActivityCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToComment() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromProtocolStateMachineCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromFunctionBehaviorCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromActivityCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToComment() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromFunctionBehaviorCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromProtocolStateMachineCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromFunctionBehaviorCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromProtocolStateMachineCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromFunctionBehaviorCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromFunctionBehaviorCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromProtocolStateMachineCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromFunctionBehaviorCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromProtocolStateMachineCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromActivityCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromFunctionBehaviorCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromProtocolStateMachineCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromProtocolStateMachineCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToComment() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromFunctionBehaviorCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromFunctionBehaviorCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromProtocolStateMachineCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromProtocolStateMachineCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromActivityCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromProtocolStateMachineCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromProtocolStateMachineCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromActivityCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromActivityCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromProtocolStateMachineCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromActivityCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromProtocolStateMachineCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromActivityCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromActivityCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromProtocolStateMachineCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToComment() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromActivityCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromFunctionBehaviorCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromActivityCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromFunctionBehaviorCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromActivityCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromProtocolStateMachineCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromProtocolStateMachineCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromActivityCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromFunctionBehaviorCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromActivityCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromProtocolStateMachineCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromFunctionBehaviorCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromFunctionBehaviorCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromActivityCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromFunctionBehaviorCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromProtocolStateMachineCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromActivityCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromFunctionBehaviorCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToComment() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromActivityCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromActivityCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromActivityCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromFunctionBehaviorCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromFunctionBehaviorCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromFunctionBehaviorCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromActivityCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromActivityCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromActivityCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromFunctionBehaviorCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromProtocolStateMachineCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromFunctionBehaviorCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromProtocolStateMachineCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromActivityCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromProtocolStateMachineCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromActivityCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromFunctionBehaviorCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromProtocolStateMachineCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromProtocolStateMachineCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromFunctionBehaviorCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromActivityCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromFunctionBehaviorCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromProtocolStateMachineCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromActivityCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromFunctionBehaviorCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromActivityCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromProtocolStateMachineCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromProtocolStateMachineCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToComment() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromFunctionBehaviorCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromProtocolStateMachineCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromActivityCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToComment() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromFunctionBehaviorCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromActivityCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromFunctionBehaviorCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromFunctionBehaviorCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromProtocolStateMachineCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromActivityCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromFunctionBehaviorCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromFunctionBehaviorCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromFunctionBehaviorCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromProtocolStateMachineCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromFunctionBehaviorCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromProtocolStateMachineCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromProtocolStateMachineCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromProtocolStateMachineCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromActivityCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromFunctionBehaviorCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromActivityCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromTimeObservationToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromProtocolStateMachineCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromOpaqueBehaviorCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromProtocolStateMachineCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromProtocolStateMachineCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromActivityCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromActivityCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromFunctionBehaviorCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToComment() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromProtocolStateMachineCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInteractionCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromProtocolStateMachineCompositeToProtocolStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromActivityCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInteractionCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromProtocolStateMachineCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromStateMachineCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromTimeObservationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromTimeObservationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromFunctionBehaviorCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromActivityCompositeToStateMachineComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromActivityCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromOpaqueBehaviorCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCollaborationCompositeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCollaborationCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromActivityCompositeToOpaqueBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCollaborationCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToTimeObservation() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDurationObservationToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDurationObservationToComment() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromStateMachineCompositeToComment() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassCompositeToActivityComposite() {
		testToManageLink(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromProtocolStateMachineCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromFunctionBehaviorCompositeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromFunctionBehaviorCompositeToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromActivityCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(ActivityCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDurationObservationToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToDurationObservation() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToInteractionComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromStateMachineCompositeToCollaborationComposite() {
		testToManageLink(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInteractionCompositeToFunctionBehaviorComposite() {
		testToManageLink(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromOpaqueBehaviorCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromFunctionBehaviorCompositeToClassComposite() {
		testToManageLink(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
}	
