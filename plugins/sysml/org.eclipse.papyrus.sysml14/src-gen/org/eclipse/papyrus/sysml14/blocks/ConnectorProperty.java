/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.blocks;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Connectors can be typed by association classes that are stereotyped by Block (association blocks). These connectors specify instances (links) of the association block that exist due to instantiation of the block owning or inheriting the connector. The value of a connector property on an instance of a block will be exactly those link objects that are instances of the association block typing the connector referred to by the connector property.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.ConnectorProperty#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.ConnectorProperty#getConnector <em>Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getConnectorProperty()
 * @model
 * @generated
 */
public interface ConnectorProperty extends EObject {
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
	 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getConnectorProperty_Base_Property()
	 * @model ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.blocks.ConnectorProperty#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A connector of the block owning the property on which the stereotype is applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #setConnector(Connector)
	 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getConnectorProperty_Connector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.blocks.ConnectorProperty#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

} // ConnectorProperty
