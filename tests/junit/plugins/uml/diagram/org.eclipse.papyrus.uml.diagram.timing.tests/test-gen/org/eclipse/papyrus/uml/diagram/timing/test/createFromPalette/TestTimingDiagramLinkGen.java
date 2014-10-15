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

import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateLinkFromPaletteTest;
import org.eclipse.papyrus.uml.diagram.timing.custom.CreateTimingDiagramCommand;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.InteractionEditPartTN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageAsyncEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageCreateEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageDeleteEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageFoundEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageLostEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageReplyEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageSyncEditPart;
import org.eclipse.papyrus.uml.diagram.timing.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.timing.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.timing.tests.ITimingDiagramTestsConstants;
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
	public void testLinkMessageCreateFromInteractionTNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageCreateEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
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
	public void testLinkMessageAsyncFromInteractionTNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageAsyncEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
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
	public void testLinkMessageReplyFromInteractionTNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageReplyEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
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
	public void testLinkMessageLostFromInteractionTNToInteractionTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(MessageLostEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID), true);
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
}	
