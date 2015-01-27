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

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adjunct Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The AdjunctProperty stereotype can be applied to properties to constrain their values to the values of connectors typed by association blocks, call actions, object nodes, variables, or parameters, interaction uses, and submachine states.  The values of connectors typed by association blocks are the instances of the association block typing a connector in the block having the stereotyped property.  The values of call actions are the executions of behaviors invoked by the behavior having the call action and the stereotyped property (see Subclause 11.3.1.1.1 for more about this use of the stereotype).  The values of object nodes are the values of tokens in the object nodes of the behavior having the stereotyped property (see Subclause 11.3.1.4.1 for more about this use of the stereotype).  The values of variables are those assigned by executions of activities that have the stereotyped property.  The values of parameters are those assigned by executions of behaviors that have the stereotyped property.  The keyword «adjunct» before a property name indicates the property is stereotyped by AdjunctProperty.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.AdjunctProperty#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.AdjunctProperty#getPrincipal <em>Principal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getAdjunctProperty()
 * @model
 * @generated
 */
public interface AdjunctProperty extends EObject {
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
	 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getAdjunctProperty_Base_Property()
	 * @model ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.blocks.AdjunctProperty#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Returns the value of the '<em><b>Principal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives the element that determines the values of the property.  Must be a connector, call action, object node, variable, or parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Principal</em>' reference.
	 * @see #setPrincipal(Element)
	 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getAdjunctProperty_Principal()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Element getPrincipal();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.blocks.AdjunctProperty#getPrincipal <em>Principal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Principal</em>' reference.
	 * @see #getPrincipal()
	 * @generated
	 */
	void setPrincipal(Element value);

} // AdjunctProperty
