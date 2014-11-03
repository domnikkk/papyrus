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
 * A representation of the literals of the enumeration '<em><b>Uml Label Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getUmlLabelKind()
 * @model
 * @generated
 */
public enum UmlLabelKind implements Enumerator {
	/**
	 * The '<em><b>Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #NAME_VALUE
	 * @generated
	 * @ordered
	 */
	NAME(0, "name", "name"), /**
	 * The '<em><b>End Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #END_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	END_NAME(1, "endName", "endName"), /**
	 * The '<em><b>End Multiplicity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #END_MULTIPLICITY_VALUE
	 * @generated
	 * @ordered
	 */
	END_MULTIPLICITY(2, "endMultiplicity", "endMultiplicity"), /**
	 * The '<em><b>End Modifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #END_MODIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	END_MODIFIER(3, "endModifier", "endModifier"), /**
	 * The '<em><b>Body</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #BODY_VALUE
	 * @generated
	 * @ordered
	 */
	BODY(4, "body", "body");

	/**
	 * The '<em><b>Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Name</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #NAME
	 * @model name="name"
	 * @generated
	 * @ordered
	 */
	public static final int NAME_VALUE = 0;

	/**
	 * The '<em><b>End Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>End Name</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #END_NAME
	 * @model name="endName"
	 * @generated
	 * @ordered
	 */
	public static final int END_NAME_VALUE = 1;

	/**
	 * The '<em><b>End Multiplicity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>End Multiplicity</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #END_MULTIPLICITY
	 * @model name="endMultiplicity"
	 * @generated
	 * @ordered
	 */
	public static final int END_MULTIPLICITY_VALUE = 2;

	/**
	 * The '<em><b>End Modifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>End Modifier</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #END_MODIFIER
	 * @model name="endModifier"
	 * @generated
	 * @ordered
	 */
	public static final int END_MODIFIER_VALUE = 3;

	/**
	 * The '<em><b>Body</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Body</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #BODY
	 * @model name="body"
	 * @generated
	 * @ordered
	 */
	public static final int BODY_VALUE = 4;

	/**
	 * An array of all the '<em><b>Uml Label Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final UmlLabelKind[] VALUES_ARRAY = new UmlLabelKind[]{ NAME, END_NAME, END_MULTIPLICITY, END_MODIFIER, BODY, };

	/**
	 * A public read-only list of all the '<em><b>Uml Label Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<UmlLabelKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Uml Label Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static UmlLabelKind get(String literal) {
		for(int i = 0; i < VALUES_ARRAY.length; ++i) {
			UmlLabelKind result = VALUES_ARRAY[i];
			if(result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Uml Label Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static UmlLabelKind getByName(String name) {
		for(int i = 0; i < VALUES_ARRAY.length; ++i) {
			UmlLabelKind result = VALUES_ARRAY[i];
			if(result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Uml Label Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static UmlLabelKind get(int value) {
		switch(value) {
		case NAME_VALUE:
			return NAME;
		case END_NAME_VALUE:
			return END_NAME;
		case END_MULTIPLICITY_VALUE:
			return END_MULTIPLICITY;
		case END_MODIFIER_VALUE:
			return END_MODIFIER;
		case BODY_VALUE:
			return BODY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private UmlLabelKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
} //UmlLabelKind
