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

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.dd.dc.Point;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Polygon</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * Polygon is a marked element that defines a closed shape consisting of a sequence of connected straight line segments.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.Polygon#getPoints <em>Point</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getPolygon()
 * @model
 * @generated
 */
public interface Polygon extends MarkedElement {

	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference
	 * list. The list contents are of type {@link org.eclipse.papyrus.dd.dc.Point}. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> a list of 3 or more points
	 * making up the polygon. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Point</em>' containment reference list.
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getPolygon_Point()
	 * @model containment="true" lower="3"
	 * @generated
	 */
	EList<Point> getPoints();
} // Polygon
