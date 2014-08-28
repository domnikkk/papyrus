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
import org.eclipse.papyrus.eastadl.infrastructure.RefineInstanceRef;
import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refine Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.RefineInstanceRefImpl#getIdentifiable_target <em>Identifiable target</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.RefineInstanceRefImpl#getIdentifiable_context <em>Identifiable context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefineInstanceRefImpl extends InstanceRefImpl implements RefineInstanceRef {
	/**
	 * The cached value of the '{@link #getIdentifiable_target() <em>Identifiable target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getIdentifiable_target()
	 * @generated
	 * @ordered
	 */
	protected NamedElement identifiable_target;

	/**
	 * The cached value of the '{@link #getIdentifiable_context() <em>Identifiable context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getIdentifiable_context()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> identifiable_context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected RefineInstanceRefImpl() {
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
		return InfrastructurePackage.Literals.REFINE_INSTANCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NamedElement getIdentifiable_target() {
		if (identifiable_target != null && identifiable_target.eIsProxy()) {
			InternalEObject oldIdentifiable_target = (InternalEObject) identifiable_target;
			identifiable_target = (NamedElement) eResolveProxy(oldIdentifiable_target);
			if (identifiable_target != oldIdentifiable_target) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.REFINE_INSTANCE_REF__IDENTIFIABLE_TARGET, oldIdentifiable_target, identifiable_target));
				}
			}
		}
		return identifiable_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NamedElement basicGetIdentifiable_target() {
		return identifiable_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setIdentifiable_target(NamedElement newIdentifiable_target) {
		NamedElement oldIdentifiable_target = identifiable_target;
		identifiable_target = newIdentifiable_target;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.REFINE_INSTANCE_REF__IDENTIFIABLE_TARGET, oldIdentifiable_target, identifiable_target));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<NamedElement> getIdentifiable_context() {
		if (identifiable_context == null) {
			identifiable_context = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, InfrastructurePackage.REFINE_INSTANCE_REF__IDENTIFIABLE_CONTEXT);
		}
		return identifiable_context;
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
		case InfrastructurePackage.REFINE_INSTANCE_REF__IDENTIFIABLE_TARGET:
			if (resolve) {
				return getIdentifiable_target();
			}
			return basicGetIdentifiable_target();
		case InfrastructurePackage.REFINE_INSTANCE_REF__IDENTIFIABLE_CONTEXT:
			return getIdentifiable_context();
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
		case InfrastructurePackage.REFINE_INSTANCE_REF__IDENTIFIABLE_TARGET:
			setIdentifiable_target((NamedElement) newValue);
			return;
		case InfrastructurePackage.REFINE_INSTANCE_REF__IDENTIFIABLE_CONTEXT:
			getIdentifiable_context().clear();
			getIdentifiable_context().addAll((Collection<? extends NamedElement>) newValue);
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
		case InfrastructurePackage.REFINE_INSTANCE_REF__IDENTIFIABLE_TARGET:
			setIdentifiable_target((NamedElement) null);
			return;
		case InfrastructurePackage.REFINE_INSTANCE_REF__IDENTIFIABLE_CONTEXT:
			getIdentifiable_context().clear();
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
		case InfrastructurePackage.REFINE_INSTANCE_REF__IDENTIFIABLE_TARGET:
			return identifiable_target != null;
		case InfrastructurePackage.REFINE_INSTANCE_REF__IDENTIFIABLE_CONTEXT:
			return identifiable_context != null && !identifiable_context.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // RefineInstanceRefImpl
