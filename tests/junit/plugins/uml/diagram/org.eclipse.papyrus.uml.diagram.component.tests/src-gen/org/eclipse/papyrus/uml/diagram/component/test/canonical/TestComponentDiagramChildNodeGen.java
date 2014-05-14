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
package org.eclipse.papyrus.uml.diagram.component.test.canonical;

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.diagram.tests.canonical.TestChildNode;
import org.eclipse.papyrus.uml.diagram.component.CreateComponentDiagramCommand;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.CommentEditPartPCN;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.ComponentEditPartPCN;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.ConstraintEditPartPCN;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.InterfaceEditPartPCN;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.ModelEditPartCN;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.PackageEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.PackageEditPartCN;
import org.eclipse.papyrus.uml.diagram.component.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.component.test.IComponentDiagramTestsConstants;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestComponentDiagramChildNodeGen.
 */
public class TestComponentDiagramChildNodeGen extends TestChildNode {
	
	
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
	 * Test to manage component Comment.
	 */
	@Test
	public void testChildNodeCommentEditPartPCN() {
		testToManageNode(UMLElementTypes.getElementType(CommentEditPartPCN.VISUAL_ID), UMLPackage.eINSTANCE.getComment()
		, UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Package.
	 */
	@Test
	public void testChildNodePackageEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getPackage()
		, UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Model.
	 */
	@Test
	public void testChildNodeModelEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getModel()
		, UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Constraint.
	 */
	@Test
	public void testChildNodeConstraintEditPartPCN() {
		testToManageNode(UMLElementTypes.getElementType(ConstraintEditPartPCN.VISUAL_ID), UMLPackage.eINSTANCE.getConstraint()
		, UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Component.
	 */
	@Test
	public void testChildNodeComponentEditPartPCN() {
		testToManageNode(UMLElementTypes.getElementType(ComponentEditPartPCN.VISUAL_ID), UMLPackage.eINSTANCE.getComponent()
		, UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Interface.
	 */
	@Test
	public void testChildNodeInterfaceEditPartPCN() {
		testToManageNode(UMLElementTypes.getElementType(InterfaceEditPartPCN.VISUAL_ID), UMLPackage.eINSTANCE.getInterface()
		, UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override 
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), getDiagramEditPart().getDiagramPreferencesHint());
	}
	
}	
