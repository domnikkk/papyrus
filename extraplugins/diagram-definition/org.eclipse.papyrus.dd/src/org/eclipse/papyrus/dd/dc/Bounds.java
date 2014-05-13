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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Bounds</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> Bounds specifies a rectangular area in some x-y
 * coordinate system that is defined by a location (x and y) and a size (width
 * and height). <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dc.Bounds#getX <em>X</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dc.Bounds#getY <em>Y</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dc.Bounds#getWidth <em>Width</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dc.Bounds#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.dc.DCPackage#getBounds()
 * @model
 * @generated
 */
public interface Bounds extends EObject {

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute. The default value
	 * is <code>"0"</code>. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> a real number (>=0 or <=0) that represents the
	 * x-coordinate of the bounds <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see org.eclipse.papyrus.dd.dc.DCPackage#getBounds_X()
	 * @model default="0" dataType="org.eclipse.papyrus.dd.dc.Real"
	 *        required="true" ordered="false"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dc.Bounds#getX
	 * <em>X</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute. The default value
	 * is <code>"0"</code>. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> a real number (>=0 or <=0) that represents the
	 * y-coordinate of the bounds <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see org.eclipse.papyrus.dd.dc.DCPackage#getBounds_Y()
	 * @model default="0" dataType="org.eclipse.papyrus.dd.dc.Real"
	 *        required="true" ordered="false"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dc.Bounds#getY
	 * <em>Y</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a real
	 * number (>=0) that represents the width of the bounds <!-- end-model-doc
	 * -->
	 * 
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see org.eclipse.papyrus.dd.dc.DCPackage#getBounds_Width()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Real" required="true"
	 *        ordered="false"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dc.Bounds#getWidth
	 * <em>Width</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a real
	 * number (>=0) that represents the height of the bounds <!-- end-model-doc
	 * -->
	 * 
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see org.eclipse.papyrus.dd.dc.DCPackage#getBounds_Height()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Real" required="true"
	 *        ordered="false"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dc.Bounds#getHeight
	 * <em>Height</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the width and height of bounds cannot be negative
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/Ecore/OCL body='width >= 0 and height >=0'"
	 * @generated
	 */
	boolean nonNegativeSize(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // Bounds
