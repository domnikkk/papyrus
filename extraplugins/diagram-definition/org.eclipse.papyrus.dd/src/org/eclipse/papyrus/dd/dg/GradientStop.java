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

import java.awt.Color;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Gradient Stop</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * GradientStop defines a color transition along the distance from a gradient's start to its end offsets.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.GradientStop#getColor <em>Color</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.GradientStop#getOffset <em>Offset</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.GradientStop#getOpacity <em>Opacity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getGradientStop()
 * @model
 * @generated
 */
public interface GradientStop extends EObject {

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the
	 * color to use at this gradient stop. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #isSetColor()
	 * @see #unsetColor()
	 * @see #setColor(Color)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getGradientStop_Color()
	 * @model unsettable="true" dataType="org.eclipse.papyrus.dd.dc.Color"
	 *        ordered="false"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.GradientStop#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Color</em>' attribute.
	 * @see #isSetColor()
	 * @see #unsetColor()
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Unsets the value of the '{@link org.eclipse.papyrus.dd.dg.GradientStop#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isSetColor()
	 * @see #getColor()
	 * @see #setColor(Color)
	 * @generated
	 */
	void unsetColor();

	/**
	 * Returns whether the value of the '{@link org.eclipse.papyrus.dd.dg.GradientStop#getColor <em>Color</em>}' attribute is set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return whether the value of the '<em>Color</em>' attribute is set.
	 * @see #unsetColor()
	 * @see #getColor()
	 * @see #setColor(Color)
	 * @generated
	 */
	boolean isSetColor();

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> an
	 * offset of this gradient stop represented as a percentage of the distance
	 * between the start and end positions of the gradient along the x and y
	 * axes. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #setOffset(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getGradientStop_Offset()
	 * @model unsettable="true" dataType="org.eclipse.papyrus.dd.dc.Real"
	 *        ordered="false"
	 * @generated
	 */
	double getOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.GradientStop#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.papyrus.dd.dg.GradientStop#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isSetOffset()
	 * @see #getOffset()
	 * @see #setOffset(double)
	 * @generated
	 */
	void unsetOffset();

	/**
	 * Returns whether the value of the '{@link org.eclipse.papyrus.dd.dg.GradientStop#getOffset <em>Offset</em>}' attribute is set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return whether the value of the '<em>Offset</em>' attribute is set.
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @see #setOffset(double)
	 * @generated
	 */
	boolean isSetOffset();

	/**
	 * Returns the value of the '<em><b>Opacity</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a real
	 * number (>=0 and<=1) representing the opacity of the color at the stop. A
	 * value of 0 means totally transparent, while a value of 1 means totally
	 * opaque. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Opacity</em>' attribute.
	 * @see #isSetOpacity()
	 * @see #unsetOpacity()
	 * @see #setOpacity(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getGradientStop_Opacity()
	 * @model unsettable="true" dataType="org.eclipse.papyrus.dd.dc.Real"
	 *        ordered="false"
	 * @generated
	 */
	double getOpacity();

	/**
	 * Sets the value of the ' {@link org.eclipse.papyrus.dd.dg.GradientStop#getOpacity
	 * <em>Opacity</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Opacity</em>' attribute.
	 * @see #isSetOpacity()
	 * @see #unsetOpacity()
	 * @see #getOpacity()
	 * @generated
	 */
	void setOpacity(double value);

	/**
	 * Unsets the value of the ' {@link org.eclipse.papyrus.dd.dg.GradientStop#getOpacity
	 * <em>Opacity</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see #isSetOpacity()
	 * @see #getOpacity()
	 * @see #setOpacity(double)
	 * @generated
	 */
	void unsetOpacity();

	/**
	 * Returns whether the value of the '{@link org.eclipse.papyrus.dd.dg.GradientStop#getOpacity <em>Opacity</em>}' attribute is set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return whether the value of the '<em>Opacity</em>' attribute is set.
	 * @see #unsetOpacity()
	 * @see #getOpacity()
	 * @see #setOpacity(double)
	 * @generated
	 */
	boolean isSetOpacity();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the offset must be between 0 and 1.
	 *
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/Ecore/OCL body='offset>=0 and offset<=1'"
	 * @generated
	 */
	boolean validOffset(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the opacity must be between 0 and 1.
	 *
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/Ecore/OCL body='opacity>=0 and opacity<=1'"
	 * @generated
	 */
	boolean validOpacity(DiagnosticChain diagnostics, Map<Object, Object> context);
} // GradientStop
