/**
 */
package org.eclipse.papyrus.eastadl.requirements.usecases;

import org.eclipse.papyrus.eastadl.infrastructure.elements.Relationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.usecases.Include#getBase_Include <em>Base Include</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.usecases.Include#getAddition <em>Addition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.requirements.usecases.UsecasesPackage#getInclude()
 * @model
 * @generated
 */
public interface Include extends Relationship {
	/**
	 * Returns the value of the '<em><b>Base Include</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Include</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Base Include</em>' reference.
	 * @see #setBase_Include(org.eclipse.uml2.uml.Include)
	 * @see org.eclipse.papyrus.eastadl.requirements.usecases.UsecasesPackage#getInclude_Base_Include()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Include getBase_Include();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.requirements.usecases.Include#getBase_Include <em>Base Include</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Base Include</em>' reference.
	 * @see #getBase_Include()
	 * @generated
	 */
	void setBase_Include(org.eclipse.uml2.uml.Include value);

	/**
	 * Returns the value of the '<em><b>Addition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addition</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Addition</em>' reference.
	 * @see #setAddition(UseCase)
	 * @see org.eclipse.papyrus.eastadl.requirements.usecases.UsecasesPackage#getInclude_Addition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UseCase getAddition();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.requirements.usecases.Include#getAddition <em>Addition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Addition</em>' reference.
	 * @see #getAddition()
	 * @generated
	 */
	void setAddition(UseCase value);

} // Include
