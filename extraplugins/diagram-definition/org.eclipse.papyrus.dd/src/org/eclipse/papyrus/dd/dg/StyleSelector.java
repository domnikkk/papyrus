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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Style Selector</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.StyleSelector#getKind <em>Kind</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.StyleSelector#getClasses <em>Class</em>}
 * </li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyleSelector()
 * @model
 * @generated
 */
public interface StyleSelector extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute. The literals
	 * are from the enumeration {@link org.eclipse.papyrus.dd.dg.ElementKind}.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * The kind of graphical element to select. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.papyrus.dd.dg.ElementKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(ElementKind)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyleSelector_Kind()
	 * @model unsettable="true" ordered="false"
	 * @generated
	 */
	ElementKind getKind();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.StyleSelector#getKind <em>Kind</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.papyrus.dd.dg.ElementKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ElementKind value);

	/**
	 * Unsets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.StyleSelector#getKind <em>Kind</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(ElementKind)
	 * @generated
	 */
	void unsetKind();

	/**
	 * Returns whether the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.StyleSelector#getKind <em>Kind</em>}'
	 * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(ElementKind)
	 * @generated
	 */
	boolean isSetKind();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute list. The list
	 * contents are of type {@link java.lang.String}. <!-- begin-user-doc -->
	 * <!-- end-user-doc --> <!-- begin-model-doc --> A set of strings
	 * representing classes of graphical elements to select. Selected elements
	 * must have all those classes. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Class</em>' attribute list.
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyleSelector_Class()
	 * @model dataType="org.eclipse.papyrus.dd.dc.String"
	 * @generated
	 */
	EList<String> getClasses();

} // StyleSelector
