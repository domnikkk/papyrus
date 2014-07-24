/**
 * Copyright (c) 2014 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.umlrt.UMLRealTime.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.papyrus.umlrt.UMLRealTime.PortRegistrationType;
import org.eclipse.papyrus.umlrt.UMLRealTime.RTPort;
import org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage;

import org.eclipse.papyrus.umlrt.UMLRealTime.util.UMLRealTimeValidator;

import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RT Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTPortImpl#isNotification <em>Is Notification</em>}</li>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTPortImpl#isPublish <em>Is Publish</em>}</li>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTPortImpl#isWired <em>Is Wired</em>}</li>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTPortImpl#getRegistration <em>Registration</em>}</li>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTPortImpl#getRegistrationOverride <em>Registration Override</em>}</li>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTPortImpl#getBase_Port <em>Base Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RTPortImpl extends MinimalEObjectImpl.Container implements RTPort {
	/**
	 * The default value of the '{@link #isNotification() <em>Is Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotification()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NOTIFICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNotification() <em>Is Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotification()
	 * @generated
	 * @ordered
	 */
	protected boolean isNotification = IS_NOTIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isPublish() <em>Is Publish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublish()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PUBLISH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPublish() <em>Is Publish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublish()
	 * @generated
	 * @ordered
	 */
	protected boolean isPublish = IS_PUBLISH_EDEFAULT;

	/**
	 * The default value of the '{@link #isWired() <em>Is Wired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_WIRED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isWired() <em>Is Wired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWired()
	 * @generated
	 * @ordered
	 */
	protected boolean isWired = IS_WIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegistration() <em>Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistration()
	 * @generated
	 * @ordered
	 */
	protected static final PortRegistrationType REGISTRATION_EDEFAULT = PortRegistrationType.AUTOMATIC;

	/**
	 * The cached value of the '{@link #getRegistration() <em>Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistration()
	 * @generated
	 * @ordered
	 */
	protected PortRegistrationType registration = REGISTRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegistrationOverride() <em>Registration Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRATION_OVERRIDE_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getRegistrationOverride() <em>Registration Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationOverride()
	 * @generated
	 * @ordered
	 */
	protected String registrationOverride = REGISTRATION_OVERRIDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Port() <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Port()
	 * @generated
	 * @ordered
	 */
	protected Port base_Port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLRealTimePackage.Literals.RT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNotification() {
		return isNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNotification(boolean newIsNotification) {
		boolean oldIsNotification = isNotification;
		isNotification = newIsNotification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRealTimePackage.RT_PORT__IS_NOTIFICATION, oldIsNotification, isNotification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPublish() {
		return isPublish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPublish(boolean newIsPublish) {
		boolean oldIsPublish = isPublish;
		isPublish = newIsPublish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRealTimePackage.RT_PORT__IS_PUBLISH, oldIsPublish, isPublish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWired() {
		return isWired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsWired(boolean newIsWired) {
		boolean oldIsWired = isWired;
		isWired = newIsWired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRealTimePackage.RT_PORT__IS_WIRED, oldIsWired, isWired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRegistrationType getRegistration() {
		return registration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistration(PortRegistrationType newRegistration) {
		PortRegistrationType oldRegistration = registration;
		registration = newRegistration == null ? REGISTRATION_EDEFAULT : newRegistration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRealTimePackage.RT_PORT__REGISTRATION, oldRegistration, registration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegistrationOverride() {
		return registrationOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistrationOverride(String newRegistrationOverride) {
		String oldRegistrationOverride = registrationOverride;
		registrationOverride = newRegistrationOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRealTimePackage.RT_PORT__REGISTRATION_OVERRIDE, oldRegistrationOverride, registrationOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getBase_Port() {
		if (base_Port != null && base_Port.eIsProxy()) {
			InternalEObject oldBase_Port = (InternalEObject)base_Port;
			base_Port = (Port)eResolveProxy(oldBase_Port);
			if (base_Port != oldBase_Port) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLRealTimePackage.RT_PORT__BASE_PORT, oldBase_Port, base_Port));
			}
		}
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetBase_Port() {
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Port(Port newBase_Port) {
		Port oldBase_Port = base_Port;
		base_Port = newBase_Port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRealTimePackage.RT_PORT__BASE_PORT, oldBase_Port, base_Port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Awiredportcannotpublishitsname(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UMLRealTimeValidator.DIAGNOSTIC_SOURCE,
						 UMLRealTimeValidator.RT_PORT__AWIREDPORTCANNOTPUBLISHITSNAME,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Awiredportcannotpublishitsname", EObjectValidator.getObjectLabel(this, context) }), //$NON-NLS-1$ //$NON-NLS-2$
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Apublicportmustbedefinedasaserviceport(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UMLRealTimeValidator.DIAGNOSTIC_SOURCE,
						 UMLRealTimeValidator.RT_PORT__APUBLICPORTMUSTBEDEFINEDASASERVICEPORT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Apublicportmustbedefinedasaserviceport", EObjectValidator.getObjectLabel(this, context) }), //$NON-NLS-1$ //$NON-NLS-2$
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ASAPunwiredunpublishedmusthaveprotectedvisibility(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UMLRealTimeValidator.DIAGNOSTIC_SOURCE,
						 UMLRealTimeValidator.RT_PORT__ASA_PUNWIREDUNPUBLISHEDMUSTHAVEPROTECTEDVISIBILITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ASAPunwiredunpublishedmusthaveprotectedvisibility", EObjectValidator.getObjectLabel(this, context) }), //$NON-NLS-1$ //$NON-NLS-2$
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AnSPPunwiredandpublishedmusthavepublicvisibility(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UMLRealTimeValidator.DIAGNOSTIC_SOURCE,
						 UMLRealTimeValidator.RT_PORT__AN_SP_PUNWIREDANDPUBLISHEDMUSTHAVEPUBLICVISIBILITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AnSPPunwiredandpublishedmusthavepublicvisibility", EObjectValidator.getObjectLabel(this, context) }), //$NON-NLS-1$ //$NON-NLS-2$
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLRealTimePackage.RT_PORT__IS_NOTIFICATION:
				return isNotification();
			case UMLRealTimePackage.RT_PORT__IS_PUBLISH:
				return isPublish();
			case UMLRealTimePackage.RT_PORT__IS_WIRED:
				return isWired();
			case UMLRealTimePackage.RT_PORT__REGISTRATION:
				return getRegistration();
			case UMLRealTimePackage.RT_PORT__REGISTRATION_OVERRIDE:
				return getRegistrationOverride();
			case UMLRealTimePackage.RT_PORT__BASE_PORT:
				if (resolve) return getBase_Port();
				return basicGetBase_Port();
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
			case UMLRealTimePackage.RT_PORT__IS_NOTIFICATION:
				setIsNotification((Boolean)newValue);
				return;
			case UMLRealTimePackage.RT_PORT__IS_PUBLISH:
				setIsPublish((Boolean)newValue);
				return;
			case UMLRealTimePackage.RT_PORT__IS_WIRED:
				setIsWired((Boolean)newValue);
				return;
			case UMLRealTimePackage.RT_PORT__REGISTRATION:
				setRegistration((PortRegistrationType)newValue);
				return;
			case UMLRealTimePackage.RT_PORT__REGISTRATION_OVERRIDE:
				setRegistrationOverride((String)newValue);
				return;
			case UMLRealTimePackage.RT_PORT__BASE_PORT:
				setBase_Port((Port)newValue);
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
			case UMLRealTimePackage.RT_PORT__IS_NOTIFICATION:
				setIsNotification(IS_NOTIFICATION_EDEFAULT);
				return;
			case UMLRealTimePackage.RT_PORT__IS_PUBLISH:
				setIsPublish(IS_PUBLISH_EDEFAULT);
				return;
			case UMLRealTimePackage.RT_PORT__IS_WIRED:
				setIsWired(IS_WIRED_EDEFAULT);
				return;
			case UMLRealTimePackage.RT_PORT__REGISTRATION:
				setRegistration(REGISTRATION_EDEFAULT);
				return;
			case UMLRealTimePackage.RT_PORT__REGISTRATION_OVERRIDE:
				setRegistrationOverride(REGISTRATION_OVERRIDE_EDEFAULT);
				return;
			case UMLRealTimePackage.RT_PORT__BASE_PORT:
				setBase_Port((Port)null);
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
			case UMLRealTimePackage.RT_PORT__IS_NOTIFICATION:
				return isNotification != IS_NOTIFICATION_EDEFAULT;
			case UMLRealTimePackage.RT_PORT__IS_PUBLISH:
				return isPublish != IS_PUBLISH_EDEFAULT;
			case UMLRealTimePackage.RT_PORT__IS_WIRED:
				return isWired != IS_WIRED_EDEFAULT;
			case UMLRealTimePackage.RT_PORT__REGISTRATION:
				return registration != REGISTRATION_EDEFAULT;
			case UMLRealTimePackage.RT_PORT__REGISTRATION_OVERRIDE:
				return REGISTRATION_OVERRIDE_EDEFAULT == null ? registrationOverride != null : !REGISTRATION_OVERRIDE_EDEFAULT.equals(registrationOverride);
			case UMLRealTimePackage.RT_PORT__BASE_PORT:
				return base_Port != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case UMLRealTimePackage.RT_PORT___AWIREDPORTCANNOTPUBLISHITSNAME__DIAGNOSTICCHAIN_MAP:
				return Awiredportcannotpublishitsname((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UMLRealTimePackage.RT_PORT___APUBLICPORTMUSTBEDEFINEDASASERVICEPORT__DIAGNOSTICCHAIN_MAP:
				return Apublicportmustbedefinedasaserviceport((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UMLRealTimePackage.RT_PORT___ASA_PUNWIREDUNPUBLISHEDMUSTHAVEPROTECTEDVISIBILITY__DIAGNOSTICCHAIN_MAP:
				return ASAPunwiredunpublishedmusthaveprotectedvisibility((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UMLRealTimePackage.RT_PORT___AN_SP_PUNWIREDANDPUBLISHEDMUSTHAVEPUBLICVISIBILITY__DIAGNOSTICCHAIN_MAP:
				return AnSPPunwiredandpublishedmusthavepublicvisibility((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (isNotification: "); //$NON-NLS-1$
		result.append(isNotification);
		result.append(", isPublish: "); //$NON-NLS-1$
		result.append(isPublish);
		result.append(", isWired: "); //$NON-NLS-1$
		result.append(isWired);
		result.append(", registration: "); //$NON-NLS-1$
		result.append(registration);
		result.append(", registrationOverride: "); //$NON-NLS-1$
		result.append(registrationOverride);
		result.append(')');
		return result.toString();
	}

} //RTPortImpl
