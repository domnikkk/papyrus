/**
 */
package org.eclipse.papyrus.umlrt.UMLRealTime.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.umlrt.UMLRealTime.MessageSet;
import org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage;

import org.eclipse.uml2.uml.Interface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.MessageSetImpl#getBase_Interface <em>Base Interface</em>}</li>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.MessageSetImpl#isIncoming <em>Is Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageSetImpl extends MinimalEObjectImpl.Container implements MessageSet {
	/**
	 * The cached value of the '{@link #getBase_Interface() <em>Base Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Interface()
	 * @generated
	 * @ordered
	 */
	protected Interface base_Interface;

	/**
	 * The default value of the '{@link #isIncoming() <em>Is Incoming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncoming()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INCOMING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIncoming() <em>Is Incoming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncoming()
	 * @generated
	 * @ordered
	 */
	protected boolean isIncoming = IS_INCOMING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLRealTimePackage.Literals.MESSAGE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getBase_Interface() {
		if (base_Interface != null && base_Interface.eIsProxy()) {
			InternalEObject oldBase_Interface = (InternalEObject)base_Interface;
			base_Interface = (Interface)eResolveProxy(oldBase_Interface);
			if (base_Interface != oldBase_Interface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLRealTimePackage.MESSAGE_SET__BASE_INTERFACE, oldBase_Interface, base_Interface));
			}
		}
		return base_Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetBase_Interface() {
		return base_Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Interface(Interface newBase_Interface) {
		Interface oldBase_Interface = base_Interface;
		base_Interface = newBase_Interface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRealTimePackage.MESSAGE_SET__BASE_INTERFACE, oldBase_Interface, base_Interface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncoming() {
		return isIncoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIncoming(boolean newIsIncoming) {
		boolean oldIsIncoming = isIncoming;
		isIncoming = newIsIncoming;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRealTimePackage.MESSAGE_SET__IS_INCOMING, oldIsIncoming, isIncoming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLRealTimePackage.MESSAGE_SET__BASE_INTERFACE:
				if (resolve) return getBase_Interface();
				return basicGetBase_Interface();
			case UMLRealTimePackage.MESSAGE_SET__IS_INCOMING:
				return isIncoming();
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
			case UMLRealTimePackage.MESSAGE_SET__BASE_INTERFACE:
				setBase_Interface((Interface)newValue);
				return;
			case UMLRealTimePackage.MESSAGE_SET__IS_INCOMING:
				setIsIncoming((Boolean)newValue);
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
			case UMLRealTimePackage.MESSAGE_SET__BASE_INTERFACE:
				setBase_Interface((Interface)null);
				return;
			case UMLRealTimePackage.MESSAGE_SET__IS_INCOMING:
				setIsIncoming(IS_INCOMING_EDEFAULT);
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
			case UMLRealTimePackage.MESSAGE_SET__BASE_INTERFACE:
				return base_Interface != null;
			case UMLRealTimePackage.MESSAGE_SET__IS_INCOMING:
				return isIncoming != IS_INCOMING_EDEFAULT;
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
		result.append(" (isIncoming: ");
		result.append(isIncoming);
		result.append(')');
		return result.toString();
	}

} //MessageSetImpl
