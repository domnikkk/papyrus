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

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.clazz.CreateClassDiagramCommand;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomUMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.CommentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ConstraintEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.EnumerationEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InformationItemEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InstanceSpecificationEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ModelEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PackageEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PrimitiveTypeEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SignalEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.clazz.test.IClassDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateNodeFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestClassDiagramChildNodeInDataTypeEditPartGen.
 */
public class TestClassDiagramChildNodeInDataTypeEditPartGen extends CreateNodeFromPaletteTest {
	
	
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
	 * Test to manage component Enumeration.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeEnumerationEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InstanceSpecification.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeInstanceSpecificationEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Model.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeModelEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Signal.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeSignalEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Comment.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeCommentEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PrimitiveType.
	 */
	@Test
	@GeneratedTest
	public void testChildNodePrimitiveTypeEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationItem.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeInformationItemEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Constraint.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeConstraintEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Package.
	 */
	@Test
	@GeneratedTest
	public void testChildNodePackageEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Class.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeClassEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component DataType.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeDataTypeEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Component.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeComponentEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), true);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override 
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), getDiagramEditPart().getDiagramPreferencesHint());
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return CustomUMLDiagramUpdater.INSTANCE;
	}
	
}	
