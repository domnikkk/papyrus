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
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Style Rule</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.StyleRule#getSelectors <em>Selector</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.StyleRule#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyleRule()
 * @model
 * @generated
 */
public interface StyleRule extends EObject {

	/**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference
	 * list. The list contents are of type {@link org.eclipse.papyrus.dd.dg.StyleSelector}. <!-- begin-user-doc -->
	 * <!-- end-user-doc --> <!-- begin-model-doc --> A set of selectors for
	 * graphical elements to apply the rule to. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Selector</em>' containment reference list.
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyleRule_Selector()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<StyleSelector> getSelectors();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A
	 * style that is applied to graphical elements selected by this rule. <!--
	 * end-model-doc -->
	 *
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(Style)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyleRule_Style()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Style getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.StyleRule#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(Style value);
} // StyleRule
