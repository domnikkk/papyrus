/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.datatypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.ArrayDataType#getMaxLenght <em>Max Lenght</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.ArrayDataType#getMinLenght <em>Min Lenght</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.ArrayDataType#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage#getArrayDataType()
 * @model
 * @generated
 */
public interface ArrayDataType extends EADatatype {
	/**
	 * Returns the value of the '<em><b>Max Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Lenght</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Max Lenght</em>' attribute.
	 * @see #setMaxLenght(int)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage#getArrayDataType_MaxLenght()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getMaxLenght();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.ArrayDataType#getMaxLenght <em>Max Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Max Lenght</em>' attribute.
	 * @see #getMaxLenght()
	 * @generated
	 */
	void setMaxLenght(int value);

	/**
	 * Returns the value of the '<em><b>Min Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Lenght</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Min Lenght</em>' attribute.
	 * @see #setMinLenght(int)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage#getArrayDataType_MinLenght()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getMinLenght();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.ArrayDataType#getMinLenght <em>Min Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Min Lenght</em>' attribute.
	 * @see #getMinLenght()
	 * @generated
	 */
	void setMinLenght(int value);

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Element Type</em>' reference.
	 * @see #setElementType(EADatatype)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage#getArrayDataType_ElementType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EADatatype getElementType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.ArrayDataType#getElementType <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Element Type</em>' reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(EADatatype value);

} // ArrayDataType
