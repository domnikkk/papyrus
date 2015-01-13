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
 * A representation of the model object '<em><b>Cell Text Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Text representation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextStyle#getAlignment <em>Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage#getCellTextStyle()
 * @model
 * @generated
 */
public interface CellTextStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The default value is <code>"MIDDLE_LEFT"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextAlignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignment</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextAlignment
	 * @see #setAlignment(CellTextAlignment)
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage#getCellTextStyle_Alignment()
	 * @model default="MIDDLE_LEFT"
	 * @generated
	 */
	CellTextAlignment getAlignment();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextStyle#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextAlignment
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(CellTextAlignment value);

} // CellTextStyle
