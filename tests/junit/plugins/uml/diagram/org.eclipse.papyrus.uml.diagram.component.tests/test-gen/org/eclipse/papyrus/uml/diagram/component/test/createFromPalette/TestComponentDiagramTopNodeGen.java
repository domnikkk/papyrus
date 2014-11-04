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
package org.eclipse.papyrus.uml.diagram.component.test.createFromPalette;

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.component.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.tests.CreateNodeFromPaletteTest;
import org.eclipse.papyrus.uml.diagram.component.CreateComponentDiagramCommand;
import org.eclipse.papyrus.uml.diagram.component.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.component.test.IComponentDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.ComponentEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.ModelEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.PackageEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestComponentDiagramTopNodeGen.
 */
public class TestComponentDiagramTopNodeGen extends CreateNodeFromPaletteTest {
	
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateComponentDiagramCommand();
	}
	 
	@Override
	protected String getProjectName() {
		return IComponentDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return IComponentDiagramTestsConstants.FILE_NAME;
	}

	/**
	 * Test to manage component Constraint.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeConstraintEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Model.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeModelEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Interface.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeInterfaceEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Package.
	 */
	@Test
	@GeneratedTest
	public void testTopNodePackageEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Component.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeComponentEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Comment.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeCommentEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override 
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), getDiagramEditPart().getDiagramPreferencesHint());
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
	
}	
