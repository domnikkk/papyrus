/**
 */
package org.eclipse.papyrus.umlrt.UMLRealTime;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Port Registration Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage#getPortRegistrationType()
 * @model
 * @generated
 */
public enum PortRegistrationType implements Enumerator {
	/**
	 * The '<em><b>Automatic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOMATIC_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOMATIC(0, "Automatic", "Automatic"),

	/**
	 * The '<em><b>Application</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION(1, "Application", "Application"),

	/**
	 * The '<em><b>Application Locked</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_LOCKED_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_LOCKED(2, "ApplicationLocked", "ApplicationLocked");

	/**
	 * The '<em><b>Automatic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Automatic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTOMATIC
	 * @model name="Automatic"
	 * @generated
	 * @ordered
	 */
	public static final int AUTOMATIC_VALUE = 0;

	/**
	 * The '<em><b>Application</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Application</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPLICATION
	 * @model name="Application"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_VALUE = 1;

	/**
	 * The '<em><b>Application Locked</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Application Locked</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_LOCKED
	 * @model name="ApplicationLocked"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_LOCKED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Port Registration Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PortRegistrationType[] VALUES_ARRAY =
		new PortRegistrationType[] {
			AUTOMATIC,
			APPLICATION,
			APPLICATION_LOCKED,
		};

	/**
	 * A public read-only list of all the '<em><b>Port Registration Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PortRegistrationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Port Registration Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PortRegistrationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PortRegistrationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Port Registration Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PortRegistrationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PortRegistrationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Port Registration Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PortRegistrationType get(int value) {
		switch (value) {
			case AUTOMATIC_VALUE: return AUTOMATIC;
			case APPLICATION_VALUE: return APPLICATION;
			case APPLICATION_LOCKED_VALUE: return APPLICATION_LOCKED;
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
	private PortRegistrationType(int value, String name, String literal) {
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
	
} //PortRegistrationType
