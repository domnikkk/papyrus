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

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomUMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.clazz.CreateClassDiagramCommand;
import org.eclipse.papyrus.uml.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.clazz.test.IClassDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PrimitiveTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PackageEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ModelEditPartTN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SignalEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InstanceSpecificationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.EnumerationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InformationItemEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassEditPart;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateNodeFromPaletteTest;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestClassDiagramTopNodeGen.
 */
public class TestClassDiagramTopNodeGen extends CreateNodeFromPaletteTest {
	
	
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
	 * Test to manage component PrimitiveType.
	 */
	@Test
	public void testChildNodePrimitiveTypeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationItem.
	 */
	@Test
	public void testChildNodeInformationItemEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Constraint.
	 */
	@Test
	public void testChildNodeConstraintEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Model.
	 */
	@Test
	public void testChildNodeModelEditPartTN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Package.
	 */
	@Test
	public void testChildNodePackageEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Signal.
	 */
	@Test
	public void testChildNodeSignalEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Comment.
	 */
	@Test
	public void testChildNodeCommentEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Enumeration.
	 */
	@Test
	public void testChildNodeEnumerationEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Component.
	 */
	@Test
	public void testChildNodeComponentEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Class.
	 */
	@Test
	public void testChildNodeClassEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component DataType.
	 */
	@Test
	public void testChildNodeDataTypeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InstanceSpecification.
	 */
	@Test
	public void testChildNodeInstanceSpecificationEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), true);
	}
	
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return CustomUMLDiagramUpdater.INSTANCE;
	}
	
}	
