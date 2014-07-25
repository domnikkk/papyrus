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
package org.eclipse.papyrus.umldi.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.umldi.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLDIFactoryImpl extends EFactoryImpl implements UMLDIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UMLDIFactory init() {
		try {
			UMLDIFactory theUMLDIFactory = (UMLDIFactory)EPackage.Registry.INSTANCE.getEFactory(UMLDIPackage.eNS_URI);
			if (theUMLDIFactory != null) {
				return theUMLDIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UMLDIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLDIFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UMLDIPackage.UML_DIAGRAM: return createUmlDiagram();
			case UMLDIPackage.UML_SHAPE: return createUmlShape();
			case UMLDIPackage.UML_STYLE: return createUmlStyle();
			case UMLDIPackage.UML_EDGE: return createUmlEdge();
			case UMLDIPackage.UML_COMPARTMENT: return createUmlCompartment();
			case UMLDIPackage.UML_LABEL: return createUmlLabel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UMLDIPackage.UML_COMPARTMENT_KIND:
				return createUmlCompartmentKindFromString(eDataType, initialValue);
			case UMLDIPackage.UML_LABEL_KIND:
				return createUmlLabelKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UMLDIPackage.UML_COMPARTMENT_KIND:
				return convertUmlCompartmentKindToString(eDataType, instanceValue);
			case UMLDIPackage.UML_LABEL_KIND:
				return convertUmlLabelKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlDiagram createUmlDiagram() {
		UmlDiagramImpl umlDiagram = new UmlDiagramImpl();
		return umlDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlStyle createUmlStyle() {
		UmlStyleImpl umlStyle = new UmlStyleImpl();
		return umlStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlEdge createUmlEdge() {
		UmlEdgeImpl umlEdge = new UmlEdgeImpl();
		return umlEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlCompartment createUmlCompartment() {
		UmlCompartmentImpl umlCompartment = new UmlCompartmentImpl();
		return umlCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlLabel createUmlLabel() {
		UmlLabelImpl umlLabel = new UmlLabelImpl();
		return umlLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlCompartmentKind createUmlCompartmentKindFromString(EDataType eDataType, String initialValue) {
		UmlCompartmentKind result = UmlCompartmentKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUmlCompartmentKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlLabelKind createUmlLabelKindFromString(EDataType eDataType, String initialValue) {
		UmlLabelKind result = UmlLabelKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUmlLabelKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlShape createUmlShape() {
		UmlShapeImpl umlShape = new UmlShapeImpl();
		return umlShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLDIPackage getUMLDIPackage() {
		return (UMLDIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UMLDIPackage getPackage() {
		return UMLDIPackage.eINSTANCE;
	}

} //UMLDIFactoryImpl
