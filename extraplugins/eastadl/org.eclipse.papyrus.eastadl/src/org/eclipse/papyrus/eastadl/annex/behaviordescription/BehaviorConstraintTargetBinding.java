/**
 */
package org.eclipse.papyrus.eastadl.annex.behaviordescription;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.behavior.FunctionBehavior;
import org.eclipse.papyrus.eastadl.behavior.FunctionTrigger;
import org.eclipse.papyrus.eastadl.behavior.Mode;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrorModelType;
import org.eclipse.papyrus.eastadl.infrastructure.elements.Relationship;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionType;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentType;
import org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.VehicleFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Constraint Target Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getBehaviorConstraintType <em>Behavior Constraint Type</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getTargetedVehicleFeature <em>Targeted Vehicle Feature</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getTargetedFunctionType <em>Targeted Function Type</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getConstrainedErrorModel <em>Constrained Error Model</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getTargetedHardwareComponentType <em>Targeted Hardware Component Type</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getConstrainedFunctionTriggering <em>Constrained Function Triggering</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getConstrainedModeBehavior <em>Constrained Mode Behavior</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getConstrainedFunctionBehavior <em>Constrained Function Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintTargetBinding()
 * @model
 * @generated
 */
public interface BehaviorConstraintTargetBinding extends Relationship {
	/**
	 * Returns the value of the '<em><b>Behavior Constraint Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Constraint Type</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Behavior Constraint Type</em>' reference.
	 * @see #setBehaviorConstraintType(BehaviorConstraintType)
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintTargetBinding_BehaviorConstraintType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BehaviorConstraintType getBehaviorConstraintType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getBehaviorConstraintType <em>Behavior Constraint Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Behavior Constraint Type</em>' reference.
	 * @see #getBehaviorConstraintType()
	 * @generated
	 */
	void setBehaviorConstraintType(BehaviorConstraintType value);

	/**
	 * Returns the value of the '<em><b>Targeted Vehicle Feature</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.VehicleFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targeted Vehicle Feature</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Targeted Vehicle Feature</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintTargetBinding_TargetedVehicleFeature()
	 * @model ordered="false"
	 * @generated
	 */
	EList<VehicleFeature> getTargetedVehicleFeature();

	/**
	 * Returns the value of the '<em><b>Targeted Function Type</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targeted Function Type</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Targeted Function Type</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintTargetBinding_TargetedFunctionType()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FunctionType> getTargetedFunctionType();

	/**
	 * Returns the value of the '<em><b>Constrained Error Model</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.dependability.errormodel.ErrorModelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained Error Model</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Constrained Error Model</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintTargetBinding_ConstrainedErrorModel()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ErrorModelType> getConstrainedErrorModel();

	/**
	 * Returns the value of the '<em><b>Targeted Hardware Component Type</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targeted Hardware Component Type</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Targeted Hardware Component Type</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintTargetBinding_TargetedHardwareComponentType()
	 * @model ordered="false"
	 * @generated
	 */
	EList<HardwareComponentType> getTargetedHardwareComponentType();

	/**
	 * Returns the value of the '<em><b>Constrained Function Triggering</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.behavior.FunctionTrigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained Function Triggering</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Constrained Function Triggering</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintTargetBinding_ConstrainedFunctionTriggering()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FunctionTrigger> getConstrainedFunctionTriggering();

	/**
	 * Returns the value of the '<em><b>Constrained Mode Behavior</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.behavior.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained Mode Behavior</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Constrained Mode Behavior</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintTargetBinding_ConstrainedModeBehavior()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Mode> getConstrainedModeBehavior();

	/**
	 * Returns the value of the '<em><b>Constrained Function Behavior</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.behavior.FunctionBehavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained Function Behavior</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Constrained Function Behavior</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintTargetBinding_ConstrainedFunctionBehavior()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FunctionBehavior> getConstrainedFunctionBehavior();

} // BehaviorConstraintTargetBinding
