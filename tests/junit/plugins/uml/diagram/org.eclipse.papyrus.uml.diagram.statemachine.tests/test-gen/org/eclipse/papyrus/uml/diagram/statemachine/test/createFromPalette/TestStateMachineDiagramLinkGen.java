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
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.TransitionEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.statemachine.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.statemachine.tests.IStateMachineDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateLinkFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestStateMachineDiagramLinkGen.
 */
public class TestStateMachineDiagramLinkGen extends CreateLinkFromPaletteTest {
	
	
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
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateDeepHistoryToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateMachineToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromRegionToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateMachineToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateChoiceToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromFinalStateToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJoinToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJoinToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateShallowHistoryToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateMachineToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateChoiceToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJunctionToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromFinalStateToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateDeepHistoryToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromConstraintToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromConstraintToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateTerminateToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateTerminateToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJoinToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateTerminateToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateShallowHistoryToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromCommentToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJoinToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateDeepHistoryToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateInitialToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateForkToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromFinalStateToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateDeepHistoryToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromRegionToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromConstraintToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateShallowHistoryToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateInitialToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateForkToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromCommentToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateDeepHistoryToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromRegionToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJunctionToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJoinToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateMachineToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromRegionToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromCommentToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromCommentToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateInitialToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromRegionToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromRegionToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateDeepHistoryToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateShallowHistoryToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateChoiceToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromConstraintToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJunctionToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromCommentToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateInitialToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromFinalStateToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateTerminateToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateShallowHistoryToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromFinalStateToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateInitialToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromFinalStateToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromConstraintToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateDeepHistoryToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateChoiceToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromFinalStateToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromCommentToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromRegionToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateForkToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromConstraintToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateMachineToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateForkToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJunctionToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromFinalStateToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJunctionToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromConstraintToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateMachineToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJoinToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromConstraintToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJunctionToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateShallowHistoryToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromConstraintToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJoinToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateForkToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateMachineToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateTerminateToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromCommentToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJunctionToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromRegionToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromRegionToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateShallowHistoryToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateMachineToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateTerminateToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateShallowHistoryToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromCommentToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromRegionToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateChoiceToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateTerminateToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateTerminateToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateTerminateToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateChoiceToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromRegionToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateForkToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateForkToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateInitialToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateTerminateToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromFinalStateToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateChoiceToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromFinalStateToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateTerminateToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromFinalStateToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateDeepHistoryToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateDeepHistoryToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateDeepHistoryToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJunctionToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateChoiceToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromCommentToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateInitialToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromFinalStateToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateShallowHistoryToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateShallowHistoryToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateShallowHistoryToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateMachineToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateMachineToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJunctionToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateMachineToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJoinToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJoinToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJunctionToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateForkToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateInitialToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromConstraintToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateInitialToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateMachineToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateMachineToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateDeepHistoryToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJoinToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromCommentToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromFinalStateToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateShallowHistoryToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateInitialToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateInitialToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateTerminateToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateForkToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateDeepHistoryToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateTerminateToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJoinToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateTerminateToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateChoiceToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromRegionToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromConstraintToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateShallowHistoryToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateChoiceToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJunctionToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateForkToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateChoiceToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJunctionToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateMachineToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromCommentToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJoinToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateDeepHistoryToPseudostateShallowHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateInitialToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateForkToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateShallowHistoryToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromFinalStateToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromRegionToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromConstraintToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateDeepHistoryToPseudostateInitial() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromRegionToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateForkToStateMachine() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateChoiceToPseudostateChoice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJoinToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateChoiceToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateInitialToFinalState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJoinToPseudostateFork() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateForkToState() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateForkToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJunctionToPseudostateJunction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateInitialToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateChoiceToPseudostateJoin() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromCommentToPseudostateTerminate() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromPseudostateJunctionToRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Transition.
	 */
	@Test
	@GeneratedTest
	public void testLinkTransitionFromStateToPseudostateDeepHistory() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(TransitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
}	
