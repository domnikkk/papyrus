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
package org.eclipse.papyrus.dd.dg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Style Selector</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.StyleSelector#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.StyleSelector#getKeyword <em>Keyword
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyleSelector()
 * @model
 * @generated
 */
public interface StyleSelector extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A
	 * non-abstract type that is a subtype of GraphicalElement. Elements having
	 * this type are selected. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EClass)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyleSelector_Type()
	 * @model ordered="false"
	 * @generated
	 */
	EClass getType();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.StyleSelector#getType <em>Type</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EClass value);

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' attribute list. The
	 * list contents are of type {@link java.lang.String}. <!-- begin-user-doc
	 * --> <!-- end-user-doc --> <!-- begin-model-doc --> A list of strings
	 * representing keywords of graphical elements. Elements having these
	 * keywords are selected. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Keyword</em>' attribute list.
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyleSelector_Keyword()
	 * @model dataType="org.eclipse.papyrus.dd.dc.String"
	 * @generated
	 */
	EList<String> getKeyword();

} // StyleSelector
