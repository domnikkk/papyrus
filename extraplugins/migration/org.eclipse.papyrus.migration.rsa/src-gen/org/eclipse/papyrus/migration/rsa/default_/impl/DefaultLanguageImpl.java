/**
 *  * Copyright (c) 2013, 2014 CEA LIST.
 *  *
 *  * All rights reserved. This program and the accompanying materials
 *  * are made available under the terms of the Eclipse Public License v1.0
 *  * which accompanies this distribution, and is available at
 *  * http://www.eclipse.org/legal/epl-v10.html
 *  *
 *  * Contributors:
 *  *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.migration.rsa.default_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.papyrus.migration.rsa.default_.DefaultLanguage;
import org.eclipse.papyrus.migration.rsa.default_.DefaultPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.migration.rsa.default_.impl.DefaultLanguageImpl#getBase_Package <em>Base Package</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.default_.impl.DefaultLanguageImpl#getDefaultLanguage <em>Default Language</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultLanguageImpl extends MinimalEObjectImpl.Container implements DefaultLanguage {
	/**
	 * The cached value of the '{@link #getBase_Package() <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBase_Package()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Package base_Package;

	/**
	 * The default value of the '{@link #getDefaultLanguage() <em>Default Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDefaultLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultLanguage() <em>Default Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDefaultLanguage()
	 * @generated
	 * @ordered
	 */
	protected String defaultLanguage = DEFAULT_LANGUAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected DefaultLanguageImpl() {
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
		return DefaultPackage.Literals.DEFAULT_LANGUAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public org.eclipse.uml2.uml.Package getBase_Package() {
		if (base_Package != null && base_Package.eIsProxy()) {
			InternalEObject oldBase_Package = (InternalEObject) base_Package;
			base_Package = (org.eclipse.uml2.uml.Package) eResolveProxy(oldBase_Package);
			if (base_Package != oldBase_Package) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DefaultPackage.DEFAULT_LANGUAGE__BASE_PACKAGE, oldBase_Package, base_Package));
				}
			}
		}
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package basicGetBase_Package() {
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setBase_Package(org.eclipse.uml2.uml.Package newBase_Package) {
		org.eclipse.uml2.uml.Package oldBase_Package = base_Package;
		base_Package = newBase_Package;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultPackage.DEFAULT_LANGUAGE__BASE_PACKAGE, oldBase_Package, base_Package));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getDefaultLanguage() {
		return defaultLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDefaultLanguage(String newDefaultLanguage) {
		String oldDefaultLanguage = defaultLanguage;
		defaultLanguage = newDefaultLanguage;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultPackage.DEFAULT_LANGUAGE__DEFAULT_LANGUAGE, oldDefaultLanguage, defaultLanguage));
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
		case DefaultPackage.DEFAULT_LANGUAGE__BASE_PACKAGE:
			if (resolve) {
				return getBase_Package();
			}
			return basicGetBase_Package();
		case DefaultPackage.DEFAULT_LANGUAGE__DEFAULT_LANGUAGE:
			return getDefaultLanguage();
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
		case DefaultPackage.DEFAULT_LANGUAGE__BASE_PACKAGE:
			setBase_Package((org.eclipse.uml2.uml.Package) newValue);
			return;
		case DefaultPackage.DEFAULT_LANGUAGE__DEFAULT_LANGUAGE:
			setDefaultLanguage((String) newValue);
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
		case DefaultPackage.DEFAULT_LANGUAGE__BASE_PACKAGE:
			setBase_Package((org.eclipse.uml2.uml.Package) null);
			return;
		case DefaultPackage.DEFAULT_LANGUAGE__DEFAULT_LANGUAGE:
			setDefaultLanguage(DEFAULT_LANGUAGE_EDEFAULT);
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
		case DefaultPackage.DEFAULT_LANGUAGE__BASE_PACKAGE:
			return base_Package != null;
		case DefaultPackage.DEFAULT_LANGUAGE__DEFAULT_LANGUAGE:
			return DEFAULT_LANGUAGE_EDEFAULT == null ? defaultLanguage != null : !DEFAULT_LANGUAGE_EDEFAULT.equals(defaultLanguage);
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
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (defaultLanguage: ");
		result.append(defaultLanguage);
		result.append(')');
		return result.toString();
	}

} // DefaultLanguageImpl
