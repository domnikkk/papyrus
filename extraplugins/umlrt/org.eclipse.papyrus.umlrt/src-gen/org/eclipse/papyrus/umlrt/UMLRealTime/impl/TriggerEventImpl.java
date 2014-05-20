/**
 */
package org.eclipse.papyrus.umlrt.UMLRealTime.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.umlrt.UMLRealTime.EventType;
import org.eclipse.papyrus.umlrt.UMLRealTime.TriggerEvent;
import org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage;

import org.eclipse.uml2.uml.SignalEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.TriggerEventImpl#getEvType <em>Ev Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.TriggerEventImpl#getBase_SignalEvent <em>Base Signal Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TriggerEventImpl extends MinimalEObjectImpl.Container implements TriggerEvent {
	/**
	 * The default value of the '{@link #getEvType() <em>Ev Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvType()
	 * @generated
	 * @ordered
	 */
	protected static final EventType EV_TYPE_EDEFAULT = EventType.IN_EVENT;

	/**
	 * The cached value of the '{@link #getEvType() <em>Ev Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvType()
	 * @generated
	 * @ordered
	 */
	protected EventType evType = EV_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_SignalEvent() <em>Base Signal Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_SignalEvent()
	 * @generated
	 * @ordered
	 */
	protected SignalEvent base_SignalEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLRealTimePackage.Literals.TRIGGER_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType getEvType() {
		return evType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvType(EventType newEvType) {
		EventType oldEvType = evType;
		evType = newEvType == null ? EV_TYPE_EDEFAULT : newEvType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRealTimePackage.TRIGGER_EVENT__EV_TYPE, oldEvType, evType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalEvent getBase_SignalEvent() {
		if (base_SignalEvent != null && base_SignalEvent.eIsProxy()) {
			InternalEObject oldBase_SignalEvent = (InternalEObject)base_SignalEvent;
			base_SignalEvent = (SignalEvent)eResolveProxy(oldBase_SignalEvent);
			if (base_SignalEvent != oldBase_SignalEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLRealTimePackage.TRIGGER_EVENT__BASE_SIGNAL_EVENT, oldBase_SignalEvent, base_SignalEvent));
			}
		}
		return base_SignalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalEvent basicGetBase_SignalEvent() {
		return base_SignalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_SignalEvent(SignalEvent newBase_SignalEvent) {
		SignalEvent oldBase_SignalEvent = base_SignalEvent;
		base_SignalEvent = newBase_SignalEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRealTimePackage.TRIGGER_EVENT__BASE_SIGNAL_EVENT, oldBase_SignalEvent, base_SignalEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLRealTimePackage.TRIGGER_EVENT__EV_TYPE:
				return getEvType();
			case UMLRealTimePackage.TRIGGER_EVENT__BASE_SIGNAL_EVENT:
				if (resolve) return getBase_SignalEvent();
				return basicGetBase_SignalEvent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLRealTimePackage.TRIGGER_EVENT__EV_TYPE:
				setEvType((EventType)newValue);
				return;
			case UMLRealTimePackage.TRIGGER_EVENT__BASE_SIGNAL_EVENT:
				setBase_SignalEvent((SignalEvent)newValue);
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
			case UMLRealTimePackage.TRIGGER_EVENT__EV_TYPE:
				setEvType(EV_TYPE_EDEFAULT);
				return;
			case UMLRealTimePackage.TRIGGER_EVENT__BASE_SIGNAL_EVENT:
				setBase_SignalEvent((SignalEvent)null);
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
			case UMLRealTimePackage.TRIGGER_EVENT__EV_TYPE:
				return evType != EV_TYPE_EDEFAULT;
			case UMLRealTimePackage.TRIGGER_EVENT__BASE_SIGNAL_EVENT:
				return base_SignalEvent != null;
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
		result.append(" (evType: ");
		result.append(evType);
		result.append(')');
		return result.toString();
	}

} //TriggerEventImpl
