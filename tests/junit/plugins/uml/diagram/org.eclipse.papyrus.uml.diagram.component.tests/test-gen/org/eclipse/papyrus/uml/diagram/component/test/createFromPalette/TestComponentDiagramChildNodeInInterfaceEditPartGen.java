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
import org.eclipse.papyrus.uml.diagram.component.edit.parts.InterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.ConstraintEditPartPCN;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.ModelEditPartCN;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.InterfaceEditPartPCN;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.ComponentEditPartPCN;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.PackageEditPartCN;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.CommentEditPartPCN;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.RectangleInterfaceEditPartCNComponentEditPartCN;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestComponentDiagramChildNodeInInterfaceEditPartGen.
 */
public class TestComponentDiagramChildNodeInInterfaceEditPartGen extends CreateNodeFromPaletteTest {
	
	
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
	 * Test to manage component Component.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeComponentEditPartPCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ComponentEditPartPCN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Comment.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeCommentEditPartPCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CommentEditPartPCN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Model.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeModelEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Interface.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeInterfaceEditPartPCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(InterfaceEditPartPCN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Constraint.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeConstraintEditPartPCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ConstraintEditPartPCN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Package.
	 */
	@Test
	@GeneratedTest
	public void testChildNodePackageEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), true);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override 
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), getDiagramEditPart().getDiagramPreferencesHint());
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
	
}	
