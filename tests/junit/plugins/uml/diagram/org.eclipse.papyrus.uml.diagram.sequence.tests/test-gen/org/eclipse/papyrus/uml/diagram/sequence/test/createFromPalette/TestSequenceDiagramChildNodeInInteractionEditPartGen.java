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
package org.eclipse.papyrus.uml.diagram.sequence.test.createFromPalette;

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.sequence.CreateSequenceDiagramCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.ActionExecutionSpecificationEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.BehaviorExecutionSpecificationEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.CombinedFragment2EditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.CombinedFragmentEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.ConsiderIgnoreFragmentEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.DurationConstraintInMessageEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.DurationObservationEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.InteractionEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.InteractionOperandEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.InteractionUseEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.LifelineEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.sequence.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.sequence.tests.ISequenceDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateNodeFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestSequenceDiagramChildNodeInInteractionEditPartGen.
 */
public class TestSequenceDiagramChildNodeInInteractionEditPartGen extends CreateNodeFromPaletteTest {
	
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateSequenceDiagramCommand();
	}
	 
	@Override
	protected String getProjectName() {
		return ISequenceDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return ISequenceDiagramTestsConstants.FILE_NAME;
	}

	/**
	 * Test to manage component Constraint.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeConstraintEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component BehaviorExecutionSpecification.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeBehaviorExecutionSpecificationEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(BehaviorExecutionSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component DurationConstraint.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeDurationConstraintInMessageEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(DurationConstraintInMessageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InteractionOperand.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeInteractionOperandEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(InteractionOperandEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ConsiderIgnoreFragment.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeConsiderIgnoreFragmentEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ConsiderIgnoreFragmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ActionExecutionSpecification.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeActionExecutionSpecificationEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ActionExecutionSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InteractionUse.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeInteractionUseEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(InteractionUseEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component DurationObservation.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeDurationObservationEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component CombinedFragment.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeCombinedFragmentEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CombinedFragmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Comment.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeCommentEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Lifeline.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeLifelineEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component CombinedFragment.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeCombinedFragment2EditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CombinedFragment2EditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPart.VISUAL_ID), true);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override 
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.getElementType(InteractionEditPart.VISUAL_ID), getDiagramEditPart().getDiagramPreferencesHint());
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.TYPED_INSTANCE;
	}
	
}	
