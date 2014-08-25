/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.datatypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Numerical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Datatype for numerical values.
 *
 * Extension: UML Datatype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.EANumerical#getMax <em>Max</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.EANumerical#getMin <em>Min</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.EANumerical#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage#getEANumerical()
 * @model
 * @generated
 */
public interface EANumerical extends EADatatype {
	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(Float)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage#getEANumerical_Max()
	 * @model unique="false" dataType="org.eclipse.papyrus.eastadl.infrastructure.datatypes.Numerical" ordered="false"
	 * @generated
	 */
	Float getMax();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.EANumerical#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Float value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(Float)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage#getEANumerical_Min()
	 * @model unique="false" dataType="org.eclipse.papyrus.eastadl.infrastructure.datatypes.Numerical" ordered="false"
	 * @generated
	 */
	Float getMin();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.EANumerical#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(Float value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(Unit)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage#getEANumerical_Unit()
	 * @model ordered="false"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.EANumerical#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

} // EANumerical
