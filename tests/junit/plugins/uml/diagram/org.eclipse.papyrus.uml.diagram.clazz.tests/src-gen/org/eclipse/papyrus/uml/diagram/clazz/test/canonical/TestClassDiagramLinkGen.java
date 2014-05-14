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
import org.eclipse.papyrus.diagram.tests.canonical.TestLink;
import org.eclipse.papyrus.uml.diagram.clazz.CreateClassDiagramCommand;
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
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SignalEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.UsageEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.clazz.test.IClassDiagramTestsConstants;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestClassDiagramLinkGen.
 */
public class TestClassDiagramLinkGen extends TestLink {
	
	
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
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToComment() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPackageToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromComponentToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromConstraintToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromComponentToClass() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromModelTNToClass() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromModelTNToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromComponentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromEnumerationToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromSignalToDataType() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPackageToSignal() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromClassToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromDataTypeToComponent() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDataTypeToPackage() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromComponentToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromConstraintToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromModelTNToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromSignalToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromComponentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromEnumerationToComponent() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPrimitiveTypeToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromDataTypeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPrimitiveTypeToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromComponentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPackageToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromSignalToComment() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromComponentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromSignalToSignal() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromEnumerationToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromModelTNToComment() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDataTypeToDataType() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromEnumerationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPrimitiveTypeToComment() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromSignalToComment() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPackageToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromEnumerationToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromModelTNToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInstanceSpecificationToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassToClass() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromEnumerationToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromComponentToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromEnumerationToSignal() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromEnumerationToClass() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPackageToComment() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDataTypeToDataType() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPrimitiveTypeToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromConstraintToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDataTypeToSignal() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromComponentToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPackageToDataType() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPrimitiveTypeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromClassToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDataTypeToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInformationItemToDataType() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPrimitiveTypeToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPackageToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPrimitiveTypeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInstanceSpecificationToComment() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromSignalToPackage() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInstanceSpecificationToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromComponentToComment() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToSignal() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPrimitiveTypeToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInstanceSpecificationToComment() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromSignalToSignal() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPackageToClass() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPrimitiveTypeToComment() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromEnumerationToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromEnumerationToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromModelTNToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassToClass() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromComponentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromSignalToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromEnumerationToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDataTypeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPrimitiveTypeToSignal() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPrimitiveTypeToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToDataType() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromModelTNToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromComponentToClass() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPackageToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPackageToClass() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromEnumerationToSignal() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromDataTypeToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToSignal() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInstanceSpecificationToClass() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromSignalToClass() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromModelTNToComment() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromClassToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromSignalToClass() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInstanceSpecificationToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPackageToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPackageToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromSignalToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromCommentToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromDataTypeToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInstanceSpecificationToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInstanceSpecificationToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromConstraintToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDataTypeToClass() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPackageToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPrimitiveTypeToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromCommentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPackageToDataType() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDataTypeToComponent() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDataTypeToPackage() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromModelTNToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPrimitiveTypeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPackageToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInstanceSpecificationToDataType() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPrimitiveTypeToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromModelTNToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromConstraintToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPackageToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromEnumerationToComment() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInstanceSpecificationToClass() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPackageToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPackageToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInstanceSpecificationToSignal() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDataTypeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDataTypeToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromCommentToDataType() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPrimitiveTypeToComment() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPackageToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPackageToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPrimitiveTypeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToClass() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInformationItemToSignal() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromEnumerationToSignal() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToDataType() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDataTypeToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDataTypeToComponent() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromCommentToClass() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromEnumerationToComponent() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromSignalToPackage() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromComponentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPrimitiveTypeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInstanceSpecificationToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToSignal() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDataTypeToComment() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromCommentToSignal() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromCommentToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromEnumerationToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromComponentToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromEnumerationToClass() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromModelTNToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromSignalToComponent() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInstanceSpecificationToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassToComment() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromDataTypeToPackage() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromEnumerationToDataType() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPrimitiveTypeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInstanceSpecificationToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromEnumerationToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromModelTNToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPrimitiveTypeToClass() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPackageToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDataTypeToSignal() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInstanceSpecificationToComment() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPackageToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromConstraintToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromSignalToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToSignal() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromEnumerationToComment() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromModelTNToClass() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromComponentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPrimitiveTypeToSignal() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromEnumerationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInformationItemToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPackageToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPrimitiveTypeToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPackageToClass() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPackageToSignal() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromSignalToDataType() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromSignalToDataType() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromModelTNToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToSignal() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPackageToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPrimitiveTypeToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromModelTNToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromComponentToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromEnumerationToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToDataType() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPackageToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromComponentToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromModelTNToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromComponentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromDataTypeToSignal() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromComponentToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromEnumerationToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromSignalToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDataTypeToPackage() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromComponentToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDataTypeToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPackageToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInstanceSpecificationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPrimitiveTypeToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromEnumerationToSignal() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromConstraintToClass() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInformationItemToClass() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromComponentToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInstanceSpecificationToClass() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromEnumerationToPackage() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromEnumerationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPrimitiveTypeToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromEnumerationToComponent() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInstanceSpecificationToDataType() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromModelTNToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromEnumerationToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromComponentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDataTypeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInstanceSpecificationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInstanceSpecificationToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromSignalToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPrimitiveTypeToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToClass() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPrimitiveTypeToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromCommentToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPrimitiveTypeToDataType() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToComment() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromComponentToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassToClass() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInstanceSpecificationToSignal() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDataTypeToSignal() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromModelTNToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPrimitiveTypeToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPackageToDataType() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromModelTNToClass() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPrimitiveTypeToDataType() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromComponentToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInstanceSpecificationToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDataTypeToComponent() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPrimitiveTypeToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromEnumerationToComponent() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromComponentToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToClass() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromComponentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDataTypeToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPackageToComment() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDataTypeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromEnumerationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromCommentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInstanceSpecificationToSignal() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassToComment() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPackageToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromComponentToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInstanceSpecificationToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToClass() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInstanceSpecificationToClass() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromSignalToPackage() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInstanceSpecificationToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromModelTNToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromDataTypeToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromDataTypeToClass() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInstanceSpecificationToDataType() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInstanceSpecificationToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromSignalToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromModelTNToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInstanceSpecificationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromEnumerationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPackageToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromComponentToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromModelTNToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromEnumerationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPackageToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromClassToClass() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPrimitiveTypeToSignal() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromEnumerationToClass() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPackageToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPrimitiveTypeToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInformationItemToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromModelTNToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromCommentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPackageToClass() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInformationItemToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromEnumerationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDataTypeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPrimitiveTypeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromDataTypeToComment() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromComponentToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToDataType() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPrimitiveTypeToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromModelTNToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromComponentToComment() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromSignalToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromEnumerationToPackage() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPrimitiveTypeToDataType() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToClass() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInformationItemToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromComponentToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDataTypeToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDataTypeToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromComponentToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromComponentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDataTypeToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInstanceSpecificationToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromSignalToDataType() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPackageToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInstanceSpecificationToSignal() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPackageToComment() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInformationItemToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromDataTypeToDataType() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInstanceSpecificationToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromModelTNToComment() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPrimitiveTypeToDataType() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromSignalToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDataTypeToClass() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromModelTNToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromEnumerationToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromSignalToSignal() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromComponentToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInstanceSpecificationToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInstanceSpecificationToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromSignalToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromComponentToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPrimitiveTypeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromClassToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToDataType() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromModelTNToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInstanceSpecificationToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInstanceSpecificationToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToClass() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromModelTNToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromEnumerationToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDataTypeToComment() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInformationItemToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPrimitiveTypeToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromSignalToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromModelTNToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromDataTypeToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromModelTNToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromSignalToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromComponentToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPackageToSignal() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromSignalToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPackageToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromEnumerationToComment() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromComponentToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInstanceSpecificationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromDataTypeToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromClassToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromEnumerationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromModelTNToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromSignalToComment() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromComponentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromModelTNToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromSignalToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromSignalToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInformationItemToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromComponentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromModelTNToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInstanceSpecificationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromCommentToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPrimitiveTypeToSignal() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDataTypeToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPackageToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromSignalToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromCommentToDataType() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromClassToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromModelTNToClass() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInstanceSpecificationToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromModelTNToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromClassToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDataTypeToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromEnumerationToDataType() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromSignalToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromModelTNToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDataTypeToComment() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromClassToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromComponentToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInstanceSpecificationToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromModelTNToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromSignalToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromClassToComment() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToComment() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromModelTNToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromSignalToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromSignalToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromClassToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPackageToDataType() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInformationItemToComment() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromSignalToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromComponentToComment() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPrimitiveTypeToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPrimitiveTypeToClass() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromClassToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInstanceSpecificationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromSignalToClass() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInstanceSpecificationToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromSignalToComment() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInstanceSpecificationToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInformationItemToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromEnumerationToPackage() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPackageToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromEnumerationToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromComponentToClass() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDataTypeToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromEnumerationToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromClassToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromSignalToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromModelTNToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPackageToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromComponentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPackageToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromComponentToComment() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPackageToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromModelTNToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromComponentToClass() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPrimitiveTypeToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromModelTNToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromConstraintToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPackageToSignal() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromSignalToClass() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPrimitiveTypeToClass() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromConstraintToDataType() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromComponentToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPrimitiveTypeToComment() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInformationItemToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromClassToComment() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromDataTypeToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInstanceSpecificationToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromModelTNToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPrimitiveTypeToClass() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInstanceSpecificationToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDataTypeToClass() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromModelTNToModelTN() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromPrimitiveTypeToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromModelTNToComment() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromSignalToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToSignal() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromEnumerationToDataType() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromModelTNToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPrimitiveTypeToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInstanceSpecificationToDataType() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromModelTNToEnumeration() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromSignalToComponent() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromClassToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromConstraintToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToClass() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromComponentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPackageToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromEnumerationToClass() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromSignalToSignal() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromEnumerationToComment() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromModelTNToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInstanceSpecificationToComment() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromEnumerationToDataType() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPackageToComment() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromSignalToComponent() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromComponentToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromPrimitiveTypeToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromSignalToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInformationItemToInstanceSpecification() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromSignalToPackage() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	public void testLinkAssociationFromInstanceSpecificationToInformationItem() {
		testToManageLink(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromConstraintToClass() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromSignalToComponent() {
		testToManageLink(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToSignal() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromDataTypeToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToClass() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromInformationItemToPrimitiveType() {
		testToManageLink(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationFlow.
	 */
	@Test
	public void testLinkInformationFlowFromDataTypeToDataType() {
		testToManageLink(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromEnumerationToPackage() {
		testToManageLink(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromModelTNToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
}	
