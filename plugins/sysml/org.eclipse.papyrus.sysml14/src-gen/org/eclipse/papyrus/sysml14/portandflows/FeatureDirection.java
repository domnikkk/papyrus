/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.portandflows;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Feature Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.sysml14.portandflows.PortandflowsPackage#getFeatureDirection()
 * @model
 * @generated
 */
public enum FeatureDirection implements Enumerator {
	/**
	 * The '<em><b>Provided</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVIDED_VALUE
	 * @generated
	 * @ordered
	 */
	PROVIDED(0, "provided", "provided"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIRED(1, "required", "required"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Provided Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVIDED_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	PROVIDED_REQUIRED(2, "providedRequired", "providedRequired"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Provided</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Provided</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROVIDED
	 * @model name="provided"
	 * @generated
	 * @ordered
	 */
	public static final int PROVIDED_VALUE = 0;

	/**
	 * The '<em><b>Required</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Required</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUIRED
	 * @model name="required"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRED_VALUE = 1;

	/**
	 * The '<em><b>Provided Required</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Provided Required</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROVIDED_REQUIRED
	 * @model name="providedRequired"
	 * @generated
	 * @ordered
	 */
	public static final int PROVIDED_REQUIRED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Feature Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FeatureDirection[] VALUES_ARRAY =
		new FeatureDirection[] {
			PROVIDED,
			REQUIRED,
			PROVIDED_REQUIRED,
		};

	/**
	 * A public read-only list of all the '<em><b>Feature Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FeatureDirection> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Feature Direction</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureDirection get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeatureDirection result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feature Direction</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureDirection getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeatureDirection result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feature Direction</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureDirection get(int value) {
		switch (value) {
			case PROVIDED_VALUE: return PROVIDED;
			case REQUIRED_VALUE: return REQUIRED;
			case PROVIDED_REQUIRED_VALUE: return PROVIDED_REQUIRED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FeatureDirection(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FeatureDirection
