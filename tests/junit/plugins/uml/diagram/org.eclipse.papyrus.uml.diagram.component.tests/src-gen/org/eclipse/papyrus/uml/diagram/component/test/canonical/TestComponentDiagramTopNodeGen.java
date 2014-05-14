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
import org.eclipse.papyrus.diagram.tests.canonical.TestTopNode;
import org.eclipse.papyrus.uml.diagram.component.CreateComponentDiagramCommand;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.ComponentEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.InterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.ModelEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.PackageEditPart;
import org.eclipse.papyrus.uml.diagram.component.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.component.test.IComponentDiagramTestsConstants;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestComponentDiagramTopNodeGen.
 */
public class TestComponentDiagramTopNodeGen extends TestTopNode {
	
	
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
	 * Test to manage component Model.
	 */
	@Test
	public void testTopNodeModelEditPart() {
		testToManageNode(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getModel()
		, UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Package.
	 */
	@Test
	public void testTopNodePackageEditPart() {
		testToManageNode(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getPackage()
		, UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component NamedElement.
	 */
	@Test
	public void testTopNodeInterfaceEditPart() {
		testToManageNode(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getNamedElement()
		, UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Constraint.
	 */
	@Test
	public void testTopNodeConstraintEditPart() {
		testToManageNode(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getConstraint()
		, UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Component.
	 */
	@Test
	public void testTopNodeComponentEditPart() {
		testToManageNode(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getComponent()
		, UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Comment.
	 */
	@Test
	public void testTopNodeCommentEditPart() {
		testToManageNode(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getComment()
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
