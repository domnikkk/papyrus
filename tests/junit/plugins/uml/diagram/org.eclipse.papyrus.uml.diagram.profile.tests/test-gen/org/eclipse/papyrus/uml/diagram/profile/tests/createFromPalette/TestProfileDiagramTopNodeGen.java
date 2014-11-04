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
package org.eclipse.papyrus.uml.diagram.profile.tests.createFromPalette;

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.profile.CreateProfileDiagramCommand;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.AssociationNodeEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ClassEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.DataTypeEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.DependencyNodeEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.EnumerationEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ModelEditPartTN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.PackageEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.PrimitiveTypeEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ProfileEditPartTN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.StereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.profile.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.profile.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.profile.tests.IProfileDiagramTest;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateNodeFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestProfileDiagramTopNodeGen.
 */
public class TestProfileDiagramTopNodeGen extends CreateNodeFromPaletteTest {
	
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateProfileDiagramCommand();
	}
	 
	@Override
	protected String getProjectName() {
		return IProfileDiagramTest.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return IProfileDiagramTest.FILE_NAME;
	}

	/**
	 * Test to manage component PrimitiveType.
	 */
	@Test
	@GeneratedTest
	public void testTopNodePrimitiveTypeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Comment.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeCommentEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component DataType.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeDataTypeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Enumeration.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeEnumerationEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Profile.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeProfileEditPartTN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ProfileEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Stereotype.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeStereotypeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(StereotypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Package.
	 */
	@Test
	@GeneratedTest
	public void testTopNodePackageEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeAssociationNodeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(AssociationNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Class.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeClassEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Model.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeModelEditPartTN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ModelEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Constraint.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeConstraintEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testTopNodeDependencyNodeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
		return UMLDiagramUpdater.INSTANCE;
	}
	
}	
