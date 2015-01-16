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

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.commands.wrappers.GEFtoEMFCommandWrapper;
import org.eclipse.papyrus.junit.framework.classification.FailingTest;
import org.eclipse.papyrus.uml.diagram.clazz.CreateClassDiagramCommand;
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
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DefaultNamedElementEditPart;
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
import org.eclipse.papyrus.uml.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.clazz.test.IClassDiagramTestsConstants;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class TestListCompartmentNodesChildDuplicates extends AbstractPapyrusTestCase {

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

	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateClassDiagramCommand();
	}

	@Test
	public void testAssociationClassVsProperty() throws Exception {
		checkDuplicate(AssociationClassEditPart.VISUAL_ID, AssociationClassAttributeCompartmentEditPart.VISUAL_ID, PropertyForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testAssociationClassVsOperation() throws Exception {
		checkDuplicate(AssociationClassEditPart.VISUAL_ID, AssociationClassOperationCompartmentEditPart.VISUAL_ID, OperationForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testClassVsProperty() throws Exception {
		checkDuplicate(ClassEditPart.VISUAL_ID, ClassAttributeCompartmentEditPart.VISUAL_ID, PropertyForClassEditPart.VISUAL_ID);
	}

	@Test
	public void testClassVsOperation() throws Exception {
		checkDuplicate(ClassEditPart.VISUAL_ID, ClassOperationCompartmentEditPart.VISUAL_ID, OperationForClassEditPart.VISUAL_ID);
	}

	@Test
	public void testClassVsClass() throws Exception {
		checkDuplicate(ClassEditPart.VISUAL_ID, ClassNestedClassifierCompartmentEditPart.VISUAL_ID, ClassEditPart.VISUAL_ID, NestedClassForClassEditPart.VISUAL_ID);
	}

	@Test
	public void testClassVsDataType() throws Exception {
		checkDuplicate(ClassEditPart.VISUAL_ID, ClassNestedClassifierCompartmentEditPart.VISUAL_ID, DataTypeEditPart.VISUAL_ID, NestedDataTypeForClassEditPart.VISUAL_ID);
	}

	@Test
	public void testClassVsEnumeration() throws Exception {
		checkDuplicate(ClassEditPart.VISUAL_ID, ClassNestedClassifierCompartmentEditPart.VISUAL_ID, EnumerationEditPart.VISUAL_ID, NestedEnumerationForClassEditPart.VISUAL_ID);
	}

	@Test
	public void testClassVsInterface() throws Exception {
		checkDuplicate(ClassEditPart.VISUAL_ID, ClassNestedClassifierCompartmentEditPart.VISUAL_ID, InterfaceEditPart.VISUAL_ID, NestedInterfaceForClassEditPart.VISUAL_ID);
	}

	@Test
	public void testClassVsReception() throws Exception {
		checkDuplicate(ClassEditPart.VISUAL_ID, ClassOperationCompartmentEditPart.VISUAL_ID, ReceptionEditPart.VISUAL_ID);
	}

	@Test
	public void testClassVsPrimitiveType() throws Exception {
		checkDuplicate(ClassEditPart.VISUAL_ID, ClassNestedClassifierCompartmentEditPart.VISUAL_ID, PrimitiveTypeEditPart.VISUAL_ID, NestedPrimitiveTypeForClassEditPart.VISUAL_ID);
	}

	@Test
	public void testClassVsSignal() throws Exception {
		checkDuplicate(ClassEditPart.VISUAL_ID, ClassNestedClassifierCompartmentEditPart.VISUAL_ID, SignalEditPart.VISUAL_ID, NestedSignalForClassEditPart.VISUAL_ID);
	}

	@Test
	public void testComponentVsClass() throws Exception {
		checkDuplicate(ComponentEditPart.VISUAL_ID, ComponentNestedClassifierCompartmentEditPart.VISUAL_ID, ClassEditPart.VISUAL_ID, NestedClassForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testComponentVsDataType() throws Exception {
		checkDuplicate(ComponentEditPart.VISUAL_ID, ComponentNestedClassifierCompartmentEditPart.VISUAL_ID, DataTypeEditPart.VISUAL_ID, NestedDataTypeForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testComponentVsEnumeration() throws Exception {
		checkDuplicate(ComponentEditPart.VISUAL_ID, ComponentNestedClassifierCompartmentEditPart.VISUAL_ID, EnumerationEditPart.VISUAL_ID, NestedEnumerationForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testComponentVsInterface() throws Exception {
		checkDuplicate(ComponentEditPart.VISUAL_ID, ComponentNestedClassifierCompartmentEditPart.VISUAL_ID, InterfaceEditPart.VISUAL_ID, NestedInterfaceForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testComponentVsPrimitiveType() throws Exception {
		checkDuplicate(ComponentEditPart.VISUAL_ID, ComponentNestedClassifierCompartmentEditPart.VISUAL_ID, PrimitiveTypeEditPart.VISUAL_ID, NestedPrimitiveTypeForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testComponentVsSignal() throws Exception {
		checkDuplicate(ComponentEditPart.VISUAL_ID, ComponentNestedClassifierCompartmentEditPart.VISUAL_ID, SignalEditPart.VISUAL_ID, NestedSignalForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testComponentVsOperation() throws Exception {
		checkDuplicate(ComponentEditPart.VISUAL_ID, ComponentOperationCompartmentEditPart.VISUAL_ID, OperationForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testComponentVsReception() throws Exception {
		checkDuplicate(ComponentEditPart.VISUAL_ID, ComponentOperationCompartmentEditPart.VISUAL_ID, ReceptionEditPart.VISUAL_ID);
	}

	@Test
	public void testComponentVsProperty() throws Exception {
		checkDuplicate(ComponentEditPart.VISUAL_ID, ComponentAttributeCompartmentEditPart.VISUAL_ID, PropertyForComponentEditPart.VISUAL_ID);
	}

	@Test
	public void testDataTypeVsProperty() throws Exception {
		checkDuplicate(DataTypeEditPart.VISUAL_ID, DataTypeAttributeCompartmentEditPart.VISUAL_ID, PropertyforDataTypeEditPart.VISUAL_ID);
	}

	@Test
	public void testDataTypeVsOperation() throws Exception {
		checkDuplicate(DataTypeEditPart.VISUAL_ID, DataTypeOperationCompartmentEditPart.VISUAL_ID, OperationForDataTypeEditPart.VISUAL_ID);
	}

	@Test
	public void testInterfaceVsOperation() throws Exception {
		checkDuplicate(InterfaceEditPart.VISUAL_ID, InterfaceOperationCompartmentEditPart.VISUAL_ID, OperationForInterfaceEditpart.VISUAL_ID);
	}

	@Test
	public void testInterfaceVsReception() throws Exception {
		checkDuplicate(InterfaceEditPart.VISUAL_ID, InterfaceOperationCompartmentEditPart.VISUAL_ID, ReceptionInInterfaceEditPart.VISUAL_ID);
	}

	@Test
	public void testInterfaceVsClass() throws Exception {
		checkDuplicate(InterfaceEditPart.VISUAL_ID, InterfaceNestedClassifierCompartmentEditPart.VISUAL_ID, ClassEditPart.VISUAL_ID, NestedClassForInterfaceEditPart.VISUAL_ID);
	}

	@Test
	public void testInterfaceVsDataType() throws Exception {
		checkDuplicate(InterfaceEditPart.VISUAL_ID, InterfaceNestedClassifierCompartmentEditPart.VISUAL_ID, DataTypeEditPart.VISUAL_ID, NestedDataTypeForInterfaceEditPart.VISUAL_ID);
	}

	@Test
	public void testInterfaceVsEnumeration() throws Exception {
		checkDuplicate(InterfaceEditPart.VISUAL_ID, InterfaceNestedClassifierCompartmentEditPart.VISUAL_ID, EnumerationEditPart.VISUAL_ID, NestedEnumerationForInterfaceEditPart.VISUAL_ID);
	}

	@Test
	public void testInterfaceVsInterface() throws Exception {
		checkDuplicate(InterfaceEditPart.VISUAL_ID, InterfaceNestedClassifierCompartmentEditPart.VISUAL_ID, InterfaceEditPart.VISUAL_ID, NestedInterfaceForInterfaceEditPart.VISUAL_ID);
	}

	@Test
	public void testInterfaceVsPrimitiveType() throws Exception {
		checkDuplicate(InterfaceEditPart.VISUAL_ID, InterfaceNestedClassifierCompartmentEditPart.VISUAL_ID, PrimitiveTypeEditPart.VISUAL_ID, NestedPrimitiveTypeForInterfaceEditPart.VISUAL_ID);
	}

	@Test
	public void testInterfaceVsSignal() throws Exception {
		checkDuplicate(InterfaceEditPart.VISUAL_ID, InterfaceNestedClassifierCompartmentEditPart.VISUAL_ID, SignalEditPart.VISUAL_ID, NestedSignalForInterfaceEditPart.VISUAL_ID);
	}

	@Test
	public void testInterfaceVsProperty() throws Exception {
		checkDuplicate(InterfaceEditPart.VISUAL_ID, InterfaceAttributeCompartmentEditPart.VISUAL_ID, PropertyForInterfaceEditPart.VISUAL_ID);
	}

	@Test
	public void testPrimitiveTypeVsProperty() throws Exception {
		checkDuplicate(PrimitiveTypeEditPart.VISUAL_ID, PrimitiveTypeAttributeCompartmentEditPart.VISUAL_ID, PropertyforPrimitiveTypeEditPart.VISUAL_ID);
	}

	@Test
	public void testPrimitiveTypeVsOperation() throws Exception {
		checkDuplicate(PrimitiveTypeEditPart.VISUAL_ID, PrimitiveTypeOperationCompartmentEditPart.VISUAL_ID, OperationForPrimitiveTypeEditPart.VISUAL_ID);
	}

	@Test
	public void testSignalVsProperty() throws Exception {
		checkDuplicate(SignalEditPart.VISUAL_ID, SignalAttributeCompartmentEditPart.VISUAL_ID, PropertyForSignalEditPart.VISUAL_ID);
	}

	@FailingTest
	@Test
	public void testEnumerationVsEnumerationLiteral() throws Exception {
		checkDuplicate(EnumerationEditPart.VISUAL_ID, EnumerationEnumerationLiteralCompartmentEditPart.VISUAL_ID, EnumerationLiteralEditPart.VISUAL_ID);
	}

	private void checkDuplicate(int parent, int parentContainer, int child) {
		checkDuplicate(parent, parentContainer, child, 0);
	}

	private void checkDuplicate(int parent, int parentContainer, int child, int nestedChild) {
		IGraphicalEditPart parentEP = createChild(parent, getDiagramEditPart(), 0);
		IGraphicalEditPart targetEP = findChildBySemanticHint(parentEP, parentContainer);
		IGraphicalEditPart dndEP = createChild(nestedChild > 0 ? nestedChild : child, targetEP, 0);
		{
			Command ddCommand = createDropCommand(dndEP, getDiagramEditPart());
			Assert.assertTrue(ddCommand.canExecute());
			executeOnUIThread(ddCommand);
		}
		IGraphicalEditPart canvasDnDEP = findChildBySemanticHint(getDiagramEditPart(), nestedChild > 0 ? child : DefaultNamedElementEditPart.VISUAL_ID);
		{
			Command ddCommand = createDropCommand(canvasDnDEP, targetEP);
			Assert.assertFalse(canvasDnDEP.getClass().getName() + " can't be dropped to the " + targetEP.getClass().getName() + " due the duplication behavior rule.", ddCommand.canExecute());
		}
	}

	private Command createDropCommand(IGraphicalEditPart child, IGraphicalEditPart newParent) {
		CompoundCommand c = new CompoundCommand();
		ChangeBoundsRequest changeBoundsRequest = new ChangeBoundsRequest(org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants.REQ_DRAG);
		changeBoundsRequest.setEditParts(child);
		changeBoundsRequest.setLocation(new Point(15, 15));
		c.add(child.getCommand(changeBoundsRequest));
		getDiagramEditPart().getEditingDomain().getCommandStack().execute(new GEFtoEMFCommandWrapper(c));
		changeBoundsRequest.setType(org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants.REQ_DROP);
		c.add(newParent.getCommand(changeBoundsRequest));
		return c;
	}

	private IGraphicalEditPart createChild(int childVID, IGraphicalEditPart container, int number) {
		final IElementType childType = UMLElementTypes.getElementType(childVID);
		final CreateViewRequest requestcreation = CreateViewRequestFactory.getCreateShapeRequest(childType, container.getDiagramPreferencesHint());
		requestcreation.setSize(new Dimension(1, 1));
		requestcreation.setLocation(new Point(10, 10));
		Command cmd = container.getCommand(requestcreation);
		executeOnUIThread(cmd);
		return findChild(container, childVID, number);
	}

	private IGraphicalEditPart findChild(IGraphicalEditPart parent, int vid, int number) {
		List<?> children = parent.getChildren();
		if (number > children.size() - 1) {
			Assert.fail("Parent " + parent + ", type " + parent.getNotationView() + " hasn't less children then " + number);
		}
		IGraphicalEditPart childEP = (IGraphicalEditPart) children.get(number);
		assertNotNull("Parent " + parent + ", type " + parent.getNotationView() + " looking for: " + vid, childEP);
		Assert.assertEquals("Parent " + parent + ", type " + parent.getNotationView() + " looking for: " + vid, UMLVisualIDRegistry.getVisualID(childEP.getNotationView()), vid);
		return childEP;
	}

	private IGraphicalEditPart findChildBySemanticHint(IGraphicalEditPart parent, int vid) {
		IGraphicalEditPart childEP = parent.getChildBySemanticHint(Integer.toString(vid));
		assertNotNull("Parent " + parent + ", type " + parent.getNotationView() + " looking for: " + vid, childEP);
		return childEP;
	}
}
