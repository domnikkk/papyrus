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
package org.eclipse.papyrus.uml.diagram.activity.test.createFromPalette;

import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.activity.CreateActivityDiagramCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ActivityEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ControlFlowEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ObjectFlowEditPart;
import org.eclipse.papyrus.uml.diagram.activity.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.activity.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.activity.tests.IActivityDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateLinkFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestActivityDiagramLinkGen.
 */
public class TestActivityDiagramLinkGen extends CreateLinkFromPaletteTest {
	
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateActivityDiagramCommand();
	}
	 
	@Override
	protected String getProjectName() {
		return IActivityDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return IActivityDiagramTestsConstants.FILE_NAME;
	}

	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.TYPED_INSTANCE;
	}
}	
