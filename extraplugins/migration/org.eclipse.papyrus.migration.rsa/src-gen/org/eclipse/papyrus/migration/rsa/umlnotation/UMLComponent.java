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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLComponent#isShowWhitebox <em>Show Whitebox</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.migration.rsa.umlnotation.PapyrusUMLNotationPackage#getUMLComponent()
 * @model
 * @generated
 */
public interface UMLComponent extends UMLShape {

	/**
	 * Returns the value of the '<em><b>Show Whitebox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Whitebox</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Show Whitebox</em>' attribute.
	 * @see #setShowWhitebox(boolean)
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.PapyrusUMLNotationPackage#getUMLComponent_ShowWhitebox()
	 * @model
	 * @generated
	 */
	boolean isShowWhitebox();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLComponent#isShowWhitebox <em>Show Whitebox</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Show Whitebox</em>' attribute.
	 * @see #isShowWhitebox()
	 * @generated
	 */
	void setShowWhitebox(boolean value);
} // UMLComponent
