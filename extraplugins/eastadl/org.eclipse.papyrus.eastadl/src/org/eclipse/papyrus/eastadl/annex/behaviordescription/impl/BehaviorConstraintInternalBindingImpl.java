/**
 */
package org.eclipse.papyrus.eastadl.annex.behaviordescription.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintInternalBinding;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage;
import org.eclipse.papyrus.eastadl.environment.ClampConnector;
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Constraint Internal Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintInternalBindingImpl#getBindingThroughClampConnector <em>Binding Through Clamp Connector</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintInternalBindingImpl#getBindingThroughFunctionConnector <em>Binding Through Function Connector</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintInternalBindingImpl#getBindingThroughHardwareConnector <em>Binding Through Hardware Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehaviorConstraintInternalBindingImpl extends MinimalEObjectImpl.Container implements BehaviorConstraintInternalBinding {
	/**
	 * The cached value of the '{@link #getBindingThroughClampConnector() <em>Binding Through Clamp Connector</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingThroughClampConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<ClampConnector> bindingThroughClampConnector;

	/**
	 * The cached value of the '{@link #getBindingThroughFunctionConnector() <em>Binding Through Function Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingThroughFunctionConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef> bindingThroughFunctionConnector;

	/**
	 * The cached value of the '{@link #getBindingThroughHardwareConnector() <em>Binding Through Hardware Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingThroughHardwareConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef> bindingThroughHardwareConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorConstraintInternalBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviordescriptionPackage.Literals.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClampConnector> getBindingThroughClampConnector() {
		if (bindingThroughClampConnector == null) {
			bindingThroughClampConnector = new EObjectResolvingEList<ClampConnector>(ClampConnector.class, this, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_CLAMP_CONNECTOR);
		}
		return bindingThroughClampConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef> getBindingThroughFunctionConnector() {
		if (bindingThroughFunctionConnector == null) {
			bindingThroughFunctionConnector = new EObjectContainmentEList<BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef>(BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef.class, this, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_FUNCTION_CONNECTOR);
		}
		return bindingThroughFunctionConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef> getBindingThroughHardwareConnector() {
		if (bindingThroughHardwareConnector == null) {
			bindingThroughHardwareConnector = new EObjectContainmentEList<BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef>(BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef.class, this, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_HARDWARE_CONNECTOR);
		}
		return bindingThroughHardwareConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_FUNCTION_CONNECTOR:
				return ((InternalEList<?>)getBindingThroughFunctionConnector()).basicRemove(otherEnd, msgs);
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_HARDWARE_CONNECTOR:
				return ((InternalEList<?>)getBindingThroughHardwareConnector()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_CLAMP_CONNECTOR:
				return getBindingThroughClampConnector();
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_FUNCTION_CONNECTOR:
				return getBindingThroughFunctionConnector();
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_HARDWARE_CONNECTOR:
				return getBindingThroughHardwareConnector();
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
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_CLAMP_CONNECTOR:
				getBindingThroughClampConnector().clear();
				getBindingThroughClampConnector().addAll((Collection<? extends ClampConnector>)newValue);
				return;
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_FUNCTION_CONNECTOR:
				getBindingThroughFunctionConnector().clear();
				getBindingThroughFunctionConnector().addAll((Collection<? extends BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef>)newValue);
				return;
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_HARDWARE_CONNECTOR:
				getBindingThroughHardwareConnector().clear();
				getBindingThroughHardwareConnector().addAll((Collection<? extends BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef>)newValue);
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
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_CLAMP_CONNECTOR:
				getBindingThroughClampConnector().clear();
				return;
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_FUNCTION_CONNECTOR:
				getBindingThroughFunctionConnector().clear();
				return;
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_HARDWARE_CONNECTOR:
				getBindingThroughHardwareConnector().clear();
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
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_CLAMP_CONNECTOR:
				return bindingThroughClampConnector != null && !bindingThroughClampConnector.isEmpty();
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_FUNCTION_CONNECTOR:
				return bindingThroughFunctionConnector != null && !bindingThroughFunctionConnector.isEmpty();
			case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_HARDWARE_CONNECTOR:
				return bindingThroughHardwareConnector != null && !bindingThroughHardwareConnector.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BehaviorConstraintInternalBindingImpl
