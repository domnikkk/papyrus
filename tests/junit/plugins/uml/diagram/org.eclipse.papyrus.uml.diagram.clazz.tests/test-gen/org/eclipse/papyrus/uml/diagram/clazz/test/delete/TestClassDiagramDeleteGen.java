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
package org.eclipse.papyrus.uml.diagram.clazz.test.delete;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.clazz.CreateClassDiagramCommand;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomUMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AssociationNodeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DependencyNodeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DurationObservationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.EnumerationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InformationItemEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InstanceSpecificationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ModelEditPartTN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PackageEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PrimitiveTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ShortCutDiagramEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SignalEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.TimeObservationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.clazz.test.IClassDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.delete.AbstractDeleteNodeTest;
import org.junit.Test;

/**
 * The Class TestClassDiagramDeleteGen.
 */
public class TestClassDiagramDeleteGen extends AbstractDeleteNodeTest {

	@Override
	public GraphicalEditPart getContainerEditPart() {
		return getDiagramEditPart();
	}
	
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
	 * Test to delete element Signal.
	 */
	@Test
	@GeneratedTest
	public void testDeleteNodeSignalEditPart() {
		testDestroy(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID));
	}
	/**
	 * Test to delete element Dependency.
	 */
	@Test
	@GeneratedTest
	public void testDeleteNodeDependencyNodeEditPart() {
		testDestroy(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID));
	}
	/**
	 * Test to delete element Model.
	 */
	@Test
	@GeneratedTest
	public void testDeleteNodeModelEditPartTN() {
		testDestroy(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID));
	}
	/**
	 * Test to delete element Comment.
	 */
	@Test
	@GeneratedTest
	public void testDeleteNodeCommentEditPart() {
		testDestroy(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID));
	}
	/**
	 * Test to delete element InstanceSpecification.
	 */
	@Test
	@GeneratedTest
	public void testDeleteNodeInstanceSpecificationEditPart() {
		testDestroy(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID));
	}
	/**
	 * Test to delete element Enumeration.
	 */
	@Test
	@GeneratedTest
	public void testDeleteNodeEnumerationEditPart() {
		testDestroy(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID));
	}
	/**
	 * Test to delete element PrimitiveType.
	 */
	@Test
	@GeneratedTest
	public void testDeleteNodePrimitiveTypeEditPart() {
		testDestroy(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID));
	}
	/**
	 * Test to delete element Class.
	 */
	@Test
	@GeneratedTest
	public void testDeleteNodeClassEditPart() {
		testDestroy(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID));
	}
	/**
	 * Test to delete element Interface.
	 */
	@Test
	@GeneratedTest
	public void testDeleteNodeInterfaceEditPart() {
		testDestroy(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID));
	}
	/**
	 * Test to delete element Association.
	 */
	@Test
	@GeneratedTest
	public void testDeleteNodeAssociationNodeEditPart() {
		testDestroy(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID));
	}
	/**
	 * Test to delete element Component.
	 */
	@Test
	@GeneratedTest
	public void testDeleteNodeComponentEditPart() {
		testDestroy(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID));
	}
	/**
	 * Test to delete element Constraint.
	 */
	@Test
	@GeneratedTest
	public void testDeleteNodeConstraintEditPart() {
		testDestroy(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID));
	}
	/**
	 * Test to delete element TimeObservation.
	 */
	@Test
	@GeneratedTest
	public void testDeleteNodeTimeObservationEditPart() {
		testDestroy(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID));
	}
	/**
	 * Test to delete element Package.
	 */
	@Test
	@GeneratedTest
	public void testDeleteNodePackageEditPart() {
		testDestroy(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID));
	}
	/**
	 * Test to delete element .
	 */
	@Test
	@GeneratedTest
	public void testDeleteNodeShortCutDiagramEditPart() {
		testDestroy(UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID));
	}
	/**
	 * Test to delete element DataType.
	 */
	@Test
	@GeneratedTest
	public void testDeleteNodeDataTypeEditPart() {
		testDestroy(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID));
	}
	/**
	 * Test to delete element DurationObservation.
	 */
	@Test
	@GeneratedTest
	public void testDeleteNodeDurationObservationEditPart() {
		testDestroy(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID));
	}
	/**
	 * Test to delete element InformationItem.
	 */
	@Test
	@GeneratedTest
	public void testDeleteNodeInformationItemEditPart() {
		testDestroy(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID));
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return CustomUMLDiagramUpdater.INSTANCE;
	}
}
