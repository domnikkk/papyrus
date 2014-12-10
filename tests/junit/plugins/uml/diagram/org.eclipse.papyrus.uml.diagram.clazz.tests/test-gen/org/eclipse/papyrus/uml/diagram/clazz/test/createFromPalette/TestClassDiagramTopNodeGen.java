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
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.AbstractCreateNodeFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestClassDiagramTopNodeGen.
 */
public class TestClassDiagramTopNodeGen extends AbstractCreateNodeFromPaletteTest {
	
	
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
	 * Test to create node Class.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeClassEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to create node Association.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeAssociationNodeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to create node Constraint.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeConstraintEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to create node Signal.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeSignalEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to create node DurationObservation.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeDurationObservationEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to create node InstanceSpecification.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeInstanceSpecificationEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to create node Enumeration.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeEnumerationEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to create node DataType.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeDataTypeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to create node TimeObservation.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeTimeObservationEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(TimeObservationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to create node .
	 */
	@Test
	@GeneratedTest
	public void testTopNodeShortCutDiagramEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ShortCutDiagramEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to create node InformationItem.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeInformationItemEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(InformationItemEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to create node Dependency.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeDependencyNodeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to create node Package.
	 */
	@Test
	@GeneratedTest
	public void testTopNodePackageEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to create node Interface.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeInterfaceEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to create node Comment.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeCommentEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to create node PrimitiveType.
	 */
	@Test
	@GeneratedTest
	public void testTopNodePrimitiveTypeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to create node Model.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeModelEditPartTN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to create node Component.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeComponentEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), true);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override 
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), getDiagramEditPart().getDiagramPreferencesHint());
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return CustomUMLDiagramUpdater.INSTANCE;
	}
	
}	
