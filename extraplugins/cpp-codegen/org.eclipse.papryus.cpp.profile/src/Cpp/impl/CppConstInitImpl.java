/**
 */
package Cpp.impl;

import Cpp.CppConstInit;
import Cpp.CppPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Const Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Cpp.impl.CppConstInitImpl#getInitialisation <em>Initialisation</em>}</li>
 *   <li>{@link Cpp.impl.CppConstInitImpl#getBase_operation <em>Base operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CppConstInitImpl extends EObjectImpl implements CppConstInit {
	/**
	 * The default value of the '{@link #getInitialisation() <em>Initialisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialisation()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIALISATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialisation() <em>Initialisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialisation()
	 * @generated
	 * @ordered
	 */
	protected String initialisation = INITIALISATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_operation() <em>Base operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_operation()
	 * @generated
	 * @ordered
	 */
	protected Operation base_operation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CppConstInitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CppPackage.Literals.CPP_CONST_INIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialisation() {
		return initialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialisation(String newInitialisation) {
		String oldInitialisation = initialisation;
		initialisation = newInitialisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CppPackage.CPP_CONST_INIT__INITIALISATION, oldInitialisation, initialisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getBase_operation() {
		if (base_operation != null && base_operation.eIsProxy()) {
			InternalEObject oldBase_operation = (InternalEObject)base_operation;
			base_operation = (Operation)eResolveProxy(oldBase_operation);
			if (base_operation != oldBase_operation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CppPackage.CPP_CONST_INIT__BASE_OPERATION, oldBase_operation, base_operation));
			}
		}
		return base_operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetBase_operation() {
		return base_operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_operation(Operation newBase_operation) {
		Operation oldBase_operation = base_operation;
		base_operation = newBase_operation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CppPackage.CPP_CONST_INIT__BASE_OPERATION, oldBase_operation, base_operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CppPackage.CPP_CONST_INIT__INITIALISATION:
				return getInitialisation();
			case CppPackage.CPP_CONST_INIT__BASE_OPERATION:
				if (resolve) return getBase_operation();
				return basicGetBase_operation();
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
			case CppPackage.CPP_CONST_INIT__INITIALISATION:
				setInitialisation((String)newValue);
				return;
			case CppPackage.CPP_CONST_INIT__BASE_OPERATION:
				setBase_operation((Operation)newValue);
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
			case CppPackage.CPP_CONST_INIT__INITIALISATION:
				setInitialisation(INITIALISATION_EDEFAULT);
				return;
			case CppPackage.CPP_CONST_INIT__BASE_OPERATION:
				setBase_operation((Operation)null);
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
			case CppPackage.CPP_CONST_INIT__INITIALISATION:
				return INITIALISATION_EDEFAULT == null ? initialisation != null : !INITIALISATION_EDEFAULT.equals(initialisation);
			case CppPackage.CPP_CONST_INIT__BASE_OPERATION:
				return base_operation != null;
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
		result.append(" (initialisation: ");
		result.append(initialisation);
		result.append(')');
		return result.toString();
	}

} //CppConstInitImpl