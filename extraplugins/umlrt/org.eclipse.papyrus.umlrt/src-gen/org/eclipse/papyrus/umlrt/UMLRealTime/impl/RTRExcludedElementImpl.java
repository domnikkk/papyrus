/**
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

import org.eclipse.papyrus.umlrt.UMLRealTime.RTRExcludedElement;
import org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage;

import org.eclipse.papyrus.umlrt.UMLRealTime.util.UMLRealTimeValidator;

import org.eclipse.uml2.uml.RedefinableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RTR Excluded Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTRExcludedElementImpl#getBase_RedefinableElement <em>Base Redefinable Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RTRExcludedElementImpl extends MinimalEObjectImpl.Container implements RTRExcludedElement {
	/**
	 * The cached value of the '{@link #getBase_RedefinableElement() <em>Base Redefinable Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_RedefinableElement()
	 * @generated
	 * @ordered
	 */
	protected RedefinableElement base_RedefinableElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTRExcludedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLRealTimePackage.Literals.RTR_EXCLUDED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableElement getBase_RedefinableElement() {
		if (base_RedefinableElement != null && base_RedefinableElement.eIsProxy()) {
			InternalEObject oldBase_RedefinableElement = (InternalEObject)base_RedefinableElement;
			base_RedefinableElement = (RedefinableElement)eResolveProxy(oldBase_RedefinableElement);
			if (base_RedefinableElement != oldBase_RedefinableElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLRealTimePackage.RTR_EXCLUDED_ELEMENT__BASE_REDEFINABLE_ELEMENT, oldBase_RedefinableElement, base_RedefinableElement));
			}
		}
		return base_RedefinableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableElement basicGetBase_RedefinableElement() {
		return base_RedefinableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_RedefinableElement(RedefinableElement newBase_RedefinableElement) {
		RedefinableElement oldBase_RedefinableElement = base_RedefinableElement;
		base_RedefinableElement = newBase_RedefinableElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRealTimePackage.RTR_EXCLUDED_ELEMENT__BASE_REDEFINABLE_ELEMENT, oldBase_RedefinableElement, base_RedefinableElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ExclusioncanonlybeappliedtosomeUMLRTmodelelements(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UMLRealTimeValidator.RTR_EXCLUDED_ELEMENT__EXCLUSIONCANONLYBEAPPLIEDTOSOME_UMLR_TMODELELEMENTS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ExclusioncanonlybeappliedtosomeUMLRTmodelelements", EObjectValidator.getObjectLabel(this, context) }),
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
			case UMLRealTimePackage.RTR_EXCLUDED_ELEMENT__BASE_REDEFINABLE_ELEMENT:
				if (resolve) return getBase_RedefinableElement();
				return basicGetBase_RedefinableElement();
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
			case UMLRealTimePackage.RTR_EXCLUDED_ELEMENT__BASE_REDEFINABLE_ELEMENT:
				setBase_RedefinableElement((RedefinableElement)newValue);
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
			case UMLRealTimePackage.RTR_EXCLUDED_ELEMENT__BASE_REDEFINABLE_ELEMENT:
				setBase_RedefinableElement((RedefinableElement)null);
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
			case UMLRealTimePackage.RTR_EXCLUDED_ELEMENT__BASE_REDEFINABLE_ELEMENT:
				return base_RedefinableElement != null;
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
			case UMLRealTimePackage.RTR_EXCLUDED_ELEMENT___EXCLUSIONCANONLYBEAPPLIEDTOSOME_UMLR_TMODELELEMENTS__DIAGNOSTICCHAIN_MAP:
				return ExclusioncanonlybeappliedtosomeUMLRTmodelelements((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RTRExcludedElementImpl
