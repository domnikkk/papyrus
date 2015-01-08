/**
 */
package org.eclipse.papyrus.eastadl.annex.behaviordescription.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintInternalBinding;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage;
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_errorModelTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_functionTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.TraceableSpecificationImpl;
import org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.VehicleFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Constraint Prototype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintPrototypeImpl#getInstantiationVariable <em>Instantiation Variable</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintPrototypeImpl#getTargetVehicleFeatureElement <em>Target Vehicle Feature Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintPrototypeImpl#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintPrototypeImpl#getFunctionTarget <em>Function Target</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintPrototypeImpl#getHardwareComponentTarget <em>Hardware Component Target</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintPrototypeImpl#getErrorModelTarget <em>Error Model Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorConstraintPrototypeImpl extends TraceableSpecificationImpl implements BehaviorConstraintPrototype {
	/**
	 * The cached value of the '{@link #getInstantiationVariable() <em>Instantiation Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getInstantiationVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorConstraintInternalBinding> instantiationVariable;

	/**
	 * The cached value of the '{@link #getTargetVehicleFeatureElement() <em>Target Vehicle Feature Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getTargetVehicleFeatureElement()
	 * @generated
	 * @ordered
	 */
	protected EList<VehicleFeature> targetVehicleFeatureElement;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected BehaviorConstraintType type;

	/**
	 * The cached value of the '{@link #getFunctionTarget() <em>Function Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFunctionTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorConstraintPrototype_functionTargetInstanceRef> functionTarget;

	/**
	 * The cached value of the '{@link #getHardwareComponentTarget() <em>Hardware Component Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getHardwareComponentTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef> hardwareComponentTarget;

	/**
	 * The cached value of the '{@link #getErrorModelTarget() <em>Error Model Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getErrorModelTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorConstraintPrototype_errorModelTargetInstanceRef> errorModelTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected BehaviorConstraintPrototypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviordescriptionPackage.Literals.BEHAVIOR_CONSTRAINT_PROTOTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<BehaviorConstraintInternalBinding> getInstantiationVariable() {
		if (instantiationVariable == null) {
			instantiationVariable = new EObjectResolvingEList<BehaviorConstraintInternalBinding>(BehaviorConstraintInternalBinding.class, this, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__INSTANTIATION_VARIABLE);
		}
		return instantiationVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<VehicleFeature> getTargetVehicleFeatureElement() {
		if (targetVehicleFeatureElement == null) {
			targetVehicleFeatureElement = new EObjectResolvingEList<VehicleFeature>(VehicleFeature.class, this, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__TARGET_VEHICLE_FEATURE_ELEMENT);
		}
		return targetVehicleFeatureElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public BehaviorConstraintType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (BehaviorConstraintType) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public BehaviorConstraintType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setType(BehaviorConstraintType newType) {
		BehaviorConstraintType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<BehaviorConstraintPrototype_functionTargetInstanceRef> getFunctionTarget() {
		if (functionTarget == null) {
			functionTarget = new EObjectContainmentEList<BehaviorConstraintPrototype_functionTargetInstanceRef>(BehaviorConstraintPrototype_functionTargetInstanceRef.class, this, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__FUNCTION_TARGET);
		}
		return functionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef> getHardwareComponentTarget() {
		if (hardwareComponentTarget == null) {
			hardwareComponentTarget = new EObjectContainmentEList<BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef>(BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef.class, this,
					BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__HARDWARE_COMPONENT_TARGET);
		}
		return hardwareComponentTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<BehaviorConstraintPrototype_errorModelTargetInstanceRef> getErrorModelTarget() {
		if (errorModelTarget == null) {
			errorModelTarget = new EObjectContainmentEList<BehaviorConstraintPrototype_errorModelTargetInstanceRef>(BehaviorConstraintPrototype_errorModelTargetInstanceRef.class, this,
					BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__ERROR_MODEL_TARGET);
		}
		return errorModelTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__FUNCTION_TARGET:
			return ((InternalEList<?>) getFunctionTarget()).basicRemove(otherEnd, msgs);
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__HARDWARE_COMPONENT_TARGET:
			return ((InternalEList<?>) getHardwareComponentTarget()).basicRemove(otherEnd, msgs);
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__ERROR_MODEL_TARGET:
			return ((InternalEList<?>) getErrorModelTarget()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__INSTANTIATION_VARIABLE:
			return getInstantiationVariable();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__TARGET_VEHICLE_FEATURE_ELEMENT:
			return getTargetVehicleFeatureElement();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__FUNCTION_TARGET:
			return getFunctionTarget();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__HARDWARE_COMPONENT_TARGET:
			return getHardwareComponentTarget();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__ERROR_MODEL_TARGET:
			return getErrorModelTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__INSTANTIATION_VARIABLE:
			getInstantiationVariable().clear();
			getInstantiationVariable().addAll((Collection<? extends BehaviorConstraintInternalBinding>) newValue);
			return;
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__TARGET_VEHICLE_FEATURE_ELEMENT:
			getTargetVehicleFeatureElement().clear();
			getTargetVehicleFeatureElement().addAll((Collection<? extends VehicleFeature>) newValue);
			return;
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__TYPE:
			setType((BehaviorConstraintType) newValue);
			return;
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__FUNCTION_TARGET:
			getFunctionTarget().clear();
			getFunctionTarget().addAll((Collection<? extends BehaviorConstraintPrototype_functionTargetInstanceRef>) newValue);
			return;
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__HARDWARE_COMPONENT_TARGET:
			getHardwareComponentTarget().clear();
			getHardwareComponentTarget().addAll((Collection<? extends BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef>) newValue);
			return;
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__ERROR_MODEL_TARGET:
			getErrorModelTarget().clear();
			getErrorModelTarget().addAll((Collection<? extends BehaviorConstraintPrototype_errorModelTargetInstanceRef>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__INSTANTIATION_VARIABLE:
			getInstantiationVariable().clear();
			return;
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__TARGET_VEHICLE_FEATURE_ELEMENT:
			getTargetVehicleFeatureElement().clear();
			return;
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__TYPE:
			setType((BehaviorConstraintType) null);
			return;
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__FUNCTION_TARGET:
			getFunctionTarget().clear();
			return;
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__HARDWARE_COMPONENT_TARGET:
			getHardwareComponentTarget().clear();
			return;
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__ERROR_MODEL_TARGET:
			getErrorModelTarget().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__INSTANTIATION_VARIABLE:
			return instantiationVariable != null && !instantiationVariable.isEmpty();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__TARGET_VEHICLE_FEATURE_ELEMENT:
			return targetVehicleFeatureElement != null && !targetVehicleFeatureElement.isEmpty();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__TYPE:
			return type != null;
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__FUNCTION_TARGET:
			return functionTarget != null && !functionTarget.isEmpty();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__HARDWARE_COMPONENT_TARGET:
			return hardwareComponentTarget != null && !hardwareComponentTarget.isEmpty();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE__ERROR_MODEL_TARGET:
			return errorModelTarget != null && !errorModelTarget.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // BehaviorConstraintPrototypeImpl
