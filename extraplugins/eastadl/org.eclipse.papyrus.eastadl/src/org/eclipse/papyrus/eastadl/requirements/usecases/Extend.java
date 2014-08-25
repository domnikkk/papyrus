/**
 */
package org.eclipse.papyrus.eastadl.requirements.usecases;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.infrastructure.elements.Relationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.usecases.Extend#getBase_Extend <em>Base Extend</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.usecases.Extend#getExtensionLocation <em>Extension Location</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.usecases.Extend#getExtendedCase <em>Extended Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.requirements.usecases.UsecasesPackage#getExtend()
 * @model
 * @generated
 */
public interface Extend extends Relationship {
	/**
	 * Returns the value of the '<em><b>Base Extend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Extend</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Base Extend</em>' reference.
	 * @see #setBase_Extend(org.eclipse.uml2.uml.Extend)
	 * @see org.eclipse.papyrus.eastadl.requirements.usecases.UsecasesPackage#getExtend_Base_Extend()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Extend getBase_Extend();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.requirements.usecases.Extend#getBase_Extend <em>Base Extend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Base Extend</em>' reference.
	 * @see #getBase_Extend()
	 * @generated
	 */
	void setBase_Extend(org.eclipse.uml2.uml.Extend value);

	/**
	 * Returns the value of the '<em><b>Extension Location</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.requirements.usecases.ExtensionPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Location</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Extension Location</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.requirements.usecases.UsecasesPackage#getExtend_ExtensionLocation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<ExtensionPoint> getExtensionLocation();

	/**
	 * Returns the value of the '<em><b>Extended Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Case</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Extended Case</em>' reference.
	 * @see #setExtendedCase(UseCase)
	 * @see org.eclipse.papyrus.eastadl.requirements.usecases.UsecasesPackage#getExtend_ExtendedCase()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UseCase getExtendedCase();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.requirements.usecases.Extend#getExtendedCase <em>Extended Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Extended Case</em>' reference.
	 * @see #getExtendedCase()
	 * @generated
	 */
	void setExtendedCase(UseCase value);

} // Extend
