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

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Scale</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> Scale is a kind of transform that scales (resizes) a
 * graphical element by a given factor in the x-y coordinate system. <!--
 * end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.Scale#getFactorX <em>Factor X</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Scale#getFactorY <em>Factor Y</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getScale()
 * @model
 * @generated
 */
public interface Scale extends Transform {
	/**
	 * Returns the value of the '<em><b>Factor X</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a real
	 * number (>=0) representing a scale factor along the x-axis. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Factor X</em>' attribute.
	 * @see #setFactorX(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getScale_FactorX()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Real" required="true"
	 *        ordered="false"
	 * @generated
	 */
	double getFactorX();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Scale#getFactorX
	 * <em>Factor X</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Factor X</em>' attribute.
	 * @see #getFactorX()
	 * @generated
	 */
	void setFactorX(double value);

	/**
	 * Returns the value of the '<em><b>Factor Y</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a real
	 * number(>=0) representing a scale factor along the y-axis. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Factor Y</em>' attribute.
	 * @see #setFactorY(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getScale_FactorY()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Real" required="true"
	 *        ordered="false"
	 * @generated
	 */
	double getFactorY();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Scale#getFactorY
	 * <em>Factor Y</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Factor Y</em>' attribute.
	 * @see #getFactorY()
	 * @generated
	 */
	void setFactorY(double value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * scale factors cannot be negative.
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/Ecore/OCL body='factorX>=0 and factorY>=0'"
	 * @generated
	 */
	boolean nonnegativescale(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // Scale
