/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.modelelements.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.sysml14.modelelements.ModelelementsPackage;
import org.eclipse.papyrus.sysml14.modelelements.Stakeholder;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.modelelements.internal.impl.StakeholderImpl#getBase_Classifier <em>Base Classifier</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.modelelements.internal.impl.StakeholderImpl#getConcern <em>Concern</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.modelelements.internal.impl.StakeholderImpl#getConcernList <em>Concern List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StakeholderImpl extends MinimalEObjectImpl.Container implements Stakeholder {
	/**
	 * The cached value of the '{@link #getBase_Classifier() <em>Base Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Classifier()
	 * @generated
	 * @ordered
	 */
	protected Classifier base_Classifier;

	/**
	 * The cached value of the '{@link #getConcern() <em>Concern</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcern()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> concern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StakeholderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelelementsPackage.Literals.STAKEHOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getBase_Classifier() {
		if (base_Classifier != null && base_Classifier.eIsProxy()) {
			InternalEObject oldBase_Classifier = (InternalEObject)base_Classifier;
			base_Classifier = (Classifier)eResolveProxy(oldBase_Classifier);
			if (base_Classifier != oldBase_Classifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelelementsPackage.STAKEHOLDER__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
			}
		}
		return base_Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetBase_Classifier() {
		return base_Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Classifier(Classifier newBase_Classifier) {
		Classifier oldBase_Classifier = base_Classifier;
		base_Classifier = newBase_Classifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelelementsPackage.STAKEHOLDER__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getConcern() {
		if (concern == null) {
			concern = new EObjectResolvingEList<Comment>(Comment.class, this, ModelelementsPackage.STAKEHOLDER__CONCERN);
		}
		return concern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getConcernList() {
		Comment concernList = basicGetConcernList();
		return concernList != null && concernList.eIsProxy() ? (Comment)eResolveProxy((InternalEObject)concernList) : concernList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment basicGetConcernList() {
		// TODO: implement this method to return the 'Concern List' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcernList(Comment newConcernList) {
		// TODO: implement this method to set the 'Concern List' reference
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
			case ModelelementsPackage.STAKEHOLDER__BASE_CLASSIFIER:
				if (resolve) return getBase_Classifier();
				return basicGetBase_Classifier();
			case ModelelementsPackage.STAKEHOLDER__CONCERN:
				return getConcern();
			case ModelelementsPackage.STAKEHOLDER__CONCERN_LIST:
				if (resolve) return getConcernList();
				return basicGetConcernList();
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
			case ModelelementsPackage.STAKEHOLDER__BASE_CLASSIFIER:
				setBase_Classifier((Classifier)newValue);
				return;
			case ModelelementsPackage.STAKEHOLDER__CONCERN:
				getConcern().clear();
				getConcern().addAll((Collection<? extends Comment>)newValue);
				return;
			case ModelelementsPackage.STAKEHOLDER__CONCERN_LIST:
				setConcernList((Comment)newValue);
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
			case ModelelementsPackage.STAKEHOLDER__BASE_CLASSIFIER:
				setBase_Classifier((Classifier)null);
				return;
			case ModelelementsPackage.STAKEHOLDER__CONCERN:
				getConcern().clear();
				return;
			case ModelelementsPackage.STAKEHOLDER__CONCERN_LIST:
				setConcernList((Comment)null);
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
			case ModelelementsPackage.STAKEHOLDER__BASE_CLASSIFIER:
				return base_Classifier != null;
			case ModelelementsPackage.STAKEHOLDER__CONCERN:
				return concern != null && !concern.isEmpty();
			case ModelelementsPackage.STAKEHOLDER__CONCERN_LIST:
				return basicGetConcernList() != null;
		}
		return super.eIsSet(featureID);
	}

} //StakeholderImpl
