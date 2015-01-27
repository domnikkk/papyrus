/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.requirements.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.sysml14.requirements.Requirement;
import org.eclipse.papyrus.sysml14.requirements.RequirementsPackage;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementImpl#getDerived <em>Derived</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementImpl#getSatisfiedBy <em>Satisfied By</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementImpl#getRefinedBy <em>Refined By</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementImpl#getTracedTo <em>Traced To</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementImpl#getVerifiedBy <em>Verified By</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementImpl#getMaster <em>Master</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementImpl extends MinimalEObjectImpl.Container implements Requirement {
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
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.REQUIREMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.REQUIREMENT__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getDerived() {
		// TODO: implement this method to return the 'Derived' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getDerivedFrom() {
		// TODO: implement this method to return the 'Derived From' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getSatisfiedBy() {
		// TODO: implement this method to return the 'Satisfied By' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getSatisfiedBy(String name) {
		return getSatisfiedBy(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getSatisfiedBy(String name, boolean ignoreCase, EClass eClass) {
		satisfiedByLoop: for (NamedElement satisfiedBy : getSatisfiedBy()) {
			if (eClass != null && !eClass.isInstance(satisfiedBy))
				continue satisfiedByLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(satisfiedBy.getName()) : name.equals(satisfiedBy.getName())))
				continue satisfiedByLoop;
			return satisfiedBy;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getRefinedBy() {
		// TODO: implement this method to return the 'Refined By' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getRefinedBy(String name) {
		return getRefinedBy(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getRefinedBy(String name, boolean ignoreCase, EClass eClass) {
		refinedByLoop: for (NamedElement refinedBy : getRefinedBy()) {
			if (eClass != null && !eClass.isInstance(refinedBy))
				continue refinedByLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(refinedBy.getName()) : name.equals(refinedBy.getName())))
				continue refinedByLoop;
			return refinedBy;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getTracedTo() {
		// TODO: implement this method to return the 'Traced To' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getTracedTo(String name) {
		return getTracedTo(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getTracedTo(String name, boolean ignoreCase, EClass eClass) {
		tracedToLoop: for (NamedElement tracedTo : getTracedTo()) {
			if (eClass != null && !eClass.isInstance(tracedTo))
				continue tracedToLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(tracedTo.getName()) : name.equals(tracedTo.getName())))
				continue tracedToLoop;
			return tracedTo;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getVerifiedBy() {
		// TODO: implement this method to return the 'Verified By' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getVerifiedBy(String name) {
		return getVerifiedBy(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getVerifiedBy(String name, boolean ignoreCase, EClass eClass) {
		verifiedByLoop: for (NamedElement verifiedBy : getVerifiedBy()) {
			if (eClass != null && !eClass.isInstance(verifiedBy))
				continue verifiedByLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(verifiedBy.getName()) : name.equals(verifiedBy.getName())))
				continue verifiedByLoop;
			return verifiedBy;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getMaster() {
		Requirement master = basicGetMaster();
		return master != null && master.eIsProxy() ? (Requirement)eResolveProxy((InternalEObject)master) : master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetMaster() {
		// TODO: implement this method to return the 'Master' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaster(Requirement newMaster) {
		// TODO: implement this method to set the 'Master' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENT__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case RequirementsPackage.REQUIREMENT__TEXT:
				return getText();
			case RequirementsPackage.REQUIREMENT__ID:
				return getId();
			case RequirementsPackage.REQUIREMENT__DERIVED:
				return getDerived();
			case RequirementsPackage.REQUIREMENT__DERIVED_FROM:
				return getDerivedFrom();
			case RequirementsPackage.REQUIREMENT__SATISFIED_BY:
				return getSatisfiedBy();
			case RequirementsPackage.REQUIREMENT__REFINED_BY:
				return getRefinedBy();
			case RequirementsPackage.REQUIREMENT__TRACED_TO:
				return getTracedTo();
			case RequirementsPackage.REQUIREMENT__VERIFIED_BY:
				return getVerifiedBy();
			case RequirementsPackage.REQUIREMENT__MASTER:
				if (resolve) return getMaster();
				return basicGetMaster();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENT__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__TEXT:
				setText((String)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__ID:
				setId((String)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__DERIVED:
				getDerived().clear();
				getDerived().addAll((Collection<? extends Requirement>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends Requirement>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__SATISFIED_BY:
				getSatisfiedBy().clear();
				getSatisfiedBy().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__REFINED_BY:
				getRefinedBy().clear();
				getRefinedBy().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__TRACED_TO:
				getTracedTo().clear();
				getTracedTo().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__VERIFIED_BY:
				getVerifiedBy().clear();
				getVerifiedBy().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__MASTER:
				setMaster((Requirement)newValue);
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
			case RequirementsPackage.REQUIREMENT__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case RequirementsPackage.REQUIREMENT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__DERIVED:
				getDerived().clear();
				return;
			case RequirementsPackage.REQUIREMENT__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case RequirementsPackage.REQUIREMENT__SATISFIED_BY:
				getSatisfiedBy().clear();
				return;
			case RequirementsPackage.REQUIREMENT__REFINED_BY:
				getRefinedBy().clear();
				return;
			case RequirementsPackage.REQUIREMENT__TRACED_TO:
				getTracedTo().clear();
				return;
			case RequirementsPackage.REQUIREMENT__VERIFIED_BY:
				getVerifiedBy().clear();
				return;
			case RequirementsPackage.REQUIREMENT__MASTER:
				setMaster((Requirement)null);
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
			case RequirementsPackage.REQUIREMENT__BASE_CLASS:
				return base_Class != null;
			case RequirementsPackage.REQUIREMENT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case RequirementsPackage.REQUIREMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RequirementsPackage.REQUIREMENT__DERIVED:
				return !getDerived().isEmpty();
			case RequirementsPackage.REQUIREMENT__DERIVED_FROM:
				return !getDerivedFrom().isEmpty();
			case RequirementsPackage.REQUIREMENT__SATISFIED_BY:
				return !getSatisfiedBy().isEmpty();
			case RequirementsPackage.REQUIREMENT__REFINED_BY:
				return !getRefinedBy().isEmpty();
			case RequirementsPackage.REQUIREMENT__TRACED_TO:
				return !getTracedTo().isEmpty();
			case RequirementsPackage.REQUIREMENT__VERIFIED_BY:
				return !getVerifiedBy().isEmpty();
			case RequirementsPackage.REQUIREMENT__MASTER:
				return basicGetMaster() != null;
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
		result.append(" (text: "); //$NON-NLS-1$
		result.append(text);
		result.append(", id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
