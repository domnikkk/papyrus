/**
 */
package org.eclipse.papyrus.eastadl.infrastructure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentPrototype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Constraint Prototype hardware Component Target Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef#getHardwareComponentProtype_target <em>Hardware Component Protype target</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef#getHardwareComponentPrototype_context <em>Hardware Component Prototype context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef()
 * @model
 * @generated
 */
public interface BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef extends InstanceRef {
	/**
	 * Returns the value of the '<em><b>Hardware Component Protype target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Component Protype target</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Hardware Component Protype target</em>' reference.
	 * @see #setHardwareComponentProtype_target(HardwareComponentPrototype)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef_HardwareComponentProtype_target()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	HardwareComponentPrototype getHardwareComponentProtype_target();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef#getHardwareComponentProtype_target <em>Hardware Component Protype target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Hardware Component Protype target</em>' reference.
	 * @see #getHardwareComponentProtype_target()
	 * @generated
	 */
	void setHardwareComponentProtype_target(HardwareComponentPrototype value);

	/**
	 * Returns the value of the '<em><b>Hardware Component Prototype context</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Component Prototype context</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Hardware Component Prototype context</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef_HardwareComponentPrototype_context()
	 * @model ordered="false"
	 * @generated
	 */
	EList<HardwareComponentPrototype> getHardwareComponentPrototype_context();

} // BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef
