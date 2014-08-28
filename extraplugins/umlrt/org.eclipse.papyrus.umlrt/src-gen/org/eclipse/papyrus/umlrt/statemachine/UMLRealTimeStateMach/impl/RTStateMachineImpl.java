/**
 * Copyright (c) 2014 CEA LIST.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl;

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

import org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTStateMachine;
import org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.UMLRealTimeStateMachPackage;

import org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.util.UMLRealTimeStateMachValidator;

import org.eclipse.uml2.uml.StateMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RT State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTStateMachineImpl#getBase_StateMachine <em>Base State Machine</em>}</li>
 * <li>{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTStateMachineImpl#isPassive <em>Is Passive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RTStateMachineImpl extends MinimalEObjectImpl.Container implements RTStateMachine {
	/**
	 * The cached value of the '{@link #getBase_StateMachine() <em>Base State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBase_StateMachine()
	 * @generated
	 * @ordered
	 */
	protected StateMachine base_StateMachine;

	/**
	 * The default value of the '{@link #isPassive() <em>Is Passive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isPassive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PASSIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPassive() <em>Is Passive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isPassive()
	 * @generated
	 * @ordered
	 */
	protected boolean isPassive = IS_PASSIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RTStateMachineImpl() {
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
		return UMLRealTimeStateMachPackage.Literals.RT_STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public StateMachine getBase_StateMachine() {
		if (base_StateMachine != null && base_StateMachine.eIsProxy()) {
			InternalEObject oldBase_StateMachine = (InternalEObject) base_StateMachine;
			base_StateMachine = (StateMachine) eResolveProxy(oldBase_StateMachine);
			if (base_StateMachine != oldBase_StateMachine) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLRealTimeStateMachPackage.RT_STATE_MACHINE__BASE_STATE_MACHINE, oldBase_StateMachine, base_StateMachine));
				}
			}
		}
		return base_StateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StateMachine basicGetBase_StateMachine() {
		return base_StateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setBase_StateMachine(StateMachine newBase_StateMachine) {
		StateMachine oldBase_StateMachine = base_StateMachine;
		base_StateMachine = newBase_StateMachine;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRealTimeStateMachPackage.RT_STATE_MACHINE__BASE_STATE_MACHINE, oldBase_StateMachine, base_StateMachine));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isPassive() {
		return isPassive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setIsPassive(boolean newIsPassive) {
		boolean oldIsPassive = isPassive;
		isPassive = newIsPassive;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRealTimeStateMachPackage.RT_STATE_MACHINE__IS_PASSIVE, oldIsPassive, isPassive));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean AnRTstatemachinehasexactlyoneregion(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
						(new BasicDiagnostic
						(Diagnostic.ERROR,
								UMLRealTimeStateMachValidator.DIAGNOSTIC_SOURCE,
								UMLRealTimeStateMachValidator.RT_STATE_MACHINE__AN_RTSTATEMACHINEHASEXACTLYONEREGION,
								EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AnRTstatemachinehasexactlyoneregion", EObjectValidator.getObjectLabel(this, context) }), //$NON-NLS-1$ //$NON-NLS-2$
								new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean AnRTstatemachineisneverreentrant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
						(new BasicDiagnostic
						(Diagnostic.ERROR,
								UMLRealTimeStateMachValidator.DIAGNOSTIC_SOURCE,
								UMLRealTimeStateMachValidator.RT_STATE_MACHINE__AN_RTSTATEMACHINEISNEVERREENTRANT,
								EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AnRTstatemachineisneverreentrant", EObjectValidator.getObjectLabel(this, context) }), //$NON-NLS-1$ //$NON-NLS-2$
								new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean RTstatemachinesdonothaveparametersorparametersets(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
						(new BasicDiagnostic
						(Diagnostic.ERROR,
								UMLRealTimeStateMachValidator.DIAGNOSTIC_SOURCE,
								UMLRealTimeStateMachValidator.RT_STATE_MACHINE__RTSTATEMACHINESDONOTHAVEPARAMETERSORPARAMETERSETS,
								EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RTstatemachinesdonothaveparametersorparametersets", EObjectValidator.getObjectLabel(this, context) }), //$NON-NLS-1$ //$NON-NLS-2$
								new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean RTstatemachinesmusthaveacontextanditmustbeaClass(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
						(new BasicDiagnostic
						(Diagnostic.ERROR,
								UMLRealTimeStateMachValidator.DIAGNOSTIC_SOURCE,
								UMLRealTimeStateMachValidator.RT_STATE_MACHINE__RTSTATEMACHINESMUSTHAVEACONTEXTANDITMUSTBEA_CLASS,
								EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RTstatemachinesmusthaveacontextanditmustbeaClass", EObjectValidator.getObjectLabel(this, context) }), //$NON-NLS-1$ //$NON-NLS-2$
								new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean Passivestatemachineareonlyallowedonpassivedataclasses(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
						(new BasicDiagnostic
						(Diagnostic.ERROR,
								UMLRealTimeStateMachValidator.DIAGNOSTIC_SOURCE,
								UMLRealTimeStateMachValidator.RT_STATE_MACHINE__PASSIVESTATEMACHINEAREONLYALLOWEDONPASSIVEDATACLASSES,
								EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Passivestatemachineareonlyallowedonpassivedataclasses", EObjectValidator.getObjectLabel(this, context) }), //$NON-NLS-1$ //$NON-NLS-2$
								new Object[] { this }));
			}
			return false;
		}
		return true;
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
		case UMLRealTimeStateMachPackage.RT_STATE_MACHINE__BASE_STATE_MACHINE:
			if (resolve) {
				return getBase_StateMachine();
			}
			return basicGetBase_StateMachine();
		case UMLRealTimeStateMachPackage.RT_STATE_MACHINE__IS_PASSIVE:
			return isPassive();
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
		case UMLRealTimeStateMachPackage.RT_STATE_MACHINE__BASE_STATE_MACHINE:
			setBase_StateMachine((StateMachine) newValue);
			return;
		case UMLRealTimeStateMachPackage.RT_STATE_MACHINE__IS_PASSIVE:
			setIsPassive((Boolean) newValue);
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
		case UMLRealTimeStateMachPackage.RT_STATE_MACHINE__BASE_STATE_MACHINE:
			setBase_StateMachine((StateMachine) null);
			return;
		case UMLRealTimeStateMachPackage.RT_STATE_MACHINE__IS_PASSIVE:
			setIsPassive(IS_PASSIVE_EDEFAULT);
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
		case UMLRealTimeStateMachPackage.RT_STATE_MACHINE__BASE_STATE_MACHINE:
			return base_StateMachine != null;
		case UMLRealTimeStateMachPackage.RT_STATE_MACHINE__IS_PASSIVE:
			return isPassive != IS_PASSIVE_EDEFAULT;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case UMLRealTimeStateMachPackage.RT_STATE_MACHINE___AN_RTSTATEMACHINEHASEXACTLYONEREGION__DIAGNOSTICCHAIN_MAP:
			return AnRTstatemachinehasexactlyoneregion((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLRealTimeStateMachPackage.RT_STATE_MACHINE___AN_RTSTATEMACHINEISNEVERREENTRANT__DIAGNOSTICCHAIN_MAP:
			return AnRTstatemachineisneverreentrant((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLRealTimeStateMachPackage.RT_STATE_MACHINE___RTSTATEMACHINESDONOTHAVEPARAMETERSORPARAMETERSETS__DIAGNOSTICCHAIN_MAP:
			return RTstatemachinesdonothaveparametersorparametersets((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLRealTimeStateMachPackage.RT_STATE_MACHINE___RTSTATEMACHINESMUSTHAVEACONTEXTANDITMUSTBEA_CLASS__DIAGNOSTICCHAIN_MAP:
			return RTstatemachinesmusthaveacontextanditmustbeaClass((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLRealTimeStateMachPackage.RT_STATE_MACHINE___PASSIVESTATEMACHINEAREONLYALLOWEDONPASSIVEDATACLASSES__DIAGNOSTICCHAIN_MAP:
			return Passivestatemachineareonlyallowedonpassivedataclasses((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (isPassive: "); //$NON-NLS-1$
		result.append(isPassive);
		result.append(')');
		return result.toString();
	}

} // RTStateMachineImpl
