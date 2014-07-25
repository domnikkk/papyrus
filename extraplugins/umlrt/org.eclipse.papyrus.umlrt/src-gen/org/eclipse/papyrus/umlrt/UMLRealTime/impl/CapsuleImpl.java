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

import org.eclipse.papyrus.umlrt.UMLRealTime.Capsule;
import org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage;

import org.eclipse.papyrus.umlrt.UMLRealTime.util.UMLRealTimeValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capsule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.CapsuleImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapsuleImpl extends MinimalEObjectImpl.Container implements Capsule {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapsuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLRealTimePackage.Literals.CAPSULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLRealTimePackage.CAPSULE__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRealTimePackage.CAPSULE__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Capsulesarealwaysactive(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UMLRealTimeValidator.CAPSULE__CAPSULESAREALWAYSACTIVE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Capsulesarealwaysactive", EObjectValidator.getObjectLabel(this, context) }), //$NON-NLS-1$ //$NON-NLS-2$
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
	public boolean AcapsulecannothaveReceptionfeatures(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UMLRealTimeValidator.CAPSULE__ACAPSULECANNOTHAVE_RECEPTIONFEATURES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AcapsulecannothaveReceptionfeatures", EObjectValidator.getObjectLabel(this, context) }), //$NON-NLS-1$ //$NON-NLS-2$
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
	public boolean Acapsuleclasscanalwaysbesubclassed(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UMLRealTimeValidator.CAPSULE__ACAPSULECLASSCANALWAYSBESUBCLASSED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Acapsuleclasscanalwaysbesubclassed", EObjectValidator.getObjectLabel(this, context) }), //$NON-NLS-1$ //$NON-NLS-2$
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
	public boolean Acapsulecanhaveatmostonesuperclass(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UMLRealTimeValidator.CAPSULE__ACAPSULECANHAVEATMOSTONESUPERCLASS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Acapsulecanhaveatmostonesuperclass", EObjectValidator.getObjectLabel(this, context) }), //$NON-NLS-1$ //$NON-NLS-2$
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
	public boolean Capsuleclassesarealwayssubstitutable(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UMLRealTimeValidator.CAPSULE__CAPSULECLASSESAREALWAYSSUBSTITUTABLE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Capsuleclassesarealwayssubstitutable", EObjectValidator.getObjectLabel(this, context) }), //$NON-NLS-1$ //$NON-NLS-2$
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
	public boolean Allattributesofacapsuleclasshaveexactlyonetype(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UMLRealTimeValidator.CAPSULE__ALLATTRIBUTESOFACAPSULECLASSHAVEEXACTLYONETYPE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Allattributesofacapsuleclasshaveexactlyonetype", EObjectValidator.getObjectLabel(this, context) }), //$NON-NLS-1$ //$NON-NLS-2$
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
	public boolean Privatevisibilityisnotsupportedoncapsulefeatures(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UMLRealTimeValidator.CAPSULE__PRIVATEVISIBILITYISNOTSUPPORTEDONCAPSULEFEATURES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Privatevisibilityisnotsupportedoncapsulefeatures", EObjectValidator.getObjectLabel(this, context) }), //$NON-NLS-1$ //$NON-NLS-2$
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
	public boolean Acapsuleclasscannothavenestedclassifiers(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UMLRealTimeValidator.CAPSULE__ACAPSULECLASSCANNOTHAVENESTEDCLASSIFIERS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Acapsuleclasscannothavenestedclassifiers", EObjectValidator.getObjectLabel(this, context) }), //$NON-NLS-1$ //$NON-NLS-2$
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
	public boolean Alloperationsofacapsulearesequential(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UMLRealTimeValidator.CAPSULE__ALLOPERATIONSOFACAPSULEARESEQUENTIAL,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Alloperationsofacapsulearesequential", EObjectValidator.getObjectLabel(this, context) }), //$NON-NLS-1$ //$NON-NLS-2$
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
			case UMLRealTimePackage.CAPSULE__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
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
			case UMLRealTimePackage.CAPSULE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
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
			case UMLRealTimePackage.CAPSULE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
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
			case UMLRealTimePackage.CAPSULE__BASE_CLASS:
				return base_Class != null;
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
			case UMLRealTimePackage.CAPSULE___CAPSULESAREALWAYSACTIVE__DIAGNOSTICCHAIN_MAP:
				return Capsulesarealwaysactive((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UMLRealTimePackage.CAPSULE___ACAPSULECANNOTHAVE_RECEPTIONFEATURES__DIAGNOSTICCHAIN_MAP:
				return AcapsulecannothaveReceptionfeatures((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UMLRealTimePackage.CAPSULE___ACAPSULECLASSCANALWAYSBESUBCLASSED__DIAGNOSTICCHAIN_MAP:
				return Acapsuleclasscanalwaysbesubclassed((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UMLRealTimePackage.CAPSULE___ACAPSULECANHAVEATMOSTONESUPERCLASS__DIAGNOSTICCHAIN_MAP:
				return Acapsulecanhaveatmostonesuperclass((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UMLRealTimePackage.CAPSULE___CAPSULECLASSESAREALWAYSSUBSTITUTABLE__DIAGNOSTICCHAIN_MAP:
				return Capsuleclassesarealwayssubstitutable((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UMLRealTimePackage.CAPSULE___ALLATTRIBUTESOFACAPSULECLASSHAVEEXACTLYONETYPE__DIAGNOSTICCHAIN_MAP:
				return Allattributesofacapsuleclasshaveexactlyonetype((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UMLRealTimePackage.CAPSULE___PRIVATEVISIBILITYISNOTSUPPORTEDONCAPSULEFEATURES__DIAGNOSTICCHAIN_MAP:
				return Privatevisibilityisnotsupportedoncapsulefeatures((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UMLRealTimePackage.CAPSULE___ACAPSULECLASSCANNOTHAVENESTEDCLASSIFIERS__DIAGNOSTICCHAIN_MAP:
				return Acapsuleclasscannothavenestedclassifiers((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UMLRealTimePackage.CAPSULE___ALLOPERATIONSOFACAPSULEARESEQUENTIAL__DIAGNOSTICCHAIN_MAP:
				return Alloperationsofacapsulearesequential((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CapsuleImpl
