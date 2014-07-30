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
package org.eclipse.papyrus.diagram.clazz.test.createFromPalette;

import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.uml.diagram.clazz.CreateClassDiagramCommand;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomUMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ElementImportEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.EnumerationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.GeneralizationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InformationItemEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InstanceSpecificationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ModelEditPartTN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PackageEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PackageImportEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PrimitiveTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SignalEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SubstitutionEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.clazz.test.IClassDiagramTestsConstants;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestClassDiagramLinkOwnedBySourceGen.
 */
public class TestClassDiagramLinkOwnedBySourceGen extends CreateLinkOwnedBySourceFromPaletteTest {
	
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateClassDiagramCommand();
	}
	 
	@Override
	protected String getProjectName() {
		return IClassDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return IClassDiagramTestsConstants.FILE_NAME;
	}

	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return CustomUMLDiagramUpdater.INSTANCE;
	}
}	
