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
package org.eclipse.papyrus.uml.diagram.profile.tests.createFromPalette;

import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.profile.CreateProfileDiagramCommand;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.AssociationBranchEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.AssociationEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.AssociationNodeEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ClassEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.DataTypeEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.DependencyEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.DependencyNodeEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.EnumerationEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ExtensionEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ModelEditPartTN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.PackageEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.PrimitiveTypeEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ProfileApplicationEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ProfileEditPartTN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.StereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.profile.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.profile.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.profile.tests.IProfileDiagramTest;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateLinkFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestProfileDiagramLinkGen.
 */
public class TestProfileDiagramLinkGen extends CreateLinkFromPaletteTest {
	
	
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
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPrimitiveTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromAssociationNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromEnumerationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPackageToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromAssociationNodeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPrimitiveTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDataTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDataTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromStereotypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPrimitiveTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromConstraintToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromAssociationNodeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPrimitiveTypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPrimitiveTypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDependencyNodeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromProfileTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDataTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPrimitiveTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromCommentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDataTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPackageToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromClassToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPackageToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromEnumerationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromCommentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromStereotypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromProfileTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDependencyNodeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDataTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPackageToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromStereotypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromEnumerationToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromClassToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromAssociationNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromConstraintToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDependencyNodeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPrimitiveTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromStereotypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromStereotypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromProfileTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPrimitiveTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDataTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromModelTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromAssociationNodeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDependencyNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromEnumerationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromEnumerationToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromAssociationNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDependencyNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromClassToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromAssociationNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDependencyNodeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromModelTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPrimitiveTypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromCommentToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromEnumerationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromProfileTNToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromProfileTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDataTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromStereotypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromClassToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromProfileTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPackageToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPackageToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromAssociationNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDependencyNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDataTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromClassToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromModelTNToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromClassToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromAssociationNodeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromProfileTNToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromConstraintToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromProfileTNToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromConstraintToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDataTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromProfileTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPrimitiveTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStereotypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPrimitiveTypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDataTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromClassToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromModelTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromAssociationNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDataTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPrimitiveTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDependencyNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromProfileTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDependencyNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPrimitiveTypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDependencyNodeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPrimitiveTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPackageToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromProfileTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDataTypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromProfileTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromCommentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromEnumerationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromAssociationNodeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromAssociationNodeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromModelTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDependencyNodeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromCommentToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromStereotypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromAssociationNodeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromClassToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPackageToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromConstraintToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromProfileTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromEnumerationToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDataTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDependencyNodeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromConstraintToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromStereotypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromAssociationNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPrimitiveTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPrimitiveTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPrimitiveTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromEnumerationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromEnumerationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromAssociationNodeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPrimitiveTypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromCommentToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromCommentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDataTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromClassToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromCommentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDependencyNodeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromStereotypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromEnumerationToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromModelTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDependencyNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDependencyNodeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromAssociationNodeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromEnumerationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromCommentToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromStereotypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDataTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDependencyNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPrimitiveTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromProfileTNToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromModelTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromModelTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromConstraintToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromProfileTNToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPrimitiveTypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromProfileTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromConstraintToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromProfileTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromClassToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromProfileTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPackageToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDependencyNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromAssociationNodeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDependencyNodeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromClassToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromConstraintToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPackageToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromClassToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPrimitiveTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDependencyNodeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromProfileTNToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromProfileTNToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromModelTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromProfileTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromEnumerationToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromConstraintToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPackageToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromModelTNToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPackageToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromModelTNToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromAssociationNodeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromStereotypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStereotypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromModelTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromClassToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDataTypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDependencyNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromEnumerationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromAssociationNodeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDataTypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromAssociationNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromModelTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromAssociationNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDependencyNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPrimitiveTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromConstraintToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromAssociationNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromClassToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDataTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromModelTNToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromModelTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPrimitiveTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromClassToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromStereotypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromModelTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromEnumerationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromEnumerationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPackageToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromProfileTNToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromEnumerationToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromStereotypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromProfileTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromModelTNToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromCommentToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromStereotypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDependencyNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromAssociationNodeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromStereotypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromProfileTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromStereotypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPrimitiveTypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPackageToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromModelTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDataTypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromConstraintToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromModelTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromAssociationNodeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDataTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPackageToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromConstraintToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromStereotypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPackageToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDependencyNodeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDependencyNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromEnumerationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromConstraintToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromClassToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromConstraintToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDataTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromEnumerationToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromClassToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromAssociationNodeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromProfileTNToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromAssociationNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromProfileTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPackageToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDependencyNodeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDependencyNodeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromEnumerationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDataTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromAssociationNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromProfileTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDataTypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromEnumerationToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDataTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDependencyNodeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDataTypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDataTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromEnumerationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromModelTNToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPrimitiveTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromStereotypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromProfileTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromAssociationNodeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDependencyNodeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromEnumerationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromEnumerationToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromClassToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromModelTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromClassToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPackageToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStereotypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStereotypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromAssociationNodeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromStereotypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDependencyNodeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromEnumerationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStereotypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDependencyNodeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromEnumerationToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromEnumerationToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDataTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDataTypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPrimitiveTypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromClassToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromConstraintToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromConstraintToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromCommentToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDependencyNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDataTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromModelTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromProfileTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromStereotypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromCommentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromEnumerationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromEnumerationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPrimitiveTypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromProfileTNToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromAssociationNodeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromProfileTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPackageToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromProfileTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromAssociationNodeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromStereotypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPrimitiveTypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPrimitiveTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromCommentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromEnumerationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromModelTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromClassToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStereotypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromModelTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromEnumerationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPackageToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromCommentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPrimitiveTypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPackageToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDependencyNodeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromConstraintToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromStereotypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromConstraintToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromEnumerationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromAssociationNodeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromClassToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStereotypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromConstraintToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromConstraintToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromAssociationNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromAssociationNodeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDataTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromAssociationNodeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPrimitiveTypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromProfileTNToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPrimitiveTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromAssociationNodeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromAssociationNodeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromCommentToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPrimitiveTypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromProfileTNToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromConstraintToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromAssociationNodeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromStereotypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDataTypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStereotypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPrimitiveTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPrimitiveTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromConstraintToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDependencyNodeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromStereotypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromCommentToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPackageToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromStereotypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDependencyNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromCommentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromStereotypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromModelTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDataTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromCommentToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromClassToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromConstraintToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDependencyNodeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromStereotypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromAssociationNodeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPrimitiveTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDependencyNodeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromClassToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPrimitiveTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromProfileTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromModelTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromCommentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromProfileTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromClassToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPrimitiveTypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDataTypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPackageToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDependencyNodeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromEnumerationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromStereotypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromCommentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPackageToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromEnumerationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromModelTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromClassToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDataTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPackageToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromConstraintToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromEnumerationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPackageToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelTNToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromCommentToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDataTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromStereotypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromModelTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromEnumerationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromModelTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromStereotypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDependencyNodeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDataTypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromClassToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelTNToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromCommentToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPrimitiveTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromStereotypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDependencyNodeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromStereotypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStereotypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromClassToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromEnumerationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDependencyNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromProfileTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPrimitiveTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDataTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromProfileTNToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPrimitiveTypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromStereotypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDependencyNodeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDataTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromCommentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromConstraintToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromCommentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromStereotypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromProfileTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromProfileTNToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromModelTNToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDataTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDataTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromAssociationNodeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPrimitiveTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDependencyNodeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromAssociationNodeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromModelTNToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDependencyNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromAssociationNodeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPrimitiveTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromAssociationNodeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDependencyNodeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromAssociationNodeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDependencyNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromAssociationNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDependencyNodeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromClassToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDependencyNodeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromModelTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStereotypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDataTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDataTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPackageToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDataTypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromEnumerationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDependencyNodeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDependencyNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromCommentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromEnumerationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromStereotypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPackageToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromProfileTNToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromStereotypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromCommentToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromProfileTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDataTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelTNToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromModelTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromAssociationNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromModelTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromModelTNToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromAssociationNodeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPrimitiveTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDependencyNodeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromModelTNToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDependencyNodeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromModelTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromEnumerationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPackageToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDataTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromModelTNToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromCommentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPrimitiveTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromProfileTNToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDependencyNodeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDataTypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromConstraintToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPrimitiveTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromClassToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromModelTNToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromClassToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromAssociationNodeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPackageToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromProfileTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromCommentToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromClassToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDataTypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromProfileTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromEnumerationToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPackageToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDataTypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDataTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromEnumerationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDataTypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromEnumerationToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromStereotypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromCommentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromConstraintToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDataTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromCommentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromAssociationNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromConstraintToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromAssociationNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromModelTNToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromProfileTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDataTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromEnumerationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromConstraintToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromStereotypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDataTypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPackageToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromClassToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromProfileTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromProfileTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromProfileTNToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromEnumerationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromCommentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromAssociationNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromClassToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDataTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromClassToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromDependencyNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPrimitiveTypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromProfileTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDataTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromConstraintToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromStereotypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromEnumerationToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromEnumerationToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromProfileTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDependencyNodeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromEnumerationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromClassToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromEnumerationToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromAssociationNodeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromProfileTNToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPrimitiveTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromProfileTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromAssociationNodeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromConstraintToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDataTypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPrimitiveTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromAssociationNodeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromAssociationNodeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromEnumerationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromConstraintToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDataTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPrimitiveTypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromModelTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromCommentToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDataTypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromModelTNToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDataTypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPrimitiveTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromProfileTNToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStereotypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPrimitiveTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDependencyNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromProfileTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromAssociationNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromAssociationNodeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromStereotypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelTNToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromModelTNToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromModelTNToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromStereotypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromClassToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPackageToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromStereotypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromEnumerationToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromDependencyNodeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromCommentToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromEnumerationToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDataTypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPrimitiveTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromModelTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromCommentToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromStereotypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromEnumerationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPrimitiveTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromClassToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPrimitiveTypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromStereotypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromEnumerationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromCommentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromStereotypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromConstraintToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPrimitiveTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromAssociationNodeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromEnumerationToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromClassToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromPrimitiveTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromProfileTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDependencyNodeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromProfileTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDependencyNodeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPrimitiveTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromProfileTNToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromClassToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromModelTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromPackageToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromClassToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromClassToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromConstraintToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromEnumerationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromModelTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromAssociationNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromStereotypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromConstraintToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromClassToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromStereotypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDependencyNodeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromClassToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromEnumerationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPrimitiveTypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromEnumerationToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromClassToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromProfileTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extension.
	 */
	@Test
	@GeneratedTest
	public void testLinkExtensionFromCommentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtensionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromClassToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromAssociationNodeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromModelTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromProfileTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationBranchFromPackageToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromEnumerationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPrimitiveTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromEnumerationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromStereotypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromClassToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromClassToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromStereotypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPackageToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProfileApplication.
	 */
	@Test
	@GeneratedTest
	public void testLinkProfileApplicationFromDependencyNodeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileApplicationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
}	
