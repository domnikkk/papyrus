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

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Group</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Group defines a group of graphical elements that can be styled, clipped and/or transformed together.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.Group#getMembers <em>Member</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Group#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends GraphicalElement {

	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference
	 * list. The list contents are of type {@link org.eclipse.papyrus.dd.dg.GraphicalElement}. It is bidirectional
	 * and its opposite is ' {@link org.eclipse.papyrus.dd.dg.GraphicalElement#getGroup
	 * <em>Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> A list of graphical elements that are members of this
	 * group. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getGroup_Member()
	 * @see org.eclipse.papyrus.dd.dg.GraphicalElement#getGroup
	 * @model opposite="group" containment="true"
	 * @generated
	 */
	EList<GraphicalElement> getMembers();

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Layout</em>' attribute.
	 * @see #setLayout(String)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getGroup_Layout()
	 * @model dataType="org.eclipse.papyrus.dd.dc.String" ordered="false"
	 * @generated
	 */
	String getLayout();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Group#getLayout <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Layout</em>' attribute.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(String value);
} // Group
