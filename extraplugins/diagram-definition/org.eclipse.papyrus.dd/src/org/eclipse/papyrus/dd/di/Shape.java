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
package org.eclipse.papyrus.dd.di;

import org.eclipse.papyrus.dd.dc.Bounds;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Shape</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * Shape is a diagram element with given bounds that is laid out relative to the origin of the diagram
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.di.Shape#getBounds <em>Bounds</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.di.DIPackage#getShape()
 * @model abstract="true"
 * @generated
 */
public interface Shape extends DiagramElement {

	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the optional bounds of the shape relative to the origin of its nesting
	 * plane. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Bounds</em>' containment reference.
	 * @see #setBounds(Bounds)
	 * @see org.eclipse.papyrus.dd.di.DIPackage#getShape_Bounds()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Bounds getBounds();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.di.Shape#getBounds <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Bounds</em>' containment reference.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(Bounds value);
} // Shape
