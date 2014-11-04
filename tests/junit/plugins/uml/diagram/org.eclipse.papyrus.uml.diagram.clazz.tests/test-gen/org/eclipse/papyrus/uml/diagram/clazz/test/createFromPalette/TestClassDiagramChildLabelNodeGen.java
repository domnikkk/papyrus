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

import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.clazz.CreateClassDiagramCommand;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomUMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AssociationClassAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AssociationClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AssociationClassNestedClassifierCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AssociationClassOperationCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassAttributeCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassNestedClassifierCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassNestedClassifierCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassOperationCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassOperationCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassifierTemplateParameterEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentAttributeCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentNestedClassifierCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentNestedClassifierCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentOperationCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentOperationCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeAttributeCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeOperationCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeOperationCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.EnumerationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.EnumerationEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.EnumerationEnumerationLiteralCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.EnumerationEnumerationLiteralCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.EnumerationLiteralEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InstanceSpecificationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InstanceSpecificationEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InstanceSpecificationSlotCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InstanceSpecificationSlotCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceAttributeCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceNestedClassifierCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceNestedClassifierCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceOperationCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceOperationCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.NestedClassForClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.NestedClassForComponentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.NestedClassForInterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.OperationForComponentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.OperationForDataTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.OperationForInterfaceEditpart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.OperationForPrimitiveTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PrimitiveTypeAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PrimitiveTypeAttributeCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PrimitiveTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PrimitiveTypeEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PrimitiveTypeOperationCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PrimitiveTypeOperationCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PropertyForClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PropertyForComponentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PropertyForInterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PropertyForSignalEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PropertyforDataTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PropertyforPrimitiveTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ReceptionEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.RedefinableTemplateSignatureEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.RedefinableTemplateSignatureTemplateParameterCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SignalAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SignalAttributeCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SignalEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SignalEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SlotEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.TemplateSignatureEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.TemplateSignatureTemplateParameterCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.clazz.test.IClassDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.AbstractCreateChildLabelNodeFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestClassDiagramChildLabelNodeGen.
 */
public class TestClassDiagramChildLabelNodeGen extends AbstractCreateChildLabelNodeFromPaletteTest {
	
	
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
	 * Tests for child label nodes».
	 */
	@Test
	@GeneratedTest
	public void TestClassDiagramChildLabelNodeGenOperation() {
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(InstanceSpecificationEditPart.VISUAL_ID), UMLElementTypes.getElementType(SlotEditPart.VISUAL_ID), InstanceSpecificationSlotCompartmentEditPart.VISUAL_ID, true);

		
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(InstanceSpecificationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(SlotEditPart.VISUAL_ID), InstanceSpecificationSlotCompartmentEditPartCN.VISUAL_ID, true);
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OperationForDataTypeEditPart.VISUAL_ID), DataTypeOperationCompartmentEditPart.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(NestedClassForInterfaceEditPart.VISUAL_ID), InterfaceNestedClassifierCompartmentEditPart.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReceptionEditPart.VISUAL_ID), ClassOperationCompartmentEditPart.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(SignalEditPart.VISUAL_ID), UMLElementTypes.getElementType(PropertyForSignalEditPart.VISUAL_ID), SignalAttributeCompartmentEditPart.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(AssociationClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(NestedClassForComponentEditPart.VISUAL_ID), AssociationClassNestedClassifierCompartmentEditPart.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(EnumerationEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(EnumerationLiteralEditPart.VISUAL_ID), EnumerationEnumerationLiteralCompartmentEditPartCN.VISUAL_ID, true);
					
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(OperationForComponentEditPart.VISUAL_ID), ComponentOperationCompartmentEditPart.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(InterfaceEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PropertyForInterfaceEditPart.VISUAL_ID), InterfaceAttributeCompartmentEditPartCN.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PropertyForClassEditPart.VISUAL_ID), ClassAttributeCompartmentEditPart.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(NestedClassForClassEditPart.VISUAL_ID), ClassNestedClassifierCompartmentEditPartCN.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(ClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(NestedClassForClassEditPart.VISUAL_ID), ClassNestedClassifierCompartmentEditPart.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(EnumerationEditPart.VISUAL_ID), UMLElementTypes.getElementType(EnumerationLiteralEditPart.VISUAL_ID), EnumerationEnumerationLiteralCompartmentEditPart.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(SignalEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PropertyForSignalEditPart.VISUAL_ID), SignalAttributeCompartmentEditPartCN.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(AssociationClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(PropertyForComponentEditPart.VISUAL_ID), AssociationClassAttributeCompartmentEditPart.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PropertyforDataTypeEditPart.VISUAL_ID), DataTypeAttributeCompartmentEditPartCN.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(InterfaceEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(NestedClassForInterfaceEditPart.VISUAL_ID), InterfaceNestedClassifierCompartmentEditPartCN.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(DataTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OperationForDataTypeEditPart.VISUAL_ID), DataTypeOperationCompartmentEditPartCN.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(OperationForInterfaceEditpart.VISUAL_ID), InterfaceOperationCompartmentEditPart.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ReceptionEditPart.VISUAL_ID), ClassOperationCompartmentEditPartCN.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PropertyForComponentEditPart.VISUAL_ID), ComponentAttributeCompartmentEditPartCN.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PropertyforPrimitiveTypeEditPart.VISUAL_ID), PrimitiveTypeAttributeCompartmentEditPartCN.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(DataTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PropertyforDataTypeEditPart.VISUAL_ID), DataTypeAttributeCompartmentEditPart.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(AssociationClassEditPart.VISUAL_ID), UMLElementTypes.getElementType(OperationForComponentEditPart.VISUAL_ID), AssociationClassOperationCompartmentEditPart.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OperationForComponentEditPart.VISUAL_ID), ComponentOperationCompartmentEditPartCN.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PropertyForComponentEditPart.VISUAL_ID), ComponentAttributeCompartmentEditPart.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PropertyForInterfaceEditPart.VISUAL_ID), InterfaceAttributeCompartmentEditPart.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(NestedClassForComponentEditPart.VISUAL_ID), ComponentNestedClassifierCompartmentEditPart.VISUAL_ID, true);
					
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(RedefinableTemplateSignatureEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassifierTemplateParameterEditPart.VISUAL_ID), RedefinableTemplateSignatureTemplateParameterCompartmentEditPart.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(PrimitiveTypeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OperationForPrimitiveTypeEditPart.VISUAL_ID), PrimitiveTypeOperationCompartmentEditPartCN.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OperationForPrimitiveTypeEditPart.VISUAL_ID), PrimitiveTypeOperationCompartmentEditPart.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(ClassEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(PropertyForClassEditPart.VISUAL_ID), ClassAttributeCompartmentEditPartCN.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(PrimitiveTypeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PropertyforPrimitiveTypeEditPart.VISUAL_ID), PrimitiveTypeAttributeCompartmentEditPart.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(InterfaceEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OperationForInterfaceEditpart.VISUAL_ID), InterfaceOperationCompartmentEditPartCN.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(TemplateSignatureEditPart.VISUAL_ID), UMLElementTypes.getElementType(ClassifierTemplateParameterEditPart.VISUAL_ID), TemplateSignatureTemplateParameterCompartmentEditPart.VISUAL_ID, true);
					
		testCreateChildLabelNodeFromPaletteTest(UMLElementTypes.getElementType(ComponentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(NestedClassForComponentEditPart.VISUAL_ID), ComponentNestedClassifierCompartmentEditPartCN.VISUAL_ID, true);
					
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return CustomUMLDiagramUpdater.INSTANCE;
	}
	
}	
