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
 * <em><b>Quadratic Curve To</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> QuadraticCurveTo is a kind of path command that
 * draws a quadratic b?zier curve from the current point to a new point using a
 * single control point. EllipticalArcTo is a kind of path command that draws an
 * elliptical arc from the current point to a new point in the coordinate
 * system. <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.QuadraticCurveTo#getPoint <em>Point
 * </em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.QuadraticCurveTo#getControl <em>Control
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getQuadraticCurveTo()
 * @model
 * @generated
 */
public interface QuadraticCurveTo extends PathCommand {
	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a
	 * point to draw a quadratic b?zier curve to from the current point in the
	 * coordinate system. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Point</em>' containment reference.
	 * @see #setPoint(Point)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getQuadraticCurveTo_Point()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Point getPoint();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.QuadraticCurveTo#getPoint
	 * <em>Point</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Point</em>' containment reference.
	 * @see #getPoint()
	 * @generated
	 */
	void setPoint(Point value);

	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the control point of the quadratic b?zier curve. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Control</em>' containment reference.
	 * @see #setControl(Point)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getQuadraticCurveTo_Control()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Point getControl();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.QuadraticCurveTo#getControl
	 * <em>Control</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Control</em>' containment reference.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(Point value);

} // QuadraticCurveTo
