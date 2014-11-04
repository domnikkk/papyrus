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

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
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
import org.eclipse.papyrus.uml.diagram.statemachine.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.statemachine.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.statemachine.tests.IStateMachineDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateNodeFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestStateMachineDiagramChildNodeInStateMachineEditPartGen.
 */
public class TestStateMachineDiagramChildNodeInStateMachineEditPartGen extends CreateNodeFromPaletteTest {
	
	
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
	 * Test to manage component FinalState.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeFinalStateEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(FinalStateEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Pseudostate.
	 */
	@Test
	@GeneratedTest
	public void testChildNodePseudostateForkEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PseudostateForkEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Pseudostate.
	 */
	@Test
	@GeneratedTest
	public void testChildNodePseudostateJoinEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PseudostateJoinEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Region.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeRegionEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(RegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Pseudostate.
	 */
	@Test
	@GeneratedTest
	public void testChildNodePseudostateChoiceEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PseudostateChoiceEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Pseudostate.
	 */
	@Test
	@GeneratedTest
	public void testChildNodePseudostateJunctionEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PseudostateJunctionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Comment.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeCommentEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Pseudostate.
	 */
	@Test
	@GeneratedTest
	public void testChildNodePseudostateTerminateEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PseudostateTerminateEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Constraint.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeConstraintEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Pseudostate.
	 */
	@Test
	@GeneratedTest
	public void testChildNodePseudostateDeepHistoryEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PseudostateDeepHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component State.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeStateEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(StateEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Pseudostate.
	 */
	@Test
	@GeneratedTest
	public void testChildNodePseudostateShallowHistoryEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PseudostateShallowHistoryEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Pseudostate.
	 */
	@Test
	@GeneratedTest
	public void testChildNodePseudostateInitialEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PseudostateInitialEditPart.VISUAL_ID), UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), true);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override 
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.getElementType(StateMachineEditPart.VISUAL_ID), getDiagramEditPart().getDiagramPreferencesHint());
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
	
}	
