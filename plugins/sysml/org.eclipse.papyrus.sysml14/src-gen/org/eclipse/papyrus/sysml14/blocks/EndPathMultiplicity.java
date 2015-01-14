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

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Path Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.EndPathMultiplicity#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.EndPathMultiplicity#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.EndPathMultiplicity#getUpper <em>Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getEndPathMultiplicity()
 * @model
 * @generated
 */
public interface EndPathMultiplicity extends EObject {
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
	 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getEndPathMultiplicity_Base_Property()
	 * @model ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.blocks.EndPathMultiplicity#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives the minimum number of values of the property at the end of the related bindingPath, for each object reached by navigation along the bindingPath from an instance of the block owning the property to which EndPathMultiplicity is applied
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(int)
	 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getEndPathMultiplicity_Lower()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getLower();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.blocks.EndPathMultiplicity#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(int value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives the maximum number of values of the property at the end of the related bindingPath, for each object reached by navigation along the bindingPath from an instance of the block owning the property to which EndPathMultiplicity is applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(int)
	 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getEndPathMultiplicity_Upper()
	 * @model default="-1" dataType="org.eclipse.uml2.types.UnlimitedNatural" ordered="false"
	 * @generated
	 */
	int getUpper();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.blocks.EndPathMultiplicity#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(int value);

} // EndPathMultiplicity
