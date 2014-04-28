/**
 */
package org.eclipse.papyrus.eastadl.infrastructure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.AllocationTarget;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.TargetInstanceRef#getAllocationTarget <em>Allocation Target</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.TargetInstanceRef#getAllocationTarget_context <em>Allocation Target context</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.TargetInstanceRef#getIntAttribute <em>Int Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getTargetInstanceRef()
 * @model
 * @generated
 */
public interface TargetInstanceRef extends InstanceRef {
	/**
	 * Returns the value of the '<em><b>Allocation Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Target</em>' reference.
	 * @see #setAllocationTarget(AllocationTarget)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getTargetInstanceRef_AllocationTarget()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AllocationTarget getAllocationTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.TargetInstanceRef#getAllocationTarget <em>Allocation Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Target</em>' reference.
	 * @see #getAllocationTarget()
	 * @generated
	 */
	void setAllocationTarget(AllocationTarget value);

	/**
	 * Returns the value of the '<em><b>Allocation Target context</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.AllocationTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation Target context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Target context</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getTargetInstanceRef_AllocationTarget_context()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AllocationTarget> getAllocationTarget_context();

	/**
	 * Returns the value of the '<em><b>Int Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Attribute</em>' attribute.
	 * @see #setIntAttribute(int)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getTargetInstanceRef_IntAttribute()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIntAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.TargetInstanceRef#getIntAttribute <em>Int Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Attribute</em>' attribute.
	 * @see #getIntAttribute()
	 * @generated
	 */
	void setIntAttribute(int value);

} // TargetInstanceRef
