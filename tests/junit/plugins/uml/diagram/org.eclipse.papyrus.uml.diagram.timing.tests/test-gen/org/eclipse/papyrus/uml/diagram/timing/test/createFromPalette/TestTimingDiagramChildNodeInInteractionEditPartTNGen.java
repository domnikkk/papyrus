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
package org.eclipse.papyrus.uml.diagram.timing.test.createFromPalette;

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.timing.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.tests.CreateNodeFromPaletteTest;
import org.eclipse.papyrus.uml.diagram.timing.CreateTimingDiagramCommand;
import org.eclipse.papyrus.uml.diagram.timing.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.timing.test.ITimingDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.CompactLifelineEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.CompactStateInvariantEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DestructionOccurrenceSpecificationEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TimeConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.GeneralOrderingEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DurationConstraintEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.InteractionEditPartTN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TimeObservationEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageOccurrenceSpecificationEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DurationObservationEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.OccurrenceSpecificationEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FullStateInvariantEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FullLifelineEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.LifelineEditPart;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestTimingDiagramChildNodeInInteractionEditPartTNGen.
 */
public class TestTimingDiagramChildNodeInInteractionEditPartTNGen extends CreateNodeFromPaletteTest {
	
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateTimingDiagramCommand();
	}
	 
	@Override
	protected String getProjectName() {
		return ITimingDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return ITimingDiagramTestsConstants.FILE_NAME;
	}

	/**
	 * Test to manage component DurationConstraint.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeDurationConstraintEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component StateInvariant.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeCompactStateInvariantEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component OccurrenceSpecification.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeOccurrenceSpecificationEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component TimeConstraint.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeTimeConstraintEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component StateInvariant.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeFullStateInvariantEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component DurationObservation.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeDurationObservationEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component MessageOccurrenceSpecification.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeMessageOccurrenceSpecificationEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Lifeline.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeLifelineEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component GeneralOrdering.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeGeneralOrderingEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component TimeObservation.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeTimeObservationEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component DestructionOccurrenceSpecification.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeDestructionOccurrenceSpecificationEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Lifeline.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeCompactLifelineEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Lifeline.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeFullLifelineEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override 
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), getDiagramEditPart().getDiagramPreferencesHint());
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
	
}	
