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
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Definitions</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <<<<<<< HEAD
 * <li>{@link org.eclipse.papyrus.dd.dg.Definitions#getDefinitions <em>Definition</em>}</li>
 * =======
 * <li>{@link org.eclipse.papyrus.dd.dg.Definitions#getDefnitions <em>Defnition</em>}</li>
 * >>>>>>> branch 'master' of ssh://melaasar6nr@git.eclipse.org:29418/papyrus/org.eclipse.papyrus
 * <li>{@link org.eclipse.papyrus.dd.dg.Definitions#getStyleSheet <em>Style Sheet</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getDefinitions()
 * @model
 * @generated
 */
public interface Definitions extends EObject {

	/**
	 * <<<<<<< HEAD
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.dd.dg.Definition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of clip paths that are referenced by graphical elements in the containing canvas.
	 * <!-- end-model-doc -->
	 * =======
	 * Returns the value of the '<em><b>Defnition</b></em>' containment
	 * reference list. The list contents are of type {@link org.eclipse.papyrus.dd.dg.Definition}. <!-- begin-user-doc -->
	 * <!-- end-user-doc --> <!-- begin-model-doc --> A set of clip paths that
	 * are referenced by graphical elements in the containing canvas. <!--
	 * end-model-doc -->
	 * >>>>>>> branch 'master' of ssh://melaasar6nr@git.eclipse.org:29418/papyrus/org.eclipse.papyrus
	 *
	 * @return the value of the '<em>Definition</em>' containment reference list.
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getDefinitions_Definition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Definition> getDefinitions();

	/**
	 * Returns the value of the '<em><b>Style Sheet</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> An optional embdded style sheet that that apply to
	 * graphical elements in the containing canvas. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Style Sheet</em>' containment reference.
	 * @see #setStyleSheet(StyleSheet)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getDefinitions_StyleSheet()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	StyleSheet getStyleSheet();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Definitions#getStyleSheet <em>Style Sheet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *        the new value of the '<em>Style Sheet</em>' containment reference.
	 * @see #getStyleSheet()
	 * @generated
	 */
	void setStyleSheet(StyleSheet value);
} // Definitions
