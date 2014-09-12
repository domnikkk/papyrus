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
package org.eclipse.papyrus.migration.rsa.profilebase;

import org.eclipse.papyrus.migration.rsa.default_.AbstractConstraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.migration.rsa.profilebase.ProfileConstraint#getMessageKey <em>Message Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.migration.rsa.profilebase.ProfileBasePackage#getProfileConstraint()
 * @model
 * @generated
 */
public interface ProfileConstraint extends AbstractConstraint {
	/**
	 * Returns the value of the '<em><b>Message Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Key</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Message Key</em>' attribute.
	 * @see #setMessageKey(String)
	 * @see org.eclipse.papyrus.migration.rsa.profilebase.ProfileBasePackage#getProfileConstraint_MessageKey()
	 * @model required="true"
	 * @generated
	 */
	String getMessageKey();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rsa.profilebase.ProfileConstraint#getMessageKey <em>Message Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Message Key</em>' attribute.
	 * @see #getMessageKey()
	 * @generated
	 */
	void setMessageKey(String value);

} // ProfileConstraint
