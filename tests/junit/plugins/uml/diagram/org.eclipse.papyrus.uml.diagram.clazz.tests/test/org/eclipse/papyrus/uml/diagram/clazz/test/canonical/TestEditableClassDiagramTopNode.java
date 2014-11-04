/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.clazz.test.canonical;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.uml.diagram.clazz.CreateClassDiagramCommand;
import org.eclipse.papyrus.uml.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.clazz.test.IClassDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.edition.AbstractEditableNodeTest;
import org.junit.Test;

/**
 * The Class TestClassDiagramTopNode.
 */
public class TestEditableClassDiagramTopNode extends AbstractEditableNodeTest {

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
	 * Test to manage component.
	 */
	@Test
	public void testToManageComponent() {
		testEdition(UMLElementTypes.Component_2002);
	}

	/**
	 * Test to manage instance specification.
	 */
	@Test
	public void testToManageInstanceSpecification() {
		testEdition(UMLElementTypes.InstanceSpecification_2001);
	}

	/**
	 * Test to manage signal.
	 */
	@Test
	public void testToManageSignal() {
		testEdition(UMLElementTypes.Signal_2003);
	}

	/**
	 * Test to manage model.
	 */
	@Test
	public void testToManageModel() {
		testEdition(UMLElementTypes.Model_2005);
	}

	/**
	 * Test to manage enumeration.
	 */
	@Test
	public void testToManageEnumeration() {
		testEdition(UMLElementTypes.Enumeration_2006);
	}

	/**
	 * Test to manage i package.
	 */
	@Test
	public void testToManageIPackage() {
		testEdition(UMLElementTypes.Package_2007);
	}

	/**
	 * Test to manage class.
	 */
	@Test
	public void testToManageClass() {
		testEdition(UMLElementTypes.Class_2008);
	}

	/**
	 * Test to manage primitive type.
	 */
	@Test
	public void testToManagePrimitiveType() {
		testEdition(UMLElementTypes.PrimitiveType_2009);
	}

	/**
	 * Test to manage data type.
	 */
	@Test
	public void testToManageDataType() {
		testEdition(UMLElementTypes.DataType_2010);
	}

	/**
	 * Test to manage constraint.
	 */
	@Test
	public void testToManageConstraint() {
		testEdition(UMLElementTypes.Constraint_2011);
	}

	/**
	 * Test to manage comment.
	 */
	@Test
	public void testToManageComment() {
		testEdition(UMLElementTypes.Comment_2012);
	}

	/**
	 * Test to manage component.
	 */
	@Test
	public void testToManageInformationItem() {
		testEdition(UMLElementTypes.InformationItem_2099);
	}
	
	/**
	 * Test to manage component.
	 */
	@Test
	public void testToManageInterface() {
		testEdition(UMLElementTypes.Interface_2004);
	}
	
	/**
	 * Test to manage component.
	 */
	@Test
	public void testToManageTimeObservation() {
		testEdition(UMLElementTypes.TimeObservation_2096);
	}
	
	/**
	 * Test to manage component.
	 */
	@Test
	public void testToManageDurationObservation() {
		testEdition(UMLElementTypes.DurationObservation_2095);
	}


}
