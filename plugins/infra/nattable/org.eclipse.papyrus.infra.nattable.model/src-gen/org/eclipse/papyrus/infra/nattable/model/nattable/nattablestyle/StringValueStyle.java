/**
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Value Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * String representation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StringValueStyle#getStringValue <em>String Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage#getStringValueStyle()
 * @model
 * @generated
 */
public interface StringValueStyle extends NamedStyle {
	/**
	 * Returns the value of the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Value</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>String Value</em>' attribute.
	 * @see #setStringValue(String)
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage#getStringValueStyle_StringValue()
	 * @model
	 * @generated
	 */
	String getStringValue();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StringValueStyle#getStringValue <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>String Value</em>' attribute.
	 * @see #getStringValue()
	 * @generated
	 */
	void setStringValue(String value);

} // StringValueStyle
