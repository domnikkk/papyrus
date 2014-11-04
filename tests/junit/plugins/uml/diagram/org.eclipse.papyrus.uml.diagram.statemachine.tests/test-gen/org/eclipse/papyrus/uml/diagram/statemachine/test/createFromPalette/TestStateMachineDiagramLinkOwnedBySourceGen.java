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
package org.eclipse.papyrus.uml.diagram.statemachine.test.createFromPalette;

import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.statemachine.CreateStateMachineDiagramCommand;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.FinalStateEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.GeneralizationEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.PseudostateChoiceEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.PseudostateDeepHistoryEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.PseudostateForkEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.PseudostateInitialEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.PseudostateJoinEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.PseudostateJunctionEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.PseudostateShallowHistoryEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.PseudostateTerminateEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.RegionEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.StateEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.StateMachineEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.statemachine.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.statemachine.tests.IStateMachineDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateLinkOwnedBySourceFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestStateMachineDiagramLinkOwnedBySourceGen.
 */
public class TestStateMachineDiagramLinkOwnedBySourceGen extends CreateLinkOwnedBySourceFromPaletteTest {
	
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateStateMachineDiagramCommand();
	}
	 
	@Override
	protected String getProjectName() {
		return IStateMachineDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return IStateMachineDiagramTestsConstants.FILE_NAME;
	}

	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJoinToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateDeepHistoryToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateDeepHistoryToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateTerminateToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJoinToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateTerminateToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromFinalStateToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateChoiceToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJoinToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromRegionToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateForkToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateShallowHistoryToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJunctionToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateTerminateToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateShallowHistoryToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromFinalStateToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateInitialToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJunctionToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateChoiceToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateForkToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromRegionToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateDeepHistoryToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromRegionToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromFinalStateToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateShallowHistoryToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateForkToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateChoiceToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJoinToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateDeepHistoryToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJunctionToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromFinalStateToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateDeepHistoryToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateShallowHistoryToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromFinalStateToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromRegionToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateTerminateToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateInitialToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateForkToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateForkToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateInitialToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateDeepHistoryToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromFinalStateToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateChoiceToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateForkToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateForkToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromRegionToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromFinalStateToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateInitialToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJunctionToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateDeepHistoryToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJoinToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateShallowHistoryToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJunctionToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateForkToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromRegionToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateInitialToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJunctionToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateShallowHistoryToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateInitialToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateInitialToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJunctionToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateDeepHistoryToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateDeepHistoryToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJunctionToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateForkToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateTerminateToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromRegionToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateChoiceToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateChoiceToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateChoiceToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromRegionToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJoinToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromFinalStateToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJunctionToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateTerminateToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateTerminateToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromFinalStateToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateForkToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJoinToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateShallowHistoryToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateDeepHistoryToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateInitialToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromRegionToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromFinalStateToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromFinalStateToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateInitialToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateForkToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromFinalStateToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateInitialToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateInitialToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromRegionToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromFinalStateToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJunctionToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateInitialToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJoinToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJunctionToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateInitialToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateChoiceToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateShallowHistoryToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateForkToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateChoiceToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateShallowHistoryToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateChoiceToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateForkToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateTerminateToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJoinToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateTerminateToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJunctionToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJoinToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateChoiceToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateChoiceToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateTerminateToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateShallowHistoryToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromRegionToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJoinToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJunctionToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJunctionToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJoinToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJoinToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateChoiceToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateTerminateToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateTerminateToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateShallowHistoryToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateTerminateToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateTerminateToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromRegionToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateShallowHistoryToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateShallowHistoryToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateJoinToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromFinalStateToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateDeepHistoryToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateDeepHistoryToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateForkToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromRegionToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateShallowHistoryToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateDeepHistoryToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateChoiceToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromRegionToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateInitialToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateMachineToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPseudostateDeepHistoryToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStateToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
}	
