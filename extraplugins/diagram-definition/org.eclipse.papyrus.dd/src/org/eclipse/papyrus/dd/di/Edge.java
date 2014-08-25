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
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Edge</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Edge is a diagram element that renders as a polyline, connecting a source diagram element to a target diagram element, and is positioned relative
 * to the origin of the diagram.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.di.Edge#getSourceDiagramElement <em>Source Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.di.Edge#getWaypoint <em>Waypoint</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.di.Edge#getTargetDiagramElement <em>Target Diagram Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.dd.di.DIPackage#getEdge()
 * @model abstract="true"
 * @generated
 */
public interface Edge extends DiagramElement {

	/**
	 * Returns the value of the '<em><b>Source Diagram Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.dd.di.DiagramElement#getSourceEdge <em>Source Edge</em>}'.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the edge's source diagram element, i.e. where the edge starts from.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Source Diagram Element</em>' reference.
	 * @see org.eclipse.papyrus.dd.di.DIPackage#getEdge_SourceDiagramElement()
	 * @see org.eclipse.papyrus.dd.di.DiagramElement#getSourceEdge
	 * @model opposite="sourceEdge" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	DiagramElement getSourceDiagramElement();

	/**
	 * Returns the value of the '<em><b>Waypoint</b></em>' containment reference
	 * list. The list contents are of type {@link org.eclipse.papyrus.dd.dc.Point}. <!-- begin-user-doc --> <!--
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

	/**
	 * Returns the value of the '<em><b>Target Diagram Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.dd.di.DiagramElement#getTargetEdge <em>Target Edge</em>}'.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the edge's target diagram element, i.e. where the edge ends at.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Target Diagram Element</em>' reference.
	 * @see org.eclipse.papyrus.dd.di.DIPackage#getEdge_TargetDiagramElement()
	 * @see org.eclipse.papyrus.dd.di.DiagramElement#getTargetEdge
	 * @model opposite="targetEdge" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	DiagramElement getTargetDiagramElement();
} // Edge
