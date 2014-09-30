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
package org.eclipse.papyrus.dd.dc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration ' <em><b>Known Color</b></em>', and utility methods for working with
 * them. <!--
 * end-user-doc --> <!-- begin-model-doc --> KnownColor is an enumeration of 17
 * known colors. <!-- end-model-doc -->
 *
 * @see org.eclipse.papyrus.dd.dc.DCPackage#getKnownColor()
 * @model
 * @generated
 */
public enum KnownColor implements Enumerator {
	/**
	 * The '<em><b>Maroon</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #MAROON_VALUE
	 * @generated
	 * @ordered
	 */
	MAROON(0, "maroon", "#800000"),
	/**
	 * The '<em><b>Red</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #RED_VALUE
	 * @generated
	 * @ordered
	 */
	RED(1, "red", "#FF0000"),
	/**
	 * The '<em><b>Orange</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #ORANGE_VALUE
	 * @generated
	 * @ordered
	 */
	ORANGE(2, "orange", "#FFA500"),
	/**
	 * The '<em><b>Yellow</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #YELLOW_VALUE
	 * @generated
	 * @ordered
	 */
	YELLOW(3, "yellow", "#FFFF00"),
	/**
	 * The '<em><b>Olive</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #OLIVE_VALUE
	 * @generated
	 * @ordered
	 */
	OLIVE(4, "olive", "#808000"),
	/**
	 * The '<em><b>Purple</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #PURPLE_VALUE
	 * @generated
	 * @ordered
	 */
	PURPLE(5, "purple", "#800080"),
	/**
	 * The '<em><b>Fuchsia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #FUCHSIA_VALUE
	 * @generated
	 * @ordered
	 */
	FUCHSIA(6, "fuchsia", "#FF00FF"),
	/**
	 * The '<em><b>White</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #WHITE_VALUE
	 * @generated
	 * @ordered
	 */
	WHITE(7, "white", "#FFFFFF"),
	/**
	 * The '<em><b>Lime</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #LIME_VALUE
	 * @generated
	 * @ordered
	 */
	LIME(8, "lime", "#00FF00"),
	/**
	 * The '<em><b>Green</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #GREEN_VALUE
	 * @generated
	 * @ordered
	 */
	GREEN(9, "green", "#008000"),
	/**
	 * The '<em><b>Navy</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #NAVY_VALUE
	 * @generated
	 * @ordered
	 */
	NAVY(10, "navy", "#000080"),
	/**
	 * The '<em><b>Blue</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #BLUE_VALUE
	 * @generated
	 * @ordered
	 */
	BLUE(11, "blue", "#0000FF"),
	/**
	 * The '<em><b>Aqua</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #AQUA_VALUE
	 * @generated
	 * @ordered
	 */
	AQUA(12, "aqua", "#00FFFF"),
	/**
	 * The '<em><b>Teal</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #TEAL_VALUE
	 * @generated
	 * @ordered
	 */
	TEAL(13, "teal", "#008080"),
	/**
	 * The '<em><b>Black</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #BLACK_VALUE
	 * @generated
	 * @ordered
	 */
	BLACK(14, "black", "#000000"),
	/**
	 * The '<em><b>Silver</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #SILVER_VALUE
	 * @generated
	 * @ordered
	 */
	SILVER(15, "silver", "#C0C0C0"),
	/**
	 * The '<em><b>Gray</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #GRAY_VALUE
	 * @generated
	 * @ordered
	 */
	GRAY(16, "gray", "#808080");

	/**
	 * The '<em><b>Maroon</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> a color with a value of #800000
	 * <!-- end-model-doc -->
	 *
	 * @see #MAROON
	 * @model name="maroon" literal="#800000"
	 * @generated
	 * @ordered
	 */
	public static final int MAROON_VALUE = 0;

	/**
	 * The '<em><b>Red</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> a color with a value of #FF0000
	 * <!-- end-model-doc -->
	 *
	 * @see #RED
	 * @model name="red" literal="#FF0000"
	 * @generated
	 * @ordered
	 */
	public static final int RED_VALUE = 1;

	/**
	 * The '<em><b>Orange</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> a color with a value of #FFA500
	 * <!-- end-model-doc -->
	 *
	 * @see #ORANGE
	 * @model name="orange" literal="#FFA500"
	 * @generated
	 * @ordered
	 */
	public static final int ORANGE_VALUE = 2;

	/**
	 * The '<em><b>Yellow</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> a color with a value of #FFFF00
	 * <!-- end-model-doc -->
	 *
	 * @see #YELLOW
	 * @model name="yellow" literal="#FFFF00"
	 * @generated
	 * @ordered
	 */
	public static final int YELLOW_VALUE = 3;

	/**
	 * The '<em><b>Olive</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> a color with a value of #808000
	 * <!-- end-model-doc -->
	 *
	 * @see #OLIVE
	 * @model name="olive" literal="#808000"
	 * @generated
	 * @ordered
	 */
	public static final int OLIVE_VALUE = 4;

	/**
	 * The '<em><b>Purple</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> a color with a value of #800080
	 * <!-- end-model-doc -->
	 *
	 * @see #PURPLE
	 * @model name="purple" literal="#800080"
	 * @generated
	 * @ordered
	 */
	public static final int PURPLE_VALUE = 5;

	/**
	 * The '<em><b>Fuchsia</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> a color with a value of #FF00FF
	 * <!-- end-model-doc -->
	 *
	 * @see #FUCHSIA
	 * @model name="fuchsia" literal="#FF00FF"
	 * @generated
	 * @ordered
	 */
	public static final int FUCHSIA_VALUE = 6;

	/**
	 * The '<em><b>White</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> a color with a value of #FFFFFF
	 * <!-- end-model-doc -->
	 *
	 * @see #WHITE
	 * @model name="white" literal="#FFFFFF"
	 * @generated
	 * @ordered
	 */
	public static final int WHITE_VALUE = 7;

	/**
	 * The '<em><b>Lime</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> a color with a value of #00FF00
	 * <!-- end-model-doc -->
	 *
	 * @see #LIME
	 * @model name="lime" literal="#00FF00"
	 * @generated
	 * @ordered
	 */
	public static final int LIME_VALUE = 8;

	/**
	 * The '<em><b>Green</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> a color with a value of #008000
	 * <!-- end-model-doc -->
	 *
	 * @see #GREEN
	 * @model name="green" literal="#008000"
	 * @generated
	 * @ordered
	 */
	public static final int GREEN_VALUE = 9;

	/**
	 * The '<em><b>Navy</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> a color with a value of #000080
	 * <!-- end-model-doc -->
	 *
	 * @see #NAVY
	 * @model name="navy" literal="#000080"
	 * @generated
	 * @ordered
	 */
	public static final int NAVY_VALUE = 10;

	/**
	 * The '<em><b>Blue</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> a color with a value of #0000FF
	 * <!-- end-model-doc -->
	 *
	 * @see #BLUE
	 * @model name="blue" literal="#0000FF"
	 * @generated
	 * @ordered
	 */
	public static final int BLUE_VALUE = 11;

	/**
	 * The '<em><b>Aqua</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> a color with a value of #00FFFF
	 * <!-- end-model-doc -->
	 *
	 * @see #AQUA
	 * @model name="aqua" literal="#00FFFF"
	 * @generated
	 * @ordered
	 */
	public static final int AQUA_VALUE = 12;

	/**
	 * The '<em><b>Teal</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> a color with a value of #008080
	 * <!-- end-model-doc -->
	 *
	 * @see #TEAL
	 * @model name="teal" literal="#008080"
	 * @generated
	 * @ordered
	 */
	public static final int TEAL_VALUE = 13;

	/**
	 * The '<em><b>Black</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> a color with a value of #000000
	 * <!-- end-model-doc -->
	 *
	 * @see #BLACK
	 * @model name="black" literal="#000000"
	 * @generated
	 * @ordered
	 */
	public static final int BLACK_VALUE = 14;

	/**
	 * The '<em><b>Silver</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> a color with a value of #C0C0C0
	 * <!-- end-model-doc -->
	 *
	 * @see #SILVER
	 * @model name="silver" literal="#C0C0C0"
	 * @generated
	 * @ordered
	 */
	public static final int SILVER_VALUE = 15;

	/**
	 * The '<em><b>Gray</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> a color with a value of #808080
	 * <!-- end-model-doc -->
	 *
	 * @see #GRAY
	 * @model name="gray" literal="#808080"
	 * @generated
	 * @ordered
	 */
	public static final int GRAY_VALUE = 16;

	/**
	 * An array of all the '<em><b>Known Color</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final KnownColor[] VALUES_ARRAY = new KnownColor[]{ MAROON, RED, ORANGE, YELLOW, OLIVE, PURPLE, FUCHSIA, WHITE, LIME, GREEN, NAVY, BLUE, AQUA, TEAL, BLACK, SILVER, GRAY, };

	/**
	 * A public read-only list of all the '<em><b>Known Color</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final List<KnownColor> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Known Color</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static KnownColor get(String literal) {
		for(int i = 0; i < VALUES_ARRAY.length; ++i) {
			KnownColor result = VALUES_ARRAY[i];
			if(result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Known Color</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static KnownColor getByName(String name) {
		for(int i = 0; i < VALUES_ARRAY.length; ++i) {
			KnownColor result = VALUES_ARRAY[i];
			if(result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Known Color</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static KnownColor get(int value) {
		switch(value) {
		case MAROON_VALUE:
			return MAROON;
		case RED_VALUE:
			return RED;
		case ORANGE_VALUE:
			return ORANGE;
		case YELLOW_VALUE:
			return YELLOW;
		case OLIVE_VALUE:
			return OLIVE;
		case PURPLE_VALUE:
			return PURPLE;
		case FUCHSIA_VALUE:
			return FUCHSIA;
		case WHITE_VALUE:
			return WHITE;
		case LIME_VALUE:
			return LIME;
		case GREEN_VALUE:
			return GREEN;
		case NAVY_VALUE:
			return NAVY;
		case BLUE_VALUE:
			return BLUE;
		case AQUA_VALUE:
			return AQUA;
		case TEAL_VALUE:
			return TEAL;
		case BLACK_VALUE:
			return BLACK;
		case SILVER_VALUE:
			return SILVER;
		case GRAY_VALUE:
			return GRAY;
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
	private KnownColor(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
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
} // KnownColor
