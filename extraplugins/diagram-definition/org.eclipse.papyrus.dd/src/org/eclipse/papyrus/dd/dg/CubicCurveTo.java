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
 * <em><b>Cubic Curve To</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> CubicCurveTo is a kind of path command that draws a
 * cubic b?zier curve from the current point to a new point using a start and an
 * end control points. Definitions nests definitions that are commonly
 * referenced in the containing canvas. It can also nest an embedded stylesheet.
 * EllipticalArcTo is a kind of path command that draws an elliptical arc from
 * the current point to a new point in the coordinate system. QuadraticCurveTo
 * is a kind of path command that draws a quadratic b?zier curve from the
 * current point to a new point using a single control point. <!-- end-model-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.CubicCurveTo#getPoint <em>Point</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.CubicCurveTo#getStartControl <em>Start
 * Control</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.CubicCurveTo#getEndControl <em>End
 * Control</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getCubicCurveTo()
 * @model
 * @generated
 */
public interface CubicCurveTo extends PathCommand {
	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a
	 * point to draw a cubic b?zier curve to from the current point in the
	 * coordinate system. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Point</em>' containment reference.
	 * @see #setPoint(Point)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getCubicCurveTo_Point()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Point getPoint();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.CubicCurveTo#getPoint <em>Point</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Point</em>' containment reference.
	 * @see #getPoint()
	 * @generated
	 */
	void setPoint(Point value);

	/**
	 * Returns the value of the '<em><b>Start Control</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> the start control point of the cubic b?zier curve.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Start Control</em>' containment reference.
	 * @see #setStartControl(Point)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getCubicCurveTo_StartControl()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Point getStartControl();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.CubicCurveTo#getStartControl
	 * <em>Start Control</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Start Control</em>' containment
	 *            reference.
	 * @see #getStartControl()
	 * @generated
	 */
	void setStartControl(Point value);

	/**
	 * Returns the value of the '<em><b>End Control</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> the end control point of the cubic b?zier curve. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>End Control</em>' containment reference.
	 * @see #setEndControl(Point)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getCubicCurveTo_EndControl()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Point getEndControl();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.CubicCurveTo#getEndControl
	 * <em>End Control</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>End Control</em>' containment
	 *            reference.
	 * @see #getEndControl()
	 * @generated
	 */
	void setEndControl(Point value);

} // CubicCurveTo
