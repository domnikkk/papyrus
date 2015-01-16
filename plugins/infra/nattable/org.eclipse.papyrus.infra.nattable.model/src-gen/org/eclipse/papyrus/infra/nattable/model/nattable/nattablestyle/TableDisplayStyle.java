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
 * A representation of the model object '<em><b>Table Display Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.TableDisplayStyle#getDisplayStyle <em>Display Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage#getTableDisplayStyle()
 * @model
 * @generated
 */
public interface TableDisplayStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Display Style</b></em>' attribute.
	 * The default value is <code>"NORMAL"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DisplayStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Style</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Display Style</em>' attribute.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DisplayStyle
	 * @see #setDisplayStyle(DisplayStyle)
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage#getTableDisplayStyle_DisplayStyle()
	 * @model default="NORMAL" required="true"
	 * @generated
	 */
	DisplayStyle getDisplayStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.TableDisplayStyle#getDisplayStyle <em>Display Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Display Style</em>' attribute.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DisplayStyle
	 * @see #getDisplayStyle()
	 * @generated
	 */
	void setDisplayStyle(DisplayStyle value);

} // TableDisplayStyle
