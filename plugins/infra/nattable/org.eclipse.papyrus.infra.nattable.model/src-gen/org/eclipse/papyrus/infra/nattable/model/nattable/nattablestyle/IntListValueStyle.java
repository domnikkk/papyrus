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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int List Value Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Int lists representation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntListValueStyle#getIntListValue <em>Int List Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage#getIntListValueStyle()
 * @model
 * @generated
 */
public interface IntListValueStyle extends NamedStyle {
	/**
	 * Returns the value of the '<em><b>Int List Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int List Value</em>' attribute list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Int List Value</em>' attribute list.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage#getIntListValueStyle_IntListValue()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getIntListValue();

} // IntListValueStyle
