/**
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

import org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTPseudostate;
import org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.UMLRealTimeStateMachPackage;

import org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.util.UMLRealTimeStateMachValidator;

import org.eclipse.uml2.uml.Pseudostate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RT Pseudostate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTPseudostateImpl#getBase_Pseudostate <em>Base Pseudostate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RTPseudostateImpl extends MinimalEObjectImpl.Container implements RTPseudostate {
	/**
	 * The cached value of the '{@link #getBase_Pseudostate() <em>Base Pseudostate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Pseudostate()
	 * @generated
	 * @ordered
	 */
	protected Pseudostate base_Pseudostate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTPseudostateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLRealTimeStateMachPackage.Literals.RT_PSEUDOSTATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate getBase_Pseudostate() {
		if (base_Pseudostate != null && base_Pseudostate.eIsProxy()) {
			InternalEObject oldBase_Pseudostate = (InternalEObject)base_Pseudostate;
			base_Pseudostate = (Pseudostate)eResolveProxy(oldBase_Pseudostate);
			if (base_Pseudostate != oldBase_Pseudostate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLRealTimeStateMachPackage.RT_PSEUDOSTATE__BASE_PSEUDOSTATE, oldBase_Pseudostate, base_Pseudostate));
			}
		}
		return base_Pseudostate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate basicGetBase_Pseudostate() {
		return base_Pseudostate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Pseudostate(Pseudostate newBase_Pseudostate) {
		Pseudostate oldBase_Pseudostate = base_Pseudostate;
		base_Pseudostate = newBase_Pseudostate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRealTimeStateMachPackage.RT_PSEUDOSTATE__BASE_PSEUDOSTATE, oldBase_Pseudostate, base_Pseudostate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean RTstatemachinesdonotsupportconcurrencyorshallowhistory(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UMLRealTimeStateMachValidator.RT_PSEUDOSTATE__RTSTATEMACHINESDONOTSUPPORTCONCURRENCYORSHALLOWHISTORY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RTstatemachinesdonotsupportconcurrencyorshallowhistory", EObjectValidator.getObjectLabel(this, context) }),
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
			case UMLRealTimeStateMachPackage.RT_PSEUDOSTATE__BASE_PSEUDOSTATE:
				if (resolve) return getBase_Pseudostate();
				return basicGetBase_Pseudostate();
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
			case UMLRealTimeStateMachPackage.RT_PSEUDOSTATE__BASE_PSEUDOSTATE:
				setBase_Pseudostate((Pseudostate)newValue);
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
			case UMLRealTimeStateMachPackage.RT_PSEUDOSTATE__BASE_PSEUDOSTATE:
				setBase_Pseudostate((Pseudostate)null);
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
			case UMLRealTimeStateMachPackage.RT_PSEUDOSTATE__BASE_PSEUDOSTATE:
				return base_Pseudostate != null;
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
			case UMLRealTimeStateMachPackage.RT_PSEUDOSTATE___RTSTATEMACHINESDONOTSUPPORTCONCURRENCYORSHALLOWHISTORY__DIAGNOSTICCHAIN_MAP:
				return RTstatemachinesdonotsupportconcurrencyorshallowhistory((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RTPseudostateImpl
