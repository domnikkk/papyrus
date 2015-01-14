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

import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.InstanceSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ValueType defines types of values that may be used to express information about a system, but cannot be identified as the target of any reference. Since a value cannot be identified except by means of the value itself, each such value within a model is independent of any other, unless other forms of constraints are imposed. Value types may be used to type properties, operation parameters, or potentially other elements within SysML. SysML defines ValueType as a stereotype of UML DataType to establish a more neutral term for system values that may never be given a concrete data representation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.ValueType#getBase_DataType <em>Base Data Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.ValueType#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.ValueType#getQuantityKind <em>Quantity Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getValueType()
 * @model
 * @generated
 */
public interface ValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Data Type</em>' reference.
	 * @see #setBase_DataType(DataType)
	 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getValueType_Base_DataType()
	 * @model ordered="false"
	 * @generated
	 */
	DataType getBase_DataType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.blocks.ValueType#getBase_DataType <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Data Type</em>' reference.
	 * @see #getBase_DataType()
	 * @generated
	 */
	void setBase_DataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A quantity in terms of which the magnitudes of other quantities that have the same dimension can be stated, as identified by an instance of the Unit stereotype.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(InstanceSpecification)
	 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getValueType_Unit()
	 * @model ordered="false"
	 * @generated
	 */
	InstanceSpecification getUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.blocks.ValueType#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(InstanceSpecification value);

	/**
	 * Returns the value of the '<em><b>Quantity Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A kind of quantity that may be stated by means of defined units, as identified by an instance of the Dimension stereotype. A value type may optionally specify a dimension without any unit. Such a value has no concrete representation, but may be used to express a value in an abstract form independent of any specific units.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity Kind</em>' reference.
	 * @see #setQuantityKind(InstanceSpecification)
	 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getValueType_QuantityKind()
	 * @model ordered="false"
	 * @generated
	 */
	InstanceSpecification getQuantityKind();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.blocks.ValueType#getQuantityKind <em>Quantity Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Kind</em>' reference.
	 * @see #getQuantityKind()
	 * @generated
	 */
	void setQuantityKind(InstanceSpecification value);

} // ValueType
