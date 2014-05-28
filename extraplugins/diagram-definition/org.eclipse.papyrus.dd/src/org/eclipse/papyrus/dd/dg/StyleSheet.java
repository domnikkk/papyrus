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
 * <em><b>Style Sheet</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.StyleSheet#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyleSheet()
 * @model
 * @generated
 */
public interface StyleSheet extends EObject {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.eclipse.papyrus.dd.dg.StyleRule}. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> A list of style rules that
	 * apply to graphical elements. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyleSheet_Rule()
	 * @model containment="true"
	 * @generated
	 */
	EList<StyleRule> getRule();

} // StyleSheet
