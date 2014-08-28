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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.papyrus.dd.dc.Point;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Circle</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Circle is a graphical element that defines a circular shape with a given center point and a radius.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.Circle#getCenter <em>Center</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Circle#getRadius <em>Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getCircle()
 * @model
 * @generated
 */
public interface Circle extends GraphicalElement {

	/**
	 * Returns the value of the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the center point of the circle in the x-y coordinate system. <!--
	 * end-model-doc -->
	 *
	 * @return the value of the '<em>Center</em>' containment reference.
	 * @see #setCenter(Point)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getCircle_Center()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Point getCenter();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Circle#getCenter <em>Center</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Center</em>' containment reference.
	 * @see #getCenter()
	 * @generated
	 */
	void setCenter(Point value);

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a real number (>=0) that represents the radius of the circle.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getCircle_Radius()
	 * @model default="0" dataType="org.eclipse.papyrus.dd.dc.Real" required="true" ordered="false"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Circle#getRadius
	 * <em>Radius</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * The radius of a circle cannot be negative
	 *
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/Ecore/OCL body='radius >= 0'"
	 * @generated
	 */
	boolean nonNegativeRadius(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Circle
