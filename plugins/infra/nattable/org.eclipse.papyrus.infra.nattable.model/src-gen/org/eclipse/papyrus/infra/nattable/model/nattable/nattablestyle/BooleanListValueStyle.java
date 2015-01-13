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
 * A representation of the model object '<em><b>Boolean List Value Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Boolean lists representation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanListValueStyle#getBooleanListValue <em>Boolean List Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage#getBooleanListValueStyle()
 * @model
 * @generated
 */
public interface BooleanListValueStyle extends NamedStyle {
	/**
	 * Returns the value of the '<em><b>Boolean List Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean List Value</em>' attribute list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Boolean List Value</em>' attribute list.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage#getBooleanListValueStyle_BooleanListValue()
	 * @model unique="false"
	 * @generated
	 */
	EList<Boolean> getBooleanListValue();

} // BooleanListValueStyle
