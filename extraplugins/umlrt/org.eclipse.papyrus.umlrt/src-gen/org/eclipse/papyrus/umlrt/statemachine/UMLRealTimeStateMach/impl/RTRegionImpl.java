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

import org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTRegion;
import org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.UMLRealTimeStateMachPackage;

import org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.util.UMLRealTimeStateMachValidator;

import org.eclipse.uml2.uml.Region;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RT Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTRegionImpl#getBase_Region <em>Base Region</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RTRegionImpl extends MinimalEObjectImpl.Container implements RTRegion {
	/**
	 * The cached value of the '{@link #getBase_Region() <em>Base Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Region()
	 * @generated
	 * @ordered
	 */
	protected Region base_Region;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLRealTimeStateMachPackage.Literals.RT_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getBase_Region() {
		if (base_Region != null && base_Region.eIsProxy()) {
			InternalEObject oldBase_Region = (InternalEObject)base_Region;
			base_Region = (Region)eResolveProxy(oldBase_Region);
			if (base_Region != oldBase_Region) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLRealTimeStateMachPackage.RT_REGION__BASE_REGION, oldBase_Region, base_Region));
			}
		}
		return base_Region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region basicGetBase_Region() {
		return base_Region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Region(Region newBase_Region) {
		Region oldBase_Region = base_Region;
		base_Region = newBase_Region;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRealTimeStateMachPackage.RT_REGION__BASE_REGION, oldBase_Region, base_Region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean RegionsinRTstatemachinescannothaveafinalstate(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UMLRealTimeStateMachValidator.RT_REGION__REGIONSIN_RTSTATEMACHINESCANNOTHAVEAFINALSTATE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RegionsinRTstatemachinescannothaveafinalstate", EObjectValidator.getObjectLabel(this, context) }),
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
			case UMLRealTimeStateMachPackage.RT_REGION__BASE_REGION:
				if (resolve) return getBase_Region();
				return basicGetBase_Region();
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
			case UMLRealTimeStateMachPackage.RT_REGION__BASE_REGION:
				setBase_Region((Region)newValue);
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
			case UMLRealTimeStateMachPackage.RT_REGION__BASE_REGION:
				setBase_Region((Region)null);
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
			case UMLRealTimeStateMachPackage.RT_REGION__BASE_REGION:
				return base_Region != null;
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
			case UMLRealTimeStateMachPackage.RT_REGION___REGIONSIN_RTSTATEMACHINESCANNOTHAVEAFINALSTATE__DIAGNOSTICCHAIN_MAP:
				return RegionsinRTstatemachinescannothaveafinalstate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RTRegionImpl
