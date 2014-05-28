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
 * <em><b>Rectangle</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> Rectangle is a graphical element that defines a
 * rectangular shape with given bounds. A rectangle may be given rounded corners
 * by setting its corner radius. <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.Rectangle#getBounds <em>Bounds</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Rectangle#getCornerRadius <em>Corner
 * Radius</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getRectangle()
 * @model
 * @generated
 */
public interface Rectangle extends GraphicalElement {
	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the bounds of the rectangle in the x-y coordinate system. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Bounds</em>' containment reference.
	 * @see #setBounds(Bounds)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getRectangle_Bounds()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Bounds getBounds();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Rectangle#getBounds <em>Bounds</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Bounds</em>' containment reference.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(Bounds value);

	/**
	 * Returns the value of the '<em><b>Corner Radius</b></em>' attribute. The
	 * default value is <code>"0"</code>. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> a radius for the rectangle's
	 * rounded corners. When the radius is 0, the rectangle is drawn with sharp
	 * corners. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Corner Radius</em>' attribute.
	 * @see #setCornerRadius(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getRectangle_CornerRadius()
	 * @model default="0" dataType="org.eclipse.papyrus.dd.dc.Real"
	 *        required="true" ordered="false"
	 * @generated
	 */
	double getCornerRadius();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Rectangle#getCornerRadius
	 * <em>Corner Radius</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Corner Radius</em>' attribute.
	 * @see #getCornerRadius()
	 * @generated
	 */
	void setCornerRadius(double value);

} // Rectangle
