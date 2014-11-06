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

import java.awt.Color;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Root Canvas</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * RootCanvas is a kind of canvas that represents the root of containment for all graphical elements that render together.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.RootCanvas#getBackgroundColor <em>Background Color</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.RootCanvas#getDefinitions <em>Definitions</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.RootCanvas#getExternalStyleSheets <em>External Style Sheet</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.RootCanvas#getScripts <em>Script</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getRootCanvas()
 * @model
 * @generated
 */
public interface RootCanvas extends Canvas {

	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> An
	 * optional paint for the background of the canvas. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Background Color</em>' attribute.
	 * @see #isSetBackgroundColor()
	 * @see #unsetBackgroundColor()
	 * @see #setBackgroundColor(Color)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getRootCanvas_BackgroundColor()
	 * @model unsettable="true" dataType="org.eclipse.papyrus.dd.dc.Color"
	 *        ordered="false"
	 * @generated
	 */
	Color getBackgroundColor();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.RootCanvas#getBackgroundColor <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Background Color</em>' attribute.
	 * @see #isSetBackgroundColor()
	 * @see #unsetBackgroundColor()
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(Color value);

	/**
	 * Unsets the value of the '{@link org.eclipse.papyrus.dd.dg.RootCanvas#getBackgroundColor <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isSetBackgroundColor()
	 * @see #getBackgroundColor()
	 * @see #setBackgroundColor(Color)
	 * @generated
	 */
	void unsetBackgroundColor();

	/**
	 * Returns whether the value of the '{@link org.eclipse.papyrus.dd.dg.RootCanvas#getBackgroundColor <em>Background Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Background Color</em>' attribute is set.
	 * @see #unsetBackgroundColor()
	 * @see #getBackgroundColor()
	 * @see #setBackgroundColor(Color)
	 * @generated
	 */
	boolean isSetBackgroundColor();

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> An optional definitions element to hold objects
	 * commonly referenced by the canvas. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Definitions</em>' containment reference.
	 * @see #setDefinitions(Definitions)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getRootCanvas_Definitions()
	 * @model containment="true"
	 * @generated
	 */
	Definitions getDefinitions();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.RootCanvas#getDefinitions <em>Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Definitions</em>' containment reference.
	 * @see #getDefinitions()
	 * @generated
	 */
	void setDefinitions(Definitions value);

	/**
	 * Returns the value of the '<em><b>External Style Sheet</b></em>' reference
	 * list. The list contents are of type {@link org.eclipse.papyrus.dd.dg.StyleSheet}. <!-- begin-user-doc -->
	 * <!-- end-user-doc --> <!-- begin-model-doc --> A list of external style
	 * sheets that are imported by the canvas. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>External Style Sheet</em>' reference list.
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getRootCanvas_ExternalStyleSheet()
	 * @model
	 * @generated
	 */
	EList<StyleSheet> getExternalStyleSheets();

	/**
	 * Returns the value of the '<em><b>Script</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' attribute list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Script</em>' attribute list.
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getRootCanvas_Script()
	 * @model dataType="org.eclipse.papyrus.dd.dc.String" ordered="false"
	 * @generated
	 */
	EList<String> getScripts();
} // RootCanvas
