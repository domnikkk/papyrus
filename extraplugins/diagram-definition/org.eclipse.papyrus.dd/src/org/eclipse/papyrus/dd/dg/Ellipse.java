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

import org.eclipse.papyrus.dd.dc.Dimension;
import org.eclipse.papyrus.dd.dc.Point;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Ellipse</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * Ellipse is a graphical element that defines an elliptical shape with a given center point and two radii on the x and y axes.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.Ellipse#getCenter <em>Center</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Ellipse#getRadii <em>Radii</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getEllipse()
 * @model
 * @generated
 */
public interface Ellipse extends GraphicalElement {

	/**
	 * Returns the value of the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the center point of the ellipse in the x-y coordinate system. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Center</em>' containment reference.
	 * @see #setCenter(Point)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getEllipse_Center()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Point getCenter();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Ellipse#getCenter <em>Center</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Center</em>' containment reference.
	 * @see #getCenter()
	 * @generated
	 */
	void setCenter(Point value);

	/**
	 * Returns the value of the '<em><b>Radii</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a
	 * dimension that specifies the two radii of the ellipse (a width along the
	 * x-axis and a height along the y-axis) <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Radii</em>' containment reference.
	 * @see #setRadii(Dimension)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getEllipse_Radii()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Dimension getRadii();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Ellipse#getRadii <em>Radii</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Radii</em>' containment reference.
	 * @see #getRadii()
	 * @generated
	 */
	void setRadii(Dimension value);
} // Ellipse
