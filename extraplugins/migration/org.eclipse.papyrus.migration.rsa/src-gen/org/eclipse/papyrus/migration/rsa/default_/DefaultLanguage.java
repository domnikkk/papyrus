/**
 *  * Copyright (c) 2013, 2014 CEA LIST.
 *  *
 *  * All rights reserved. This program and the accompanying materials
 *  * are made available under the terms of the Eclipse Public License v1.0
 *  * which accompanies this distribution, and is available at
 *  * http://www.eclipse.org/legal/epl-v10.html
 *  *
 *  * Contributors:
 *  *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.migration.rsa.default_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.migration.rsa.default_.DefaultLanguage#getBase_Package <em>Base Package</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.default_.DefaultLanguage#getDefaultLanguage <em>Default Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.migration.rsa.default_.DefaultPackage#getDefaultLanguage()
 * @model
 * @generated
 */
public interface DefaultLanguage extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Base Package</em>' reference.
	 * @see #setBase_Package(org.eclipse.uml2.uml.Package)
	 * @see org.eclipse.papyrus.migration.rsa.default_.DefaultPackage#getDefaultLanguage_Base_Package()
	 * @model
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getBase_Package();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rsa.default_.DefaultLanguage#getBase_Package <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Base Package</em>' reference.
	 * @see #getBase_Package()
	 * @generated
	 */
	void setBase_Package(org.eclipse.uml2.uml.Package value);

	/**
	 * Returns the value of the '<em><b>Default Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Language</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Default Language</em>' attribute.
	 * @see #setDefaultLanguage(String)
	 * @see org.eclipse.papyrus.migration.rsa.default_.DefaultPackage#getDefaultLanguage_DefaultLanguage()
	 * @model
	 * @generated
	 */
	String getDefaultLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rsa.default_.DefaultLanguage#getDefaultLanguage <em>Default Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Default Language</em>' attribute.
	 * @see #getDefaultLanguage()
	 * @generated
	 */
	void setDefaultLanguage(String value);

} // DefaultLanguage
