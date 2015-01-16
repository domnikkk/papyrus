/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.portandflows;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A FlowProperty signifies a single flow element that can flow to/from a block. A flow property’s values are either received from or transmitted to an external block. Flow properties are defined directly on blocks or flow specifications that are those specifications which type the flow ports. Flow properties enable item flows across connectors connecting parts of the corresponding block types, either directly (in case of the property is defined on the block) or via flowPorts. For Block, Data Type, and Value Type properties, setting an “out” FlowProperty value of a block usage on one end of a connector will result in assigning the same value of an “in” FlowProperty of a block usage at the other end of the connector, provided the flow properties are matched. Flow properties of type Signal imply sending and/or receiving of a signal usage. An “out” FlowProperty of type Signal means that the owning Block may broadcast the signal via connectors and an “in” FlowProperty means that the owning block is able to receive the Signal.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.portandflows.FlowProperty#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.portandflows.FlowProperty#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.sysml14.portandflows.PortandflowsPackage#getFlowProperty()
 * @model
 * @generated
 */
public interface FlowProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see org.eclipse.papyrus.sysml14.portandflows.PortandflowsPackage#getFlowProperty_Base_Property()
	 * @model ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.portandflows.FlowProperty#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"inout"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.sysml14.portandflows.FlowDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies if the property value is received from an external block (direction=“in”), transmitted to an external Block (direction=“out”) or both (direction=“inout”).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.papyrus.sysml14.portandflows.FlowDirection
	 * @see #setDirection(FlowDirection)
	 * @see org.eclipse.papyrus.sysml14.portandflows.PortandflowsPackage#getFlowProperty_Direction()
	 * @model default="inout" required="true" ordered="false"
	 * @generated
	 */
	FlowDirection getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.portandflows.FlowProperty#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.papyrus.sysml14.portandflows.FlowDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(FlowDirection value);

} // FlowProperty
