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
package org.eclipse.papyrus.uml.diagram.profile.tests.drop;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.profile.CreateProfileDiagramCommand;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.AssociationNodeEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ClassEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.DataTypeEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.DependencyNodeEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.EnumerationEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ModelEditPartTN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.PackageEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.PrimitiveTypeEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ProfileEditPartTN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.StereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.profile.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.profile.tests.IProfileDiagramTest;
import org.eclipse.papyrus.uml.diagram.tests.drop.AbstractDropNodeTest;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

/**
 * The Class TestProfileDiagramDropGen.
 */
public class TestProfileDiagramDropGen extends AbstractDropNodeTest {

	@Override
	public GraphicalEditPart getContainerEditPart() {
		return getDiagramEditPart();
	}
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateProfileDiagramCommand();
	}
	
	@Override
	protected String getProjectName() {
		return IProfileDiagramTest.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return IProfileDiagramTest.FILE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected View getRootView() {
		return (View)getContainerEditPart().getModel();
	}

	/**
	 * Test to manage component Class.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeClassEditPart() {
		testToDropNode(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getClass_()
		, true);
	}
	/**
	 * Test to manage component Package.
	 */
	@Test
	@GeneratedTest
	public void testDropNodePackageEditPart() {
		testToDropNode(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getPackage()
		, true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeAssociationNodeEditPart() {
		testToDropNode(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getAssociation()
		, true);
	}
	/**
	 * Test to manage component Enumeration.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeEnumerationEditPart() {
		testToDropNode(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getEnumeration()
		, true);
	}
	/**
	 * Test to manage component Model.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeModelEditPartTN() {
		testToDropNode(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLPackage.eINSTANCE.getModel()
		, true);
	}
	/**
	 * Test to manage component Profile.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeProfileEditPartTN() {
		testToDropNode(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLPackage.eINSTANCE.getProfile()
		, true);
	}
	/**
	 * Test to manage component DataType.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeDataTypeEditPart() {
		testToDropNode(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getDataType()
		, true);
	}
	/**
	 * Test to manage component Comment.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeCommentEditPart() {
		testToDropNode(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getComment()
		, true);
	}
	/**
	 * Test to manage component Stereotype.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeStereotypeEditPart() {
		testToDropNode(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getStereotype()
		, true);
	}
	/**
	 * Test to manage component PrimitiveType.
	 */
	@Test
	@GeneratedTest
	public void testDropNodePrimitiveTypeEditPart() {
		testToDropNode(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getPrimitiveType()
		, true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeDependencyNodeEditPart() {
		testToDropNode(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getDependency()
		, true);
	}
	/**
	 * Test to manage component Constraint.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeConstraintEditPart() {
		testToDropNode(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getConstraint()
		, true);
	}
	
}
