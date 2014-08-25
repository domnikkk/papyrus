/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.datatypes;

import org.eclipse.papyrus.eastadl.infrastructure.elements.EAPackageableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit#getFactor <em>Factor</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit#getOffset <em>Offset</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit#getSymbol <em>Symbol</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit#getQuantity <em>Quantity</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage#getUnit()
 * @model
 * @generated
 */
public interface Unit extends EAPackageableElement {
	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #setFactor(Float)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage#getUnit_Factor()
	 * @model dataType="org.eclipse.papyrus.eastadl.infrastructure.datatypes.javalangFloat" required="true" ordered="false"
	 * @generated
	 */
	Float getFactor();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Factor</em>' attribute.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(Float value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(Float)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage#getUnit_Offset()
	 * @model dataType="org.eclipse.papyrus.eastadl.infrastructure.datatypes.javalangFloat" required="true" ordered="false"
	 * @generated
	 */
	Float getOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(Float value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage#getUnit_Symbol()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Quantity</em>' reference.
	 * @see #setQuantity(Quantity)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage#getUnit_Quantity()
	 * @model ordered="false"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit#getQuantity <em>Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Quantity</em>' reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Unit)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage#getUnit_Reference()
	 * @model ordered="false"
	 * @generated
	 */
	Unit getReference();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Unit value);

} // Unit
