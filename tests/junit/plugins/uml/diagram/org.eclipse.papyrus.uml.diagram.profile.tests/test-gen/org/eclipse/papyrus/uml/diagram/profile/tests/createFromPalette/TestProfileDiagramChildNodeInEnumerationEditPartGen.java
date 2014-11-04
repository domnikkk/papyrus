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
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ClassEditPartCN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.CommentEditPartCN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ConstraintEditPartCN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.DataTypeEditPartCN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.EnumerationEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.EnumerationEditPartCN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.MetaclassEditPartCN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ModelEditPartCN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.PackageEditPartCN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.PrimitiveTypeEditPartCN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ProfileEditPartCN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.StereotypeEditPartCN;
import org.eclipse.papyrus.uml.diagram.profile.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.profile.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.profile.tests.IProfileDiagramTest;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateNodeFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestProfileDiagramChildNodeInEnumerationEditPartGen.
 */
public class TestProfileDiagramChildNodeInEnumerationEditPartGen extends CreateNodeFromPaletteTest {
	
	
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
	 * Test to manage component Class.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeMetaclassEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(MetaclassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Constraint.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeConstraintEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component DataType.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeDataTypeEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Package.
	 */
	@Test
	@GeneratedTest
	public void testChildNodePackageEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PrimitiveType.
	 */
	@Test
	@GeneratedTest
	public void testChildNodePrimitiveTypeEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Model.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeModelEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Enumeration.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeEnumerationEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Class.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeClassEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Comment.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeCommentEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Profile.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeProfileEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ProfileEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Stereotype.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeStereotypeEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(StereotypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), true);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override 
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), getDiagramEditPart().getDiagramPreferencesHint());
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
	
}	
