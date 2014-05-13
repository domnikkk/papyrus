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
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Elliptical Curve To</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.EllipticalCurveTo#getPoint <em>Point
 * </em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.EllipticalCurveTo#getRadii <em>Radii
 * </em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.EllipticalCurveTo#getRotation <em>
 * Rotation</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.EllipticalCurveTo#isLargeArc <em>Is
 * Large Arc</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.EllipticalCurveTo#isSweep <em>Is Sweep
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getEllipticalCurveTo()
 * @model
 * @generated
 */
public interface EllipticalCurveTo extends PathCommand {
	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a
	 * point to draw an elliptical arc to from the current point in the
	 * coordinate system. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Point</em>' containment reference.
	 * @see #setPoint(Point)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getEllipticalCurveTo_Point()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Point getPoint();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.EllipticalCurveTo#getPoint
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
	 * Returns the value of the '<em><b>Radii</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the two radii of the ellipse from which the arc is created. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Radii</em>' containment reference.
	 * @see #setRadii(Dimension)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getEllipticalCurveTo_Radii()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Dimension getRadii();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.EllipticalCurveTo#getRadii
	 * <em>Radii</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Radii</em>' containment reference.
	 * @see #getRadii()
	 * @generated
	 */
	void setRadii(Dimension value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a real
	 * number representing a rotation (in degrees) of the ellipse from which the
	 * arc is created. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #setRotation(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getEllipticalCurveTo_Rotation()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Real" required="true"
	 *        ordered="false"
	 * @generated
	 */
	double getRotation();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.EllipticalCurveTo#getRotation
	 * <em>Rotation</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Rotation</em>' attribute.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(double value);

	/**
	 * Returns the value of the '<em><b>Is Large Arc</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> whether
	 * the arc sweep is equal to or greater than 180 degrees (the large arc).
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Is Large Arc</em>' attribute.
	 * @see #setIsLargeArc(boolean)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getEllipticalCurveTo_IsLargeArc()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Boolean" required="true"
	 *        ordered="false"
	 * @generated
	 */
	boolean isLargeArc();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.EllipticalCurveTo#isLargeArc
	 * <em>Is Large Arc</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Is Large Arc</em>' attribute.
	 * @see #isLargeArc()
	 * @generated
	 */
	void setIsLargeArc(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Sweep</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> whether
	 * the arc is drawn in a positive-angle direction <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Is Sweep</em>' attribute.
	 * @see #setIsSweep(boolean)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getEllipticalCurveTo_IsSweep()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Boolean" required="true"
	 *        ordered="false"
	 * @generated
	 */
	boolean isSweep();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.EllipticalCurveTo#isSweep
	 * <em>Is Sweep</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Is Sweep</em>' attribute.
	 * @see #isSweep()
	 * @generated
	 */
	void setIsSweep(boolean value);

} // EllipticalCurveTo
