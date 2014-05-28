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

import org.eclipse.papyrus.dd.dc.Bounds;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Use</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> Rectangle is a graphical element that defines a
 * rectangular shape with given bounds. A rectangle may be given rounded corners
 * by setting its corner radius. <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.Use#getBounds <em>Bounds</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getUse()
 * @model
 * @generated
 */
public interface Use extends GraphicalElement {
	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the bounds of the rectangle in the x-y coordinate system. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Bounds</em>' containment reference.
	 * @see #setBounds(Bounds)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getUse_Bounds()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Bounds getBounds();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Use#getBounds
	 * <em>Bounds</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Bounds</em>' containment reference.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(Bounds value);

} // Use
