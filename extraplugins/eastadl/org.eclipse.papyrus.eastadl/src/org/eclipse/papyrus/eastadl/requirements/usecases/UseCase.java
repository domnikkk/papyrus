/**
 */
package org.eclipse.papyrus.eastadl.requirements.usecases;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.infrastructure.elements.TraceableSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.usecases.UseCase#getBase_UseCase <em>Base Use Case</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.usecases.UseCase#getInclude <em>Include</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.usecases.UseCase#getExtend <em>Extend</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.usecases.UseCase#getExtensionPoint <em>Extension Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.requirements.usecases.UsecasesPackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Use Case</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Base Use Case</em>' reference.
	 * @see #setBase_UseCase(org.eclipse.uml2.uml.UseCase)
	 * @see org.eclipse.papyrus.eastadl.requirements.usecases.UsecasesPackage#getUseCase_Base_UseCase()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.UseCase getBase_UseCase();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.requirements.usecases.UseCase#getBase_UseCase <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Base Use Case</em>' reference.
	 * @see #getBase_UseCase()
	 * @generated
	 */
	void setBase_UseCase(org.eclipse.uml2.uml.UseCase value);

	/**
	 * Returns the value of the '<em><b>Include</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.requirements.usecases.Include}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Include</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.requirements.usecases.UsecasesPackage#getUseCase_Include()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Include> getInclude();

	/**
	 * Returns the value of the '<em><b>Extend</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.requirements.usecases.Extend}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extend</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Extend</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.requirements.usecases.UsecasesPackage#getUseCase_Extend()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Extend> getExtend();

	/**
	 * Returns the value of the '<em><b>Extension Point</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.requirements.usecases.ExtensionPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Point</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Extension Point</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.requirements.usecases.UsecasesPackage#getUseCase_ExtensionPoint()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ExtensionPoint> getExtensionPoint();

} // UseCase
