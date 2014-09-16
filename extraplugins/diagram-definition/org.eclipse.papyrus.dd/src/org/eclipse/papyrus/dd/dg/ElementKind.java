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
 * <!-- begin-user-doc --> A representation of the literals of the enumeration ' <em><b>Element Kind</b></em>', and utility methods for working with
 * them.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getElementKind()
 * @model
 * @generated
 */
public enum ElementKind implements Enumerator {
	/**
	 * The '<em><b>Canvas</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #CANVAS_VALUE
	 * @generated
	 * @ordered
	 */
	CANVAS(0, "canvas", "canvas"),
	/**
	 * The '<em><b>Circle</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #CIRCLE_VALUE
	 * @generated
	 * @ordered
	 */
	CIRCLE(1, "circle", "circle"),
	/**
	 * The '<em><b>Clip Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #CLIP_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	CLIP_PATH(2, "clipPath", "clipPath"),
	/**
	 * The '<em><b>Ellipse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #ELLIPSE_VALUE
	 * @generated
	 * @ordered
	 */
	ELLIPSE(3, "ellipse", "ellipse"),
	/**
	 * The '<em><b>Group</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	GROUP(4, "group", "group"),
	/**
	 * The '<em><b>Image</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE(5, "image", "image"),
	/**
	 * The '<em><b>Line</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #LINE_VALUE
	 * @generated
	 * @ordered
	 */
	LINE(6, "line", "line"),
	/**
	 * The '<em><b>Marker</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #MARKER_VALUE
	 * @generated
	 * @ordered
	 */
	MARKER(7, "marker", "marker"),
	/**
	 * The '<em><b>Path</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #PATH_VALUE
	 * @generated
	 * @ordered
	 */
	PATH(8, "path", "path"),
	/**
	 * The '<em><b>Polygon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #POLYGON_VALUE
	 * @generated
	 * @ordered
	 */
	POLYGON(9, "polygon", "polygon"),
	/**
	 * The '<em><b>Polyline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #POLYLINE_VALUE
	 * @generated
	 * @ordered
	 */
	POLYLINE(10, "polyline", "polyline"),
	/**
	 * The '<em><b>Rectangle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #RECTANGLE_VALUE
	 * @generated
	 * @ordered
	 */
	RECTANGLE(11, "rectangle", "rectangle"),
	/**
	 * The '<em><b>Text</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(12, "text", "text"),
	/**
	 * The '<em><b>Use</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #USE_VALUE
	 * @generated
	 * @ordered
	 */
	USE(13, "use", "use");

	/**
	 * The '<em><b>Canvas</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Canvas</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #CANVAS
	 * @model name="canvas"
	 * @generated
	 * @ordered
	 */
	public static final int CANVAS_VALUE = 0;

	/**
	 * The '<em><b>Circle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Circle</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #CIRCLE
	 * @model name="circle"
	 * @generated
	 * @ordered
	 */
	public static final int CIRCLE_VALUE = 1;

	/**
	 * The '<em><b>Clip Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clip Path</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #CLIP_PATH
	 * @model name="clipPath"
	 * @generated
	 * @ordered
	 */
	public static final int CLIP_PATH_VALUE = 2;

	/**
	 * The '<em><b>Ellipse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ellipse</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #ELLIPSE
	 * @model name="ellipse"
	 * @generated
	 * @ordered
	 */
	public static final int ELLIPSE_VALUE = 3;

	/**
	 * The '<em><b>Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Group</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #GROUP
	 * @model name="group"
	 * @generated
	 * @ordered
	 */
	public static final int GROUP_VALUE = 4;

	/**
	 * The '<em><b>Image</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Image</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #IMAGE
	 * @model name="image"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_VALUE = 5;

	/**
	 * The '<em><b>Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Line</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #LINE
	 * @model name="line"
	 * @generated
	 * @ordered
	 */
	public static final int LINE_VALUE = 6;

	/**
	 * The '<em><b>Marker</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Marker</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #MARKER
	 * @model name="marker"
	 * @generated
	 * @ordered
	 */
	public static final int MARKER_VALUE = 7;

	/**
	 * The '<em><b>Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Path</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #PATH
	 * @model name="path"
	 * @generated
	 * @ordered
	 */
	public static final int PATH_VALUE = 8;

	/**
	 * The '<em><b>Polygon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Polygon</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #POLYGON
	 * @model name="polygon"
	 * @generated
	 * @ordered
	 */
	public static final int POLYGON_VALUE = 9;

	/**
	 * The '<em><b>Polyline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Polyline</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #POLYLINE
	 * @model name="polyline"
	 * @generated
	 * @ordered
	 */
	public static final int POLYLINE_VALUE = 10;

	/**
	 * The '<em><b>Rectangle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rectangle</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #RECTANGLE
	 * @model name="rectangle"
	 * @generated
	 * @ordered
	 */
	public static final int RECTANGLE_VALUE = 11;

	/**
	 * The '<em><b>Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Text</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #TEXT
	 * @model name="text"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_VALUE = 12;

	/**
	 * The '<em><b>Use</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Use</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #USE
	 * @model name="use"
	 * @generated
	 * @ordered
	 */
	public static final int USE_VALUE = 13;

	/**
	 * An array of all the '<em><b>Element Kind</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final ElementKind[] VALUES_ARRAY = new ElementKind[]{ CANVAS, CIRCLE, CLIP_PATH, ELLIPSE, GROUP, IMAGE, LINE, MARKER, PATH, POLYGON, POLYLINE, RECTANGLE, TEXT, USE, };

	/**
	 * A public read-only list of all the '<em><b>Element Kind</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final List<ElementKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Element Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static ElementKind get(String literal) {
		for(int i = 0; i < VALUES_ARRAY.length; ++i) {
			ElementKind result = VALUES_ARRAY[i];
			if(result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Element Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static ElementKind getByName(String name) {
		for(int i = 0; i < VALUES_ARRAY.length; ++i) {
			ElementKind result = VALUES_ARRAY[i];
			if(result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Element Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static ElementKind get(int value) {
		switch(value) {
		case CANVAS_VALUE:
			return CANVAS;
		case CIRCLE_VALUE:
			return CIRCLE;
		case CLIP_PATH_VALUE:
			return CLIP_PATH;
		case ELLIPSE_VALUE:
			return ELLIPSE;
		case GROUP_VALUE:
			return GROUP;
		case IMAGE_VALUE:
			return IMAGE;
		case LINE_VALUE:
			return LINE;
		case MARKER_VALUE:
			return MARKER;
		case PATH_VALUE:
			return PATH;
		case POLYGON_VALUE:
			return POLYGON;
		case POLYLINE_VALUE:
			return POLYLINE;
		case RECTANGLE_VALUE:
			return RECTANGLE;
		case TEXT_VALUE:
			return TEXT;
		case USE_VALUE:
			return USE;
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
	private ElementKind(int value, String name, String literal) {
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
} // ElementKind
