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

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.diagram.tests.canonical.TestChildNode;
import org.eclipse.papyrus.uml.diagram.clazz.CreateClassDiagramCommand;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.CommentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ConstraintEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.EnumerationEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InformationItemEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InstanceSpecificationEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ModelEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PackageEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PackageEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PrimitiveTypeEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SignalEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.clazz.test.IClassDiagramTestsConstants;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestClassDiagramChildNodeGen.
 */
public class TestClassDiagramChildNodeGen extends TestChildNode {
	
	
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
	public void testChildNodeEnumerationEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getEnumeration()
		, UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Component.
	 */
	@Test
	public void testChildNodeComponentEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getComponent()
		, UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Class.
	 */
	@Test
	public void testChildNodeClassEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getClass_()
		, UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component DataType.
	 */
	@Test
	public void testChildNodeDataTypeEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getDataType()
		, UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Model.
	 */
	@Test
	public void testChildNodeModelEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getModel()
		, UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InstanceSpecification.
	 */
	@Test
	public void testChildNodeInstanceSpecificationEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getInstanceSpecification()
		, UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Constraint.
	 */
	@Test
	public void testChildNodeConstraintEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getConstraint()
		, UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Comment.
	 */
	@Test
	public void testChildNodeCommentEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getComment()
		, UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationItem.
	 */
	@Test
	public void testChildNodeInformationItemEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getInformationItem()
		, UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PrimitiveType.
	 */
	@Test
	public void testChildNodePrimitiveTypeEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getPrimitiveType()
		, UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Signal.
	 */
	@Test
	public void testChildNodeSignalEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getSignal()
		, UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Package.
	 */
	@Test
	public void testChildNodePackageEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getPackage()
		, UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), true);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override 
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), getDiagramEditPart().getDiagramPreferencesHint());
	}
	
}	
