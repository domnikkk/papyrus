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
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.AssociationNodeEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ClassEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.DataTypeEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.DependencyNodeEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ElementImportEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.EnumerationEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.GeneralizationEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ModelEditPartTN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.PackageEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.PackageImportEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.PrimitiveTypeEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ProfileEditPartTN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.StereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.profile.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.profile.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.profile.tests.IProfileDiagramTest;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateLinkOwnedBySourceFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestProfileDiagramLinkOwnedBySourceGen.
 */
public class TestProfileDiagramLinkOwnedBySourceGen extends CreateLinkOwnedBySourceFromPaletteTest {
	
	
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
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromProfileTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromStereotypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromClassToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromEnumerationToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromAssociationNodeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromAssociationNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromStereotypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromClassToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromConstraintToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDataTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromEnumerationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromProfileTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDependencyNodeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromAssociationNodeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDependencyNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromCommentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPackageToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromAssociationNodeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromCommentToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromConstraintToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromProfileTNToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromProfileTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDependencyNodeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromAssociationNodeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromConstraintToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromEnumerationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromProfileTNToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromClassToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDataTypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromEnumerationToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDependencyNodeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromEnumerationToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPackageToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromModelTNToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDataTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromCommentToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromClassToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStereotypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromModelTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromProfileTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStereotypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPackageToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromAssociationNodeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromConstraintToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromAssociationNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromProfileTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromProfileTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromEnumerationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDataTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromAssociationNodeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromClassToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDataTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDependencyNodeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStereotypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromEnumerationToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromStereotypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDependencyNodeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromCommentToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromStereotypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPackageToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromModelTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromModelTNToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPackageToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPackageToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStereotypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDataTypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDependencyNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromModelTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPackageToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDataTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromModelTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPackageToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromCommentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDependencyNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromModelTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPackageToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromClassToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromProfileTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromAssociationNodeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromClassToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromEnumerationToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromAssociationNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromEnumerationToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDependencyNodeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromStereotypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromStereotypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromConstraintToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromProfileTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDataTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromModelTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStereotypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromStereotypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromConstraintToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromClassToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromProfileTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPackageToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromClassToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromConstraintToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromModelTNToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromModelTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromStereotypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPackageToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromAssociationNodeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromModelTNToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDataTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromEnumerationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromClassToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromClassToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromAssociationNodeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromProfileTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromAssociationNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromProfileTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDependencyNodeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDependencyNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromModelTNToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromCommentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromProfileTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromModelTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPackageToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDataTypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromEnumerationToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromStereotypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDependencyNodeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromAssociationNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromProfileTNToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromCommentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromConstraintToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromModelTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDependencyNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDependencyNodeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDataTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPackageToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStereotypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDependencyNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromConstraintToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromEnumerationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromAssociationNodeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDependencyNodeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromClassToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromModelTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromEnumerationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromAssociationNodeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromProfileTNToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPackageToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromConstraintToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromAssociationNodeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromEnumerationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromEnumerationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPackageToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDependencyNodeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDependencyNodeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromConstraintToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromAssociationNodeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStereotypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDependencyNodeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDependencyNodeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPackageToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromProfileTNToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromModelTNToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDependencyNodeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStereotypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDependencyNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromAssociationNodeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromStereotypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromCommentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromCommentToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromClassToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDependencyNodeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromModelTNToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromClassToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPackageToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromEnumerationToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromClassToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromAssociationNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromProfileTNToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromStereotypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromCommentToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromConstraintToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromModelTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromModelTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromClassToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromAssociationNodeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromStereotypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromStereotypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromProfileTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromEnumerationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromAssociationNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromCommentToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromAssociationNodeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromModelTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromProfileTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromAssociationNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromEnumerationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromModelTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromAssociationNodeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromModelTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromClassToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromModelTNToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromClassToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromProfileTNToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPackageToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromProfileTNToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDataTypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromAssociationNodeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromProfileTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromModelTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDependencyNodeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromProfileTNToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromAssociationNodeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromModelTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDataTypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromStereotypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDataTypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDependencyNodeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDataTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStereotypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDataTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDependencyNodeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromConstraintToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromCommentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromProfileTNToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromConstraintToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromAssociationNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromEnumerationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromClassToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromProfileTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDependencyNodeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDataTypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromClassToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromAssociationNodeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromAssociationNodeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromProfileTNToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromAssociationNodeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromStereotypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromStereotypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDataTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromStereotypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromEnumerationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromProfileTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromCommentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromEnumerationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromModelTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromProfileTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromCommentToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromAssociationNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromAssociationNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromStereotypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromModelTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromEnumerationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPackageToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStereotypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromStereotypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromClassToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDataTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromModelTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromProfileTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDataTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDependencyNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromCommentToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromProfileTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromProfileTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDependencyNodeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromCommentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromConstraintToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPackageToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromStereotypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDependencyNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromModelTNToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromAssociationNodeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromProfileTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPackageToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromCommentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDataTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDependencyNodeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromEnumerationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromConstraintToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDataTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromProfileTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromAssociationNodeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromStereotypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromModelTNToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromModelTNToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromEnumerationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromStereotypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromStereotypeToStereotype() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStereotypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromConstraintToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromStereotypeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPackageToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromStereotypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDependencyNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromCommentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromModelTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromProfileTNToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromClassToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromModelTNToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromClassToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromClassToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromModelTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromClassToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromConstraintToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromPackageToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDataTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromModelTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromModelTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPackageToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDependencyNodeToProfileTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromAssociationNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDependencyNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDependencyNodeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPackageToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceElementImportFromDependencyNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPackageToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPackageToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromProfileTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromDataTypeToAssociationNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
}	
