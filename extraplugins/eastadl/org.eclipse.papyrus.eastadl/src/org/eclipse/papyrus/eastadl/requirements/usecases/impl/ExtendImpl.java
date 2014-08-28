/**
 */
package org.eclipse.papyrus.eastadl.requirements.usecases.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.RelationshipImpl;
import org.eclipse.papyrus.eastadl.requirements.usecases.Extend;
import org.eclipse.papyrus.eastadl.requirements.usecases.ExtensionPoint;
import org.eclipse.papyrus.eastadl.requirements.usecases.UseCase;
import org.eclipse.papyrus.eastadl.requirements.usecases.UsecasesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.usecases.impl.ExtendImpl#getBase_Extend <em>Base Extend</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.usecases.impl.ExtendImpl#getExtensionLocation <em>Extension Location</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.usecases.impl.ExtendImpl#getExtendedCase <em>Extended Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendImpl extends RelationshipImpl implements Extend {
	/**
	 * The cached value of the '{@link #getBase_Extend() <em>Base Extend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBase_Extend()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Extend base_Extend;

	/**
	 * The cached value of the '{@link #getExtensionLocation() <em>Extension Location</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getExtensionLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionPoint> extensionLocation;

	/**
	 * The cached value of the '{@link #getExtendedCase() <em>Extended Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getExtendedCase()
	 * @generated
	 * @ordered
	 */
	protected UseCase extendedCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ExtendImpl() {
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
		return UsecasesPackage.Literals.EXTEND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public org.eclipse.uml2.uml.Extend getBase_Extend() {
		if (base_Extend != null && base_Extend.eIsProxy()) {
			InternalEObject oldBase_Extend = (InternalEObject) base_Extend;
			base_Extend = (org.eclipse.uml2.uml.Extend) eResolveProxy(oldBase_Extend);
			if (base_Extend != oldBase_Extend) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsecasesPackage.EXTEND__BASE_EXTEND, oldBase_Extend, base_Extend));
				}
			}
		}
		return base_Extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public org.eclipse.uml2.uml.Extend basicGetBase_Extend() {
		return base_Extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setBase_Extend(org.eclipse.uml2.uml.Extend newBase_Extend) {
		org.eclipse.uml2.uml.Extend oldBase_Extend = base_Extend;
		base_Extend = newBase_Extend;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UsecasesPackage.EXTEND__BASE_EXTEND, oldBase_Extend, base_Extend));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<ExtensionPoint> getExtensionLocation() {
		if (extensionLocation == null) {
			extensionLocation = new EObjectResolvingEList<ExtensionPoint>(ExtensionPoint.class, this, UsecasesPackage.EXTEND__EXTENSION_LOCATION);
		}
		return extensionLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public UseCase getExtendedCase() {
		if (extendedCase != null && extendedCase.eIsProxy()) {
			InternalEObject oldExtendedCase = (InternalEObject) extendedCase;
			extendedCase = (UseCase) eResolveProxy(oldExtendedCase);
			if (extendedCase != oldExtendedCase) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsecasesPackage.EXTEND__EXTENDED_CASE, oldExtendedCase, extendedCase));
				}
			}
		}
		return extendedCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public UseCase basicGetExtendedCase() {
		return extendedCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setExtendedCase(UseCase newExtendedCase) {
		UseCase oldExtendedCase = extendedCase;
		extendedCase = newExtendedCase;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UsecasesPackage.EXTEND__EXTENDED_CASE, oldExtendedCase, extendedCase));
		}
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
		case UsecasesPackage.EXTEND__BASE_EXTEND:
			if (resolve) {
				return getBase_Extend();
			}
			return basicGetBase_Extend();
		case UsecasesPackage.EXTEND__EXTENSION_LOCATION:
			return getExtensionLocation();
		case UsecasesPackage.EXTEND__EXTENDED_CASE:
			if (resolve) {
				return getExtendedCase();
			}
			return basicGetExtendedCase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UsecasesPackage.EXTEND__BASE_EXTEND:
			setBase_Extend((org.eclipse.uml2.uml.Extend) newValue);
			return;
		case UsecasesPackage.EXTEND__EXTENSION_LOCATION:
			getExtensionLocation().clear();
			getExtensionLocation().addAll((Collection<? extends ExtensionPoint>) newValue);
			return;
		case UsecasesPackage.EXTEND__EXTENDED_CASE:
			setExtendedCase((UseCase) newValue);
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
		case UsecasesPackage.EXTEND__BASE_EXTEND:
			setBase_Extend((org.eclipse.uml2.uml.Extend) null);
			return;
		case UsecasesPackage.EXTEND__EXTENSION_LOCATION:
			getExtensionLocation().clear();
			return;
		case UsecasesPackage.EXTEND__EXTENDED_CASE:
			setExtendedCase((UseCase) null);
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
		case UsecasesPackage.EXTEND__BASE_EXTEND:
			return base_Extend != null;
		case UsecasesPackage.EXTEND__EXTENSION_LOCATION:
			return extensionLocation != null && !extensionLocation.isEmpty();
		case UsecasesPackage.EXTEND__EXTENDED_CASE:
			return extendedCase != null;
		}
		return super.eIsSet(featureID);
	}

} // ExtendImpl
