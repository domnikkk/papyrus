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
package org.eclipse.papyrus.dd.di;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.dd.dc.Point;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Edge</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> Edge is a diagram element that renders as a
 * polyline, connecting a source diagram element to a target diagram element,
 * and is positioned relative to the origin of the diagram. <!-- end-model-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.di.Edge#getSource <em>Source</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.di.Edge#getTarget <em>Target</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.di.Edge#getWaypoint <em>Waypoint</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.di.DIPackage#getEdge()
 * @model abstract="true"
 * @generated
 */
public interface Edge extends DiagramElement {

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference. This feature
	 * is a derived union. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> the edge's source diagram element, i.e. where the
	 * edge starts from. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Source</em>' reference.
	 * @see org.eclipse.papyrus.dd.di.DIPackage#getEdge_Source()
	 * @model required="true" transient="true" changeable="false"
	 *        volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	DiagramElement getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference. This feature
	 * is a derived union. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> the edge's target diagram element, i.e. where the
	 * edge ends at. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Target</em>' reference.
	 * @see org.eclipse.papyrus.dd.di.DIPackage#getEdge_Target()
	 * @model required="true" transient="true" changeable="false"
	 *        volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	DiagramElement getTarget();

	/**
	 * Returns the value of the '<em><b>Waypoint</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.eclipse.papyrus.dd.dc.Point}. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> an optional list of points
	 * relative to the origin of the nesting diagram that specifies the
	 * connected line segments of the edge <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Waypoint</em>' containment reference list.
	 * @see org.eclipse.papyrus.dd.di.DIPackage#getEdge_Waypoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getWaypoint();

} // Edge
