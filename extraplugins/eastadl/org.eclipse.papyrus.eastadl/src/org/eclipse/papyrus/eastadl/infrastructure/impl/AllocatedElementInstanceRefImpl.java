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
import org.eclipse.papyrus.eastadl.infrastructure.AllocatedElementInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.AllocateableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocated Element Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.AllocatedElementInstanceRefImpl#getAllocateableElement <em>Allocateable Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.AllocatedElementInstanceRefImpl#getAllocateableElement_context <em>Allocateable Element context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllocatedElementInstanceRefImpl extends InstanceRefImpl implements AllocatedElementInstanceRef {
	/**
	 * The cached value of the '{@link #getAllocateableElement() <em>Allocateable Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getAllocateableElement()
	 * @generated
	 * @ordered
	 */
	protected AllocateableElement allocateableElement;

	/**
	 * The cached value of the '{@link #getAllocateableElement_context() <em>Allocateable Element context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getAllocateableElement_context()
	 * @generated
	 * @ordered
	 */
	protected EList<AllocateableElement> allocateableElement_context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected AllocatedElementInstanceRefImpl() {
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
		return InfrastructurePackage.Literals.ALLOCATED_ELEMENT_INSTANCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public AllocateableElement getAllocateableElement() {
		if (allocateableElement != null && allocateableElement.eIsProxy()) {
			InternalEObject oldAllocateableElement = (InternalEObject) allocateableElement;
			allocateableElement = (AllocateableElement) eResolveProxy(oldAllocateableElement);
			if (allocateableElement != oldAllocateableElement) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.ALLOCATED_ELEMENT_INSTANCE_REF__ALLOCATEABLE_ELEMENT, oldAllocateableElement, allocateableElement));
				}
			}
		}
		return allocateableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public AllocateableElement basicGetAllocateableElement() {
		return allocateableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setAllocateableElement(AllocateableElement newAllocateableElement) {
		AllocateableElement oldAllocateableElement = allocateableElement;
		allocateableElement = newAllocateableElement;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.ALLOCATED_ELEMENT_INSTANCE_REF__ALLOCATEABLE_ELEMENT, oldAllocateableElement, allocateableElement));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<AllocateableElement> getAllocateableElement_context() {
		if (allocateableElement_context == null) {
			allocateableElement_context = new EObjectResolvingEList<AllocateableElement>(AllocateableElement.class, this, InfrastructurePackage.ALLOCATED_ELEMENT_INSTANCE_REF__ALLOCATEABLE_ELEMENT_CONTEXT);
		}
		return allocateableElement_context;
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
		case InfrastructurePackage.ALLOCATED_ELEMENT_INSTANCE_REF__ALLOCATEABLE_ELEMENT:
			if (resolve) {
				return getAllocateableElement();
			}
			return basicGetAllocateableElement();
		case InfrastructurePackage.ALLOCATED_ELEMENT_INSTANCE_REF__ALLOCATEABLE_ELEMENT_CONTEXT:
			return getAllocateableElement_context();
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
		case InfrastructurePackage.ALLOCATED_ELEMENT_INSTANCE_REF__ALLOCATEABLE_ELEMENT:
			setAllocateableElement((AllocateableElement) newValue);
			return;
		case InfrastructurePackage.ALLOCATED_ELEMENT_INSTANCE_REF__ALLOCATEABLE_ELEMENT_CONTEXT:
			getAllocateableElement_context().clear();
			getAllocateableElement_context().addAll((Collection<? extends AllocateableElement>) newValue);
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
		case InfrastructurePackage.ALLOCATED_ELEMENT_INSTANCE_REF__ALLOCATEABLE_ELEMENT:
			setAllocateableElement((AllocateableElement) null);
			return;
		case InfrastructurePackage.ALLOCATED_ELEMENT_INSTANCE_REF__ALLOCATEABLE_ELEMENT_CONTEXT:
			getAllocateableElement_context().clear();
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
		case InfrastructurePackage.ALLOCATED_ELEMENT_INSTANCE_REF__ALLOCATEABLE_ELEMENT:
			return allocateableElement != null;
		case InfrastructurePackage.ALLOCATED_ELEMENT_INSTANCE_REF__ALLOCATEABLE_ELEMENT_CONTEXT:
			return allocateableElement_context != null && !allocateableElement_context.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // AllocatedElementInstanceRefImpl
