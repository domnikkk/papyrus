/**
 * Copyright (c) 2014 CEA LIST.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.umldi.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.dd.di.Diagram;
import org.eclipse.papyrus.dd.di.DiagramElement;
import org.eclipse.papyrus.dd.di.Edge;
import org.eclipse.papyrus.dd.di.Shape;
import org.eclipse.papyrus.dd.di.Style;

import org.eclipse.papyrus.umldi.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage
 * @generated
 */
public class UMLDISwitch<T> extends Switch<T> {

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static UMLDIPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UMLDISwitch() {
		if(modelPackage == null) {
			modelPackage = UMLDIPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch(classifierID) {
		case UMLDIPackage.UML_DIAGRAM:
		{
			UmlDiagram umlDiagram = (UmlDiagram)theEObject;
			T result = caseUmlDiagram(umlDiagram);
			if(result == null)
				result = caseUmlDiagramElement(umlDiagram);
			if(result == null)
				result = caseDiagram(umlDiagram);
			if(result == null)
				result = caseShape(umlDiagram);
			if(result == null)
				result = caseDiagramElement(umlDiagram);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.UML_DIAGRAM_ELEMENT:
		{
			UmlDiagramElement umlDiagramElement = (UmlDiagramElement)theEObject;
			T result = caseUmlDiagramElement(umlDiagramElement);
			if(result == null)
				result = caseDiagramElement(umlDiagramElement);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.UML_STYLE:
		{
			UmlStyle umlStyle = (UmlStyle)theEObject;
			T result = caseUmlStyle(umlStyle);
			if(result == null)
				result = caseStyle(umlStyle);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.UML_EDGE:
		{
			UmlEdge umlEdge = (UmlEdge)theEObject;
			T result = caseUmlEdge(umlEdge);
			if(result == null)
				result = caseTopUmlDiagramElement(umlEdge);
			if(result == null)
				result = caseEdge(umlEdge);
			if(result == null)
				result = caseUmlDiagramElement(umlEdge);
			if(result == null)
				result = caseDiagramElement(umlEdge);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT:
		{
			TopUmlDiagramElement topUmlDiagramElement = (TopUmlDiagramElement)theEObject;
			T result = caseTopUmlDiagramElement(topUmlDiagramElement);
			if(result == null)
				result = caseUmlDiagramElement(topUmlDiagramElement);
			if(result == null)
				result = caseDiagramElement(topUmlDiagramElement);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT:
		{
			PackagedElementCompartment packagedElementCompartment = (PackagedElementCompartment)theEObject;
			T result = casePackagedElementCompartment(packagedElementCompartment);
			if(result == null)
				result = caseUmlCompartment(packagedElementCompartment);
			if(result == null)
				result = caseUmlDiagramElement(packagedElementCompartment);
			if(result == null)
				result = caseShape(packagedElementCompartment);
			if(result == null)
				result = caseDiagramElement(packagedElementCompartment);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.UML_COMPARTMENT:
		{
			UmlCompartment umlCompartment = (UmlCompartment)theEObject;
			T result = caseUmlCompartment(umlCompartment);
			if(result == null)
				result = caseUmlDiagramElement(umlCompartment);
			if(result == null)
				result = caseShape(umlCompartment);
			if(result == null)
				result = caseDiagramElement(umlCompartment);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.PACKAGE_SHAPE:
		{
			PackageShape packageShape = (PackageShape)theEObject;
			T result = casePackageShape(packageShape);
			if(result == null)
				result = caseTemplateableElementShape(packageShape);
			if(result == null)
				result = caseNamedShape(packageShape);
			if(result == null)
				result = caseUmlShape(packageShape);
			if(result == null)
				result = caseTopUmlDiagramElement(packageShape);
			if(result == null)
				result = caseShape(packageShape);
			if(result == null)
				result = caseUmlDiagramElement(packageShape);
			if(result == null)
				result = caseDiagramElement(packageShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.TEMPLATEABLE_ELEMENT_SHAPE:
		{
			TemplateableElementShape templateableElementShape = (TemplateableElementShape)theEObject;
			T result = caseTemplateableElementShape(templateableElementShape);
			if(result == null)
				result = caseNamedShape(templateableElementShape);
			if(result == null)
				result = caseUmlShape(templateableElementShape);
			if(result == null)
				result = caseTopUmlDiagramElement(templateableElementShape);
			if(result == null)
				result = caseShape(templateableElementShape);
			if(result == null)
				result = caseUmlDiagramElement(templateableElementShape);
			if(result == null)
				result = caseDiagramElement(templateableElementShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.NAMED_SHAPE:
		{
			NamedShape namedShape = (NamedShape)theEObject;
			T result = caseNamedShape(namedShape);
			if(result == null)
				result = caseUmlShape(namedShape);
			if(result == null)
				result = caseTopUmlDiagramElement(namedShape);
			if(result == null)
				result = caseShape(namedShape);
			if(result == null)
				result = caseUmlDiagramElement(namedShape);
			if(result == null)
				result = caseDiagramElement(namedShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.UML_SHAPE:
		{
			UmlShape umlShape = (UmlShape)theEObject;
			T result = caseUmlShape(umlShape);
			if(result == null)
				result = caseTopUmlDiagramElement(umlShape);
			if(result == null)
				result = caseShape(umlShape);
			if(result == null)
				result = caseUmlDiagramElement(umlShape);
			if(result == null)
				result = caseDiagramElement(umlShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.NAME_LABEL:
		{
			NameLabel nameLabel = (NameLabel)theEObject;
			T result = caseNameLabel(nameLabel);
			if(result == null)
				result = caseUmlLabel(nameLabel);
			if(result == null)
				result = caseUmlDiagramElement(nameLabel);
			if(result == null)
				result = caseShape(nameLabel);
			if(result == null)
				result = caseDiagramElement(nameLabel);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.UML_LABEL:
		{
			UmlLabel umlLabel = (UmlLabel)theEObject;
			T result = caseUmlLabel(umlLabel);
			if(result == null)
				result = caseUmlDiagramElement(umlLabel);
			if(result == null)
				result = caseShape(umlLabel);
			if(result == null)
				result = caseDiagramElement(umlLabel);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.NAMED_EDGE:
		{
			NamedEdge namedEdge = (NamedEdge)theEObject;
			T result = caseNamedEdge(namedEdge);
			if(result == null)
				result = caseUmlEdge(namedEdge);
			if(result == null)
				result = caseTopUmlDiagramElement(namedEdge);
			if(result == null)
				result = caseEdge(namedEdge);
			if(result == null)
				result = caseUmlDiagramElement(namedEdge);
			if(result == null)
				result = caseDiagramElement(namedEdge);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.TEMPLATE_PARAMETER_COMPARTMENT:
		{
			TemplateParameterCompartment templateParameterCompartment = (TemplateParameterCompartment)theEObject;
			T result = caseTemplateParameterCompartment(templateParameterCompartment);
			if(result == null)
				result = caseUmlCompartment(templateParameterCompartment);
			if(result == null)
				result = caseUmlDiagramElement(templateParameterCompartment);
			if(result == null)
				result = caseShape(templateParameterCompartment);
			if(result == null)
				result = caseDiagramElement(templateParameterCompartment);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.TEMPLATE_PARAMETER_LABEL:
		{
			TemplateParameterLabel templateParameterLabel = (TemplateParameterLabel)theEObject;
			T result = caseTemplateParameterLabel(templateParameterLabel);
			if(result == null)
				result = caseNameLabel(templateParameterLabel);
			if(result == null)
				result = caseUmlLabel(templateParameterLabel);
			if(result == null)
				result = caseUmlDiagramElement(templateParameterLabel);
			if(result == null)
				result = caseShape(templateParameterLabel);
			if(result == null)
				result = caseDiagramElement(templateParameterLabel);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.CLASS_DIAGRAM:
		{
			ClassDiagram classDiagram = (ClassDiagram)theEObject;
			T result = caseClassDiagram(classDiagram);
			if(result == null)
				result = caseStructureDiagram(classDiagram);
			if(result == null)
				result = caseUmlDiagram(classDiagram);
			if(result == null)
				result = caseUmlDiagramElement(classDiagram);
			if(result == null)
				result = caseDiagram(classDiagram);
			if(result == null)
				result = caseShape(classDiagram);
			if(result == null)
				result = caseDiagramElement(classDiagram);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.STRUCTURE_DIAGRAM:
		{
			StructureDiagram structureDiagram = (StructureDiagram)theEObject;
			T result = caseStructureDiagram(structureDiagram);
			if(result == null)
				result = caseUmlDiagram(structureDiagram);
			if(result == null)
				result = caseUmlDiagramElement(structureDiagram);
			if(result == null)
				result = caseDiagram(structureDiagram);
			if(result == null)
				result = caseShape(structureDiagram);
			if(result == null)
				result = caseDiagramElement(structureDiagram);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.CLASSIFIER_SHAPE:
		{
			ClassifierShape classifierShape = (ClassifierShape)theEObject;
			T result = caseClassifierShape(classifierShape);
			if(result == null)
				result = caseTemplateableElementShape(classifierShape);
			if(result == null)
				result = caseNamedShape(classifierShape);
			if(result == null)
				result = caseUmlShape(classifierShape);
			if(result == null)
				result = caseTopUmlDiagramElement(classifierShape);
			if(result == null)
				result = caseShape(classifierShape);
			if(result == null)
				result = caseUmlDiagramElement(classifierShape);
			if(result == null)
				result = caseDiagramElement(classifierShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.CONSTRAINT_SHAPE:
		{
			ConstraintShape constraintShape = (ConstraintShape)theEObject;
			T result = caseConstraintShape(constraintShape);
			if(result == null)
				result = caseBodyShape(constraintShape);
			if(result == null)
				result = caseNamedShape(constraintShape);
			if(result == null)
				result = caseUmlShape(constraintShape);
			if(result == null)
				result = caseTopUmlDiagramElement(constraintShape);
			if(result == null)
				result = caseShape(constraintShape);
			if(result == null)
				result = caseUmlDiagramElement(constraintShape);
			if(result == null)
				result = caseDiagramElement(constraintShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.BODY_SHAPE:
		{
			BodyShape bodyShape = (BodyShape)theEObject;
			T result = caseBodyShape(bodyShape);
			if(result == null)
				result = caseUmlShape(bodyShape);
			if(result == null)
				result = caseTopUmlDiagramElement(bodyShape);
			if(result == null)
				result = caseShape(bodyShape);
			if(result == null)
				result = caseUmlDiagramElement(bodyShape);
			if(result == null)
				result = caseDiagramElement(bodyShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.BODY_LABEL:
		{
			BodyLabel bodyLabel = (BodyLabel)theEObject;
			T result = caseBodyLabel(bodyLabel);
			if(result == null)
				result = caseUmlLabel(bodyLabel);
			if(result == null)
				result = caseUmlDiagramElement(bodyLabel);
			if(result == null)
				result = caseShape(bodyLabel);
			if(result == null)
				result = caseDiagramElement(bodyLabel);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT:
		{
			AttributeCompartment attributeCompartment = (AttributeCompartment)theEObject;
			T result = caseAttributeCompartment(attributeCompartment);
			if(result == null)
				result = caseUmlCompartment(attributeCompartment);
			if(result == null)
				result = caseUmlDiagramElement(attributeCompartment);
			if(result == null)
				result = caseShape(attributeCompartment);
			if(result == null)
				result = caseDiagramElement(attributeCompartment);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.CLASSIFIER_WITH_ATTRIBUTES_SHAPE:
		{
			ClassifierWithAttributesShape classifierWithAttributesShape = (ClassifierWithAttributesShape)theEObject;
			T result = caseClassifierWithAttributesShape(classifierWithAttributesShape);
			if(result == null)
				result = caseClassifierShape(classifierWithAttributesShape);
			if(result == null)
				result = caseTemplateableElementShape(classifierWithAttributesShape);
			if(result == null)
				result = caseNamedShape(classifierWithAttributesShape);
			if(result == null)
				result = caseUmlShape(classifierWithAttributesShape);
			if(result == null)
				result = caseTopUmlDiagramElement(classifierWithAttributesShape);
			if(result == null)
				result = caseShape(classifierWithAttributesShape);
			if(result == null)
				result = caseUmlDiagramElement(classifierWithAttributesShape);
			if(result == null)
				result = caseDiagramElement(classifierWithAttributesShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.PROPERTY_LABEL:
		{
			PropertyLabel propertyLabel = (PropertyLabel)theEObject;
			T result = casePropertyLabel(propertyLabel);
			if(result == null)
				result = caseNameLabel(propertyLabel);
			if(result == null)
				result = caseUmlLabel(propertyLabel);
			if(result == null)
				result = caseUmlDiagramElement(propertyLabel);
			if(result == null)
				result = caseShape(propertyLabel);
			if(result == null)
				result = caseDiagramElement(propertyLabel);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.OPERATION_COMPARTMENT:
		{
			OperationCompartment operationCompartment = (OperationCompartment)theEObject;
			T result = caseOperationCompartment(operationCompartment);
			if(result == null)
				result = caseUmlCompartment(operationCompartment);
			if(result == null)
				result = caseUmlDiagramElement(operationCompartment);
			if(result == null)
				result = caseShape(operationCompartment);
			if(result == null)
				result = caseDiagramElement(operationCompartment);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.CLASSIFIER_WITH_OPERATIONS_SHAPE:
		{
			ClassifierWithOperationsShape classifierWithOperationsShape = (ClassifierWithOperationsShape)theEObject;
			T result = caseClassifierWithOperationsShape(classifierWithOperationsShape);
			if(result == null)
				result = caseClassifierWithAttributesShape(classifierWithOperationsShape);
			if(result == null)
				result = caseClassifierShape(classifierWithOperationsShape);
			if(result == null)
				result = caseTemplateableElementShape(classifierWithOperationsShape);
			if(result == null)
				result = caseNamedShape(classifierWithOperationsShape);
			if(result == null)
				result = caseUmlShape(classifierWithOperationsShape);
			if(result == null)
				result = caseTopUmlDiagramElement(classifierWithOperationsShape);
			if(result == null)
				result = caseShape(classifierWithOperationsShape);
			if(result == null)
				result = caseUmlDiagramElement(classifierWithOperationsShape);
			if(result == null)
				result = caseDiagramElement(classifierWithOperationsShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.OPERATION_LABEL:
		{
			OperationLabel operationLabel = (OperationLabel)theEObject;
			T result = caseOperationLabel(operationLabel);
			if(result == null)
				result = caseNameLabel(operationLabel);
			if(result == null)
				result = caseUmlLabel(operationLabel);
			if(result == null)
				result = caseUmlDiagramElement(operationLabel);
			if(result == null)
				result = caseShape(operationLabel);
			if(result == null)
				result = caseDiagramElement(operationLabel);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.RECEPTION_COMPARTMENT:
		{
			ReceptionCompartment receptionCompartment = (ReceptionCompartment)theEObject;
			T result = caseReceptionCompartment(receptionCompartment);
			if(result == null)
				result = caseUmlCompartment(receptionCompartment);
			if(result == null)
				result = caseUmlDiagramElement(receptionCompartment);
			if(result == null)
				result = caseShape(receptionCompartment);
			if(result == null)
				result = caseDiagramElement(receptionCompartment);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.CLASSIFIER_WITH_RECEPTIONS_SHAPE:
		{
			ClassifierWithReceptionsShape classifierWithReceptionsShape = (ClassifierWithReceptionsShape)theEObject;
			T result = caseClassifierWithReceptionsShape(classifierWithReceptionsShape);
			if(result == null)
				result = caseClassifierWithOperationsShape(classifierWithReceptionsShape);
			if(result == null)
				result = caseClassifierWithAttributesShape(classifierWithReceptionsShape);
			if(result == null)
				result = caseClassifierShape(classifierWithReceptionsShape);
			if(result == null)
				result = caseTemplateableElementShape(classifierWithReceptionsShape);
			if(result == null)
				result = caseNamedShape(classifierWithReceptionsShape);
			if(result == null)
				result = caseUmlShape(classifierWithReceptionsShape);
			if(result == null)
				result = caseTopUmlDiagramElement(classifierWithReceptionsShape);
			if(result == null)
				result = caseShape(classifierWithReceptionsShape);
			if(result == null)
				result = caseUmlDiagramElement(classifierWithReceptionsShape);
			if(result == null)
				result = caseDiagramElement(classifierWithReceptionsShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.RECEPTION_LABEL:
		{
			ReceptionLabel receptionLabel = (ReceptionLabel)theEObject;
			T result = caseReceptionLabel(receptionLabel);
			if(result == null)
				result = caseNameLabel(receptionLabel);
			if(result == null)
				result = caseUmlLabel(receptionLabel);
			if(result == null)
				result = caseUmlDiagramElement(receptionLabel);
			if(result == null)
				result = caseShape(receptionLabel);
			if(result == null)
				result = caseDiagramElement(receptionLabel);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.LITERAL_COMPARTMENT:
		{
			LiteralCompartment literalCompartment = (LiteralCompartment)theEObject;
			T result = caseLiteralCompartment(literalCompartment);
			if(result == null)
				result = caseUmlCompartment(literalCompartment);
			if(result == null)
				result = caseUmlDiagramElement(literalCompartment);
			if(result == null)
				result = caseShape(literalCompartment);
			if(result == null)
				result = caseDiagramElement(literalCompartment);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.ENUMERATION_SHAPE:
		{
			EnumerationShape enumerationShape = (EnumerationShape)theEObject;
			T result = caseEnumerationShape(enumerationShape);
			if(result == null)
				result = caseClassifierShape(enumerationShape);
			if(result == null)
				result = caseTemplateableElementShape(enumerationShape);
			if(result == null)
				result = caseNamedShape(enumerationShape);
			if(result == null)
				result = caseUmlShape(enumerationShape);
			if(result == null)
				result = caseTopUmlDiagramElement(enumerationShape);
			if(result == null)
				result = caseShape(enumerationShape);
			if(result == null)
				result = caseUmlDiagramElement(enumerationShape);
			if(result == null)
				result = caseDiagramElement(enumerationShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.LITERAL_LABEL:
		{
			LiteralLabel literalLabel = (LiteralLabel)theEObject;
			T result = caseLiteralLabel(literalLabel);
			if(result == null)
				result = caseNameLabel(literalLabel);
			if(result == null)
				result = caseUmlLabel(literalLabel);
			if(result == null)
				result = caseUmlDiagramElement(literalLabel);
			if(result == null)
				result = caseShape(literalLabel);
			if(result == null)
				result = caseDiagramElement(literalLabel);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.ROLE_LABEL:
		{
			RoleLabel roleLabel = (RoleLabel)theEObject;
			T result = caseRoleLabel(roleLabel);
			if(result == null)
				result = caseNameLabel(roleLabel);
			if(result == null)
				result = caseUmlLabel(roleLabel);
			if(result == null)
				result = caseUmlDiagramElement(roleLabel);
			if(result == null)
				result = caseShape(roleLabel);
			if(result == null)
				result = caseDiagramElement(roleLabel);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.ASSOCIATION_EDGE:
		{
			AssociationEdge associationEdge = (AssociationEdge)theEObject;
			T result = caseAssociationEdge(associationEdge);
			if(result == null)
				result = caseNamedEdge(associationEdge);
			if(result == null)
				result = caseUmlEdge(associationEdge);
			if(result == null)
				result = caseTopUmlDiagramElement(associationEdge);
			if(result == null)
				result = caseEdge(associationEdge);
			if(result == null)
				result = caseUmlDiagramElement(associationEdge);
			if(result == null)
				result = caseDiagramElement(associationEdge);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.MULTIPLICITY_LABEL:
		{
			MultiplicityLabel multiplicityLabel = (MultiplicityLabel)theEObject;
			T result = caseMultiplicityLabel(multiplicityLabel);
			if(result == null)
				result = caseUmlLabel(multiplicityLabel);
			if(result == null)
				result = caseUmlDiagramElement(multiplicityLabel);
			if(result == null)
				result = caseShape(multiplicityLabel);
			if(result == null)
				result = caseDiagramElement(multiplicityLabel);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.PROPERTY_EDGE:
		{
			PropertyEdge propertyEdge = (PropertyEdge)theEObject;
			T result = casePropertyEdge(propertyEdge);
			if(result == null)
				result = caseNamedEdge(propertyEdge);
			if(result == null)
				result = caseUmlEdge(propertyEdge);
			if(result == null)
				result = caseTopUmlDiagramElement(propertyEdge);
			if(result == null)
				result = caseEdge(propertyEdge);
			if(result == null)
				result = caseUmlDiagramElement(propertyEdge);
			if(result == null)
				result = caseDiagramElement(propertyEdge);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.MODIFIER_LABEL:
		{
			ModifierLabel modifierLabel = (ModifierLabel)theEObject;
			T result = caseModifierLabel(modifierLabel);
			if(result == null)
				result = caseUmlLabel(modifierLabel);
			if(result == null)
				result = caseUmlDiagramElement(modifierLabel);
			if(result == null)
				result = caseShape(modifierLabel);
			if(result == null)
				result = caseDiagramElement(modifierLabel);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.GENERALIZATION_SET_EDGE:
		{
			GeneralizationSetEdge generalizationSetEdge = (GeneralizationSetEdge)theEObject;
			T result = caseGeneralizationSetEdge(generalizationSetEdge);
			if(result == null)
				result = caseNamedEdge(generalizationSetEdge);
			if(result == null)
				result = caseUmlEdge(generalizationSetEdge);
			if(result == null)
				result = caseTopUmlDiagramElement(generalizationSetEdge);
			if(result == null)
				result = caseEdge(generalizationSetEdge);
			if(result == null)
				result = caseUmlDiagramElement(generalizationSetEdge);
			if(result == null)
				result = caseDiagramElement(generalizationSetEdge);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.POWER_LABEL:
		{
			PowerLabel powerLabel = (PowerLabel)theEObject;
			T result = casePowerLabel(powerLabel);
			if(result == null)
				result = caseUmlLabel(powerLabel);
			if(result == null)
				result = caseUmlDiagramElement(powerLabel);
			if(result == null)
				result = caseShape(powerLabel);
			if(result == null)
				result = caseDiagramElement(powerLabel);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.INSTANCE_SPECIFICATION_EDGE:
		{
			InstanceSpecificationEdge instanceSpecificationEdge = (InstanceSpecificationEdge)theEObject;
			T result = caseInstanceSpecificationEdge(instanceSpecificationEdge);
			if(result == null)
				result = caseNamedEdge(instanceSpecificationEdge);
			if(result == null)
				result = caseUmlEdge(instanceSpecificationEdge);
			if(result == null)
				result = caseTopUmlDiagramElement(instanceSpecificationEdge);
			if(result == null)
				result = caseEdge(instanceSpecificationEdge);
			if(result == null)
				result = caseUmlDiagramElement(instanceSpecificationEdge);
			if(result == null)
				result = caseDiagramElement(instanceSpecificationEdge);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE:
		{
			InstanceSpecificationShape instanceSpecificationShape = (InstanceSpecificationShape)theEObject;
			T result = caseInstanceSpecificationShape(instanceSpecificationShape);
			if(result == null)
				result = caseNamedShape(instanceSpecificationShape);
			if(result == null)
				result = caseUmlShape(instanceSpecificationShape);
			if(result == null)
				result = caseTopUmlDiagramElement(instanceSpecificationShape);
			if(result == null)
				result = caseShape(instanceSpecificationShape);
			if(result == null)
				result = caseUmlDiagramElement(instanceSpecificationShape);
			if(result == null)
				result = caseDiagramElement(instanceSpecificationShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.SLOT_COMPARTMENT:
		{
			SlotCompartment slotCompartment = (SlotCompartment)theEObject;
			T result = caseSlotCompartment(slotCompartment);
			if(result == null)
				result = caseUmlCompartment(slotCompartment);
			if(result == null)
				result = caseUmlDiagramElement(slotCompartment);
			if(result == null)
				result = caseShape(slotCompartment);
			if(result == null)
				result = caseDiagramElement(slotCompartment);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.SLOT_LABEL:
		{
			SlotLabel slotLabel = (SlotLabel)theEObject;
			T result = caseSlotLabel(slotLabel);
			if(result == null)
				result = caseNameLabel(slotLabel);
			if(result == null)
				result = caseUmlLabel(slotLabel);
			if(result == null)
				result = caseUmlDiagramElement(slotLabel);
			if(result == null)
				result = caseShape(slotLabel);
			if(result == null)
				result = caseDiagramElement(slotLabel);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.CLASS_SHAPE:
		{
			ClassShape classShape = (ClassShape)theEObject;
			T result = caseClassShape(classShape);
			if(result == null)
				result = caseClassifierWithReceptionsShape(classShape);
			if(result == null)
				result = caseClassifierWithOperationsShape(classShape);
			if(result == null)
				result = caseClassifierWithAttributesShape(classShape);
			if(result == null)
				result = caseClassifierShape(classShape);
			if(result == null)
				result = caseTemplateableElementShape(classShape);
			if(result == null)
				result = caseNamedShape(classShape);
			if(result == null)
				result = caseUmlShape(classShape);
			if(result == null)
				result = caseTopUmlDiagramElement(classShape);
			if(result == null)
				result = caseShape(classShape);
			if(result == null)
				result = caseUmlDiagramElement(classShape);
			if(result == null)
				result = caseDiagramElement(classShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.INTERFACE_SHAPE:
		{
			InterfaceShape interfaceShape = (InterfaceShape)theEObject;
			T result = caseInterfaceShape(interfaceShape);
			if(result == null)
				result = caseClassifierWithReceptionsShape(interfaceShape);
			if(result == null)
				result = caseClassifierWithOperationsShape(interfaceShape);
			if(result == null)
				result = caseClassifierWithAttributesShape(interfaceShape);
			if(result == null)
				result = caseClassifierShape(interfaceShape);
			if(result == null)
				result = caseTemplateableElementShape(interfaceShape);
			if(result == null)
				result = caseNamedShape(interfaceShape);
			if(result == null)
				result = caseUmlShape(interfaceShape);
			if(result == null)
				result = caseTopUmlDiagramElement(interfaceShape);
			if(result == null)
				result = caseShape(interfaceShape);
			if(result == null)
				result = caseUmlDiagramElement(interfaceShape);
			if(result == null)
				result = caseDiagramElement(interfaceShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.DATA_TYPE_SHAPE:
		{
			DataTypeShape dataTypeShape = (DataTypeShape)theEObject;
			T result = caseDataTypeShape(dataTypeShape);
			if(result == null)
				result = caseClassifierWithOperationsShape(dataTypeShape);
			if(result == null)
				result = caseClassifierWithAttributesShape(dataTypeShape);
			if(result == null)
				result = caseClassifierShape(dataTypeShape);
			if(result == null)
				result = caseTemplateableElementShape(dataTypeShape);
			if(result == null)
				result = caseNamedShape(dataTypeShape);
			if(result == null)
				result = caseUmlShape(dataTypeShape);
			if(result == null)
				result = caseTopUmlDiagramElement(dataTypeShape);
			if(result == null)
				result = caseShape(dataTypeShape);
			if(result == null)
				result = caseUmlDiagramElement(dataTypeShape);
			if(result == null)
				result = caseDiagramElement(dataTypeShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.PRIMITIVE_TYPE_SHAPE:
		{
			PrimitiveTypeShape primitiveTypeShape = (PrimitiveTypeShape)theEObject;
			T result = casePrimitiveTypeShape(primitiveTypeShape);
			if(result == null)
				result = caseDataTypeShape(primitiveTypeShape);
			if(result == null)
				result = caseClassifierWithOperationsShape(primitiveTypeShape);
			if(result == null)
				result = caseClassifierWithAttributesShape(primitiveTypeShape);
			if(result == null)
				result = caseClassifierShape(primitiveTypeShape);
			if(result == null)
				result = caseTemplateableElementShape(primitiveTypeShape);
			if(result == null)
				result = caseNamedShape(primitiveTypeShape);
			if(result == null)
				result = caseUmlShape(primitiveTypeShape);
			if(result == null)
				result = caseTopUmlDiagramElement(primitiveTypeShape);
			if(result == null)
				result = caseShape(primitiveTypeShape);
			if(result == null)
				result = caseUmlDiagramElement(primitiveTypeShape);
			if(result == null)
				result = caseDiagramElement(primitiveTypeShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.SIGNAL_SHAPE:
		{
			SignalShape signalShape = (SignalShape)theEObject;
			T result = caseSignalShape(signalShape);
			if(result == null)
				result = caseClassifierWithAttributesShape(signalShape);
			if(result == null)
				result = caseClassifierShape(signalShape);
			if(result == null)
				result = caseTemplateableElementShape(signalShape);
			if(result == null)
				result = caseNamedShape(signalShape);
			if(result == null)
				result = caseUmlShape(signalShape);
			if(result == null)
				result = caseTopUmlDiagramElement(signalShape);
			if(result == null)
				result = caseShape(signalShape);
			if(result == null)
				result = caseUmlDiagramElement(signalShape);
			if(result == null)
				result = caseDiagramElement(signalShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.MODEL_SHAPE:
		{
			ModelShape modelShape = (ModelShape)theEObject;
			T result = caseModelShape(modelShape);
			if(result == null)
				result = casePackageShape(modelShape);
			if(result == null)
				result = caseTemplateableElementShape(modelShape);
			if(result == null)
				result = caseNamedShape(modelShape);
			if(result == null)
				result = caseUmlShape(modelShape);
			if(result == null)
				result = caseTopUmlDiagramElement(modelShape);
			if(result == null)
				result = caseShape(modelShape);
			if(result == null)
				result = caseUmlDiagramElement(modelShape);
			if(result == null)
				result = caseDiagramElement(modelShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.CONTAINMENT_EDGE:
		{
			ContainmentEdge containmentEdge = (ContainmentEdge)theEObject;
			T result = caseContainmentEdge(containmentEdge);
			if(result == null)
				result = caseUmlEdge(containmentEdge);
			if(result == null)
				result = caseTopUmlDiagramElement(containmentEdge);
			if(result == null)
				result = caseEdge(containmentEdge);
			if(result == null)
				result = caseUmlDiagramElement(containmentEdge);
			if(result == null)
				result = caseDiagramElement(containmentEdge);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.GENERALIZATION_EDGE:
		{
			GeneralizationEdge generalizationEdge = (GeneralizationEdge)theEObject;
			T result = caseGeneralizationEdge(generalizationEdge);
			if(result == null)
				result = caseNamedEdge(generalizationEdge);
			if(result == null)
				result = caseUmlEdge(generalizationEdge);
			if(result == null)
				result = caseTopUmlDiagramElement(generalizationEdge);
			if(result == null)
				result = caseEdge(generalizationEdge);
			if(result == null)
				result = caseUmlDiagramElement(generalizationEdge);
			if(result == null)
				result = caseDiagramElement(generalizationEdge);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.REALIZATION_EDGE:
		{
			RealizationEdge realizationEdge = (RealizationEdge)theEObject;
			T result = caseRealizationEdge(realizationEdge);
			if(result == null)
				result = caseAbstractionEdge(realizationEdge);
			if(result == null)
				result = caseDependencyEdge(realizationEdge);
			if(result == null)
				result = caseNamedEdge(realizationEdge);
			if(result == null)
				result = caseUmlEdge(realizationEdge);
			if(result == null)
				result = caseTopUmlDiagramElement(realizationEdge);
			if(result == null)
				result = caseEdge(realizationEdge);
			if(result == null)
				result = caseUmlDiagramElement(realizationEdge);
			if(result == null)
				result = caseDiagramElement(realizationEdge);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.ABSTRACTION_EDGE:
		{
			AbstractionEdge abstractionEdge = (AbstractionEdge)theEObject;
			T result = caseAbstractionEdge(abstractionEdge);
			if(result == null)
				result = caseDependencyEdge(abstractionEdge);
			if(result == null)
				result = caseNamedEdge(abstractionEdge);
			if(result == null)
				result = caseUmlEdge(abstractionEdge);
			if(result == null)
				result = caseTopUmlDiagramElement(abstractionEdge);
			if(result == null)
				result = caseEdge(abstractionEdge);
			if(result == null)
				result = caseUmlDiagramElement(abstractionEdge);
			if(result == null)
				result = caseDiagramElement(abstractionEdge);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.DEPENDENCY_EDGE:
		{
			DependencyEdge dependencyEdge = (DependencyEdge)theEObject;
			T result = caseDependencyEdge(dependencyEdge);
			if(result == null)
				result = caseNamedEdge(dependencyEdge);
			if(result == null)
				result = caseUmlEdge(dependencyEdge);
			if(result == null)
				result = caseTopUmlDiagramElement(dependencyEdge);
			if(result == null)
				result = caseEdge(dependencyEdge);
			if(result == null)
				result = caseUmlDiagramElement(dependencyEdge);
			if(result == null)
				result = caseDiagramElement(dependencyEdge);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.INTERFACE_REALIZATION_EDGE:
		{
			InterfaceRealizationEdge interfaceRealizationEdge = (InterfaceRealizationEdge)theEObject;
			T result = caseInterfaceRealizationEdge(interfaceRealizationEdge);
			if(result == null)
				result = caseRealizationEdge(interfaceRealizationEdge);
			if(result == null)
				result = caseAbstractionEdge(interfaceRealizationEdge);
			if(result == null)
				result = caseDependencyEdge(interfaceRealizationEdge);
			if(result == null)
				result = caseNamedEdge(interfaceRealizationEdge);
			if(result == null)
				result = caseUmlEdge(interfaceRealizationEdge);
			if(result == null)
				result = caseTopUmlDiagramElement(interfaceRealizationEdge);
			if(result == null)
				result = caseEdge(interfaceRealizationEdge);
			if(result == null)
				result = caseUmlDiagramElement(interfaceRealizationEdge);
			if(result == null)
				result = caseDiagramElement(interfaceRealizationEdge);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.USAGE_EDGE:
		{
			UsageEdge usageEdge = (UsageEdge)theEObject;
			T result = caseUsageEdge(usageEdge);
			if(result == null)
				result = caseDependencyEdge(usageEdge);
			if(result == null)
				result = caseNamedEdge(usageEdge);
			if(result == null)
				result = caseUmlEdge(usageEdge);
			if(result == null)
				result = caseTopUmlDiagramElement(usageEdge);
			if(result == null)
				result = caseEdge(usageEdge);
			if(result == null)
				result = caseUmlDiagramElement(usageEdge);
			if(result == null)
				result = caseDiagramElement(usageEdge);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.ELEMENT_IMPORT_EDGE:
		{
			ElementImportEdge elementImportEdge = (ElementImportEdge)theEObject;
			T result = caseElementImportEdge(elementImportEdge);
			if(result == null)
				result = caseNamedEdge(elementImportEdge);
			if(result == null)
				result = caseUmlEdge(elementImportEdge);
			if(result == null)
				result = caseTopUmlDiagramElement(elementImportEdge);
			if(result == null)
				result = caseEdge(elementImportEdge);
			if(result == null)
				result = caseUmlDiagramElement(elementImportEdge);
			if(result == null)
				result = caseDiagramElement(elementImportEdge);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.PACKAGE_IMPORT_EDGE:
		{
			PackageImportEdge packageImportEdge = (PackageImportEdge)theEObject;
			T result = casePackageImportEdge(packageImportEdge);
			if(result == null)
				result = caseNamedEdge(packageImportEdge);
			if(result == null)
				result = caseUmlEdge(packageImportEdge);
			if(result == null)
				result = caseTopUmlDiagramElement(packageImportEdge);
			if(result == null)
				result = caseEdge(packageImportEdge);
			if(result == null)
				result = caseUmlDiagramElement(packageImportEdge);
			if(result == null)
				result = caseDiagramElement(packageImportEdge);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.PACKAGE_MERGE_EDGE:
		{
			PackageMergeEdge packageMergeEdge = (PackageMergeEdge)theEObject;
			T result = casePackageMergeEdge(packageMergeEdge);
			if(result == null)
				result = caseNamedEdge(packageMergeEdge);
			if(result == null)
				result = caseUmlEdge(packageMergeEdge);
			if(result == null)
				result = caseTopUmlDiagramElement(packageMergeEdge);
			if(result == null)
				result = caseEdge(packageMergeEdge);
			if(result == null)
				result = caseUmlDiagramElement(packageMergeEdge);
			if(result == null)
				result = caseDiagramElement(packageMergeEdge);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.SUBSTITUTION_EDGE:
		{
			SubstitutionEdge substitutionEdge = (SubstitutionEdge)theEObject;
			T result = caseSubstitutionEdge(substitutionEdge);
			if(result == null)
				result = caseRealizationEdge(substitutionEdge);
			if(result == null)
				result = caseAbstractionEdge(substitutionEdge);
			if(result == null)
				result = caseDependencyEdge(substitutionEdge);
			if(result == null)
				result = caseNamedEdge(substitutionEdge);
			if(result == null)
				result = caseUmlEdge(substitutionEdge);
			if(result == null)
				result = caseTopUmlDiagramElement(substitutionEdge);
			if(result == null)
				result = caseEdge(substitutionEdge);
			if(result == null)
				result = caseUmlDiagramElement(substitutionEdge);
			if(result == null)
				result = caseDiagramElement(substitutionEdge);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.INFORMATION_FLOW_EDGE:
		{
			InformationFlowEdge informationFlowEdge = (InformationFlowEdge)theEObject;
			T result = caseInformationFlowEdge(informationFlowEdge);
			if(result == null)
				result = caseNamedEdge(informationFlowEdge);
			if(result == null)
				result = caseUmlEdge(informationFlowEdge);
			if(result == null)
				result = caseTopUmlDiagramElement(informationFlowEdge);
			if(result == null)
				result = caseEdge(informationFlowEdge);
			if(result == null)
				result = caseUmlDiagramElement(informationFlowEdge);
			if(result == null)
				result = caseDiagramElement(informationFlowEdge);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.ITEM_LABEL:
		{
			ItemLabel itemLabel = (ItemLabel)theEObject;
			T result = caseItemLabel(itemLabel);
			if(result == null)
				result = caseUmlLabel(itemLabel);
			if(result == null)
				result = caseUmlDiagramElement(itemLabel);
			if(result == null)
				result = caseShape(itemLabel);
			if(result == null)
				result = caseDiagramElement(itemLabel);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.ASSOCIATION_CLASS_EDGE:
		{
			AssociationClassEdge associationClassEdge = (AssociationClassEdge)theEObject;
			T result = caseAssociationClassEdge(associationClassEdge);
			if(result == null)
				result = caseAssociationEdge(associationClassEdge);
			if(result == null)
				result = caseNamedEdge(associationClassEdge);
			if(result == null)
				result = caseUmlEdge(associationClassEdge);
			if(result == null)
				result = caseTopUmlDiagramElement(associationClassEdge);
			if(result == null)
				result = caseEdge(associationClassEdge);
			if(result == null)
				result = caseUmlDiagramElement(associationClassEdge);
			if(result == null)
				result = caseDiagramElement(associationClassEdge);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.COMMENT_SHAPE:
		{
			CommentShape commentShape = (CommentShape)theEObject;
			T result = caseCommentShape(commentShape);
			if(result == null)
				result = caseBodyShape(commentShape);
			if(result == null)
				result = caseUmlShape(commentShape);
			if(result == null)
				result = caseTopUmlDiagramElement(commentShape);
			if(result == null)
				result = caseShape(commentShape);
			if(result == null)
				result = caseUmlDiagramElement(commentShape);
			if(result == null)
				result = caseDiagramElement(commentShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.ATTACHMENT_EDGE:
		{
			AttachmentEdge attachmentEdge = (AttachmentEdge)theEObject;
			T result = caseAttachmentEdge(attachmentEdge);
			if(result == null)
				result = caseUmlEdge(attachmentEdge);
			if(result == null)
				result = caseTopUmlDiagramElement(attachmentEdge);
			if(result == null)
				result = caseEdge(attachmentEdge);
			if(result == null)
				result = caseUmlDiagramElement(attachmentEdge);
			if(result == null)
				result = caseDiagramElement(attachmentEdge);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.ASSOCIATION_CLASS_SHAPE:
		{
			AssociationClassShape associationClassShape = (AssociationClassShape)theEObject;
			T result = caseAssociationClassShape(associationClassShape);
			if(result == null)
				result = caseClassShape(associationClassShape);
			if(result == null)
				result = caseClassifierWithReceptionsShape(associationClassShape);
			if(result == null)
				result = caseClassifierWithOperationsShape(associationClassShape);
			if(result == null)
				result = caseClassifierWithAttributesShape(associationClassShape);
			if(result == null)
				result = caseClassifierShape(associationClassShape);
			if(result == null)
				result = caseTemplateableElementShape(associationClassShape);
			if(result == null)
				result = caseNamedShape(associationClassShape);
			if(result == null)
				result = caseUmlShape(associationClassShape);
			if(result == null)
				result = caseTopUmlDiagramElement(associationClassShape);
			if(result == null)
				result = caseShape(associationClassShape);
			if(result == null)
				result = caseUmlDiagramElement(associationClassShape);
			if(result == null)
				result = caseDiagramElement(associationClassShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.COMPONENT_SHAPE:
		{
			ComponentShape componentShape = (ComponentShape)theEObject;
			T result = caseComponentShape(componentShape);
			if(result == null)
				result = caseClassShape(componentShape);
			if(result == null)
				result = caseClassifierWithReceptionsShape(componentShape);
			if(result == null)
				result = caseClassifierWithOperationsShape(componentShape);
			if(result == null)
				result = caseClassifierWithAttributesShape(componentShape);
			if(result == null)
				result = caseClassifierShape(componentShape);
			if(result == null)
				result = caseTemplateableElementShape(componentShape);
			if(result == null)
				result = caseNamedShape(componentShape);
			if(result == null)
				result = caseUmlShape(componentShape);
			if(result == null)
				result = caseTopUmlDiagramElement(componentShape);
			if(result == null)
				result = caseShape(componentShape);
			if(result == null)
				result = caseUmlDiagramElement(componentShape);
			if(result == null)
				result = caseDiagramElement(componentShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.INFORMATION_ITEM_SHAPE:
		{
			InformationItemShape informationItemShape = (InformationItemShape)theEObject;
			T result = caseInformationItemShape(informationItemShape);
			if(result == null)
				result = caseClassifierShape(informationItemShape);
			if(result == null)
				result = caseTemplateableElementShape(informationItemShape);
			if(result == null)
				result = caseNamedShape(informationItemShape);
			if(result == null)
				result = caseUmlShape(informationItemShape);
			if(result == null)
				result = caseTopUmlDiagramElement(informationItemShape);
			if(result == null)
				result = caseShape(informationItemShape);
			if(result == null)
				result = caseUmlDiagramElement(informationItemShape);
			if(result == null)
				result = caseDiagramElement(informationItemShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.REPRESENTATION_EDGE:
		{
			RepresentationEdge representationEdge = (RepresentationEdge)theEObject;
			T result = caseRepresentationEdge(representationEdge);
			if(result == null)
				result = caseNamedEdge(representationEdge);
			if(result == null)
				result = caseUmlEdge(representationEdge);
			if(result == null)
				result = caseTopUmlDiagramElement(representationEdge);
			if(result == null)
				result = caseEdge(representationEdge);
			if(result == null)
				result = caseUmlDiagramElement(representationEdge);
			if(result == null)
				result = caseDiagramElement(representationEdge);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.ASSOCIATION_SHAPE:
		{
			AssociationShape associationShape = (AssociationShape)theEObject;
			T result = caseAssociationShape(associationShape);
			if(result == null)
				result = caseClassifierShape(associationShape);
			if(result == null)
				result = caseTemplateableElementShape(associationShape);
			if(result == null)
				result = caseNamedShape(associationShape);
			if(result == null)
				result = caseUmlShape(associationShape);
			if(result == null)
				result = caseTopUmlDiagramElement(associationShape);
			if(result == null)
				result = caseShape(associationShape);
			if(result == null)
				result = caseUmlDiagramElement(associationShape);
			if(result == null)
				result = caseDiagramElement(associationShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.DEPENDENCY_SHAPE:
		{
			DependencyShape dependencyShape = (DependencyShape)theEObject;
			T result = caseDependencyShape(dependencyShape);
			if(result == null)
				result = caseNamedShape(dependencyShape);
			if(result == null)
				result = caseUmlShape(dependencyShape);
			if(result == null)
				result = caseTopUmlDiagramElement(dependencyShape);
			if(result == null)
				result = caseShape(dependencyShape);
			if(result == null)
				result = caseUmlDiagramElement(dependencyShape);
			if(result == null)
				result = caseDiagramElement(dependencyShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.TIME_OBSERVATION_SHAPE:
		{
			TimeObservationShape timeObservationShape = (TimeObservationShape)theEObject;
			T result = caseTimeObservationShape(timeObservationShape);
			if(result == null)
				result = caseNamedShape(timeObservationShape);
			if(result == null)
				result = caseUmlShape(timeObservationShape);
			if(result == null)
				result = caseTopUmlDiagramElement(timeObservationShape);
			if(result == null)
				result = caseShape(timeObservationShape);
			if(result == null)
				result = caseUmlDiagramElement(timeObservationShape);
			if(result == null)
				result = caseDiagramElement(timeObservationShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLDIPackage.DURATION_OBSERVATION_SHAPE:
		{
			DurationObservationShape durationObservationShape = (DurationObservationShape)theEObject;
			T result = caseDurationObservationShape(durationObservationShape);
			if(result == null)
				result = caseNamedShape(durationObservationShape);
			if(result == null)
				result = caseUmlShape(durationObservationShape);
			if(result == null)
				result = caseTopUmlDiagramElement(durationObservationShape);
			if(result == null)
				result = caseShape(durationObservationShape);
			if(result == null)
				result = caseUmlDiagramElement(durationObservationShape);
			if(result == null)
				result = caseDiagramElement(durationObservationShape);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlDiagram(UmlDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Diagram Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlDiagramElement(UmlDiagramElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlStyle(UmlStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlEdge(UmlEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Uml Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Uml Diagram Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopUmlDiagramElement(TopUmlDiagramElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlCompartment(UmlCompartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlLabel(UmlLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDiagram(ClassDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDiagram(StructureDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierShape(ClassifierShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageShape(PackageShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Templateable Element Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Templateable Element Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateableElementShape(TemplateableElementShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedShape(NamedShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintShape(ConstraintShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyShape(BodyShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeCompartment(AttributeCompartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationCompartment(OperationCompartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reception Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reception Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceptionCompartment(ReceptionCompartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralCompartment(LiteralCompartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packaged Element Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packaged Element Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackagedElementCompartment(PackagedElementCompartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameLabel(NameLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedEdge(NamedEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyEdge(PropertyEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifierLabel(ModifierLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Specification Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Specification Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceSpecificationEdge(InstanceSpecificationEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyLabel(BodyLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Specification Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Specification Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceSpecificationShape(InstanceSpecificationShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlotCompartment(SlotCompartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlotLabel(SlotLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassShape(ClassShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier With Receptions Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier With Receptions Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierWithReceptionsShape(ClassifierWithReceptionsShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reception Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reception Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceptionLabel(ReceptionLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier With Attributes Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier With Attributes Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierWithAttributesShape(ClassifierWithAttributesShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyLabel(PropertyLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier With Operations Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier With Operations Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierWithOperationsShape(ClassifierWithOperationsShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationLabel(OperationLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceShape(InterfaceShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeShape(DataTypeShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeShape(PrimitiveTypeShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationShape(EnumerationShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralLabel(LiteralLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleLabel(RoleLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalShape(SignalShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelShape(ModelShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containment Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containment Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainmentEdge(ContainmentEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizationEdge(GeneralizationEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationEdge(AssociationEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityLabel(MultiplicityLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realization Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realization Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealizationEdge(RealizationEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstraction Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstraction Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractionEdge(AbstractionEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyEdge(DependencyEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Realization Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Realization Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceRealizationEdge(InterfaceRealizationEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsageEdge(UsageEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Import Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Import Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementImportEdge(ElementImportEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Import Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Import Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageImportEdge(PackageImportEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Merge Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Merge Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageMergeEdge(PackageMergeEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substitution Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substitution Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstitutionEdge(SubstitutionEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Flow Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Flow Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationFlowEdge(InformationFlowEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemLabel(ItemLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Class Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Class Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationClassEdge(AssociationClassEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization Set Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization Set Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizationSetEdge(GeneralizationSetEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerLabel(PowerLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentShape(CommentShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentEdge(AttachmentEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Class Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Class Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationClassShape(AssociationClassShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentShape(ComponentShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Item Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Item Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationItemShape(InformationItemShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Representation Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Representation Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepresentationEdge(RepresentationEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationShape(AssociationShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyShape(DependencyShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Observation Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Observation Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeObservationShape(TimeObservationShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Observation Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Observation Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationObservationShape(DurationObservationShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Parameter Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Parameter Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateParameterCompartment(TemplateParameterCompartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Parameter Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Parameter Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateParameterLabel(TemplateParameterLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlShape(UmlShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramElement(DiagramElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShape(Shape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagram(Diagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyle(Style object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}
} //UMLDISwitch
