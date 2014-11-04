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
package org.eclipse.papyrus.uml.diagram.usecase.test.appearance;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.tests.appearance.AppearanceNodeTest;
import org.eclipse.papyrus.uml.diagram.usecase.CreateUseCaseDiagramCommand;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.CommentEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ConstraintEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.PackageEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCaseEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.usecase.tests.IUseCaseTestsConstants;
import org.junit.Test;

/**
 * The Class TestUseCaseAppearanceGen.
 */
public class TestUseCaseAppearanceGen extends AppearanceNodeTest {

	@Override
	public GraphicalEditPart getContainerEditPart() {
		return getDiagramEditPart();
	}
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateUseCaseDiagramCommand();
	}
	
	@Override
	protected String getProjectName() {
		return IUseCaseTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return IUseCaseTestsConstants.FILE_NAME;
	}

	/**
	 * Test to manage component Package.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodePackageEditPartTN() {
		testAppearance(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID));
	}
	/**
	 * Test to manage component Actor.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeActorEditPartTN() {
		testAppearance(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID));
	}
	/**
	 * Test to manage component Constraint.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeConstraintEditPartTN() {
		testAppearance(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID));
	}
	/**
	 * Test to manage component UseCase.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeUseCaseEditPartTN() {
		testAppearance(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID));
	}
	/**
	 * Test to manage component Comment.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeCommentEditPartTN() {
		testAppearance(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID));
	}
}
