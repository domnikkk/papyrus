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

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.diagram.tests.canonical.TestTopNode;
import org.eclipse.papyrus.uml.diagram.communication.CreateCommunicationDiagramCommand;
import org.eclipse.papyrus.uml.diagram.communication.edit.parts.InteractionEditPart;
import org.eclipse.papyrus.uml.diagram.communication.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.communication.test.ICommunicationDiagramTestsConstants;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestCommunicationDiagramTopNodeGen.
 */
public class TestCommunicationDiagramTopNodeGen extends TestTopNode {
	
	
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
	 * Test to manage component Interaction.
	 */
	@Test
	public void testTopNodeInteractionEditPart() {
		testToManageNode(UMLElementTypes.getElementType(InteractionEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getInteraction()
		, UMLElementTypes.getElementType(InteractionEditPart.VISUAL_ID), true);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override 
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.getElementType(InteractionEditPart.VISUAL_ID), getDiagramEditPart().getDiagramPreferencesHint());
	}
	
}	
