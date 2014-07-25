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
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Linear Gradient</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LinearGradient is a kind of gradient that fills a graphical element by smoothly changing color values along a vector.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.dd.dg.LinearGradient#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.LinearGradient#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getLinearGradient()
 * @model
 * @generated
 */
public interface LinearGradient extends Gradient {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a
	 * starting point for the linear gradient expressed as a percentage along
	 * the x and y axes. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Point)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getLinearGradient_Start()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Point getStart();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.LinearGradient#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Point value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> an
	 * ending point for the linear gradient expressed as a percentage along the
	 * x and y axes. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Point)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getLinearGradient_End()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Point getEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.LinearGradient#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Point value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * all the components of the gradient vector must be between 0 and 1.
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/Ecore/OCL body='start.x>=0 and start.x<=1 and end.x>=0 and end.x<=1 and start.y>=0 and start.y<=1 and end.y>=0 and end.y<=1'"
	 * @generated
	 */
	boolean validGradientVector(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // LinearGradient
