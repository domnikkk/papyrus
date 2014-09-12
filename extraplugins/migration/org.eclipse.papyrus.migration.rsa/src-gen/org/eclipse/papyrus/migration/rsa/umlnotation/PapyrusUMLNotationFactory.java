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
package org.eclipse.papyrus.migration.rsa.umlnotation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.migration.rsa.umlnotation.PapyrusUMLNotationPackage
 * @generated
 */
public interface PapyrusUMLNotationFactory extends EFactory {

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	PapyrusUMLNotationFactory eINSTANCE = org.eclipse.papyrus.migration.rsa.umlnotation.impl.PapyrusUMLNotationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>UML Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>UML Diagram</em>'.
	 * @generated
	 */
	UMLDiagram createUMLDiagram();

	/**
	 * Returns a new object of class '<em>UML Frame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>UML Frame</em>'.
	 * @generated
	 */
	UMLFrame createUMLFrame();

	/**
	 * Returns a new object of class '<em>UML Shape Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>UML Shape Compartment</em>'.
	 * @generated
	 */
	UMLShapeCompartment createUMLShapeCompartment();

	/**
	 * Returns a new object of class '<em>UML Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>UML Shape</em>'.
	 * @generated
	 */
	UMLShape createUMLShape();

	/**
	 * Returns a new object of class '<em>UML Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>UML Connector</em>'.
	 * @generated
	 */
	UMLConnector createUMLConnector();

	/**
	 * Returns a new object of class '<em>UML Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>UML Component</em>'.
	 * @generated
	 */
	UMLComponent createUMLComponent();

	/**
	 * Returns a new object of class '<em>UML Classifier Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>UML Classifier Shape</em>'.
	 * @generated
	 */
	UMLClassifierShape createUMLClassifierShape();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the package supported by this factory.
	 * @generated
	 */
	PapyrusUMLNotationPackage getPapyrusRSANotationPackage();

} // PapyrusUMLNotationFactory
