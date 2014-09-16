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
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Radial Gradient</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * RadialGradient is a kind of gradient that fills a graphical element by smoothly changing color values in a circle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.RadialGradient#getCenter <em>Center</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.RadialGradient#getFocus <em>Focus</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.RadialGradient#getRadius <em>Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getRadialGradient()
 * @model
 * @generated
 */
public interface RadialGradient extends Gradient {

	/**
	 * Returns the value of the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a
	 * center point for the radial gradient expressed as a percentage along the
	 * x and y axes. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Center</em>' containment reference.
	 * @see #setCenter(Point)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getRadialGradient_Center()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Point getCenter();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.RadialGradient#getCenter <em>Center</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param value
	 *        the new value of the '<em>Center</em>' containment reference.
	 * @see #getCenter()
	 * @generated
	 */
	void setCenter(Point value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a
	 * focus point for the radial gradient expressed as a percentage along the x
	 * and y axes. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Focus</em>' containment reference.
	 * @see #setFocus(Point)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getRadialGradient_Focus()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Point getFocus();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.RadialGradient#getFocus <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *        the new value of the '<em>Focus</em>' containment reference.
	 * @see #getFocus()
	 * @generated
	 */
	void setFocus(Point value);

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute. The default
	 * value is <code>"0.5"</code>. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> a real number (>=0 and >=1) representing a
	 * ratio of the graphical element's size that is the radius of the gradient.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getRadialGradient_Radius()
	 * @model default="0.5" dataType="org.eclipse.papyrus.dd.dc.Real"
	 *        required="true" ordered="false"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the ' {@link org.eclipse.papyrus.dd.dg.RadialGradient#getRadius
	 * <em>Radius</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *        the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the center point coordinates must be between 0 and 1
	 *
	 * @param diagnostics
	 *        The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *        The cache of context-specific information. <!-- end-model-doc
	 *        -->
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/Ecore/OCL body='centerX>=0 and centerX<=1 and centerY>=0 and centerY<=1'"
	 * @generated
	 */
	boolean validCenterPoint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the focus point coordinates must be between 0 and 1
	 *
	 * @param diagnostics
	 *        The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *        The cache of context-specific information. <!-- end-model-doc
	 *        -->
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/Ecore/OCL body='focusX>=0 and focusX<=1 and focusY>=0 and focusY<=1'"
	 * @generated
	 */
	boolean validFocusPoint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the radius must be between 0 and 1
	 *
	 * @param diagnostics
	 *        The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *        The cache of context-specific information. <!-- end-model-doc
	 *        -->
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/Ecore/OCL body='radius>=0 and radius<=1'"
	 * @generated
	 */
	boolean validRadius(DiagnosticChain diagnostics, Map<Object, Object> context);
} // RadialGradient
