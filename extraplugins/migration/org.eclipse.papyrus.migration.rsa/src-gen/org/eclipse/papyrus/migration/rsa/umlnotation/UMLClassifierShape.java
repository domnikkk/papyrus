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
 * A representation of the model object '<em><b>UML Classifier Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLClassifierShape#isUseClassifierShape <em>Use Classifier Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.migration.rsa.umlnotation.PapyrusUMLNotationPackage#getUMLClassifierShape()
 * @model
 * @generated
 */
public interface UMLClassifierShape extends UMLShape {
	/**
	 * Returns the value of the '<em><b>Use Classifier Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Classifier Shape</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Use Classifier Shape</em>' attribute.
	 * @see #setUseClassifierShape(boolean)
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.PapyrusUMLNotationPackage#getUMLClassifierShape_UseClassifierShape()
	 * @model
	 * @generated
	 */
	boolean isUseClassifierShape();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLClassifierShape#isUseClassifierShape <em>Use Classifier Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Use Classifier Shape</em>' attribute.
	 * @see #isUseClassifierShape()
	 * @generated
	 */
	void setUseClassifierShape(boolean value);

} // UMLClassifierShape
