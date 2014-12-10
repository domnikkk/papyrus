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
package org.eclipse.papyrus.uml.diagram.clazz.test.edition;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.clazz.CreateClassDiagramCommand;
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
import org.eclipse.papyrus.uml.diagram.tests.edition.AbstractEditableNodeTest;
import org.junit.Test;

/**
 * The Class TestClassDiagramEditionGen.
 */
public class TestClassDiagramEditionGen extends AbstractEditableNodeTest {

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
	 * Test the editable properties of element Constraint.
	 */
	@Test
	@GeneratedTest
	public void testEditionNodeConstraintEditPart() {
		testEdition(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID));
	}
	/**
	 * Test the editable properties of element InformationItem.
	 */
	@Test
	@GeneratedTest
	public void testEditionNodeInformationItemEditPart() {
		testEdition(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID));
	}
	/**
	 * Test the editable properties of element PrimitiveType.
	 */
	@Test
	@GeneratedTest
	public void testEditionNodePrimitiveTypeEditPart() {
		testEdition(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID));
	}
	/**
	 * Test the editable properties of element Enumeration.
	 */
	@Test
	@GeneratedTest
	public void testEditionNodeEnumerationEditPart() {
		testEdition(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID));
	}
	/**
	 * Test the editable properties of element Signal.
	 */
	@Test
	@GeneratedTest
	public void testEditionNodeSignalEditPart() {
		testEdition(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID));
	}
	/**
	 * Test the editable properties of element DurationObservation.
	 */
	@Test
	@GeneratedTest
	public void testEditionNodeDurationObservationEditPart() {
		testEdition(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID));
	}
	/**
	 * Test the editable properties of element InstanceSpecification.
	 */
	@Test
	@GeneratedTest
	public void testEditionNodeInstanceSpecificationEditPart() {
		testEdition(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID));
	}
	/**
	 * Test the editable properties of element DataType.
	 */
	@Test
	@GeneratedTest
	public void testEditionNodeDataTypeEditPart() {
		testEdition(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID));
	}
	/**
	 * Test the editable properties of element Model.
	 */
	@Test
	@GeneratedTest
	public void testEditionNodeModelEditPartTN() {
		testEdition(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID));
	}
	/**
	 * Test the editable properties of element Comment.
	 */
	@Test
	@GeneratedTest
	public void testEditionNodeCommentEditPart() {
		testEdition(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID));
	}
	/**
	 * Test the editable properties of element Class.
	 */
	@Test
	@GeneratedTest
	public void testEditionNodeClassEditPart() {
		testEdition(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID));
	}
	/**
	 * Test the editable properties of element Package.
	 */
	@Test
	@GeneratedTest
	public void testEditionNodePackageEditPart() {
		testEdition(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID));
	}
	/**
	 * Test the editable properties of element Dependency.
	 */
	@Test
	@GeneratedTest
	public void testEditionNodeDependencyNodeEditPart() {
		testEdition(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID));
	}
	/**
	 * Test the editable properties of element .
	 */
	@Test
	@GeneratedTest
	public void testEditionNodeShortCutDiagramEditPart() {
		testEdition(UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID));
	}
	/**
	 * Test the editable properties of element Component.
	 */
	@Test
	@GeneratedTest
	public void testEditionNodeComponentEditPart() {
		testEdition(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID));
	}
	/**
	 * Test the editable properties of element TimeObservation.
	 */
	@Test
	@GeneratedTest
	public void testEditionNodeTimeObservationEditPart() {
		testEdition(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID));
	}
	/**
	 * Test the editable properties of element Interface.
	 */
	@Test
	@GeneratedTest
	public void testEditionNodeInterfaceEditPart() {
		testEdition(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID));
	}
	/**
	 * Test the editable properties of element Association.
	 */
	@Test
	@GeneratedTest
	public void testEditionNodeAssociationNodeEditPart() {
		testEdition(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID));
	}
}
