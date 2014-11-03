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
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Line</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * Line is a marked element that defines a shape consisting of one straight line between two points.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.Line#getStart <em>Start</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Line#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends MarkedElement {

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the starting point of the line in the x-y coordinate system. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Point)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getLine_Start()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Point getStart();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Line#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Point value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the ending point of the line in the x-y coordinate system. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Point)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getLine_End()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Point getEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Line#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Point value);
} // Line
