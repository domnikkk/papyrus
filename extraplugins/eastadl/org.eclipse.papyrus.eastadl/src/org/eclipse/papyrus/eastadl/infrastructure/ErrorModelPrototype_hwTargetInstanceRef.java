/**
 */
package org.eclipse.papyrus.eastadl.infrastructure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentPrototype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Model Prototype hw Target Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_hwTargetInstanceRef#getHardwareComponentProtype <em>Hardware Component Protype</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_hwTargetInstanceRef#getHardwareComponentProtype_context <em>Hardware Component Protype context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getErrorModelPrototype_hwTargetInstanceRef()
 * @model
 * @generated
 */
public interface ErrorModelPrototype_hwTargetInstanceRef extends InstanceRef {
	/**
	 * Returns the value of the '<em><b>Hardware Component Protype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Component Protype</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Hardware Component Protype</em>' reference.
	 * @see #setHardwareComponentProtype(HardwareComponentPrototype)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getErrorModelPrototype_hwTargetInstanceRef_HardwareComponentProtype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	HardwareComponentPrototype getHardwareComponentProtype();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_hwTargetInstanceRef#getHardwareComponentProtype <em>Hardware Component Protype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Hardware Component Protype</em>' reference.
	 * @see #getHardwareComponentProtype()
	 * @generated
	 */
	void setHardwareComponentProtype(HardwareComponentPrototype value);

	/**
	 * Returns the value of the '<em><b>Hardware Component Protype context</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Component Protype context</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Hardware Component Protype context</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getErrorModelPrototype_hwTargetInstanceRef_HardwareComponentProtype_context()
	 * @model ordered="false"
	 * @generated
	 */
	EList<HardwareComponentPrototype> getHardwareComponentProtype_context();

} // ErrorModelPrototype_hwTargetInstanceRef
