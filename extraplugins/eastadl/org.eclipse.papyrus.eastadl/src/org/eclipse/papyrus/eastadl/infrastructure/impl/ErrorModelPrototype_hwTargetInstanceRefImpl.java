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
import org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_hwTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentPrototype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Model Prototype hw Target Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.ErrorModelPrototype_hwTargetInstanceRefImpl#getHardwareComponentProtype <em>Hardware Component Protype</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.ErrorModelPrototype_hwTargetInstanceRefImpl#getHardwareComponentProtype_context <em>Hardware Component Protype context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorModelPrototype_hwTargetInstanceRefImpl extends InstanceRefImpl implements ErrorModelPrototype_hwTargetInstanceRef {
	/**
	 * The cached value of the '{@link #getHardwareComponentProtype() <em>Hardware Component Protype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getHardwareComponentProtype()
	 * @generated
	 * @ordered
	 */
	protected HardwareComponentPrototype hardwareComponentProtype;

	/**
	 * The cached value of the '{@link #getHardwareComponentProtype_context() <em>Hardware Component Protype context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getHardwareComponentProtype_context()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareComponentPrototype> hardwareComponentProtype_context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ErrorModelPrototype_hwTargetInstanceRefImpl() {
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
		return InfrastructurePackage.Literals.ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public HardwareComponentPrototype getHardwareComponentProtype() {
		if (hardwareComponentProtype != null && hardwareComponentProtype.eIsProxy()) {
			InternalEObject oldHardwareComponentProtype = (InternalEObject) hardwareComponentProtype;
			hardwareComponentProtype = (HardwareComponentPrototype) eResolveProxy(oldHardwareComponentProtype);
			if (hardwareComponentProtype != oldHardwareComponentProtype) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE, oldHardwareComponentProtype, hardwareComponentProtype));
				}
			}
		}
		return hardwareComponentProtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HardwareComponentPrototype basicGetHardwareComponentProtype() {
		return hardwareComponentProtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setHardwareComponentProtype(HardwareComponentPrototype newHardwareComponentProtype) {
		HardwareComponentPrototype oldHardwareComponentProtype = hardwareComponentProtype;
		hardwareComponentProtype = newHardwareComponentProtype;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE, oldHardwareComponentProtype, hardwareComponentProtype));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<HardwareComponentPrototype> getHardwareComponentProtype_context() {
		if (hardwareComponentProtype_context == null) {
			hardwareComponentProtype_context = new EObjectResolvingEList<HardwareComponentPrototype>(HardwareComponentPrototype.class, this, InfrastructurePackage.ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE_CONTEXT);
		}
		return hardwareComponentProtype_context;
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
		case InfrastructurePackage.ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE:
			if (resolve) {
				return getHardwareComponentProtype();
			}
			return basicGetHardwareComponentProtype();
		case InfrastructurePackage.ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE_CONTEXT:
			return getHardwareComponentProtype_context();
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
		case InfrastructurePackage.ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE:
			setHardwareComponentProtype((HardwareComponentPrototype) newValue);
			return;
		case InfrastructurePackage.ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE_CONTEXT:
			getHardwareComponentProtype_context().clear();
			getHardwareComponentProtype_context().addAll((Collection<? extends HardwareComponentPrototype>) newValue);
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
		case InfrastructurePackage.ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE:
			setHardwareComponentProtype((HardwareComponentPrototype) null);
			return;
		case InfrastructurePackage.ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE_CONTEXT:
			getHardwareComponentProtype_context().clear();
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
		case InfrastructurePackage.ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE:
			return hardwareComponentProtype != null;
		case InfrastructurePackage.ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE_CONTEXT:
			return hardwareComponentProtype_context != null && !hardwareComponentProtype_context.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ErrorModelPrototype_hwTargetInstanceRefImpl
