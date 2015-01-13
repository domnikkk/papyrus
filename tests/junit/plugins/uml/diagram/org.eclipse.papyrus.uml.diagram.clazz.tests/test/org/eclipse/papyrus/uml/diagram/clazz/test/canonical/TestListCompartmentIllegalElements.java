/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.diagram.clazz.test.canonical;

import org.eclipse.papyrus.junit.framework.classification.FailingTest;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassNestedClassifierCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassOperationCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentNestedClassifierCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentOperationCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeOperationCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceNestedClassifierCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceOperationCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.OperationForClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.OperationForComponentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.OperationForDataTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.OperationForInterfaceEditpart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.OperationForPrimitiveTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PrimitiveTypeAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PrimitiveTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PrimitiveTypeOperationCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PropertyForClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PropertyForComponentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PropertyForInterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PropertyforDataTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PropertyforPrimitiveTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.test.IClassDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.canonical.TestListCompartmentHelper;
import org.junit.Test;

/**
 * 
 *
 */
public class TestListCompartmentIllegalElements extends AbstractPapyrusTestCase {

	private TestListCompartmentHelper myHelper;

	/**
	 * @see org.eclipse.papyrus.uml.diagram.tests.canonical.AbstractPapyrusTestCase#getProjectName()
	 *
	 * @return
	 */
	@Override
	protected String getProjectName() {
		return IClassDiagramTestsConstants.PROJECT_NAME;
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.tests.canonical.AbstractPapyrusTestCase#getFileName()
	 *
	 * @return
	 */
	@Override
	protected String getFileName() {
		return IClassDiagramTestsConstants.FILE_NAME;
	}

	@FailingTest
	public void testClassInClassAttributeCompartment() throws Exception {
		getHelper().checkUnexecutableDrop(ClassEditPart.VISUAL_ID, ClassAttributeCompartmentEditPart.VISUAL_ID, ClassEditPart.VISUAL_ID);
	}

	@FailingTest
	public void testClassInClassOperationCompartment() throws Exception {
		getHelper().checkUnexecutableDrop(ClassEditPart.VISUAL_ID, ClassOperationCompartmentEditPart.VISUAL_ID, ClassEditPart.VISUAL_ID);
	}

	@Test
	public void testPropertyInClassOperationCompartment() throws Exception {
		getHelper().checkUnexecutableChildCreate(ClassEditPart.VISUAL_ID, ClassOperationCompartmentEditPart.VISUAL_ID, PropertyForClassEditPart.VISUAL_ID);
	}

	@Test
	public void testOperationInClassAttributeCompartment() throws Exception {
		getHelper().checkUnexecutableChildCreate(ClassEditPart.VISUAL_ID, ClassAttributeCompartmentEditPart.VISUAL_ID, OperationForClassEditPart.VISUAL_ID);
	}

	@Test
	public void testOperationInClassNestedCompartment() throws Exception {
		getHelper().checkUnexecutableChildCreate(ClassEditPart.VISUAL_ID, ClassNestedClassifierCompartmentEditPart.VISUAL_ID, OperationForClassEditPart.VISUAL_ID);
	}

	@Test
	public void testPropertyInClassNestedCompartment() throws Exception {
		getHelper().checkUnexecutableChildCreate(ClassEditPart.VISUAL_ID, ClassNestedClassifierCompartmentEditPart.VISUAL_ID, PropertyForClassEditPart.VISUAL_ID);
	}

	@Test
	public void testPropertyInInterfaceOperationCompartment() throws Exception {
		getHelper().checkUnexecutableChildCreate(InterfaceEditPart.VISUAL_ID, InterfaceOperationCompartmentEditPart.VISUAL_ID, PropertyForInterfaceEditPart.VISUAL_ID);
	}

	@Test
	public void testOperationInInterfaceAttributeCompartment() throws Exception {
		getHelper().checkUnexecutableChildCreate(InterfaceEditPart.VISUAL_ID, InterfaceAttributeCompartmentEditPart.VISUAL_ID, OperationForInterfaceEditpart.VISUAL_ID);
	}

	@Test
	public void testOperationInInterfaceNestedCompartment() throws Exception {
		getHelper().checkUnexecutableChildCreate(InterfaceEditPart.VISUAL_ID, InterfaceNestedClassifierCompartmentEditPart.VISUAL_ID, OperationForInterfaceEditpart.VISUAL_ID);
	}

	@Test
	public void testPropertyInInterfaceNestedCompartment() throws Exception {
		getHelper().checkUnexecutableChildCreate(InterfaceEditPart.VISUAL_ID, InterfaceNestedClassifierCompartmentEditPart.VISUAL_ID, PropertyForInterfaceEditPart.VISUAL_ID);
	}

	@Test
	public void testPropertyInComponentOperationCompartment() throws Exception {
		getHelper().checkUnexecutableChildCreate(ComponentEditPart.VISUAL_ID, ComponentOperationCompartmentEditPart.VISUAL_ID, PropertyForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testOperationInComponentAttributeCompartment() throws Exception {
		getHelper().checkUnexecutableChildCreate(ComponentEditPart.VISUAL_ID, ComponentAttributeCompartmentEditPart.VISUAL_ID, OperationForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testOperationInComponentNestedCompartment() throws Exception {
		getHelper().checkUnexecutableChildCreate(ComponentEditPart.VISUAL_ID, ComponentNestedClassifierCompartmentEditPart.VISUAL_ID, OperationForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testPropertyInComponentNestedCompartment() throws Exception {
		getHelper().checkUnexecutableChildCreate(ComponentEditPart.VISUAL_ID, ComponentNestedClassifierCompartmentEditPart.VISUAL_ID, PropertyForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testPropertyInDataTypeOperationCompartment() throws Exception {
		getHelper().checkUnexecutableChildCreate(DataTypeEditPart.VISUAL_ID, DataTypeOperationCompartmentEditPart.VISUAL_ID, PropertyforDataTypeEditPart.VISUAL_ID);
	}

	@Test
	public void testOperationInDataTypeAttributeCompartment() throws Exception {
		getHelper().checkUnexecutableChildCreate(DataTypeEditPart.VISUAL_ID, DataTypeAttributeCompartmentEditPart.VISUAL_ID, OperationForDataTypeEditPart.VISUAL_ID);
	}

	@Test
	public void testPropertyInPrimitiveTypeOperationCompartment() throws Exception {
		getHelper().checkUnexecutableChildCreate(PrimitiveTypeEditPart.VISUAL_ID, PrimitiveTypeOperationCompartmentEditPart.VISUAL_ID, PropertyforPrimitiveTypeEditPart.VISUAL_ID);
	}

	@Test
	public void testOperationInPrimitiveTypeAttributeCompartment() throws Exception {
		getHelper().checkUnexecutableChildCreate(PrimitiveTypeEditPart.VISUAL_ID, PrimitiveTypeAttributeCompartmentEditPart.VISUAL_ID, OperationForPrimitiveTypeEditPart.VISUAL_ID);
	}

	private TestListCompartmentHelper getHelper() {
		if (myHelper == null) {
			myHelper = new ClassDiagramListCompartmentTestHelper(getDiagramEditPart(), diagramEditor);
		}
		return myHelper;
	}
}
