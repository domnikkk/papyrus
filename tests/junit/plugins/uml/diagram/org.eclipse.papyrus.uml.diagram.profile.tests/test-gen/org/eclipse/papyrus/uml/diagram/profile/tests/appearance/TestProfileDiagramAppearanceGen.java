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
package org.eclipse.papyrus.uml.diagram.profile.tests.appearance;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
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
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ShortCutDiagramEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.StereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.profile.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.profile.tests.IProfileDiagramTest;
import org.eclipse.papyrus.uml.diagram.tests.appearance.AppearanceNodeTest;
import org.junit.Test;

/**
 * The Class TestProfileDiagramAppearanceGen.
 */
public class TestProfileDiagramAppearanceGen extends AppearanceNodeTest {

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
	 * Test to manage component Comment.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeCommentEditPart() {
		testAppearance(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Class.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeClassEditPart() {
		testAppearance(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component DataType.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeDataTypeEditPart() {
		testAppearance(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Package.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodePackageEditPart() {
		testAppearance(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Enumeration.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeEnumerationEditPart() {
		testAppearance(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Profile.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeProfileEditPartTN() {
		testAppearance(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID));
	}
	/**
	 * Test to manage component PrimitiveType.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodePrimitiveTypeEditPart() {
		testAppearance(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeDependencyNodeEditPart() {
		testAppearance(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Stereotype.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeStereotypeEditPart() {
		testAppearance(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeAssociationNodeEditPart() {
		testAppearance(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Model.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeModelEditPartTN() {
		testAppearance(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID));
	}
	/**
	 * Test to manage component Constraint.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeConstraintEditPart() {
		testAppearance(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component .
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeShortCutDiagramEditPart() {
		testAppearance(UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID));
	}
}
