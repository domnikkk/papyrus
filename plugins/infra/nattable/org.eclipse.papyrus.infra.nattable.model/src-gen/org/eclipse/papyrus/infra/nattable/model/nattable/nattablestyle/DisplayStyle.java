/**
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Display Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage#getDisplayStyle()
 * @model
 * @generated
 */
public enum DisplayStyle implements Enumerator {
	/**
	 * The '<em><b>NORMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL(0, "NORMAL", "NORMAL"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>HIERARCHIC SINGLE TREE COLUMN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #HIERARCHIC_SINGLE_TREE_COLUMN_VALUE
	 * @generated
	 * @ordered
	 */
	HIERARCHIC_SINGLE_TREE_COLUMN(1, "HIERARCHIC_SINGLE_TREE_COLUMN", "HIERARCHIC_SINGLE_TREE_COLUMN"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>HIERARCHIC MULTI TREE COLUMN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #HIERARCHIC_MULTI_TREE_COLUMN_VALUE
	 * @generated
	 * @ordered
	 */
	HIERARCHIC_MULTI_TREE_COLUMN(2, "HIERARCHIC_MULTI_TREE_COLUMN", "HIERARCHIC_MULTI_TREE_COLUMN"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>NORMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORMAL</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #NORMAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_VALUE = 0;

	/**
	 * The '<em><b>HIERARCHIC SINGLE TREE COLUMN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIERARCHIC SINGLE TREE COLUMN</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #HIERARCHIC_SINGLE_TREE_COLUMN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIERARCHIC_SINGLE_TREE_COLUMN_VALUE = 1;

	/**
	 * The '<em><b>HIERARCHIC MULTI TREE COLUMN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIERARCHIC MULTI TREE COLUMN</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #HIERARCHIC_MULTI_TREE_COLUMN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIERARCHIC_MULTI_TREE_COLUMN_VALUE = 2;

	/**
	 * An array of all the '<em><b>Display Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final DisplayStyle[] VALUES_ARRAY =
			new DisplayStyle[] {
					NORMAL,
					HIERARCHIC_SINGLE_TREE_COLUMN,
					HIERARCHIC_MULTI_TREE_COLUMN,
			};

	/**
	 * A public read-only list of all the '<em><b>Display Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final List<DisplayStyle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Display Style</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static DisplayStyle get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DisplayStyle result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Display Style</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static DisplayStyle getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DisplayStyle result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Display Style</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static DisplayStyle get(int value) {
		switch (value) {
		case NORMAL_VALUE:
			return NORMAL;
		case HIERARCHIC_SINGLE_TREE_COLUMN_VALUE:
			return HIERARCHIC_SINGLE_TREE_COLUMN;
		case HIERARCHIC_MULTI_TREE_COLUMN_VALUE:
			return HIERARCHIC_MULTI_TREE_COLUMN;
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
	private DisplayStyle(int value, String name, String literal) {
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
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
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

} // DisplayStyle
