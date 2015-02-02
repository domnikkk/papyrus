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

import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AssociationClassAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AssociationClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AssociationClassOperationCompartmentEditPart;
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
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.EnumerationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.EnumerationEnumerationLiteralCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.EnumerationLiteralEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceNestedClassifierCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceOperationCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.NestedClassForClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.NestedClassForComponentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.NestedClassForInterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.NestedDataTypeForClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.NestedDataTypeForComponentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.NestedDataTypeForInterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.NestedEnumerationForClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.NestedEnumerationForComponentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.NestedEnumerationForInterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.NestedInterfaceForClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.NestedInterfaceForComponentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.NestedInterfaceForInterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.NestedPrimitiveTypeForClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.NestedPrimitiveTypeForComponentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.NestedPrimitiveTypeForInterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.NestedSignalForClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.NestedSignalForComponentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.NestedSignalForInterfaceEditPart;
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
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ReceptionEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ReceptionInInterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SignalAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SignalEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.test.IClassDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.canonical.TestListCompartmentHelper;
import org.junit.Test;

/**
 *
 */
public class TestListCompartmentNodesChildDuplicates extends AbstractPapyrusTestCase {

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

	@Test
	public void testAssociationClassVsProperty() throws Exception {
		getHelper().checkDuplicate(AssociationClassEditPart.VISUAL_ID, AssociationClassAttributeCompartmentEditPart.VISUAL_ID, PropertyForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testAssociationClassVsOperation() throws Exception {
		getHelper().checkDuplicate(AssociationClassEditPart.VISUAL_ID, AssociationClassOperationCompartmentEditPart.VISUAL_ID, OperationForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testClassVsProperty() throws Exception {
		getHelper().checkDuplicate(ClassEditPart.VISUAL_ID, ClassAttributeCompartmentEditPart.VISUAL_ID, PropertyForClassEditPart.VISUAL_ID);
	}

	@Test
	public void testClassVsOperation() throws Exception {
		getHelper().checkDuplicate(ClassEditPart.VISUAL_ID, ClassOperationCompartmentEditPart.VISUAL_ID, OperationForClassEditPart.VISUAL_ID);
	}

	@Test
	public void testClassVsClass() throws Exception {
		getHelper().checkDuplicate(ClassEditPart.VISUAL_ID, ClassNestedClassifierCompartmentEditPart.VISUAL_ID, ClassEditPart.VISUAL_ID, NestedClassForClassEditPart.VISUAL_ID);
	}

	@Test
	public void testClassVsDataType() throws Exception {
		getHelper().checkDuplicate(ClassEditPart.VISUAL_ID, ClassNestedClassifierCompartmentEditPart.VISUAL_ID, DataTypeEditPart.VISUAL_ID, NestedDataTypeForClassEditPart.VISUAL_ID);
	}

	@Test
	public void testClassVsEnumeration() throws Exception {
		getHelper().checkDuplicate(ClassEditPart.VISUAL_ID, ClassNestedClassifierCompartmentEditPart.VISUAL_ID, EnumerationEditPart.VISUAL_ID, NestedEnumerationForClassEditPart.VISUAL_ID);
	}

	@Test
	public void testClassVsInterface() throws Exception {
		getHelper().checkDuplicate(ClassEditPart.VISUAL_ID, ClassNestedClassifierCompartmentEditPart.VISUAL_ID, InterfaceEditPart.VISUAL_ID, NestedInterfaceForClassEditPart.VISUAL_ID);
	}

	@Test
	public void testClassVsReception() throws Exception {
		getHelper().checkDuplicate(ClassEditPart.VISUAL_ID, ClassOperationCompartmentEditPart.VISUAL_ID, ReceptionEditPart.VISUAL_ID);
	}

	@Test
	public void testClassVsPrimitiveType() throws Exception {
		getHelper().checkDuplicate(ClassEditPart.VISUAL_ID, ClassNestedClassifierCompartmentEditPart.VISUAL_ID, PrimitiveTypeEditPart.VISUAL_ID, NestedPrimitiveTypeForClassEditPart.VISUAL_ID);
	}

	@Test
	public void testClassVsSignal() throws Exception {
		getHelper().checkDuplicate(ClassEditPart.VISUAL_ID, ClassNestedClassifierCompartmentEditPart.VISUAL_ID, SignalEditPart.VISUAL_ID, NestedSignalForClassEditPart.VISUAL_ID);
	}

	@Test
	public void testComponentVsClass() throws Exception {
		getHelper().checkDuplicate(ComponentEditPart.VISUAL_ID, ComponentNestedClassifierCompartmentEditPart.VISUAL_ID, ClassEditPart.VISUAL_ID, NestedClassForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testComponentVsDataType() throws Exception {
		getHelper().checkDuplicate(ComponentEditPart.VISUAL_ID, ComponentNestedClassifierCompartmentEditPart.VISUAL_ID, DataTypeEditPart.VISUAL_ID, NestedDataTypeForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testComponentVsEnumeration() throws Exception {
		getHelper().checkDuplicate(ComponentEditPart.VISUAL_ID, ComponentNestedClassifierCompartmentEditPart.VISUAL_ID, EnumerationEditPart.VISUAL_ID, NestedEnumerationForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testComponentVsInterface() throws Exception {
		getHelper().checkDuplicate(ComponentEditPart.VISUAL_ID, ComponentNestedClassifierCompartmentEditPart.VISUAL_ID, InterfaceEditPart.VISUAL_ID, NestedInterfaceForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testComponentVsPrimitiveType() throws Exception {
		getHelper().checkDuplicate(ComponentEditPart.VISUAL_ID, ComponentNestedClassifierCompartmentEditPart.VISUAL_ID, PrimitiveTypeEditPart.VISUAL_ID, NestedPrimitiveTypeForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testComponentVsSignal() throws Exception {
		getHelper().checkDuplicate(ComponentEditPart.VISUAL_ID, ComponentNestedClassifierCompartmentEditPart.VISUAL_ID, SignalEditPart.VISUAL_ID, NestedSignalForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testComponentVsOperation() throws Exception {
		getHelper().checkDuplicate(ComponentEditPart.VISUAL_ID, ComponentOperationCompartmentEditPart.VISUAL_ID, OperationForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testComponentVsReception() throws Exception {
		getHelper().checkDuplicate(ComponentEditPart.VISUAL_ID, ComponentOperationCompartmentEditPart.VISUAL_ID, ReceptionEditPart.VISUAL_ID);
	}

	@Test
	public void testComponentVsProperty() throws Exception {
		getHelper().checkDuplicate(ComponentEditPart.VISUAL_ID, ComponentAttributeCompartmentEditPart.VISUAL_ID, PropertyForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testDataTypeVsProperty() throws Exception {
		getHelper().checkDuplicate(DataTypeEditPart.VISUAL_ID, DataTypeAttributeCompartmentEditPart.VISUAL_ID, PropertyforDataTypeEditPart.VISUAL_ID);
	}

	@Test
	public void testDataTypeVsOperation() throws Exception {
		getHelper().checkDuplicate(DataTypeEditPart.VISUAL_ID, DataTypeOperationCompartmentEditPart.VISUAL_ID, OperationForDataTypeEditPart.VISUAL_ID);
	}

	@Test
	public void testInterfaceVsOperation() throws Exception {
		getHelper().checkDuplicate(InterfaceEditPart.VISUAL_ID, InterfaceOperationCompartmentEditPart.VISUAL_ID, OperationForInterfaceEditpart.VISUAL_ID);
	}

	@Test
	public void testInterfaceVsReception() throws Exception {
		getHelper().checkDuplicate(InterfaceEditPart.VISUAL_ID, InterfaceOperationCompartmentEditPart.VISUAL_ID, ReceptionInInterfaceEditPart.VISUAL_ID);
	}

	@Test
	public void testInterfaceVsClass() throws Exception {
		getHelper().checkDuplicate(InterfaceEditPart.VISUAL_ID, InterfaceNestedClassifierCompartmentEditPart.VISUAL_ID, ClassEditPart.VISUAL_ID, NestedClassForInterfaceEditPart.VISUAL_ID);
	}

	@Test
	public void testInterfaceVsDataType() throws Exception {
		getHelper().checkDuplicate(InterfaceEditPart.VISUAL_ID, InterfaceNestedClassifierCompartmentEditPart.VISUAL_ID, DataTypeEditPart.VISUAL_ID, NestedDataTypeForInterfaceEditPart.VISUAL_ID);
	}

	@Test
	public void testInterfaceVsEnumeration() throws Exception {
		getHelper().checkDuplicate(InterfaceEditPart.VISUAL_ID, InterfaceNestedClassifierCompartmentEditPart.VISUAL_ID, EnumerationEditPart.VISUAL_ID, NestedEnumerationForInterfaceEditPart.VISUAL_ID);
	}

	@Test
	public void testInterfaceVsInterface() throws Exception {
		getHelper().checkDuplicate(InterfaceEditPart.VISUAL_ID, InterfaceNestedClassifierCompartmentEditPart.VISUAL_ID, InterfaceEditPart.VISUAL_ID, NestedInterfaceForInterfaceEditPart.VISUAL_ID);
	}

	@Test
	public void testInterfaceVsPrimitiveType() throws Exception {
		getHelper().checkDuplicate(InterfaceEditPart.VISUAL_ID, InterfaceNestedClassifierCompartmentEditPart.VISUAL_ID, PrimitiveTypeEditPart.VISUAL_ID, NestedPrimitiveTypeForInterfaceEditPart.VISUAL_ID);
	}

	@Test
	public void testInterfaceVsSignal() throws Exception {
		getHelper().checkDuplicate(InterfaceEditPart.VISUAL_ID, InterfaceNestedClassifierCompartmentEditPart.VISUAL_ID, SignalEditPart.VISUAL_ID, NestedSignalForInterfaceEditPart.VISUAL_ID);
	}

	@Test
	public void testInterfaceVsProperty() throws Exception {
		getHelper().checkDuplicate(InterfaceEditPart.VISUAL_ID, InterfaceAttributeCompartmentEditPart.VISUAL_ID, PropertyForInterfaceEditPart.VISUAL_ID);
	}

	@Test
	public void testPrimitiveTypeVsProperty() throws Exception {
		getHelper().checkDuplicate(PrimitiveTypeEditPart.VISUAL_ID, PrimitiveTypeAttributeCompartmentEditPart.VISUAL_ID, PropertyforPrimitiveTypeEditPart.VISUAL_ID);
	}

	@Test
	public void testPrimitiveTypeVsOperation() throws Exception {
		getHelper().checkDuplicate(PrimitiveTypeEditPart.VISUAL_ID, PrimitiveTypeOperationCompartmentEditPart.VISUAL_ID, OperationForPrimitiveTypeEditPart.VISUAL_ID);
	}

	@Test
	public void testSignalVsProperty() throws Exception {
		getHelper().checkDuplicate(SignalEditPart.VISUAL_ID, SignalAttributeCompartmentEditPart.VISUAL_ID, PropertyForSignalEditPart.VISUAL_ID);
	}

	@Test
	public void testEnumerationVsEnumerationLiteral() throws Exception {
		getHelper().checkDuplicate(EnumerationEditPart.VISUAL_ID, EnumerationEnumerationLiteralCompartmentEditPart.VISUAL_ID, EnumerationLiteralEditPart.VISUAL_ID);
	}

	private TestListCompartmentHelper getHelper() {
		if (myHelper == null) {
			myHelper = new ClassDiagramListCompartmentTestHelper(getDiagramEditPart(), diagramEditor);
		}
		return myHelper;
	}
}
