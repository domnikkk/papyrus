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
import org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage;
import org.eclipse.papyrus.eastadl.infrastructure.TargetInstanceRef;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.AllocationTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.TargetInstanceRefImpl#getAllocationTarget <em>Allocation Target</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.TargetInstanceRefImpl#getAllocationTarget_context <em>Allocation Target context</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.TargetInstanceRefImpl#getIntAttribute <em>Int Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetInstanceRefImpl extends InstanceRefImpl implements TargetInstanceRef {
	/**
	 * The cached value of the '{@link #getAllocationTarget() <em>Allocation Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationTarget()
	 * @generated
	 * @ordered
	 */
	protected AllocationTarget allocationTarget;

	/**
	 * The cached value of the '{@link #getAllocationTarget_context() <em>Allocation Target context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationTarget_context()
	 * @generated
	 * @ordered
	 */
	protected EList<AllocationTarget> allocationTarget_context;

	/**
	 * The default value of the '{@link #getIntAttribute() <em>Int Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final int INT_ATTRIBUTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIntAttribute() <em>Int Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntAttribute()
	 * @generated
	 * @ordered
	 */
	protected int intAttribute = INT_ATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetInstanceRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.TARGET_INSTANCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationTarget getAllocationTarget() {
		if (allocationTarget != null && allocationTarget.eIsProxy()) {
			InternalEObject oldAllocationTarget = (InternalEObject)allocationTarget;
			allocationTarget = (AllocationTarget)eResolveProxy(oldAllocationTarget);
			if (allocationTarget != oldAllocationTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.TARGET_INSTANCE_REF__ALLOCATION_TARGET, oldAllocationTarget, allocationTarget));
			}
		}
		return allocationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationTarget basicGetAllocationTarget() {
		return allocationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocationTarget(AllocationTarget newAllocationTarget) {
		AllocationTarget oldAllocationTarget = allocationTarget;
		allocationTarget = newAllocationTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.TARGET_INSTANCE_REF__ALLOCATION_TARGET, oldAllocationTarget, allocationTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllocationTarget> getAllocationTarget_context() {
		if (allocationTarget_context == null) {
			allocationTarget_context = new EObjectResolvingEList<AllocationTarget>(AllocationTarget.class, this, InfrastructurePackage.TARGET_INSTANCE_REF__ALLOCATION_TARGET_CONTEXT);
		}
		return allocationTarget_context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIntAttribute() {
		return intAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntAttribute(int newIntAttribute) {
		int oldIntAttribute = intAttribute;
		intAttribute = newIntAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.TARGET_INSTANCE_REF__INT_ATTRIBUTE, oldIntAttribute, intAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfrastructurePackage.TARGET_INSTANCE_REF__ALLOCATION_TARGET:
				if (resolve) return getAllocationTarget();
				return basicGetAllocationTarget();
			case InfrastructurePackage.TARGET_INSTANCE_REF__ALLOCATION_TARGET_CONTEXT:
				return getAllocationTarget_context();
			case InfrastructurePackage.TARGET_INSTANCE_REF__INT_ATTRIBUTE:
				return getIntAttribute();
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
			case InfrastructurePackage.TARGET_INSTANCE_REF__ALLOCATION_TARGET:
				setAllocationTarget((AllocationTarget)newValue);
				return;
			case InfrastructurePackage.TARGET_INSTANCE_REF__ALLOCATION_TARGET_CONTEXT:
				getAllocationTarget_context().clear();
				getAllocationTarget_context().addAll((Collection<? extends AllocationTarget>)newValue);
				return;
			case InfrastructurePackage.TARGET_INSTANCE_REF__INT_ATTRIBUTE:
				setIntAttribute((Integer)newValue);
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
			case InfrastructurePackage.TARGET_INSTANCE_REF__ALLOCATION_TARGET:
				setAllocationTarget((AllocationTarget)null);
				return;
			case InfrastructurePackage.TARGET_INSTANCE_REF__ALLOCATION_TARGET_CONTEXT:
				getAllocationTarget_context().clear();
				return;
			case InfrastructurePackage.TARGET_INSTANCE_REF__INT_ATTRIBUTE:
				setIntAttribute(INT_ATTRIBUTE_EDEFAULT);
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
			case InfrastructurePackage.TARGET_INSTANCE_REF__ALLOCATION_TARGET:
				return allocationTarget != null;
			case InfrastructurePackage.TARGET_INSTANCE_REF__ALLOCATION_TARGET_CONTEXT:
				return allocationTarget_context != null && !allocationTarget_context.isEmpty();
			case InfrastructurePackage.TARGET_INSTANCE_REF__INT_ATTRIBUTE:
				return intAttribute != INT_ATTRIBUTE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (intAttribute: ");
		result.append(intAttribute);
		result.append(')');
		return result.toString();
	}

} //TargetInstanceRefImpl
