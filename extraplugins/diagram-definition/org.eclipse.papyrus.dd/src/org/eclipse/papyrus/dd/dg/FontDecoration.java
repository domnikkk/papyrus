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
package org.eclipse.papyrus.dd.dg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration ' <em><b>Font Decoration</b></em>', and utility methods for working
 * with them.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getFontDecoration()
 * @model
 * @generated
 */
public enum FontDecoration implements Enumerator {
	/**
	 * The '<em><b>Underline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #UNDERLINE_VALUE
	 * @generated
	 * @ordered
	 */
	UNDERLINE(0, "underline", "underline"),
	/**
	 * The '<em><b>Overline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #OVERLINE_VALUE
	 * @generated
	 * @ordered
	 */
	OVERLINE(1, "overline", "overline"),
	/**
	 * The '<em><b>Line Through</b></em>' literal object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #LINE_THROUGH_VALUE
	 * @generated
	 * @ordered
	 */
	LINE_THROUGH(2, "lineThrough", "lineThrough");

	/**
	 * The '<em><b>Underline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Underline</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #UNDERLINE
	 * @model name="underline"
	 * @generated
	 * @ordered
	 */
	public static final int UNDERLINE_VALUE = 0;

	/**
	 * The '<em><b>Overline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Overline</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #OVERLINE
	 * @model name="overline"
	 * @generated
	 * @ordered
	 */
	public static final int OVERLINE_VALUE = 1;

	/**
	 * The '<em><b>Line Through</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Line Through</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #LINE_THROUGH
	 * @model name="lineThrough"
	 * @generated
	 * @ordered
	 */
	public static final int LINE_THROUGH_VALUE = 2;

	/**
	 * An array of all the '<em><b>Font Decoration</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final FontDecoration[] VALUES_ARRAY = new FontDecoration[]{ UNDERLINE, OVERLINE, LINE_THROUGH, };

	/**
	 * A public read-only list of all the '<em><b>Font Decoration</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<FontDecoration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Font Decoration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static FontDecoration get(String literal) {
		for(int i = 0; i < VALUES_ARRAY.length; ++i) {
			FontDecoration result = VALUES_ARRAY[i];
			if(result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Font Decoration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static FontDecoration getByName(String name) {
		for(int i = 0; i < VALUES_ARRAY.length; ++i) {
			FontDecoration result = VALUES_ARRAY[i];
			if(result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Font Decoration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static FontDecoration get(int value) {
		switch(value) {
		case UNDERLINE_VALUE:
			return UNDERLINE;
		case OVERLINE_VALUE:
			return OVERLINE;
		case LINE_THROUGH_VALUE:
			return LINE_THROUGH;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private FontDecoration(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
} // FontDecoration
