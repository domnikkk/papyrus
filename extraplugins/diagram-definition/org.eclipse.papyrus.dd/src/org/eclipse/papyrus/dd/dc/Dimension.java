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
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Dimension</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dimension specifies two lengths (width and height) along the x and y axes in some x-y coordinate system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dc.Dimension#getWidth <em>Width</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dc.Dimension#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.dd.dc.DCPackage#getDimension()
 * @model
 * @generated
 */
public interface Dimension extends EObject {

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a real
	 * number (>=0) that represents a length along the x-axis. <!--
	 * end-model-doc -->
	 *
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see org.eclipse.papyrus.dd.dc.DCPackage#getDimension_Width()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Real" required="true"
	 *        ordered="false"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dc.Dimension#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Width</em>' attribute.
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.papyrus.dd.dc.Dimension#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isSetWidth()
	 * @see #getWidth()
	 * @see #setWidth(double)
	 * @generated
	 */
	void unsetWidth();

	/**
	 * Returns whether the value of the '{@link org.eclipse.papyrus.dd.dc.Dimension#getWidth <em>Width</em>}' attribute is set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return whether the value of the '<em>Width</em>' attribute is set.
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @see #setWidth(double)
	 * @generated
	 */
	boolean isSetWidth();

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a real
	 * number (>=0) that represents a length along the y-axis. <!--
	 * end-model-doc -->
	 *
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see org.eclipse.papyrus.dd.dc.DCPackage#getDimension_Height()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Real" required="true"
	 *        ordered="false"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dc.Dimension#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Height</em>' attribute.
	 * @see #isSetHeight()
	 * @see #unsetHeight()
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.papyrus.dd.dc.Dimension#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isSetHeight()
	 * @see #getHeight()
	 * @see #setHeight(double)
	 * @generated
	 */
	void unsetHeight();

	/**
	 * Returns whether the value of the '{@link org.eclipse.papyrus.dd.dc.Dimension#getHeight <em>Height</em>}' attribute is set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return whether the value of the '<em>Height</em>' attribute is set.
	 * @see #unsetHeight()
	 * @see #getHeight()
	 * @see #setHeight(double)
	 * @generated
	 */
	boolean isSetHeight();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the width of a dimension cannot be negative
	 *
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='width >=0'"
	 * @generated
	 */
	boolean nonNegativeWidth(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the height of a dimension cannot be negative
	 *
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='height >=0'"
	 * @generated
	 */
	boolean nonNegativeHeight(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Dimension
