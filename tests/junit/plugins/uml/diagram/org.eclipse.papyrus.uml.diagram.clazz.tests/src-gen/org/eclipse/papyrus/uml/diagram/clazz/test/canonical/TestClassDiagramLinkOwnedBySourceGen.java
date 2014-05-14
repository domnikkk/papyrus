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
package org.eclipse.papyrus.uml.diagram.clazz.test.canonical;

import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.diagram.tests.canonical.TestLinkOwnedBySource;
import org.eclipse.papyrus.uml.diagram.clazz.CreateClassDiagramCommand;
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
public class TestClassDiagramLinkOwnedBySourceGen extends TestLinkOwnedBySource {
	
	
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
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToDataType() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToSignal() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToDataType() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToClass() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToClass() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToSignal() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToSignal() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToDataType() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToClass() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToClass() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToDataType() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToComponent() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToSignal() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToClass() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToClass() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToSignal() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToComment() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToDataType() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToComment() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToSignal() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToDataType() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToComment() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToClass() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToDataType() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToComment() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToDataType() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToComment() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToPackage() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToClass() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToDataType() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToClass() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToDataType() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToSignal() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToComponent() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToSignal() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToSignal() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToClass() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToSignal() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToClass() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToClass() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToDataType() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToClass() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToDataType() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToClass() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToSignal() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToComponent() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToComment() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToClass() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToSignal() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToSignal() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToPackage() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToPackage() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToSignal() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToComment() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToDataType() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToDataType() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToDataType() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToSignal() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToDataType() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToComponent() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToComponent() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToComment() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToClass() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToSignal() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToClass() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToDataType() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToDataType() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToClass() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToDataType() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToDataType() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToDataType() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToClass() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToSignal() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToPackage() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToSignal() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToClass() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToComponent() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToSignal() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToComment() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToComment() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToClass() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToClass() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToSignal() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToDataType() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToSignal() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToComponent() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToComment() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToClass() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToClass() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToSignal() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToComment() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToSignal() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToComment() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToDataType() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToClass() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToClass() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToClass() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToClass() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToDataType() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToComment() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToClass() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToSignal() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToDataType() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	public void testLinkOwnedBySourceGeneralizationFromClassToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPackageToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToComment() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToPackage() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToComment() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToClass() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToClass() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToDataType() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToPackage() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToClass() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToClass() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToComment() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToClass() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToComment() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToDataType() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToDataType() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToPackage() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToClass() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToClass() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToSignal() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToDataType() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToDataType() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToComment() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToComponent() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	public void testLinkOwnedBySourceGeneralizationFromModelTNToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToSignal() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToComment() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToComponent() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToClass() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToDataType() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToDataType() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToComment() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToSignal() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToComponent() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToComponent() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToDataType() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToComment() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToComment() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToComment() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToClass() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToComponent() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToComment() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToClass() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToDataType() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToClass() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToClass() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToClass() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToSignal() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToComment() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToPackage() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPrimitiveTypeToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToSignal() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToPackage() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToComment() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToDataType() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToPackage() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToComment() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToClass() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToDataType() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToComment() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToPackage() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToPackage() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToClass() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToSignal() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromModelTNToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToClass() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToClass() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToDataType() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToComment() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToComment() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToComment() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToComment() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToDataType() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToComment() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToSignal() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToComment() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToSignal() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToComponent() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToComponent() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToComment() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToSignal() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToClass() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToClass() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToComment() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToSignal() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToSignal() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToDataType() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToClass() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToComment() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToPackage() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToClass() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToClass() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToComment() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToSignal() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToClass() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromModelTNToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToComponent() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToPackage() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPackageToDataType() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToClass() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromClassToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromConstraintToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToClass() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToPackage() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToSignal() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromCommentToClass() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromEnumerationToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToClass() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromModelTNToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPackageToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromSignalToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromPrimitiveTypeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInformationItemToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromDataTypeToComment() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromDataTypeToClass() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToComment() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromClassToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToComment() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromEnumerationToSignal() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromEnumerationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromInstanceSpecificationToComment() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInformationItemToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToClass() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromInstanceSpecificationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPrimitiveTypeToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromComponentToComment() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToSignal() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromDataTypeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromSignalToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromDataTypeToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToClass() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromCommentToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromPackageToComment() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromSignalToClass() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromClassToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromSignalToSignal() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromSignalToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromClassToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromClassToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromDataTypeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInstanceSpecificationToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromInformationItemToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromComponentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInformationItemToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromConstraintToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkOwnedBySourceInterfaceRealizationFromPackageToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromModelTNToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromEnumerationToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromInstanceSpecificationToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToComment() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromModelTNToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromCommentToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromPrimitiveTypeToComment() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInstanceSpecificationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromInformationItemToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Substitution.
	 */
	@Test
	public void testLinkOwnedBySourceSubstitutionFromConstraintToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SubstitutionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromComponentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromComponentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromComponentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToComment() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromEnumerationToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ElementImport.
	 */
	@Test
	public void testLinkOwnedBySourceElementImportFromCommentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ElementImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	public void testLinkOwnedBySourcePackageImportFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	public void testLinkOwnedBySourceGeneralizationFromPrimitiveTypeToComment() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
}	
