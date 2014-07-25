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
package org.eclipse.papyrus.umldi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Uml Compartment Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getUmlCompartmentKind()
 * @model
 * @generated
 */
public enum UmlCompartmentKind implements Enumerator {
	/**
	 * The '<em><b>Attributes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTRIBUTES_VALUE
	 * @generated
	 * @ordered
	 */
	ATTRIBUTES(0, "attributes", "attributes"),

	/**
	 * The '<em><b>Operations</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATIONS_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATIONS(1, "operations", "operations");

	/**
	 * The '<em><b>Attributes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Attributes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATTRIBUTES
	 * @model name="attributes"
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES_VALUE = 0;

	/**
	 * The '<em><b>Operations</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Operations</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATIONS
	 * @model name="operations"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Uml Compartment Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UmlCompartmentKind[] VALUES_ARRAY =
		new UmlCompartmentKind[] {
			ATTRIBUTES,
			OPERATIONS,
		};

	/**
	 * A public read-only list of all the '<em><b>Uml Compartment Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UmlCompartmentKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Uml Compartment Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UmlCompartmentKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UmlCompartmentKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Uml Compartment Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UmlCompartmentKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UmlCompartmentKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Uml Compartment Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UmlCompartmentKind get(int value) {
		switch (value) {
			case ATTRIBUTES_VALUE: return ATTRIBUTES;
			case OPERATIONS_VALUE: return OPERATIONS;
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
	private UmlCompartmentKind(int value, String name, String literal) {
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
	
} //UmlCompartmentKind
