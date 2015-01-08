/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentPrototype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Constraint Prototype hardware Component Target Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRefImpl#getHardwareComponentProtype_target <em>Hardware Component Protype target</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRefImpl#getHardwareComponentPrototype_context <em>Hardware Component Prototype context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorConstraintPrototype_hardwareComponentTargetInstanceRefImpl extends InstanceRefImpl implements BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef {
	/**
	 * The cached value of the '{@link #getHardwareComponentProtype_target() <em>Hardware Component Protype target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getHardwareComponentProtype_target()
	 * @generated
	 * @ordered
	 */
	protected HardwareComponentPrototype hardwareComponentProtype_target;

	/**
	 * The cached value of the '{@link #getHardwareComponentPrototype_context() <em>Hardware Component Prototype context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getHardwareComponentPrototype_context()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareComponentPrototype> hardwareComponentPrototype_context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected BehaviorConstraintPrototype_hardwareComponentTargetInstanceRefImpl() {
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
		return InfrastructurePackage.Literals.BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HardwareComponentPrototype getHardwareComponentProtype_target() {
		if (hardwareComponentProtype_target != null && hardwareComponentProtype_target.eIsProxy()) {
			InternalEObject oldHardwareComponentProtype_target = (InternalEObject) hardwareComponentProtype_target;
			hardwareComponentProtype_target = (HardwareComponentPrototype) eResolveProxy(oldHardwareComponentProtype_target);
			if (hardwareComponentProtype_target != oldHardwareComponentProtype_target) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE_TARGET, oldHardwareComponentProtype_target,
							hardwareComponentProtype_target));
			}
		}
		return hardwareComponentProtype_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HardwareComponentPrototype basicGetHardwareComponentProtype_target() {
		return hardwareComponentProtype_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setHardwareComponentProtype_target(HardwareComponentPrototype newHardwareComponentProtype_target) {
		HardwareComponentPrototype oldHardwareComponentProtype_target = hardwareComponentProtype_target;
		hardwareComponentProtype_target = newHardwareComponentProtype_target;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE_TARGET, oldHardwareComponentProtype_target,
					hardwareComponentProtype_target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<HardwareComponentPrototype> getHardwareComponentPrototype_context() {
		if (hardwareComponentPrototype_context == null) {
			hardwareComponentPrototype_context = new EObjectResolvingEList<HardwareComponentPrototype>(HardwareComponentPrototype.class, this,
					InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE_CONTEXT);
		}
		return hardwareComponentPrototype_context;
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
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE_TARGET:
			if (resolve)
				return getHardwareComponentProtype_target();
			return basicGetHardwareComponentProtype_target();
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE_CONTEXT:
			return getHardwareComponentPrototype_context();
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
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE_TARGET:
			setHardwareComponentProtype_target((HardwareComponentPrototype) newValue);
			return;
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE_CONTEXT:
			getHardwareComponentPrototype_context().clear();
			getHardwareComponentPrototype_context().addAll((Collection<? extends HardwareComponentPrototype>) newValue);
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
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE_TARGET:
			setHardwareComponentProtype_target((HardwareComponentPrototype) null);
			return;
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE_CONTEXT:
			getHardwareComponentPrototype_context().clear();
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
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE_TARGET:
			return hardwareComponentProtype_target != null;
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE_CONTEXT:
			return hardwareComponentPrototype_context != null && !hardwareComponentPrototype_context.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // BehaviorConstraintPrototype_hardwareComponentTargetInstanceRefImpl
