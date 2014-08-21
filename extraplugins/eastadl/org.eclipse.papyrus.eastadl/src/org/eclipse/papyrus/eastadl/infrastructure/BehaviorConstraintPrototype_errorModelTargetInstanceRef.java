/**
 */
package org.eclipse.papyrus.eastadl.infrastructure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrorModelPrototype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Constraint Prototype error Model Target Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_errorModelTargetInstanceRef#getErrorModelPrototype_target <em>Error Model Prototype target</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_errorModelTargetInstanceRef#getErrorModelPrototype_context <em>Error Model Prototype context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getBehaviorConstraintPrototype_errorModelTargetInstanceRef()
 * @model
 * @generated
 */
public interface BehaviorConstraintPrototype_errorModelTargetInstanceRef extends InstanceRef {
	/**
	 * Returns the value of the '<em><b>Error Model Prototype target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Model Prototype target</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Error Model Prototype target</em>' reference.
	 * @see #setErrorModelPrototype_target(ErrorModelPrototype)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getBehaviorConstraintPrototype_errorModelTargetInstanceRef_ErrorModelPrototype_target()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ErrorModelPrototype getErrorModelPrototype_target();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_errorModelTargetInstanceRef#getErrorModelPrototype_target <em>Error Model Prototype target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Error Model Prototype target</em>' reference.
	 * @see #getErrorModelPrototype_target()
	 * @generated
	 */
	void setErrorModelPrototype_target(ErrorModelPrototype value);

	/**
	 * Returns the value of the '<em><b>Error Model Prototype context</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.dependability.errormodel.ErrorModelPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Model Prototype context</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Error Model Prototype context</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getBehaviorConstraintPrototype_errorModelTargetInstanceRef_ErrorModelPrototype_context()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ErrorModelPrototype> getErrorModelPrototype_context();

} // BehaviorConstraintPrototype_errorModelTargetInstanceRef
