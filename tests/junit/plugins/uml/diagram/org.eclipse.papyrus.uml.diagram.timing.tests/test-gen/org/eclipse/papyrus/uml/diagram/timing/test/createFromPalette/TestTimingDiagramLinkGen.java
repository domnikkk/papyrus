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
import org.eclipse.papyrus.uml.diagram.tests.CreateLinkFromPaletteTest;
import org.eclipse.papyrus.uml.diagram.timing.CreateTimingDiagramCommand;
import org.eclipse.papyrus.uml.diagram.timing.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.timing.test.ITimingDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FullLifelineEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.InteractionEditPartTN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FullStateInvariantEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageLostEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DurationConstraintEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.CompactLifelineEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageDeleteEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageAsyncEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TimeConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.OccurrenceSpecificationEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.GeneralOrderingEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageFoundEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageOccurrenceSpecificationEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.LifelineEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DestructionOccurrenceSpecificationEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.CompactStateInvariantEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageSyncEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageReplyEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageCreateEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TimeObservationEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DurationObservationEditPartCN;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestTimingDiagramLinkGen.
 */
public class TestTimingDiagramLinkGen extends CreateLinkFromPaletteTest {
	
	
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
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromGeneralOrderingToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullLifelineCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromLifelineToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromInteractionTNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeObservationToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationObservationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromMessageOccurrenceSpecificationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactLifelineCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationConstraintCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromGeneralOrderingToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromGeneralOrderingToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromGeneralOrderingToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullLifelineCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromOccurrenceSpecificationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactStateInvariantCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullStateInvariantCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactLifelineCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeConstraintToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullStateInvariantCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromMessageOccurrenceSpecificationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationObservationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromLifelineToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromMessageOccurrenceSpecificationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromGeneralOrderingToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeConstraintToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeObservationToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromMessageOccurrenceSpecificationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromMessageOccurrenceSpecificationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullStateInvariantCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullLifelineCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromOccurrenceSpecificationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromGeneralOrderingToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromOccurrenceSpecificationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromOccurrenceSpecificationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromOccurrenceSpecificationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationObservationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationConstraintCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationObservationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromMessageOccurrenceSpecificationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullLifelineCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullLifelineCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationConstraintCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDestructionOccurrenceSpecificationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullStateInvariantCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDestructionOccurrenceSpecificationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDestructionOccurrenceSpecificationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeObservationToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullLifelineCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromOccurrenceSpecificationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromOccurrenceSpecificationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromGeneralOrderingToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactLifelineCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromGeneralOrderingToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationConstraintCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullLifelineCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactLifelineCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactStateInvariantCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromLifelineToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromInteractionTNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromGeneralOrderingToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromLifelineToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromInteractionTNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullStateInvariantCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactStateInvariantCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactLifelineCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromInteractionTNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromInteractionTNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactLifelineCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromOccurrenceSpecificationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromInteractionTNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromOccurrenceSpecificationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromGeneralOrderingToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromGeneralOrderingToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromLifelineToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactLifelineCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDestructionOccurrenceSpecificationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullStateInvariantCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationObservationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeConstraintToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullLifelineCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromMessageOccurrenceSpecificationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromLifelineToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromInteractionTNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationObservationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactLifelineCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactStateInvariantCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullStateInvariantCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromGeneralOrderingToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeConstraintToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromGeneralOrderingToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDestructionOccurrenceSpecificationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromInteractionTNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeConstraintToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullLifelineCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromInteractionTNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationObservationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationConstraintCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromMessageOccurrenceSpecificationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullStateInvariantCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromMessageOccurrenceSpecificationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromInteractionTNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromInteractionTNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromOccurrenceSpecificationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromLifelineToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDestructionOccurrenceSpecificationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactLifelineCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDestructionOccurrenceSpecificationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullStateInvariantCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromMessageOccurrenceSpecificationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullStateInvariantCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDestructionOccurrenceSpecificationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromMessageOccurrenceSpecificationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromLifelineToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeObservationToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromLifelineToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromLifelineToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromMessageOccurrenceSpecificationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromOccurrenceSpecificationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactLifelineCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationObservationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactStateInvariantCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationConstraintCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullStateInvariantCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDestructionOccurrenceSpecificationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromOccurrenceSpecificationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromLifelineToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactLifelineCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeObservationToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDestructionOccurrenceSpecificationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactStateInvariantCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromGeneralOrderingToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromInteractionTNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromLifelineToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullStateInvariantCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactStateInvariantCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullLifelineCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromGeneralOrderingToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDestructionOccurrenceSpecificationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromInteractionTNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationObservationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationConstraintCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromInteractionTNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromOccurrenceSpecificationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromGeneralOrderingToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationConstraintCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDestructionOccurrenceSpecificationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromOccurrenceSpecificationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromLifelineToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromOccurrenceSpecificationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromLifelineToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactStateInvariantCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeObservationToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromGeneralOrderingToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromMessageOccurrenceSpecificationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromMessageOccurrenceSpecificationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromInteractionTNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromOccurrenceSpecificationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactLifelineCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromMessageOccurrenceSpecificationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromGeneralOrderingToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromLifelineToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDestructionOccurrenceSpecificationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDestructionOccurrenceSpecificationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactLifelineCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromGeneralOrderingToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationConstraintCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromMessageOccurrenceSpecificationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactStateInvariantCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullLifelineCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationConstraintCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactStateInvariantCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactStateInvariantCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullStateInvariantCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromMessageOccurrenceSpecificationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromGeneralOrderingToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromLifelineToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromInteractionTNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeObservationToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromLifelineToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromMessageOccurrenceSpecificationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationObservationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactStateInvariantCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromMessageOccurrenceSpecificationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDestructionOccurrenceSpecificationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromGeneralOrderingToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeConstraintToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDestructionOccurrenceSpecificationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactStateInvariantCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationObservationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeConstraintToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromLifelineToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromGeneralOrderingToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeConstraintToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationConstraintCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationObservationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeObservationToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDestructionOccurrenceSpecificationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactStateInvariantCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactLifelineCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationObservationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromOccurrenceSpecificationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullStateInvariantCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactLifelineCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromMessageOccurrenceSpecificationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactLifelineCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromMessageOccurrenceSpecificationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactLifelineCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactLifelineCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromOccurrenceSpecificationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeObservationToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationObservationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactStateInvariantCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullStateInvariantCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromOccurrenceSpecificationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullLifelineCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDestructionOccurrenceSpecificationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeObservationToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromGeneralOrderingToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactLifelineCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDestructionOccurrenceSpecificationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromOccurrenceSpecificationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromMessageOccurrenceSpecificationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromInteractionTNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDestructionOccurrenceSpecificationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeObservationToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromOccurrenceSpecificationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromOccurrenceSpecificationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeObservationToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactLifelineCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromInteractionTNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDestructionOccurrenceSpecificationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactLifelineCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationConstraintCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromGeneralOrderingToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullStateInvariantCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDestructionOccurrenceSpecificationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationObservationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactStateInvariantCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromInteractionTNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromGeneralOrderingToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactStateInvariantCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationConstraintCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromGeneralOrderingToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromInteractionTNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromInteractionTNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeObservationToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeConstraintToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactLifelineCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactLifelineCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeObservationToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromGeneralOrderingToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactStateInvariantCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactLifelineCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromOccurrenceSpecificationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullLifelineCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromLifelineToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactStateInvariantCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDestructionOccurrenceSpecificationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullLifelineCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromMessageOccurrenceSpecificationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeObservationToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullStateInvariantCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationObservationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactStateInvariantCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeObservationToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullStateInvariantCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationConstraintCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationObservationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDestructionOccurrenceSpecificationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationConstraintCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationObservationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullStateInvariantCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactLifelineCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactLifelineCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationConstraintCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeObservationToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationObservationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeObservationToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromLifelineToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullLifelineCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromMessageOccurrenceSpecificationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullLifelineCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationConstraintCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromOccurrenceSpecificationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationConstraintCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullLifelineCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromGeneralOrderingToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromOccurrenceSpecificationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromGeneralOrderingToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeConstraintToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromGeneralOrderingToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullLifelineCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationObservationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDestructionOccurrenceSpecificationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactStateInvariantCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactStateInvariantCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromMessageOccurrenceSpecificationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromOccurrenceSpecificationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullLifelineCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeConstraintToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationConstraintCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactStateInvariantCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromMessageOccurrenceSpecificationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationConstraintCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullStateInvariantCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationConstraintCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactLifelineCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationConstraintCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromMessageOccurrenceSpecificationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactLifelineCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDestructionOccurrenceSpecificationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromMessageOccurrenceSpecificationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeConstraintToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeConstraintToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromGeneralOrderingToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDestructionOccurrenceSpecificationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullStateInvariantCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromMessageOccurrenceSpecificationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationConstraintCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromLifelineToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromGeneralOrderingToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullLifelineCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromMessageOccurrenceSpecificationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromGeneralOrderingToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromInteractionTNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationConstraintCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromGeneralOrderingToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromOccurrenceSpecificationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromMessageOccurrenceSpecificationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactLifelineCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullStateInvariantCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullStateInvariantCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationObservationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactLifelineCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeConstraintToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactStateInvariantCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeObservationToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromOccurrenceSpecificationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromInteractionTNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDestructionOccurrenceSpecificationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactStateInvariantCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactLifelineCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromLifelineToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeObservationToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDestructionOccurrenceSpecificationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactStateInvariantCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactStateInvariantCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDestructionOccurrenceSpecificationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullStateInvariantCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullStateInvariantCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromLifelineToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromOccurrenceSpecificationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromOccurrenceSpecificationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullStateInvariantCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromInteractionTNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeConstraintToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullLifelineCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeObservationToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromLifelineToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationObservationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromOccurrenceSpecificationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDestructionOccurrenceSpecificationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromLifelineToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromOccurrenceSpecificationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationConstraintCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDestructionOccurrenceSpecificationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeConstraintToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDestructionOccurrenceSpecificationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationConstraintCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromOccurrenceSpecificationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeObservationToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDestructionOccurrenceSpecificationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullLifelineCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactStateInvariantCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactLifelineCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactStateInvariantCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromLifelineToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeObservationToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactLifelineCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromMessageOccurrenceSpecificationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromInteractionTNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromInteractionTNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromMessageOccurrenceSpecificationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromOccurrenceSpecificationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationConstraintCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromOccurrenceSpecificationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationConstraintCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationObservationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeObservationToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeConstraintToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeObservationToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromGeneralOrderingToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationConstraintCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeObservationToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromOccurrenceSpecificationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeConstraintToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromGeneralOrderingToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationConstraintCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactLifelineCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDestructionOccurrenceSpecificationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromMessageOccurrenceSpecificationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromLifelineToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromLifelineToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromInteractionTNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullStateInvariantCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationConstraintCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromOccurrenceSpecificationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullLifelineCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeConstraintToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactLifelineCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactLifelineCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationConstraintCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactStateInvariantCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullStateInvariantCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDestructionOccurrenceSpecificationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactStateInvariantCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationConstraintCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullLifelineCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactStateInvariantCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDestructionOccurrenceSpecificationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactStateInvariantCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeConstraintToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromOccurrenceSpecificationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDestructionOccurrenceSpecificationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromGeneralOrderingToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromInteractionTNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDestructionOccurrenceSpecificationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromInteractionTNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeConstraintToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromMessageOccurrenceSpecificationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromLifelineToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromLifelineToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullStateInvariantCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromOccurrenceSpecificationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromOccurrenceSpecificationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeConstraintToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromInteractionTNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactLifelineCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromInteractionTNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeConstraintToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationObservationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromInteractionTNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeObservationToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullLifelineCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactStateInvariantCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromGeneralOrderingToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromMessageOccurrenceSpecificationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationObservationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactLifelineCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullLifelineCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactStateInvariantCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromMessageOccurrenceSpecificationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationObservationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullLifelineCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeObservationToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromInteractionTNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationConstraintCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactLifelineCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullStateInvariantCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationConstraintCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullLifelineCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationConstraintCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullLifelineCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationConstraintCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationObservationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromGeneralOrderingToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeConstraintToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromMessageOccurrenceSpecificationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromGeneralOrderingToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDestructionOccurrenceSpecificationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullStateInvariantCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullStateInvariantCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeObservationToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromGeneralOrderingToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeObservationToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeObservationToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromInteractionTNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromInteractionTNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeObservationToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationConstraintCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullLifelineCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactStateInvariantCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationConstraintCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDestructionOccurrenceSpecificationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromOccurrenceSpecificationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullStateInvariantCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeConstraintToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeObservationToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeObservationToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromInteractionTNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactLifelineCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromLifelineToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactLifelineCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDestructionOccurrenceSpecificationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromInteractionTNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullLifelineCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromMessageOccurrenceSpecificationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromInteractionTNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationObservationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactLifelineCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullStateInvariantCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDestructionOccurrenceSpecificationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromInteractionTNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactLifelineCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromLifelineToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeObservationToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromInteractionTNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeObservationToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationConstraintCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromInteractionTNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromGeneralOrderingToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactStateInvariantCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationObservationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullStateInvariantCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullLifelineCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeObservationToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationConstraintCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactLifelineCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationObservationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactStateInvariantCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeConstraintToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeConstraintToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactLifelineCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullLifelineCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationObservationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactStateInvariantCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactStateInvariantCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromMessageOccurrenceSpecificationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromOccurrenceSpecificationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactLifelineCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromOccurrenceSpecificationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationConstraintCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDestructionOccurrenceSpecificationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromOccurrenceSpecificationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromOccurrenceSpecificationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationConstraintCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeConstraintToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromLifelineToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromInteractionTNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromGeneralOrderingToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationObservationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactLifelineCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationObservationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromMessageOccurrenceSpecificationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationObservationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactLifelineCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactStateInvariantCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationObservationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeConstraintToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeObservationToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromInteractionTNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactLifelineCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromMessageOccurrenceSpecificationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromOccurrenceSpecificationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromGeneralOrderingToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationObservationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeConstraintToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeConstraintToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromGeneralOrderingToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromInteractionTNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactLifelineCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromLifelineToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeObservationToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromLifelineToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDestructionOccurrenceSpecificationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullLifelineCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDestructionOccurrenceSpecificationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullStateInvariantCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDestructionOccurrenceSpecificationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactStateInvariantCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromMessageOccurrenceSpecificationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromOccurrenceSpecificationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromMessageOccurrenceSpecificationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactStateInvariantCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromOccurrenceSpecificationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromMessageOccurrenceSpecificationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromLifelineToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromMessageOccurrenceSpecificationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationConstraintCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromMessageOccurrenceSpecificationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationConstraintCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactStateInvariantCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeConstraintToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullStateInvariantCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeConstraintToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactStateInvariantCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactLifelineCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDestructionOccurrenceSpecificationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeObservationToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactStateInvariantCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullStateInvariantCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeObservationToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromLifelineToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactLifelineCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromInteractionTNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromGeneralOrderingToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromLifelineToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationObservationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactStateInvariantCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationConstraintCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactStateInvariantCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeConstraintToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromInteractionTNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromMessageOccurrenceSpecificationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationObservationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromLifelineToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactStateInvariantCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromOccurrenceSpecificationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromMessageOccurrenceSpecificationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullStateInvariantCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDestructionOccurrenceSpecificationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationConstraintCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationObservationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullLifelineCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactLifelineCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromMessageOccurrenceSpecificationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromGeneralOrderingToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromGeneralOrderingToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeConstraintToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullStateInvariantCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullLifelineCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeObservationToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeConstraintToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationConstraintCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeConstraintToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactLifelineCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromGeneralOrderingToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationConstraintCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactLifelineCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullLifelineCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationConstraintCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactStateInvariantCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullStateInvariantCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationObservationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationConstraintCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactLifelineCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromGeneralOrderingToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullStateInvariantCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationObservationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactStateInvariantCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromMessageOccurrenceSpecificationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactStateInvariantCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullLifelineCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeConstraintToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDestructionOccurrenceSpecificationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactLifelineCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullLifelineCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeObservationToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromGeneralOrderingToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromInteractionTNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeObservationToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromInteractionTNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeObservationToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeConstraintToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullStateInvariantCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullLifelineCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationObservationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactLifelineCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactLifelineCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDestructionOccurrenceSpecificationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullLifelineCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromOccurrenceSpecificationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromGeneralOrderingToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationObservationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationObservationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactLifelineCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromMessageOccurrenceSpecificationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromMessageOccurrenceSpecificationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullStateInvariantCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullLifelineCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactLifelineCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactStateInvariantCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDestructionOccurrenceSpecificationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeConstraintToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationObservationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDestructionOccurrenceSpecificationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullLifelineCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDestructionOccurrenceSpecificationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeConstraintToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromMessageOccurrenceSpecificationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromInteractionTNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationConstraintCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactStateInvariantCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullStateInvariantCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeObservationToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromOccurrenceSpecificationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeConstraintToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromGeneralOrderingToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromLifelineToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeObservationToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactLifelineCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDestructionOccurrenceSpecificationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullStateInvariantCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromInteractionTNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullLifelineCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationObservationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromMessageOccurrenceSpecificationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromMessageOccurrenceSpecificationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullLifelineCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDestructionOccurrenceSpecificationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromInteractionTNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactLifelineCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDestructionOccurrenceSpecificationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromOccurrenceSpecificationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullLifelineCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromInteractionTNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeConstraintToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullStateInvariantCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeObservationToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullLifelineCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationObservationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeConstraintToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationObservationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDestructionOccurrenceSpecificationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationObservationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromInteractionTNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromGeneralOrderingToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeObservationToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationObservationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationConstraintCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactLifelineCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromInteractionTNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromLifelineToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullStateInvariantCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromGeneralOrderingToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullLifelineCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationObservationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactLifelineCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactStateInvariantCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullStateInvariantCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactStateInvariantCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromInteractionTNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullLifelineCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDestructionOccurrenceSpecificationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromMessageOccurrenceSpecificationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullStateInvariantCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromGeneralOrderingToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeConstraintToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromOccurrenceSpecificationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDestructionOccurrenceSpecificationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullLifelineCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationObservationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeObservationToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromInteractionTNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactLifelineCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeConstraintToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeConstraintToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeObservationToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromGeneralOrderingToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullStateInvariantCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactStateInvariantCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactStateInvariantCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromGeneralOrderingToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromMessageOccurrenceSpecificationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromOccurrenceSpecificationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullStateInvariantCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactLifelineCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullLifelineCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactLifelineCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeConstraintToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationObservationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromMessageOccurrenceSpecificationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullStateInvariantCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromGeneralOrderingToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromInteractionTNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeObservationToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromLifelineToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDestructionOccurrenceSpecificationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactStateInvariantCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeObservationToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromInteractionTNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeObservationToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromInteractionTNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromGeneralOrderingToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationObservationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactLifelineCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullStateInvariantCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactStateInvariantCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromMessageOccurrenceSpecificationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationConstraintCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromInteractionTNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromMessageOccurrenceSpecificationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullLifelineCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromInteractionTNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromOccurrenceSpecificationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullLifelineCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactLifelineCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationConstraintCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDestructionOccurrenceSpecificationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullStateInvariantCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromMessageOccurrenceSpecificationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromLifelineToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDestructionOccurrenceSpecificationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactLifelineCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromOccurrenceSpecificationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationConstraintCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeObservationToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullStateInvariantCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromLifelineToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactStateInvariantCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactStateInvariantCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromMessageOccurrenceSpecificationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromGeneralOrderingToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromInteractionTNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDestructionOccurrenceSpecificationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationConstraintCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromOccurrenceSpecificationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromLifelineToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactStateInvariantCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationConstraintCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullLifelineCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromOccurrenceSpecificationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationObservationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationConstraintCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactLifelineCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromInteractionTNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactLifelineCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationObservationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullLifelineCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationObservationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromGeneralOrderingToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromLifelineToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullStateInvariantCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromOccurrenceSpecificationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeObservationToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullStateInvariantCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullStateInvariantCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromGeneralOrderingToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationObservationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationConstraintCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromGeneralOrderingToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactStateInvariantCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromLifelineToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromMessageOccurrenceSpecificationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeConstraintToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactLifelineCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromLifelineToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeObservationToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactLifelineCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactStateInvariantCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationObservationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromGeneralOrderingToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromOccurrenceSpecificationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullStateInvariantCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDestructionOccurrenceSpecificationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDestructionOccurrenceSpecificationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromLifelineToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDestructionOccurrenceSpecificationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromGeneralOrderingToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullLifelineCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationConstraintCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeConstraintToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromLifelineToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromOccurrenceSpecificationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromInteractionTNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromMessageOccurrenceSpecificationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullLifelineCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDestructionOccurrenceSpecificationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullLifelineCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactStateInvariantCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullLifelineCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromMessageOccurrenceSpecificationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationConstraintCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromInteractionTNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDestructionOccurrenceSpecificationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromOccurrenceSpecificationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromOccurrenceSpecificationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromInteractionTNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationConstraintCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeObservationToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromOccurrenceSpecificationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromLifelineToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromMessageOccurrenceSpecificationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromGeneralOrderingToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromOccurrenceSpecificationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullStateInvariantCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullStateInvariantCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromMessageOccurrenceSpecificationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromInteractionTNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactLifelineCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationObservationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeConstraintToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromInteractionTNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromMessageOccurrenceSpecificationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDestructionOccurrenceSpecificationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationConstraintCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromGeneralOrderingToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromLifelineToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromGeneralOrderingToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromInteractionTNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullLifelineCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullStateInvariantCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromInteractionTNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationObservationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationObservationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromGeneralOrderingToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullStateInvariantCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullLifelineCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDestructionOccurrenceSpecificationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromLifelineToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromLifelineToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeConstraintToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromInteractionTNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeConstraintToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullLifelineCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromLifelineToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeObservationToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDestructionOccurrenceSpecificationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromGeneralOrderingToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullLifelineCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullLifelineCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromOccurrenceSpecificationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeConstraintToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeConstraintToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeConstraintToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactLifelineCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactStateInvariantCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromInteractionTNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullLifelineCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromOccurrenceSpecificationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeObservationToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromInteractionTNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeObservationToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromOccurrenceSpecificationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromOccurrenceSpecificationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullStateInvariantCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactStateInvariantCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullLifelineCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromLifelineToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromGeneralOrderingToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullStateInvariantCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullStateInvariantCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeObservationToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromGeneralOrderingToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullLifelineCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeObservationToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromInteractionTNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromLifelineToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromInteractionTNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactStateInvariantCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactLifelineCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationConstraintCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeObservationToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromInteractionTNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromGeneralOrderingToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromGeneralOrderingToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullLifelineCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDestructionOccurrenceSpecificationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeConstraintToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullStateInvariantCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationConstraintCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullStateInvariantCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromOccurrenceSpecificationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromGeneralOrderingToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationObservationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullStateInvariantCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationConstraintCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationConstraintCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationObservationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationObservationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationObservationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromGeneralOrderingToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullStateInvariantCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromLifelineToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeConstraintToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullLifelineCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactStateInvariantCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationConstraintCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationObservationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeConstraintToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactLifelineCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationConstraintCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationConstraintCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeObservationToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromMessageOccurrenceSpecificationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullStateInvariantCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullStateInvariantCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromGeneralOrderingToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullStateInvariantCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromLifelineToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullLifelineCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactStateInvariantCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationObservationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDestructionOccurrenceSpecificationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeObservationToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromLifelineToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullStateInvariantCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeObservationToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromOccurrenceSpecificationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDestructionOccurrenceSpecificationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromLifelineToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationConstraintCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullLifelineCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeObservationToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromMessageOccurrenceSpecificationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactStateInvariantCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromLifelineToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeConstraintToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationObservationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeConstraintToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDestructionOccurrenceSpecificationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactLifelineCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromLifelineToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationConstraintCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationConstraintCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationConstraintCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationObservationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromInteractionTNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullStateInvariantCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullLifelineCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullStateInvariantCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromOccurrenceSpecificationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromLifelineToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromLifelineToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromOccurrenceSpecificationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactStateInvariantCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromLifelineToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationConstraintCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromOccurrenceSpecificationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDestructionOccurrenceSpecificationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationConstraintCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromMessageOccurrenceSpecificationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromInteractionTNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullLifelineCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeObservationToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromOccurrenceSpecificationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDestructionOccurrenceSpecificationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactLifelineCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromLifelineToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullLifelineCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationConstraintCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeObservationToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromMessageOccurrenceSpecificationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullStateInvariantCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromLifelineToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactStateInvariantCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullLifelineCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromMessageOccurrenceSpecificationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullStateInvariantCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationObservationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeConstraintToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactLifelineCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromMessageOccurrenceSpecificationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactStateInvariantCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeConstraintToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationObservationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromGeneralOrderingToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromLifelineToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromGeneralOrderingToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactLifelineCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullStateInvariantCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationConstraintCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromLifelineToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeConstraintToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromMessageOccurrenceSpecificationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromLifelineToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationObservationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromInteractionTNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullStateInvariantCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullLifelineCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromGeneralOrderingToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromInteractionTNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationConstraintCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDestructionOccurrenceSpecificationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullLifelineCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromLifelineToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromInteractionTNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromLifelineToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationObservationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactLifelineCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeConstraintToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromInteractionTNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullStateInvariantCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromLifelineToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeConstraintToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullStateInvariantCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeConstraintToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromGeneralOrderingToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromInteractionTNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationObservationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromMessageOccurrenceSpecificationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactLifelineCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationConstraintCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromGeneralOrderingToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromInteractionTNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactLifelineCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationObservationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromMessageOccurrenceSpecificationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationObservationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromInteractionTNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromLifelineToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullStateInvariantCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromOccurrenceSpecificationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromLifelineToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactStateInvariantCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactStateInvariantCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullLifelineCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactStateInvariantCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullLifelineCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromGeneralOrderingToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromMessageOccurrenceSpecificationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationObservationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromOccurrenceSpecificationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullLifelineCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDestructionOccurrenceSpecificationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromGeneralOrderingToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromLifelineToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromInteractionTNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeObservationToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromGeneralOrderingToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeObservationToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromMessageOccurrenceSpecificationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactStateInvariantCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDestructionOccurrenceSpecificationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromMessageOccurrenceSpecificationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromGeneralOrderingToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactStateInvariantCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactLifelineCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationObservationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromInteractionTNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromOccurrenceSpecificationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromMessageOccurrenceSpecificationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeConstraintToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullLifelineCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromGeneralOrderingToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeObservationToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullStateInvariantCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactLifelineCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactLifelineCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromLifelineToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromOccurrenceSpecificationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeObservationToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullLifelineCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeObservationToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromOccurrenceSpecificationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromOccurrenceSpecificationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationConstraintCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationObservationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromOccurrenceSpecificationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromGeneralOrderingToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromInteractionTNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromGeneralOrderingToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationConstraintCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeConstraintToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromMessageOccurrenceSpecificationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationObservationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationConstraintCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromLifelineToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromLifelineToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactStateInvariantCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactLifelineCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullLifelineCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationObservationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullLifelineCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullStateInvariantCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeObservationToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromOccurrenceSpecificationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeObservationToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeObservationToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDestructionOccurrenceSpecificationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeConstraintToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationConstraintCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDestructionOccurrenceSpecificationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullStateInvariantCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromOccurrenceSpecificationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationConstraintCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationConstraintCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactStateInvariantCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactStateInvariantCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationObservationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationConstraintCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactStateInvariantCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromLifelineToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeConstraintToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullStateInvariantCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationObservationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullStateInvariantCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromGeneralOrderingToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromOccurrenceSpecificationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullLifelineCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDestructionOccurrenceSpecificationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationConstraintCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullStateInvariantCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeConstraintToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullStateInvariantCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullLifelineCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromOccurrenceSpecificationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromLifelineToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeConstraintToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationConstraintCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromMessageOccurrenceSpecificationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationObservationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeObservationToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromInteractionTNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromLifelineToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDestructionOccurrenceSpecificationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromGeneralOrderingToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeConstraintToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromInteractionTNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeObservationToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullLifelineCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactStateInvariantCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactStateInvariantCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactStateInvariantCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDestructionOccurrenceSpecificationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationConstraintCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeObservationToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromMessageOccurrenceSpecificationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactStateInvariantCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromGeneralOrderingToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromOccurrenceSpecificationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromLifelineToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromMessageOccurrenceSpecificationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeConstraintToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationObservationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromOccurrenceSpecificationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactLifelineCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDestructionOccurrenceSpecificationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeObservationToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromTimeConstraintToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDestructionOccurrenceSpecificationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromOccurrenceSpecificationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullStateInvariantCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeConstraintToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationObservationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeConstraintToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationConstraintCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromFullLifelineCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeConstraintToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeConstraintToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeObservationToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDurationObservationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromInteractionTNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromLifelineToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromLifelineToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromLifelineToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromInteractionTNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationObservationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromLifelineToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactStateInvariantCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDestructionOccurrenceSpecificationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDestructionOccurrenceSpecificationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromInteractionTNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationObservationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromOccurrenceSpecificationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromLifelineToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromFullLifelineCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullLifelineCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromOccurrenceSpecificationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationConstraintCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationObservationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromLifelineToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromOccurrenceSpecificationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationConstraintCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactStateInvariantCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromMessageOccurrenceSpecificationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromGeneralOrderingToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromInteractionTNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullLifelineCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationObservationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullStateInvariantCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactStateInvariantCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromOccurrenceSpecificationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromInteractionTNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromOccurrenceSpecificationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromInteractionTNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationConstraintCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromLifelineToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDestructionOccurrenceSpecificationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromDurationObservationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromMessageOccurrenceSpecificationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactStateInvariantCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromOccurrenceSpecificationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromMessageOccurrenceSpecificationCNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullLifelineCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromTimeConstraintToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactStateInvariantCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactStateInvariantCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromCompactStateInvariantCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationObservationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullStateInvariantCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromMessageOccurrenceSpecificationCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromFullStateInvariantCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromCompactLifelineCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromGeneralOrderingToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeConstraintToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromGeneralOrderingToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromMessageOccurrenceSpecificationCNToCompactStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeConstraintToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromLifelineToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromOccurrenceSpecificationCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromFullLifelineCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactLifelineCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromTimeConstraintToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationConstraintCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromInteractionTNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromGeneralOrderingToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationObservationCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromMessageOccurrenceSpecificationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromTimeConstraintToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullLifelineCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeObservationToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromMessageOccurrenceSpecificationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullLifelineCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullLifelineCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullLifelineCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDestructionOccurrenceSpecificationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDurationObservationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromMessageOccurrenceSpecificationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromLifelineToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactLifelineCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromTimeConstraintToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromMessageOccurrenceSpecificationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromTimeObservationToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDestructionOccurrenceSpecificationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromOccurrenceSpecificationCNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullStateInvariantCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromInteractionTNToDurationConstraintCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromMessageOccurrenceSpecificationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromOccurrenceSpecificationCNToOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactLifelineCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDurationObservationCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromDurationConstraintCNToMessageOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromGeneralOrderingToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromCompactLifelineCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactStateInvariantCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromMessageOccurrenceSpecificationCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromFullStateInvariantCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromDestructionOccurrenceSpecificationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromLifelineToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromFullStateInvariantCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDurationConstraintCNToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromLifelineToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromDestructionOccurrenceSpecificationCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromCompactStateInvariantCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromLifelineToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageAsyncFromLifelineToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromFullLifelineCNToTimeConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDestructionOccurrenceSpecificationCNToFullStateInvariantCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageLostFromCompactLifelineCNToCompactLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageSyncFromCompactStateInvariantCNToTimeObservation() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactStateInvariantEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageSyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromCompactLifelineCNToFullLifelineCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CompactLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FullLifelineEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageCreateFromDurationObservationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageDeleteFromDestructionOccurrenceSpecificationCNToLifeline() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageDeleteEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromDestructionOccurrenceSpecificationCNToDestructionOccurrenceSpecificationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageReplyFromMessageOccurrenceSpecificationCNToDurationObservationCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromTimeObservationToGeneralOrdering() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralOrderingEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Message.
	 */
	@Test
	@GeneratedTest
	public void testLinkMessageFoundFromLifelineToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LifelineEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageFoundEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
}	
