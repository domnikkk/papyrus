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
package org.eclipse.papyrus.uml.diagram.timing.test.appearance;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.timing.CreateTimingDiagramCommand;
import org.eclipse.papyrus.uml.diagram.timing.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.timing.test.ITimingDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.appearance.AppearanceNodeTest;
import org.junit.Test;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.InteractionEditPartTN;

/**
 * The Class TestTimingDiagramAppearanceGen.
 */
public class TestTimingDiagramAppearanceGen extends AppearanceNodeTest {

	@Override
	public GraphicalEditPart getContainerEditPart() {
		return getDiagramEditPart();
	}
	
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
	 * Test to manage component Interaction.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeInteractionEditPartTN() {
		testAppearance(UMLElementTypes.getElementType(InteractionEditPartTN.VISUAL_ID));
	}
}
