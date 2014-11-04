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
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AssociationNodeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.CommentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ConstraintEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DependencyEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DependencyNodeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DurationObservationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.EnumerationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.EnumerationEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InformationItemEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InformationItemEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InstanceSpecificationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InstanceSpecificationEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ModelEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ModelEditPartTN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PackageEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PackageEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PrimitiveTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PrimitiveTypeEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ShortCutDiagramEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SignalEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SignalEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.TimeObservationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.clazz.test.IClassDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.AbstractCreateLinkFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestClassDiagramDependencyEditPartGen.
 */
public class TestClassDiagramDependencyEditPartGen extends AbstractCreateLinkFromPaletteTest {
	
	
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
	 * Test to create link Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependency() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), true);
					
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
					
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return CustomUMLDiagramUpdater.INSTANCE;
	}
}	
