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

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Skew</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Skew is a kind of transform that skews (deforms) a graphical element by given angles in the x-y coordinate system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.dd.dg.Skew#getAngleX <em>Angle X</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.Skew#getAngleY <em>Angle Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getSkew()
 * @model
 * @generated
 */
public interface Skew extends Transform {
	/**
	 * Returns the value of the '<em><b>Angle X</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a real
	 * number representing the angle (in degrees) of skew along the x-axis. Both
	 * positive (clock-wise) and negative (counter-clock-wise) values are
	 * allowed. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Angle X</em>' attribute.
	 * @see #setAngleX(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getSkew_AngleX()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Real" required="true"
	 *        ordered="false"
	 * @generated
	 */
	double getAngleX();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Skew#getAngleX
	 * <em>Angle X</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Angle X</em>' attribute.
	 * @see #getAngleX()
	 * @generated
	 */
	void setAngleX(double value);

	/**
	 * Returns the value of the '<em><b>Angle Y</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a real
	 * number representing the angle (in degrees) of skew along the y-axis. Both
	 * positive (clock-wise) and negative (counter-clock-wise) values are
	 * allowed. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Angle Y</em>' attribute.
	 * @see #setAngleY(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getSkew_AngleY()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Real" required="true"
	 *        ordered="false"
	 * @generated
	 */
	double getAngleY();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Skew#getAngleY
	 * <em>Angle Y</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Angle Y</em>' attribute.
	 * @see #getAngleY()
	 * @generated
	 */
	void setAngleY(double value);

} // Skew
