/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Sara TUCCI (CEA LIST) sara.tucci@cea.fr - Initial API and implementation
 *  Chokri MRAIDHA (CEA LIST) chokri.mraidha@cea.fr - Initial API and implementation
 *  David SERVAT (CEA LIST) david.servat@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.eastadl.infrastructure.elements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAPackage;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAPackageableElement;
import org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EA Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAPackageImpl#getSubPackage <em>Sub Package</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAPackageImpl#getElement <em>Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAPackageImpl#getBase_Package <em>Base Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EAPackageImpl extends EAElementImpl implements EAPackage {

	/**
	 * The cached value of the '{@link #getSubPackage() <em>Sub Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getSubPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<EAPackage> subPackage;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<EAPackageableElement> element;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EAPackageImpl() {
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
		return ElementsPackage.Literals.EA_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<EAPackage> getSubPackage() {
		if (subPackage == null) {
			subPackage = new EObjectResolvingEList<EAPackage>(EAPackage.class, this, ElementsPackage.EA_PACKAGE__SUB_PACKAGE);
		}
		return subPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<EAPackageableElement> getElement() {
		if (element == null) {
			element = new EObjectResolvingEList<EAPackageableElement>(EAPackageableElement.class, this, ElementsPackage.EA_PACKAGE__ELEMENT);
		}
		return element;
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ElementsPackage.EA_PACKAGE__BASE_PACKAGE, oldBase_Package, base_Package));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElementsPackage.EA_PACKAGE__BASE_PACKAGE, oldBase_Package, base_Package));
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
		case ElementsPackage.EA_PACKAGE__SUB_PACKAGE:
			return getSubPackage();
		case ElementsPackage.EA_PACKAGE__ELEMENT:
			return getElement();
		case ElementsPackage.EA_PACKAGE__BASE_PACKAGE:
			if (resolve)
				return getBase_Package();
			return basicGetBase_Package();
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
		case ElementsPackage.EA_PACKAGE__SUB_PACKAGE:
			getSubPackage().clear();
			getSubPackage().addAll((Collection<? extends EAPackage>) newValue);
			return;
		case ElementsPackage.EA_PACKAGE__ELEMENT:
			getElement().clear();
			getElement().addAll((Collection<? extends EAPackageableElement>) newValue);
			return;
		case ElementsPackage.EA_PACKAGE__BASE_PACKAGE:
			setBase_Package((org.eclipse.uml2.uml.Package) newValue);
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
		case ElementsPackage.EA_PACKAGE__SUB_PACKAGE:
			getSubPackage().clear();
			return;
		case ElementsPackage.EA_PACKAGE__ELEMENT:
			getElement().clear();
			return;
		case ElementsPackage.EA_PACKAGE__BASE_PACKAGE:
			setBase_Package((org.eclipse.uml2.uml.Package) null);
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
		case ElementsPackage.EA_PACKAGE__SUB_PACKAGE:
			return subPackage != null && !subPackage.isEmpty();
		case ElementsPackage.EA_PACKAGE__ELEMENT:
			return element != null && !element.isEmpty();
		case ElementsPackage.EA_PACKAGE__BASE_PACKAGE:
			return base_Package != null;
		}
		return super.eIsSet(featureID);
	}

} // EAPackageImpl
