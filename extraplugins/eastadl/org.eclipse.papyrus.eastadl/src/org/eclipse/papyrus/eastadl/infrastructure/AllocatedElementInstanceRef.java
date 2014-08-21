/**
 */
package org.eclipse.papyrus.eastadl.infrastructure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.AllocateableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocated Element Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.AllocatedElementInstanceRef#getAllocateableElement <em>Allocateable Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.AllocatedElementInstanceRef#getAllocateableElement_context <em>Allocateable Element context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getAllocatedElementInstanceRef()
 * @model
 * @generated
 */
public interface AllocatedElementInstanceRef extends InstanceRef {
	/**
	 * Returns the value of the '<em><b>Allocateable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocateable Element</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Allocateable Element</em>' reference.
	 * @see #setAllocateableElement(AllocateableElement)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getAllocatedElementInstanceRef_AllocateableElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AllocateableElement getAllocateableElement();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.AllocatedElementInstanceRef#getAllocateableElement <em>Allocateable Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Allocateable Element</em>' reference.
	 * @see #getAllocateableElement()
	 * @generated
	 */
	void setAllocateableElement(AllocateableElement value);

	/**
	 * Returns the value of the '<em><b>Allocateable Element context</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.functionmodeling.AllocateableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocateable Element context</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Allocateable Element context</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getAllocatedElementInstanceRef_AllocateableElement_context()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AllocateableElement> getAllocateableElement_context();

} // AllocatedElementInstanceRef
