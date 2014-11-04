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
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorInPackageEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.CommentEditPartCN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.CommentEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ComponentInPackageEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ConstraintInPackageEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.PackageEditPartCN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCaseInPackageEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.usecase.tests.IUseCaseTestsConstants;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestUseCaseChildNodeInCommentEditPartTNGen.
 */
public class TestUseCaseChildNodeInCommentEditPartTNGen extends CreateNodeFromPaletteTest {
	
	
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
	 * Test to manage component UseCase.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeUseCaseInPackageEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(UseCaseInPackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Component.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeComponentInPackageEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ComponentInPackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Constraint.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeConstraintInPackageEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ConstraintInPackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Package.
	 */
	@Test
	@GeneratedTest
	public void testChildNodePackageEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Comment.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeCommentEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Actor.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeActorInPackageEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ActorInPackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), true);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override 
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), getDiagramEditPart().getDiagramPreferencesHint());
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return CustomUMLDiagramUpdater.INSTANCE;
	}
	
}	
