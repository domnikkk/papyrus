/**
 */
package org.eclipse.papyrus.eastadl.annex.behaviordescription.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage;
import org.eclipse.papyrus.eastadl.behavior.FunctionBehavior;
import org.eclipse.papyrus.eastadl.behavior.FunctionTrigger;
import org.eclipse.papyrus.eastadl.behavior.Mode;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrorModelType;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.RelationshipImpl;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionType;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentType;
import org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.VehicleFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Constraint Target Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintTargetBindingImpl#getBehaviorConstraintType <em>Behavior Constraint Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintTargetBindingImpl#getTargetedVehicleFeature <em>Targeted Vehicle Feature</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintTargetBindingImpl#getTargetedFunctionType <em>Targeted Function Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintTargetBindingImpl#getConstrainedErrorModel <em>Constrained Error Model</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintTargetBindingImpl#getTargetedHardwareComponentType <em>Targeted Hardware Component Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintTargetBindingImpl#getConstrainedFunctionTriggering <em>Constrained Function Triggering</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintTargetBindingImpl#getConstrainedModeBehavior <em>Constrained Mode Behavior</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintTargetBindingImpl#getConstrainedFunctionBehavior <em>Constrained Function Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorConstraintTargetBindingImpl extends RelationshipImpl implements BehaviorConstraintTargetBinding {
	/**
	 * The cached value of the '{@link #getBehaviorConstraintType() <em>Behavior Constraint Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorConstraintType()
	 * @generated
	 * @ordered
	 */
	protected BehaviorConstraintType behaviorConstraintType;

	/**
	 * The cached value of the '{@link #getTargetedVehicleFeature() <em>Targeted Vehicle Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetedVehicleFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<VehicleFeature> targetedVehicleFeature;

	/**
	 * The cached value of the '{@link #getTargetedFunctionType() <em>Targeted Function Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetedFunctionType()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionType> targetedFunctionType;

	/**
	 * The cached value of the '{@link #getConstrainedErrorModel() <em>Constrained Error Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedErrorModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorModelType> constrainedErrorModel;

	/**
	 * The cached value of the '{@link #getTargetedHardwareComponentType() <em>Targeted Hardware Component Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetedHardwareComponentType()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareComponentType> targetedHardwareComponentType;

	/**
	 * The cached value of the '{@link #getConstrainedFunctionTriggering() <em>Constrained Function Triggering</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedFunctionTriggering()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionTrigger> constrainedFunctionTriggering;

	/**
	 * The cached value of the '{@link #getConstrainedModeBehavior() <em>Constrained Mode Behavior</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedModeBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> constrainedModeBehavior;

	/**
	 * The cached value of the '{@link #getConstrainedFunctionBehavior() <em>Constrained Function Behavior</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedFunctionBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionBehavior> constrainedFunctionBehavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorConstraintTargetBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviordescriptionPackage.Literals.BEHAVIOR_CONSTRAINT_TARGET_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorConstraintType getBehaviorConstraintType() {
		if (behaviorConstraintType != null && behaviorConstraintType.eIsProxy()) {
			InternalEObject oldBehaviorConstraintType = (InternalEObject)behaviorConstraintType;
			behaviorConstraintType = (BehaviorConstraintType)eResolveProxy(oldBehaviorConstraintType);
			if (behaviorConstraintType != oldBehaviorConstraintType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__BEHAVIOR_CONSTRAINT_TYPE, oldBehaviorConstraintType, behaviorConstraintType));
			}
		}
		return behaviorConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorConstraintType basicGetBehaviorConstraintType() {
		return behaviorConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviorConstraintType(BehaviorConstraintType newBehaviorConstraintType) {
		BehaviorConstraintType oldBehaviorConstraintType = behaviorConstraintType;
		behaviorConstraintType = newBehaviorConstraintType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__BEHAVIOR_CONSTRAINT_TYPE, oldBehaviorConstraintType, behaviorConstraintType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VehicleFeature> getTargetedVehicleFeature() {
		if (targetedVehicleFeature == null) {
			targetedVehicleFeature = new EObjectResolvingEList<VehicleFeature>(VehicleFeature.class, this, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__TARGETED_VEHICLE_FEATURE);
		}
		return targetedVehicleFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionType> getTargetedFunctionType() {
		if (targetedFunctionType == null) {
			targetedFunctionType = new EObjectResolvingEList<FunctionType>(FunctionType.class, this, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__TARGETED_FUNCTION_TYPE);
		}
		return targetedFunctionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorModelType> getConstrainedErrorModel() {
		if (constrainedErrorModel == null) {
			constrainedErrorModel = new EObjectResolvingEList<ErrorModelType>(ErrorModelType.class, this, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_ERROR_MODEL);
		}
		return constrainedErrorModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareComponentType> getTargetedHardwareComponentType() {
		if (targetedHardwareComponentType == null) {
			targetedHardwareComponentType = new EObjectResolvingEList<HardwareComponentType>(HardwareComponentType.class, this, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__TARGETED_HARDWARE_COMPONENT_TYPE);
		}
		return targetedHardwareComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionTrigger> getConstrainedFunctionTriggering() {
		if (constrainedFunctionTriggering == null) {
			constrainedFunctionTriggering = new EObjectResolvingEList<FunctionTrigger>(FunctionTrigger.class, this, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_FUNCTION_TRIGGERING);
		}
		return constrainedFunctionTriggering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mode> getConstrainedModeBehavior() {
		if (constrainedModeBehavior == null) {
			constrainedModeBehavior = new EObjectResolvingEList<Mode>(Mode.class, this, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_MODE_BEHAVIOR);
		}
		return constrainedModeBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionBehavior> getConstrainedFunctionBehavior() {
		if (constrainedFunctionBehavior == null) {
			constrainedFunctionBehavior = new EObjectResolvingEList<FunctionBehavior>(FunctionBehavior.class, this, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_FUNCTION_BEHAVIOR);
		}
		return constrainedFunctionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__BEHAVIOR_CONSTRAINT_TYPE:
				if (resolve) return getBehaviorConstraintType();
				return basicGetBehaviorConstraintType();
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__TARGETED_VEHICLE_FEATURE:
				return getTargetedVehicleFeature();
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__TARGETED_FUNCTION_TYPE:
				return getTargetedFunctionType();
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_ERROR_MODEL:
				return getConstrainedErrorModel();
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__TARGETED_HARDWARE_COMPONENT_TYPE:
				return getTargetedHardwareComponentType();
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_FUNCTION_TRIGGERING:
				return getConstrainedFunctionTriggering();
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_MODE_BEHAVIOR:
				return getConstrainedModeBehavior();
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_FUNCTION_BEHAVIOR:
				return getConstrainedFunctionBehavior();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__BEHAVIOR_CONSTRAINT_TYPE:
				setBehaviorConstraintType((BehaviorConstraintType)newValue);
				return;
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__TARGETED_VEHICLE_FEATURE:
				getTargetedVehicleFeature().clear();
				getTargetedVehicleFeature().addAll((Collection<? extends VehicleFeature>)newValue);
				return;
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__TARGETED_FUNCTION_TYPE:
				getTargetedFunctionType().clear();
				getTargetedFunctionType().addAll((Collection<? extends FunctionType>)newValue);
				return;
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_ERROR_MODEL:
				getConstrainedErrorModel().clear();
				getConstrainedErrorModel().addAll((Collection<? extends ErrorModelType>)newValue);
				return;
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__TARGETED_HARDWARE_COMPONENT_TYPE:
				getTargetedHardwareComponentType().clear();
				getTargetedHardwareComponentType().addAll((Collection<? extends HardwareComponentType>)newValue);
				return;
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_FUNCTION_TRIGGERING:
				getConstrainedFunctionTriggering().clear();
				getConstrainedFunctionTriggering().addAll((Collection<? extends FunctionTrigger>)newValue);
				return;
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_MODE_BEHAVIOR:
				getConstrainedModeBehavior().clear();
				getConstrainedModeBehavior().addAll((Collection<? extends Mode>)newValue);
				return;
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_FUNCTION_BEHAVIOR:
				getConstrainedFunctionBehavior().clear();
				getConstrainedFunctionBehavior().addAll((Collection<? extends FunctionBehavior>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__BEHAVIOR_CONSTRAINT_TYPE:
				setBehaviorConstraintType((BehaviorConstraintType)null);
				return;
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__TARGETED_VEHICLE_FEATURE:
				getTargetedVehicleFeature().clear();
				return;
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__TARGETED_FUNCTION_TYPE:
				getTargetedFunctionType().clear();
				return;
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_ERROR_MODEL:
				getConstrainedErrorModel().clear();
				return;
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__TARGETED_HARDWARE_COMPONENT_TYPE:
				getTargetedHardwareComponentType().clear();
				return;
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_FUNCTION_TRIGGERING:
				getConstrainedFunctionTriggering().clear();
				return;
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_MODE_BEHAVIOR:
				getConstrainedModeBehavior().clear();
				return;
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_FUNCTION_BEHAVIOR:
				getConstrainedFunctionBehavior().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__BEHAVIOR_CONSTRAINT_TYPE:
				return behaviorConstraintType != null;
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__TARGETED_VEHICLE_FEATURE:
				return targetedVehicleFeature != null && !targetedVehicleFeature.isEmpty();
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__TARGETED_FUNCTION_TYPE:
				return targetedFunctionType != null && !targetedFunctionType.isEmpty();
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_ERROR_MODEL:
				return constrainedErrorModel != null && !constrainedErrorModel.isEmpty();
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__TARGETED_HARDWARE_COMPONENT_TYPE:
				return targetedHardwareComponentType != null && !targetedHardwareComponentType.isEmpty();
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_FUNCTION_TRIGGERING:
				return constrainedFunctionTriggering != null && !constrainedFunctionTriggering.isEmpty();
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_MODE_BEHAVIOR:
				return constrainedModeBehavior != null && !constrainedModeBehavior.isEmpty();
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_FUNCTION_BEHAVIOR:
				return constrainedFunctionBehavior != null && !constrainedFunctionBehavior.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BehaviorConstraintTargetBindingImpl
