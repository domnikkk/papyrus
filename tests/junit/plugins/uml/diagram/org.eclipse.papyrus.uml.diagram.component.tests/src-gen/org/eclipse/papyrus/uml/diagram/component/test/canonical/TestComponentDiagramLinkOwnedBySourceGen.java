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

import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.diagram.tests.canonical.TestLinkOwnedBySource;
import org.eclipse.papyrus.uml.diagram.component.CreateComponentDiagramCommand;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.ComponentEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.GeneralizationEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.InterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.ModelEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.PackageEditPart;
import org.eclipse.papyrus.uml.diagram.component.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.component.test.IComponentDiagramTestsConstants;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestComponentDiagramLinkOwnedBySourceGen.
 */
public class TestComponentDiagramLinkOwnedBySourceGen extends TestLinkOwnedBySource {
	
	
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
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInterfaceToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToComment() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelToComment() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelToInterface() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToInterface() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToModel() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInterfaceToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToModel() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToInterface() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToComment() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToModel() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInterfaceToComment() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToModel() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInterfaceToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInterfaceToModel() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelToModel() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToInterface() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInterfaceToInterface() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToInterface() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
}	
