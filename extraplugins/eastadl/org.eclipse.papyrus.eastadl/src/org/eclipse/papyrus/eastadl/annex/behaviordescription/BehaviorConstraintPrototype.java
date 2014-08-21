/**
 */
package org.eclipse.papyrus.eastadl.annex.behaviordescription;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_errorModelTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_functionTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.elements.TraceableSpecification;
import org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.VehicleFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Constraint Prototype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype#getInstantiationVariable <em>Instantiation Variable</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype#getTargetVehicleFeatureElement <em>Target Vehicle Feature Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype#getFunctionTarget <em>Function Target</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype#getHardwareComponentTarget <em>Hardware Component Target</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype#getErrorModelTarget <em>Error Model Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintPrototype()
 * @model
 * @generated
 */
public interface BehaviorConstraintPrototype extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Instantiation Variable</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintInternalBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiation Variable</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Instantiation Variable</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintPrototype_InstantiationVariable()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BehaviorConstraintInternalBinding> getInstantiationVariable();

	/**
	 * Returns the value of the '<em><b>Target Vehicle Feature Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.VehicleFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Vehicle Feature Element</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target Vehicle Feature Element</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintPrototype_TargetVehicleFeatureElement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<VehicleFeature> getTargetVehicleFeatureElement();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(BehaviorConstraintType)
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintPrototype_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BehaviorConstraintType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(BehaviorConstraintType value);

	/**
	 * Returns the value of the '<em><b>Function Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_functionTargetInstanceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Target</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Function Target</em>' containment reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintPrototype_FunctionTarget()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<BehaviorConstraintPrototype_functionTargetInstanceRef> getFunctionTarget();

	/**
	 * Returns the value of the '<em><b>Hardware Component Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Component Target</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Hardware Component Target</em>' containment reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintPrototype_HardwareComponentTarget()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef> getHardwareComponentTarget();

	/**
	 * Returns the value of the '<em><b>Error Model Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_errorModelTargetInstanceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Model Target</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Error Model Target</em>' containment reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintPrototype_ErrorModelTarget()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<BehaviorConstraintPrototype_errorModelTargetInstanceRef> getErrorModelTarget();

} // BehaviorConstraintPrototype
