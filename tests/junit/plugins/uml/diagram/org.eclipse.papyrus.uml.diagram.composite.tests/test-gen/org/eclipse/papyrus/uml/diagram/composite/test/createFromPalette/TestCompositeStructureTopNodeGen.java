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

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
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
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.InformationItemEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.InteractionCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.OpaqueBehaviorCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.StateMachineCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeEventEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeExpressionEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeIntervalEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeObservationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.composite.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.composite.test.ICompositeDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateNodeFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestCompositeStructureTopNodeGen.
 */
public class TestCompositeStructureTopNodeGen extends CreateNodeFromPaletteTest {
	
	
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
	 * Test to manage component Collaboration.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeCollaborationCompositeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component TimeEvent.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeTimeEventEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(TimeEventEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component TimeInterval.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeTimeIntervalEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(TimeIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationItem.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeInformationItemEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Comment.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeCommentEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Class.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeClassCompositeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Constraint.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeConstraintEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component DurationInterval.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeDurationIntervalEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(DurationIntervalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component StateMachine.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeStateMachineCompositeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(StateMachineCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component TimeObservation.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeTimeObservationEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component TimeExpression.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeTimeExpressionEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(TimeExpressionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component OpaqueBehavior.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeOpaqueBehaviorCompositeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component DurationConstraint.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeDurationConstraintEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Duration.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeDurationEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(DurationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component DurationObservation.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeDurationObservationEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component TimeConstraint.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeTimeConstraintEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Interaction.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeInteractionCompositeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(InteractionCompositeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override 
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), getDiagramEditPart().getDiagramPreferencesHint());
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
	
}	
