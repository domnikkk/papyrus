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

import org.eclipse.papyrus.dd.dc.Point;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Rotate</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Rotate is a kind of transform that rotates a graphical element by a given angle about a given center point in the x-y coordinate system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.dd.dg.Rotate#getAngle <em>Angle</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.Rotate#getCenter <em>Center</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getRotate()
 * @model
 * @generated
 */
public interface Rotate extends Transform {
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a real
	 * number representing the angle (in degrees) of rotation. Both positive
	 * (clock-wise) and negative (counter-clock-wise) values are allowed. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getRotate_Angle()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Real" required="true"
	 *        ordered="false"
	 * @generated
	 */
	double getAngle();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Rotate#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(double value);

	/**
	 * Returns the value of the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a
	 * point in the x-y coordinate system about which the rotation is performed.
	 * If the point is not specified, it is assumed to be the origin of the x-y
	 * coordinate system. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Center</em>' containment reference.
	 * @see #setCenter(Point)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getRotate_Center()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Point getCenter();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Rotate#getCenter <em>Center</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Center</em>' containment reference.
	 * @see #getCenter()
	 * @generated
	 */
	void setCenter(Point value);

} // Rotate
