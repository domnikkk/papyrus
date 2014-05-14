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
package org.eclipse.papyrus.uml.diagram.communication.test.canonical;

import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.diagram.tests.canonical.TestLink;
import org.eclipse.papyrus.uml.diagram.communication.CreateCommunicationDiagramCommand;
import org.eclipse.papyrus.uml.diagram.communication.edit.parts.InteractionEditPart;
import org.eclipse.papyrus.uml.diagram.communication.edit.parts.MessageEditPart;
import org.eclipse.papyrus.uml.diagram.communication.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.communication.test.ICommunicationDiagramTestsConstants;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestCommunicationDiagramLinkGen.
 */
public class TestCommunicationDiagramLinkGen extends TestLink {
	
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateCommunicationDiagramCommand();
	}
	 
	@Override
	protected String getProjectName() {
		return ICommunicationDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return ICommunicationDiagramTestsConstants.FILE_NAME;
	}

	/**
	 * Test to manage component Message.
	 */
	@Test
	public void testLinkMessageFromInteractionToInteraction() {
		testToManageLink(UMLElementTypes.getElementType(InteractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MessageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InteractionEditPart.VISUAL_ID), true);
	}
}	
