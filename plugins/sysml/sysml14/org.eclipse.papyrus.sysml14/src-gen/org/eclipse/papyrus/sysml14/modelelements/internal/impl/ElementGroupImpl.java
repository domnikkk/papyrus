/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.modelelements.internal.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.sysml14.modelelements.ElementGroup;
import org.eclipse.papyrus.sysml14.modelelements.ModelelementsPackage;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.modelelements.internal.impl.ElementGroupImpl#getBase_Comment <em>Base Comment</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.modelelements.internal.impl.ElementGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.modelelements.internal.impl.ElementGroupImpl#getCriterion <em>Criterion</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.modelelements.internal.impl.ElementGroupImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.modelelements.internal.impl.ElementGroupImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.modelelements.internal.impl.ElementGroupImpl#getOrderedMember <em>Ordered Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementGroupImpl extends MinimalEObjectImpl.Container implements ElementGroup {
	/**
	 * The cached value of the '{@link #getBase_Comment() <em>Base Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Comment()
	 * @generated
	 * @ordered
	 */
	protected Comment base_Comment;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCriterion() <em>Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterion()
	 * @generated
	 * @ordered
	 */
	protected static final String CRITERION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrderedMember() <em>Ordered Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> orderedMember;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelelementsPackage.Literals.ELEMENT_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getBase_Comment() {
		if (base_Comment != null && base_Comment.eIsProxy()) {
			InternalEObject oldBase_Comment = (InternalEObject)base_Comment;
			base_Comment = (Comment)eResolveProxy(oldBase_Comment);
			if (base_Comment != oldBase_Comment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelelementsPackage.ELEMENT_GROUP__BASE_COMMENT, oldBase_Comment, base_Comment));
			}
		}
		return base_Comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment basicGetBase_Comment() {
		return base_Comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Comment(Comment newBase_Comment) {
		Comment oldBase_Comment = base_Comment;
		base_Comment = newBase_Comment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelelementsPackage.ELEMENT_GROUP__BASE_COMMENT, oldBase_Comment, base_Comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelelementsPackage.ELEMENT_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCriterion() {
		// TODO: implement this method to return the 'Criterion' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriterion(String newCriterion) {
		// TODO: implement this method to set the 'Criterion' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		// TODO: implement this method to return the 'Size' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		// TODO: implement this method to set the 'Size' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getMember() {
		// TODO: implement this method to return the 'Member' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getOrderedMember() {
		if (orderedMember == null) {
			orderedMember = new EObjectResolvingEList<Element>(Element.class, this, ModelelementsPackage.ELEMENT_GROUP__ORDERED_MEMBER);
		}
		return orderedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String criterion() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int size() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> member() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementGroup> allGroups(Element e) {
		// TODO: implement this method
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
			case ModelelementsPackage.ELEMENT_GROUP__BASE_COMMENT:
				if (resolve) return getBase_Comment();
				return basicGetBase_Comment();
			case ModelelementsPackage.ELEMENT_GROUP__NAME:
				return getName();
			case ModelelementsPackage.ELEMENT_GROUP__CRITERION:
				return getCriterion();
			case ModelelementsPackage.ELEMENT_GROUP__SIZE:
				return getSize();
			case ModelelementsPackage.ELEMENT_GROUP__MEMBER:
				return getMember();
			case ModelelementsPackage.ELEMENT_GROUP__ORDERED_MEMBER:
				return getOrderedMember();
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
			case ModelelementsPackage.ELEMENT_GROUP__BASE_COMMENT:
				setBase_Comment((Comment)newValue);
				return;
			case ModelelementsPackage.ELEMENT_GROUP__NAME:
				setName((String)newValue);
				return;
			case ModelelementsPackage.ELEMENT_GROUP__CRITERION:
				setCriterion((String)newValue);
				return;
			case ModelelementsPackage.ELEMENT_GROUP__SIZE:
				setSize((Integer)newValue);
				return;
			case ModelelementsPackage.ELEMENT_GROUP__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends Element>)newValue);
				return;
			case ModelelementsPackage.ELEMENT_GROUP__ORDERED_MEMBER:
				getOrderedMember().clear();
				getOrderedMember().addAll((Collection<? extends Element>)newValue);
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
			case ModelelementsPackage.ELEMENT_GROUP__BASE_COMMENT:
				setBase_Comment((Comment)null);
				return;
			case ModelelementsPackage.ELEMENT_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelelementsPackage.ELEMENT_GROUP__CRITERION:
				setCriterion(CRITERION_EDEFAULT);
				return;
			case ModelelementsPackage.ELEMENT_GROUP__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case ModelelementsPackage.ELEMENT_GROUP__MEMBER:
				getMember().clear();
				return;
			case ModelelementsPackage.ELEMENT_GROUP__ORDERED_MEMBER:
				getOrderedMember().clear();
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
			case ModelelementsPackage.ELEMENT_GROUP__BASE_COMMENT:
				return base_Comment != null;
			case ModelelementsPackage.ELEMENT_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelelementsPackage.ELEMENT_GROUP__CRITERION:
				return CRITERION_EDEFAULT == null ? getCriterion() != null : !CRITERION_EDEFAULT.equals(getCriterion());
			case ModelelementsPackage.ELEMENT_GROUP__SIZE:
				return getSize() != SIZE_EDEFAULT;
			case ModelelementsPackage.ELEMENT_GROUP__MEMBER:
				return !getMember().isEmpty();
			case ModelelementsPackage.ELEMENT_GROUP__ORDERED_MEMBER:
				return orderedMember != null && !orderedMember.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelelementsPackage.ELEMENT_GROUP___CRITERION:
				return criterion();
			case ModelelementsPackage.ELEMENT_GROUP___SIZE:
				return size();
			case ModelelementsPackage.ELEMENT_GROUP___MEMBER:
				return member();
			case ModelelementsPackage.ELEMENT_GROUP___ALL_GROUPS__ELEMENT:
				return allGroups((Element)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ElementGroupImpl
