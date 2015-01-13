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
 * A representation of the literals of the enumeration '<em><b>Cell Text Alignment</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Alignment of the text inside its cell
 * <!-- end-model-doc -->
 *
 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage#getCellTextAlignment()
 * @model
 * @generated
 */
public enum CellTextAlignment implements Enumerator {
	/**
	 * The '<em><b>TOP LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #TOP_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	TOP_LEFT(1, "TOP_LEFT", "TOP_LEFT"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>TOP CENTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #TOP_CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	TOP_CENTER(2, "TOP_CENTER", "TOP_CENTER"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>TOP RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #TOP_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	TOP_RIGHT(3, "TOP_RIGHT", "TOP_RIGHT"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>MIDDLE LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #MIDDLE_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	MIDDLE_LEFT(4, "MIDDLE_LEFT", "MIDDLE_LEFT"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>MIDDLE CENTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #MIDDLE_CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	MIDDLE_CENTER(5, "MIDDLE_CENTER", "MIDDLE_CENTER"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>MIDDLE RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #MIDDLE_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	MIDDLE_RIGHT(6, "MIDDLE_RIGHT", "MIDDLE_RIGHT"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>BOTTOM LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #BOTTOM_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOM_LEFT(7, "BOTTOM_LEFT", "BOTTOM_LEFT"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>BOTTOM CENTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #BOTTOM_CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOM_CENTER(8, "BOTTOM_CENTER", "BOTTOM_CENTER"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>BOTTOM RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #BOTTOM_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOM_RIGHT(9, "BOTTOM_RIGHT", "BOTTOM_RIGHT"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>TOP LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOP LEFT</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #TOP_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOP_LEFT_VALUE = 1;

	/**
	 * The '<em><b>TOP CENTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOP CENTER</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #TOP_CENTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOP_CENTER_VALUE = 2;

	/**
	 * The '<em><b>TOP RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOP RIGHT</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #TOP_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOP_RIGHT_VALUE = 3;

	/**
	 * The '<em><b>MIDDLE LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MIDDLE LEFT</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #MIDDLE_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIDDLE_LEFT_VALUE = 4;

	/**
	 * The '<em><b>MIDDLE CENTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MIDDLE CENTER</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #MIDDLE_CENTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIDDLE_CENTER_VALUE = 5;

	/**
	 * The '<em><b>MIDDLE RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MIDDLE RIGHT</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #MIDDLE_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIDDLE_RIGHT_VALUE = 6;

	/**
	 * The '<em><b>BOTTOM LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOTTOM LEFT</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #BOTTOM_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM_LEFT_VALUE = 7;

	/**
	 * The '<em><b>BOTTOM CENTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOTTOM CENTER</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #BOTTOM_CENTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM_CENTER_VALUE = 8;

	/**
	 * The '<em><b>BOTTOM RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOTTOM RIGHT</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #BOTTOM_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM_RIGHT_VALUE = 9;

	/**
	 * An array of all the '<em><b>Cell Text Alignment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final CellTextAlignment[] VALUES_ARRAY =
			new CellTextAlignment[] {
					TOP_LEFT,
					TOP_CENTER,
					TOP_RIGHT,
					MIDDLE_LEFT,
					MIDDLE_CENTER,
					MIDDLE_RIGHT,
					BOTTOM_LEFT,
					BOTTOM_CENTER,
					BOTTOM_RIGHT,
			};

	/**
	 * A public read-only list of all the '<em><b>Cell Text Alignment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final List<CellTextAlignment> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cell Text Alignment</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static CellTextAlignment get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CellTextAlignment result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cell Text Alignment</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static CellTextAlignment getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CellTextAlignment result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cell Text Alignment</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static CellTextAlignment get(int value) {
		switch (value) {
		case TOP_LEFT_VALUE:
			return TOP_LEFT;
		case TOP_CENTER_VALUE:
			return TOP_CENTER;
		case TOP_RIGHT_VALUE:
			return TOP_RIGHT;
		case MIDDLE_LEFT_VALUE:
			return MIDDLE_LEFT;
		case MIDDLE_CENTER_VALUE:
			return MIDDLE_CENTER;
		case MIDDLE_RIGHT_VALUE:
			return MIDDLE_RIGHT;
		case BOTTOM_LEFT_VALUE:
			return BOTTOM_LEFT;
		case BOTTOM_CENTER_VALUE:
			return BOTTOM_CENTER;
		case BOTTOM_RIGHT_VALUE:
			return BOTTOM_RIGHT;
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
	private CellTextAlignment(int value, String name, String literal) {
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

} // CellTextAlignment
