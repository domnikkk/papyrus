/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.umlnotation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.papyrus.migration.rsa.umlnotation.PapyrusUMLNotationFactory;
import org.eclipse.papyrus.migration.rsa.umlnotation.PapyrusUMLNotationPackage;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLClassifierShape;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLComponent;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLConnector;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLDiagram;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLFrame;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLShape;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLShapeCompartment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PapyrusUMLNotationFactoryImpl extends EFactoryImpl implements PapyrusUMLNotationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static PapyrusUMLNotationFactory init() {
		try {
			PapyrusUMLNotationFactory thePapyrusRSANotationFactory = (PapyrusUMLNotationFactory) EPackage.Registry.INSTANCE.getEFactory(PapyrusUMLNotationPackage.eNS_URI);
			if (thePapyrusRSANotationFactory != null) {
				return thePapyrusRSANotationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PapyrusUMLNotationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public PapyrusUMLNotationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PapyrusUMLNotationPackage.UML_DIAGRAM:
			return createUMLDiagram();
		case PapyrusUMLNotationPackage.UML_FRAME:
			return createUMLFrame();
		case PapyrusUMLNotationPackage.UML_SHAPE_COMPARTMENT:
			return createUMLShapeCompartment();
		case PapyrusUMLNotationPackage.UML_SHAPE:
			return createUMLShape();
		case PapyrusUMLNotationPackage.UML_CONNECTOR:
			return createUMLConnector();
		case PapyrusUMLNotationPackage.UML_COMPONENT:
			return createUMLComponent();
		case PapyrusUMLNotationPackage.UML_CLASSIFIER_SHAPE:
			return createUMLClassifierShape();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public UMLDiagram createUMLDiagram() {
		UMLDiagramImpl umlDiagram = new UMLDiagramImpl();
		return umlDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public UMLFrame createUMLFrame() {
		UMLFrameImpl umlFrame = new UMLFrameImpl();
		return umlFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public UMLShapeCompartment createUMLShapeCompartment() {
		UMLShapeCompartmentImpl umlShapeCompartment = new UMLShapeCompartmentImpl();
		return umlShapeCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public UMLShape createUMLShape() {
		UMLShapeImpl umlShape = new UMLShapeImpl();
		return umlShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public UMLConnector createUMLConnector() {
		UMLConnectorImpl umlConnector = new UMLConnectorImpl();
		return umlConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public UMLComponent createUMLComponent() {
		UMLComponentImpl umlComponent = new UMLComponentImpl();
		return umlComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public UMLClassifierShape createUMLClassifierShape() {
		UMLClassifierShapeImpl umlClassifierShape = new UMLClassifierShapeImpl();
		return umlClassifierShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public PapyrusUMLNotationPackage getPapyrusRSANotationPackage() {
		return (PapyrusUMLNotationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PapyrusUMLNotationPackage getPackage() {
		return PapyrusUMLNotationPackage.eINSTANCE;
	}

} // PapyrusUMLNotationFactoryImpl
