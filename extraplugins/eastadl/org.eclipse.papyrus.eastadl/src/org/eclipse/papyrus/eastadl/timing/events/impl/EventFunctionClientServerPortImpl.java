/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Sara TUCCI (CEA LIST) sara.tucci@cea.fr - Initial API and implementation
 *  Chokri MRAIDHA (CEA LIST) chokri.mraidha@cea.fr - Initial API and implementation
 *  David SERVAT (CEA LIST) david.servat@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.eastadl.timing.events.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.eastadl.infrastructure.EventFunctionClientServerPortInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatype;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAExpression;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.ValuesPackage;
import org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPort;
import org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPortKind;
import org.eclipse.papyrus.eastadl.timing.events.EventsPackage;
import org.eclipse.papyrus.eastadl.timing.impl.EventImpl;
import org.eclipse.uml2.uml.ValueSpecification;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Function Client Server Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.events.impl.EventFunctionClientServerPortImpl#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.events.impl.EventFunctionClientServerPortImpl#getBase_ValueSpecification <em>Base Value Specification</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.events.impl.EventFunctionClientServerPortImpl#getEventKind <em>Event Kind</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.events.impl.EventFunctionClientServerPortImpl#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventFunctionClientServerPortImpl extends EventImpl implements EventFunctionClientServerPort {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EADatatype type;

	/**
	 * The cached value of the '{@link #getBase_ValueSpecification() <em>Base Value Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBase_ValueSpecification()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification base_ValueSpecification;

	/**
	 * The default value of the '{@link #getEventKind() <em>Event Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getEventKind()
	 * @generated
	 * @ordered
	 */
	protected static final EventFunctionClientServerPortKind EVENT_KIND_EDEFAULT = EventFunctionClientServerPortKind.RECEIVED_REQUEST;

	/**
	 * The cached value of the '{@link #getEventKind() <em>Event Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getEventKind()
	 * @generated
	 * @ordered
	 */
	protected EventFunctionClientServerPortKind eventKind = EVENT_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EventFunctionClientServerPortInstanceRef port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EventFunctionClientServerPortImpl() {
		super();
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
		case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__TYPE:
			if (resolve) {
				return getType();
			}
			return basicGetType();
		case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__BASE_VALUE_SPECIFICATION:
			if (resolve) {
				return getBase_ValueSpecification();
			}
			return basicGetBase_ValueSpecification();
		case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__EVENT_KIND:
			return getEventKind();
		case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT:
			return getPort();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__TYPE:
			return type != null;
		case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__BASE_VALUE_SPECIFICATION:
			return base_ValueSpecification != null;
		case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__EVENT_KIND:
			return eventKind != EVENT_KIND_EDEFAULT;
		case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT:
			return port != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EAValue.class) {
			switch (derivedFeatureID) {
			case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__TYPE:
				return ValuesPackage.EA_VALUE__TYPE;
			case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__BASE_VALUE_SPECIFICATION:
				return ValuesPackage.EA_VALUE__BASE_VALUE_SPECIFICATION;
			default:
				return -1;
			}
		}
		if (baseClass == EAExpression.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EAValue.class) {
			switch (baseFeatureID) {
			case ValuesPackage.EA_VALUE__TYPE:
				return EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__TYPE;
			case ValuesPackage.EA_VALUE__BASE_VALUE_SPECIFICATION:
				return EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__BASE_VALUE_SPECIFICATION;
			default:
				return -1;
			}
		}
		if (baseClass == EAExpression.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__TYPE:
			setType((EADatatype) newValue);
			return;
		case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__BASE_VALUE_SPECIFICATION:
			setBase_ValueSpecification((ValueSpecification) newValue);
			return;
		case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__EVENT_KIND:
			setEventKind((EventFunctionClientServerPortKind) newValue);
			return;
		case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT:
			setPort((EventFunctionClientServerPortInstanceRef) newValue);
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
	protected EClass eStaticClass() {
		return EventsPackage.Literals.EVENT_FUNCTION_CLIENT_SERVER_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EADatatype getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (EADatatype) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__TYPE, oldType, type));
				}
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EADatatype basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setType(EADatatype newType) {
		EADatatype oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__TYPE, oldType, type));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ValueSpecification getBase_ValueSpecification() {
		if (base_ValueSpecification != null && base_ValueSpecification.eIsProxy()) {
			InternalEObject oldBase_ValueSpecification = (InternalEObject) base_ValueSpecification;
			base_ValueSpecification = (ValueSpecification) eResolveProxy(oldBase_ValueSpecification);
			if (base_ValueSpecification != oldBase_ValueSpecification) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__BASE_VALUE_SPECIFICATION, oldBase_ValueSpecification, base_ValueSpecification));
				}
			}
		}
		return base_ValueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ValueSpecification basicGetBase_ValueSpecification() {
		return base_ValueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setBase_ValueSpecification(ValueSpecification newBase_ValueSpecification) {
		ValueSpecification oldBase_ValueSpecification = base_ValueSpecification;
		base_ValueSpecification = newBase_ValueSpecification;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__BASE_VALUE_SPECIFICATION, oldBase_ValueSpecification, base_ValueSpecification));
		}
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
		case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__TYPE:
			setType((EADatatype) null);
			return;
		case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__BASE_VALUE_SPECIFICATION:
			setBase_ValueSpecification((ValueSpecification) null);
			return;
		case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__EVENT_KIND:
			setEventKind(EVENT_KIND_EDEFAULT);
			return;
		case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT:
			setPort((EventFunctionClientServerPortInstanceRef) null);
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
	public EventFunctionClientServerPortKind getEventKind() {
		return eventKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EventFunctionClientServerPortInstanceRef getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetPort(EventFunctionClientServerPortInstanceRef newPort, NotificationChain msgs) {
		EventFunctionClientServerPortInstanceRef oldPort = port;
		port = newPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT, oldPort, newPort);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setPort(EventFunctionClientServerPortInstanceRef newPort) {
		if (newPort != port) {
			NotificationChain msgs = null;
			if (port != null) {
				msgs = ((InternalEObject) port).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT, null, msgs);
			}
			if (newPort != null) {
				msgs = ((InternalEObject) newPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT, null, msgs);
			}
			msgs = basicSetPort(newPort, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT, newPort, newPort));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT:
			return basicSetPort(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setEventKind(EventFunctionClientServerPortKind newEventKind) {
		EventFunctionClientServerPortKind oldEventKind = eventKind;
		eventKind = newEventKind == null ? EVENT_KIND_EDEFAULT : newEventKind;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__EVENT_KIND, oldEventKind, eventKind));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (eventKind: ");
		result.append(eventKind);
		result.append(')');
		return result.toString();
	}

} // EventFunctionClientServerPortImpl
