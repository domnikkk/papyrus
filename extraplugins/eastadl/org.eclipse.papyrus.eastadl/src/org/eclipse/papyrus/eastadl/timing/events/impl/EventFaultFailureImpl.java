/**
 */
package org.eclipse.papyrus.eastadl.timing.events.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.eastadl.dependability.safetyconstraints.FaultFailure;
import org.eclipse.papyrus.eastadl.timing.events.EventFaultFailure;
import org.eclipse.papyrus.eastadl.timing.events.EventsPackage;
import org.eclipse.papyrus.eastadl.timing.impl.EventImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Fault Failure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.events.impl.EventFaultFailureImpl#getFaultFailure <em>Fault Failure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventFaultFailureImpl extends EventImpl implements EventFaultFailure {
	/**
	 * The cached value of the '{@link #getFaultFailure() <em>Fault Failure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFaultFailure()
	 * @generated
	 * @ordered
	 */
	protected FaultFailure faultFailure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EventFaultFailureImpl() {
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
		return EventsPackage.Literals.EVENT_FAULT_FAILURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public FaultFailure getFaultFailure() {
		if (faultFailure != null && faultFailure.eIsProxy()) {
			InternalEObject oldFaultFailure = (InternalEObject) faultFailure;
			faultFailure = (FaultFailure) eResolveProxy(oldFaultFailure);
			if (faultFailure != oldFaultFailure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventsPackage.EVENT_FAULT_FAILURE__FAULT_FAILURE, oldFaultFailure, faultFailure));
			}
		}
		return faultFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public FaultFailure basicGetFaultFailure() {
		return faultFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setFaultFailure(FaultFailure newFaultFailure) {
		FaultFailure oldFaultFailure = faultFailure;
		faultFailure = newFaultFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.EVENT_FAULT_FAILURE__FAULT_FAILURE, oldFaultFailure, faultFailure));
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
		case EventsPackage.EVENT_FAULT_FAILURE__FAULT_FAILURE:
			if (resolve)
				return getFaultFailure();
			return basicGetFaultFailure();
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
		case EventsPackage.EVENT_FAULT_FAILURE__FAULT_FAILURE:
			setFaultFailure((FaultFailure) newValue);
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
		case EventsPackage.EVENT_FAULT_FAILURE__FAULT_FAILURE:
			setFaultFailure((FaultFailure) null);
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
		case EventsPackage.EVENT_FAULT_FAILURE__FAULT_FAILURE:
			return faultFailure != null;
		}
		return super.eIsSet(featureID);
	}

} // EventFaultFailureImpl
