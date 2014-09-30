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
package org.eclipse.papyrus.dd.dc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Point</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Point specifies an location in some x-y coordinate system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dc.Point#getX <em>X</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dc.Point#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.dd.dc.DCPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends EObject {

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute. The default value
	 * is <code>"0"</code>. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> a real number (<= 0 or >= 0) that represents the
	 * x-coordinate of the point. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see org.eclipse.papyrus.dd.dc.DCPackage#getPoint_X()
	 * @model default="0" dataType="org.eclipse.papyrus.dd.dc.Real"
	 *        required="true" ordered="false"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dc.Point#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *        the new value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.papyrus.dd.dc.Point#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(double)
	 * @generated
	 */
	void unsetX();

	/**
	 * Returns whether the value of the '{@link org.eclipse.papyrus.dd.dc.Point#getX <em>X</em>}' attribute is set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return whether the value of the '<em>X</em>' attribute is set.
	 * @see #unsetX()
	 * @see #getX()
	 * @see #setX(double)
	 * @generated
	 */
	boolean isSetX();

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute. The default value
	 * is <code>"0"</code>. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> a real number (<= 0 or >= 0) that represents the
	 * y-coordinate of the point. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see org.eclipse.papyrus.dd.dc.DCPackage#getPoint_Y()
	 * @model default="0" dataType="org.eclipse.papyrus.dd.dc.Real"
	 *        required="true" ordered="false"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dc.Point#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *        the new value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.papyrus.dd.dc.Point#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isSetY()
	 * @see #getY()
	 * @see #setY(double)
	 * @generated
	 */
	void unsetY();

	/**
	 * Returns whether the value of the '{@link org.eclipse.papyrus.dd.dc.Point#getY <em>Y</em>}' attribute is set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return whether the value of the '<em>Y</em>' attribute is set.
	 * @see #unsetY()
	 * @see #getY()
	 * @see #setY(double)
	 * @generated
	 */
	boolean isSetY();
} // Point
