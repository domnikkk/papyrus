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
package org.eclipse.papyrus.uml.diagram.usecase.test.createFromPalette;

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateNodeFromPaletteTest;
import org.eclipse.papyrus.uml.diagram.usecase.CreateUseCaseDiagramCommand;
import org.eclipse.papyrus.uml.diagram.usecase.custom.edit.parts.CustomUMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.CommentEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ConstraintEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.PackageEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCaseEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.usecase.tests.IUseCaseTestsConstants;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestUseCaseTopNodeGen.
 */
public class TestUseCaseTopNodeGen extends CreateNodeFromPaletteTest {
	
	
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
	public void testTopNodePackageEditPartTN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Actor.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeActorEditPartTN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component UseCase.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeUseCaseEditPartTN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Comment.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeCommentEditPartTN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Constraint.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeConstraintEditPartTN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override 
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), getDiagramEditPart().getDiagramPreferencesHint());
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return CustomUMLDiagramUpdater.INSTANCE;
	}
	
}	
