/**
 */
package org.eclipse.papyrus.eastadl.requirements.usecases.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.TraceableSpecificationImpl;
import org.eclipse.papyrus.eastadl.requirements.usecases.Actor;
import org.eclipse.papyrus.eastadl.requirements.usecases.UsecasesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.usecases.impl.ActorImpl#getBase_Actor <em>Base Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorImpl extends TraceableSpecificationImpl implements Actor {
	/**
	 * The cached value of the '{@link #getBase_Actor() <em>Base Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBase_Actor()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Actor base_Actor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ActorImpl() {
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
		return UsecasesPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public org.eclipse.uml2.uml.Actor getBase_Actor() {
		if (base_Actor != null && base_Actor.eIsProxy()) {
			InternalEObject oldBase_Actor = (InternalEObject) base_Actor;
			base_Actor = (org.eclipse.uml2.uml.Actor) eResolveProxy(oldBase_Actor);
			if (base_Actor != oldBase_Actor) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsecasesPackage.ACTOR__BASE_ACTOR, oldBase_Actor, base_Actor));
				}
			}
		}
		return base_Actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public org.eclipse.uml2.uml.Actor basicGetBase_Actor() {
		return base_Actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setBase_Actor(org.eclipse.uml2.uml.Actor newBase_Actor) {
		org.eclipse.uml2.uml.Actor oldBase_Actor = base_Actor;
		base_Actor = newBase_Actor;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UsecasesPackage.ACTOR__BASE_ACTOR, oldBase_Actor, base_Actor));
		}
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
		case UsecasesPackage.ACTOR__BASE_ACTOR:
			if (resolve) {
				return getBase_Actor();
			}
			return basicGetBase_Actor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UsecasesPackage.ACTOR__BASE_ACTOR:
			setBase_Actor((org.eclipse.uml2.uml.Actor) newValue);
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
		case UsecasesPackage.ACTOR__BASE_ACTOR:
			setBase_Actor((org.eclipse.uml2.uml.Actor) null);
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
		case UsecasesPackage.ACTOR__BASE_ACTOR:
			return base_Actor != null;
		}
		return super.eIsSet(featureID);
	}

} // ActorImpl
