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
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassOperationCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentOperationCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeOperationCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceEditPart;
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
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PropertyForSignalEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PropertyforDataTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PropertyforPrimitiveTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SignalAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SignalEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.test.IClassDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.canonical.TestListCompartmentHelper;
import org.junit.Test;

/**
 * 
 *
 */
public class TestListCompartmentPropertiesOperationsDrop extends AbstractPapyrusTestCase {

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
	public void testPropertyInClassAttributeCompartment() throws Exception {
		getHelper().checkUnexecutableDrop2Canvas(ClassEditPart.VISUAL_ID, ClassAttributeCompartmentEditPart.VISUAL_ID, PropertyForClassEditPart.VISUAL_ID);
	}

	@FailingTest
	public void testPropertyInInterfaceAttributeCompartment() throws Exception {
		getHelper().checkUnexecutableDrop2Canvas(InterfaceEditPart.VISUAL_ID, InterfaceAttributeCompartmentEditPart.VISUAL_ID, PropertyForInterfaceEditPart.VISUAL_ID);
	}

	@FailingTest
	public void testPropertyInDataTypeAttributeCompartment() throws Exception {
		getHelper().checkUnexecutableDrop2Canvas(DataTypeEditPart.VISUAL_ID, DataTypeAttributeCompartmentEditPart.VISUAL_ID, PropertyforDataTypeEditPart.VISUAL_ID);
	}

	@FailingTest
	public void testPropertyInComponentAttributeCompartment() throws Exception {
		getHelper().checkUnexecutableDrop2Canvas(ComponentEditPart.VISUAL_ID, ComponentAttributeCompartmentEditPart.VISUAL_ID, PropertyForComponentEditPart.VISUAL_ID);
	}

	@FailingTest
	public void testPropertyInPrimitiveTypeAttributeCompartment() throws Exception {
		getHelper().checkUnexecutableDrop2Canvas(PrimitiveTypeEditPart.VISUAL_ID, PrimitiveTypeAttributeCompartmentEditPart.VISUAL_ID, PropertyforPrimitiveTypeEditPart.VISUAL_ID);
	}

	@FailingTest
	public void testPropertyInSignalAttributeCompartment() throws Exception {
		getHelper().checkUnexecutableDrop2Canvas(SignalEditPart.VISUAL_ID, SignalAttributeCompartmentEditPart.VISUAL_ID, PropertyForSignalEditPart.VISUAL_ID);
	}

	@FailingTest
	public void testOperationInClassOperationCompartment() throws Exception {
		getHelper().checkUnexecutableDrop2Canvas(ClassEditPart.VISUAL_ID, ClassOperationCompartmentEditPart.VISUAL_ID, OperationForClassEditPart.VISUAL_ID);
	}

	@FailingTest
	public void testOperationInInterfaceOperationCompartment() throws Exception {
		getHelper().checkUnexecutableDrop2Canvas(InterfaceEditPart.VISUAL_ID, InterfaceOperationCompartmentEditPart.VISUAL_ID, OperationForInterfaceEditpart.VISUAL_ID);
	}

	@FailingTest
	public void testOperationInDataTypeOperationCompartment() throws Exception {
		getHelper().checkUnexecutableDrop2Canvas(DataTypeEditPart.VISUAL_ID, DataTypeOperationCompartmentEditPart.VISUAL_ID, OperationForDataTypeEditPart.VISUAL_ID);
	}

	@FailingTest
	public void testOperationInComponentOperationCompartment() throws Exception {
		getHelper().checkUnexecutableDrop2Canvas(ComponentEditPart.VISUAL_ID, ComponentOperationCompartmentEditPart.VISUAL_ID, OperationForComponentEditPart.VISUAL_ID);
	}

	@FailingTest
	public void testOperationInPrimitiveTypeOperationCompartment() throws Exception {
		getHelper().checkUnexecutableDrop2Canvas(PrimitiveTypeEditPart.VISUAL_ID, PrimitiveTypeOperationCompartmentEditPart.VISUAL_ID, OperationForPrimitiveTypeEditPart.VISUAL_ID);
	}

	@Test
	public void testPropertyInClassDropFromModelExplorer() throws Exception {
		getHelper().checkDropPropertyFromModelExplorer2Canvas(ClassEditPart.VISUAL_ID, ClassAttributeCompartmentEditPart.VISUAL_ID, PropertyForClassEditPart.VISUAL_ID);
	}

	@Test
	public void testPropertyInInterfaceDropFromModelExplorer() throws Exception {
		getHelper().checkDropPropertyFromModelExplorer2Canvas(InterfaceEditPart.VISUAL_ID, InterfaceAttributeCompartmentEditPart.VISUAL_ID, PropertyForInterfaceEditPart.VISUAL_ID);
	}

	@Test
	public void testPropertyInDataTypeDropFromModelExplorer() throws Exception {
		getHelper().checkDropPropertyFromModelExplorer2Canvas(DataTypeEditPart.VISUAL_ID, DataTypeAttributeCompartmentEditPart.VISUAL_ID, PropertyforDataTypeEditPart.VISUAL_ID);
	}

	@Test
	public void testPropertyInComponentDropFromModelExplorer() throws Exception {
		getHelper().checkDropPropertyFromModelExplorer2Canvas(ComponentEditPart.VISUAL_ID, ComponentAttributeCompartmentEditPart.VISUAL_ID, PropertyForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testPropertyInPrimitiveTypeDropFromModelExplorer() throws Exception {
		getHelper().checkDropPropertyFromModelExplorer2Canvas(PrimitiveTypeEditPart.VISUAL_ID, PrimitiveTypeAttributeCompartmentEditPart.VISUAL_ID, PropertyforPrimitiveTypeEditPart.VISUAL_ID);
	}

	@Test
	public void testPropertyInSignalDropFromModelExplorer() throws Exception {
		getHelper().checkDropPropertyFromModelExplorer2Canvas(SignalEditPart.VISUAL_ID, SignalAttributeCompartmentEditPart.VISUAL_ID, PropertyForSignalEditPart.VISUAL_ID);
	}

	@Test
	public void testOperationInClassDropFromModelExplorer() throws Exception {
		getHelper().checkDropPropertyFromModelExplorer2Canvas(ClassEditPart.VISUAL_ID, ClassOperationCompartmentEditPart.VISUAL_ID, OperationForClassEditPart.VISUAL_ID);
	}

	@Test
	public void testOperationInInterfaceDropFromModelExplorer() throws Exception {
		getHelper().checkDropPropertyFromModelExplorer2Canvas(InterfaceEditPart.VISUAL_ID, InterfaceOperationCompartmentEditPart.VISUAL_ID, OperationForInterfaceEditpart.VISUAL_ID);
	}

	@Test
	public void testOperationInDataTypeDropFromModelExplorer() throws Exception {
		getHelper().checkDropPropertyFromModelExplorer2Canvas(DataTypeEditPart.VISUAL_ID, DataTypeOperationCompartmentEditPart.VISUAL_ID, OperationForDataTypeEditPart.VISUAL_ID);
	}

	@Test
	public void testOperationInComponentDropFromModelExplorer() throws Exception {
		getHelper().checkDropPropertyFromModelExplorer2Canvas(ComponentEditPart.VISUAL_ID, ComponentOperationCompartmentEditPart.VISUAL_ID, OperationForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testOperationInPrimitiveTypeDropFromModelExplorer() throws Exception {
		getHelper().checkDropPropertyFromModelExplorer2Canvas(PrimitiveTypeEditPart.VISUAL_ID, PrimitiveTypeOperationCompartmentEditPart.VISUAL_ID, OperationForPrimitiveTypeEditPart.VISUAL_ID);
	}

	private TestListCompartmentHelper getHelper() {
		if (myHelper == null) {
			myHelper = new ClassDiagramListCompartmentTestHelper(getDiagramEditPart(), diagramEditor);
		}
		return myHelper;
	}
}
