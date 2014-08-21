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
package org.eclipse.papyrus.umldi;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.umldi.UMLDIPackage
 * @generated
 */
public interface UMLDIFactory extends EFactory {

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	UMLDIFactory eINSTANCE = org.eclipse.papyrus.umldi.impl.UMLDIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Uml Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Uml Diagram</em>'.
	 * @generated
	 */
	UmlDiagram createUmlDiagram();

	/**
	 * Returns a new object of class '<em>Uml Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Uml Style</em>'.
	 * @generated
	 */
	UmlStyle createUmlStyle();

	/**
	 * Returns a new object of class '<em>Uml Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Uml Edge</em>'.
	 * @generated
	 */
	UmlEdge createUmlEdge();

	/**
	 * Returns a new object of class '<em>Uml Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Uml Compartment</em>'.
	 * @generated
	 */
	UmlCompartment createUmlCompartment();

	/**
	 * Returns a new object of class '<em>Uml Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Uml Label</em>'.
	 * @generated
	 */
	UmlLabel createUmlLabel();

	/**
	 * Returns a new object of class '<em>Uml Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Uml Shape</em>'.
	 * @generated
	 */
	UmlShape createUmlShape();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the package supported by this factory.
	 * @generated
	 */
	UMLDIPackage getUMLDIPackage();
} // UMLDIFactory
