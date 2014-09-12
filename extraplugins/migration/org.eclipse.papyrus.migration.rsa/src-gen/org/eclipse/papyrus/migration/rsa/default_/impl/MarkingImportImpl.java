/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.default_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.papyrus.migration.rsa.default_.DefaultPackage;
import org.eclipse.papyrus.migration.rsa.default_.MarkingImport;
import org.eclipse.uml2.uml.ElementImport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marking Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.migration.rsa.default_.impl.MarkingImportImpl#getBase_ElementImport <em>Base Element Import</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MarkingImportImpl extends MinimalEObjectImpl.Container implements MarkingImport {
	/**
	 * The cached value of the '{@link #getBase_ElementImport() <em>Base Element Import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBase_ElementImport()
	 * @generated
	 * @ordered
	 */
	protected ElementImport base_ElementImport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected MarkingImportImpl() {
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
		return DefaultPackage.Literals.MARKING_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ElementImport getBase_ElementImport() {
		if (base_ElementImport != null && base_ElementImport.eIsProxy()) {
			InternalEObject oldBase_ElementImport = (InternalEObject) base_ElementImport;
			base_ElementImport = (ElementImport) eResolveProxy(oldBase_ElementImport);
			if (base_ElementImport != oldBase_ElementImport) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DefaultPackage.MARKING_IMPORT__BASE_ELEMENT_IMPORT, oldBase_ElementImport, base_ElementImport));
				}
			}
		}
		return base_ElementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ElementImport basicGetBase_ElementImport() {
		return base_ElementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setBase_ElementImport(ElementImport newBase_ElementImport) {
		ElementImport oldBase_ElementImport = base_ElementImport;
		base_ElementImport = newBase_ElementImport;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultPackage.MARKING_IMPORT__BASE_ELEMENT_IMPORT, oldBase_ElementImport, base_ElementImport));
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
		case DefaultPackage.MARKING_IMPORT__BASE_ELEMENT_IMPORT:
			if (resolve) {
				return getBase_ElementImport();
			}
			return basicGetBase_ElementImport();
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
		case DefaultPackage.MARKING_IMPORT__BASE_ELEMENT_IMPORT:
			setBase_ElementImport((ElementImport) newValue);
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
		case DefaultPackage.MARKING_IMPORT__BASE_ELEMENT_IMPORT:
			setBase_ElementImport((ElementImport) null);
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
		case DefaultPackage.MARKING_IMPORT__BASE_ELEMENT_IMPORT:
			return base_ElementImport != null;
		}
		return super.eIsSet(featureID);
	}

} // MarkingImportImpl
