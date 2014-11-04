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
package org.eclipse.papyrus.uml.diagram.clazz.test.createFromPalette;

import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.clazz.CreateClassDiagramCommand;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomUMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AbstractionEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AssociationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DependencyEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.EnumerationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InformationFlowEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InformationItemEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InstanceSpecificationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ModelEditPartTN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PackageEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PrimitiveTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.RealizationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SignalEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.UsageEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.clazz.test.IClassDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateLinkFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestClassDiagramLinkGen.
 */
public class TestClassDiagramLinkGen extends CreateLinkFromPaletteTest {
	
	
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
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromSignalToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	public void testLinkDependencyFromInstanceSpecificationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromModelTNToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPrimitiveTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDataTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromComponentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromComponentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInformationItemToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromComponentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromSignalToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	public void testLinkDependencyFromConstraintToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromSignalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromDataTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInstanceSpecificationToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromSignalToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPrimitiveTypeToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromEnumerationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromComponentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDataTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInformationItemToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromModelTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromSignalToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPrimitiveTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromModelTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromSignalToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromComponentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromSignalToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDataTypeToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPrimitiveTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDataTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromEnumerationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromSignalToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromComponentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromComponentToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromEnumerationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInstanceSpecificationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromEnumerationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromEnumerationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromSignalToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromComponentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromSignalToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPackageToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPrimitiveTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInstanceSpecificationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInstanceSpecificationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	public void testLinkAssociationFromConstraintToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPackageToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromEnumerationToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInstanceSpecificationToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromComponentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromClassToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	public void testLinkAssociationFromPackageToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromSignalToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromConstraintToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromComponentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInstanceSpecificationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromEnumerationToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromSignalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromEnumerationToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromDataTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromModelTNToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPrimitiveTypeToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInstanceSpecificationToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	public void testLinkAssociationFromInstanceSpecificationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPrimitiveTypeToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromSignalToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromSignalToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromModelTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPrimitiveTypeToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromModelTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInstanceSpecificationToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInstanceSpecificationToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPrimitiveTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromDataTypeToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromModelTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromSignalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPackageToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInstanceSpecificationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInstanceSpecificationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDataTypeToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromClassToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromEnumerationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromEnumerationToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPrimitiveTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromSignalToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInformationItemToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromConstraintToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromEnumerationToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPrimitiveTypeToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInformationItemToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInstanceSpecificationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromComponentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromCommentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromSignalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInstanceSpecificationToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromSignalToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInstanceSpecificationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromComponentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInstanceSpecificationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInstanceSpecificationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromComponentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromComponentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPrimitiveTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPackageToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromModelTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInformationItemToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInstanceSpecificationToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromModelTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromModelTNToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPrimitiveTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromModelTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromSignalToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInformationItemToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDataTypeToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPackageToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromSignalToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromClassToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromDataTypeToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromEnumerationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromComponentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInformationItemToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInstanceSpecificationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDataTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromModelTNToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPrimitiveTypeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPackageToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromComponentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDataTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromEnumerationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDataTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromEnumerationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromComponentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromConstraintToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromComponentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromSignalToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromComponentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromSignalToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromComponentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromModelTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInstanceSpecificationToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDataTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInstanceSpecificationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromEnumerationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromConstraintToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromConstraintToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromClassToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromSignalToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromSignalToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromComponentToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromComponentToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPrimitiveTypeToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDataTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromModelTNToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromComponentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromComponentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPrimitiveTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromModelTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromEnumerationToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInstanceSpecificationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromModelTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromEnumerationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPrimitiveTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPackageToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromComponentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromSignalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInstanceSpecificationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromSignalToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInstanceSpecificationToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromClassToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInstanceSpecificationToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromEnumerationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromModelTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDataTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInformationItemToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInstanceSpecificationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInstanceSpecificationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPrimitiveTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromComponentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInstanceSpecificationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromSignalToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInstanceSpecificationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromModelTNToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromModelTNToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromEnumerationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromSignalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPrimitiveTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInstanceSpecificationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromComponentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPackageToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromComponentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromEnumerationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromCommentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInformationItemToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInstanceSpecificationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPackageToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromComponentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromModelTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromSignalToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromEnumerationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPrimitiveTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromCommentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromSignalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInstanceSpecificationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromDataTypeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromComponentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPrimitiveTypeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromComponentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInformationItemToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromComponentToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromDataTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromClassToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromSignalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromComponentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInstanceSpecificationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDataTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromModelTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromEnumerationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInformationItemToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPrimitiveTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromComponentToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromModelTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromEnumerationToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInstanceSpecificationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPrimitiveTypeToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPackageToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromSignalToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInstanceSpecificationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDataTypeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromSignalToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromClassToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInstanceSpecificationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromSignalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInstanceSpecificationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInformationItemToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInstanceSpecificationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInstanceSpecificationToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPrimitiveTypeToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromComponentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromSignalToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInstanceSpecificationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromSignalToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelTNToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelTNToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPrimitiveTypeToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInformationItemToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromModelTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromEnumerationToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromDataTypeToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPackageToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDataTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPrimitiveTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromComponentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromModelTNToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDataTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromModelTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromEnumerationToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromEnumerationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromCommentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromComponentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDataTypeToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromSignalToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPrimitiveTypeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromEnumerationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromModelTNToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromEnumerationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromModelTNToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromComponentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromSignalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromComponentToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromModelTNToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInformationItemToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPrimitiveTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromComponentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromModelTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromSignalToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromComponentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDataTypeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromModelTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromComponentToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPrimitiveTypeToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDataTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPrimitiveTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromModelTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromEnumerationToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromComponentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromDataTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPackageToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromModelTNToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromCommentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromComponentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromModelTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromSignalToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDataTypeToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInstanceSpecificationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromEnumerationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPackageToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInstanceSpecificationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromSignalToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromSignalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	public void testLinkDependencyFromDataTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromComponentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPrimitiveTypeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromClassToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromComponentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPrimitiveTypeToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDataTypeToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInstanceSpecificationToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromComponentToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromEnumerationToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromClassToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInstanceSpecificationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDataTypeToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromCommentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInformationItemToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromComponentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromSignalToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInformationItemToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromEnumerationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDataTypeToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDataTypeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromEnumerationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInformationItemToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInstanceSpecificationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromComponentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromSignalToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPrimitiveTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPackageToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInformationItemToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromSignalToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPrimitiveTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromComponentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInstanceSpecificationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromClassToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPrimitiveTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInformationItemToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInstanceSpecificationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromComponentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDataTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromEnumerationToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPackageToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromEnumerationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromCommentToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPackageToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromSignalToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInstanceSpecificationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	public void testLinkAssociationFromModelTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromComponentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromModelTNToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromSignalToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromClassToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromSignalToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromEnumerationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDataTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDataTypeToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromSignalToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromSignalToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromCommentToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromComponentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInstanceSpecificationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromCommentToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPrimitiveTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromSignalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromEnumerationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInstanceSpecificationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromConstraintToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPrimitiveTypeToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInstanceSpecificationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromModelTNToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDataTypeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDataTypeToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInstanceSpecificationToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromEnumerationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromEnumerationToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromEnumerationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	public void testLinkAssociationFromCommentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromEnumerationToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPackageToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromModelTNToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInstanceSpecificationToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPrimitiveTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromSignalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromSignalToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInstanceSpecificationToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromEnumerationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromModelTNToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromClassToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPrimitiveTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPrimitiveTypeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelTNToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPrimitiveTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromEnumerationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDataTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromComponentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromEnumerationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromEnumerationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromModelTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromEnumerationToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromSignalToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromSignalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromEnumerationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPackageToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInformationItemToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromComponentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInstanceSpecificationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPrimitiveTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromModelTNToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromSignalToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromConstraintToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromConstraintToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromClassToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDataTypeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromSignalToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPrimitiveTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDataTypeToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromEnumerationToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromSignalToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPrimitiveTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInstanceSpecificationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromComponentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromCommentToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromModelTNToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDataTypeToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInstanceSpecificationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromModelTNToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromSignalToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromComponentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInformationItemToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromSignalToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDataTypeToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPrimitiveTypeToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromModelTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromModelTNToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	public void testLinkAssociationFromPrimitiveTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromConstraintToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInstanceSpecificationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromSignalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromComponentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDataTypeToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromComponentToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromModelTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromEnumerationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	public void testLinkAssociationFromPrimitiveTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInstanceSpecificationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDataTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInstanceSpecificationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInstanceSpecificationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDataTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInstanceSpecificationToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInstanceSpecificationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromSignalToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromInformationItemToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromModelTNToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPackageToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromSignalToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromClassToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDataTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPrimitiveTypeToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromCommentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromComponentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	public void testLinkDependencyFromInstanceSpecificationToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromSignalToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromModelTNToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromDataTypeToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromCommentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromComponentToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPrimitiveTypeToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromComponentToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInstanceSpecificationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPrimitiveTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromComponentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromConstraintToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	public void testLinkDependencyFromDataTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromDataTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelTNToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromSignalToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromEnumerationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDataTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromModelTNToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromComponentToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromComponentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromSignalToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromClassToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromDataTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPrimitiveTypeToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromSignalToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPrimitiveTypeToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromConstraintToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromComponentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPrimitiveTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromEnumerationToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInstanceSpecificationToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPrimitiveTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromClassToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromDataTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelTNToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromSignalToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromComponentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInstanceSpecificationToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromModelTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromComponentToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInstanceSpecificationToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromComponentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromModelTNToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	public void testLinkDependencyFromClassToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromDataTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPrimitiveTypeToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDataTypeToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromModelTNToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromEnumerationToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromDataTypeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromDataTypeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromCommentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDataTypeToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromDataTypeToDataType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInformationItemToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInformationItemToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromModelTNToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInstanceSpecificationToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPrimitiveTypeToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	public void testLinkAssociationFromClassToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromSignalToPrimitiveType() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromSignalToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPrimitiveTypeToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromEnumerationToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromClassToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromClassToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPackageToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInstanceSpecificationToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromInformationItemToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromClassToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromInstanceSpecificationToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromClassToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToInformationItem() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInformationItemToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromModelTNToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromEnumerationToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInformationItemToSignal() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInformationItemToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromSignalToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromComponentToClass() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPackageToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromComponentToInstanceSpecification() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromEnumerationToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromSignalToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromComponentToModelTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromEnumerationToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkInformationFlowFromPrimitiveTypeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPrimitiveTypeToEnumeration() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return CustomUMLDiagramUpdater.INSTANCE;
	}
}	
