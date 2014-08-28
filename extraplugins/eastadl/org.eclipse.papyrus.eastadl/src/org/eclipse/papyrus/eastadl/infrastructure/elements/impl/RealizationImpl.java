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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedByInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage;
import org.eclipse.papyrus.eastadl.infrastructure.elements.Realization;


/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Realization</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.RealizationImpl#getBase_Realization <em>Base Realization</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.RealizationImpl#getRealized <em>Realized</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.RealizationImpl#getRealizedBy <em>Realized By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealizationImpl extends RelationshipImpl implements Realization {

	/**
	 * The cached value of the '{@link #getBase_Realization() <em>Base Realization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBase_Realization()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Realization base_Realization;

	/**
	 * The cached value of the '{@link #getRealized() <em>Realized</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getRealized()
	 * @generated
	 * @ordered
	 */
	protected EList<Realization_realizedInstanceRef> realized;
	/**
	 * The cached value of the '{@link #getRealizedBy() <em>Realized By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getRealizedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Realization_realizedByInstanceRef> realizedBy;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected RealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ElementsPackage.REALIZATION__BASE_REALIZATION:
			if (resolve) {
				return getBase_Realization();
			}
			return basicGetBase_Realization();
		case ElementsPackage.REALIZATION__REALIZED:
			return getRealized();
		case ElementsPackage.REALIZATION__REALIZED_BY:
			return getRealizedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ElementsPackage.REALIZATION__BASE_REALIZATION:
			return base_Realization != null;
		case ElementsPackage.REALIZATION__REALIZED:
			return realized != null && !realized.isEmpty();
		case ElementsPackage.REALIZATION__REALIZED_BY:
			return realizedBy != null && !realizedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ElementsPackage.REALIZATION__BASE_REALIZATION:
			setBase_Realization((org.eclipse.uml2.uml.Realization) newValue);
			return;
		case ElementsPackage.REALIZATION__REALIZED:
			getRealized().clear();
			getRealized().addAll((Collection<? extends Realization_realizedInstanceRef>) newValue);
			return;
		case ElementsPackage.REALIZATION__REALIZED_BY:
			getRealizedBy().clear();
			getRealizedBy().addAll((Collection<? extends Realization_realizedByInstanceRef>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElementsPackage.Literals.REALIZATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ElementsPackage.REALIZATION__BASE_REALIZATION:
			setBase_Realization((org.eclipse.uml2.uml.Realization) null);
			return;
		case ElementsPackage.REALIZATION__REALIZED:
			getRealized().clear();
			return;
		case ElementsPackage.REALIZATION__REALIZED_BY:
			getRealizedBy().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Realization_realizedInstanceRef> getRealized() {
		if (realized == null) {
			realized = new EObjectContainmentEList<Realization_realizedInstanceRef>(Realization_realizedInstanceRef.class, this, ElementsPackage.REALIZATION__REALIZED);
		}
		return realized;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Realization_realizedByInstanceRef> getRealizedBy() {
		if (realizedBy == null) {
			realizedBy = new EObjectContainmentEList<Realization_realizedByInstanceRef>(Realization_realizedByInstanceRef.class, this, ElementsPackage.REALIZATION__REALIZED_BY);
		}
		return realizedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public org.eclipse.uml2.uml.Realization getBase_Realization() {
		if (base_Realization != null && base_Realization.eIsProxy()) {
			InternalEObject oldBase_Realization = (InternalEObject) base_Realization;
			base_Realization = (org.eclipse.uml2.uml.Realization) eResolveProxy(oldBase_Realization);
			if (base_Realization != oldBase_Realization) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ElementsPackage.REALIZATION__BASE_REALIZATION, oldBase_Realization, base_Realization));
				}
			}
		}
		return base_Realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public org.eclipse.uml2.uml.Realization basicGetBase_Realization() {
		return base_Realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setBase_Realization(org.eclipse.uml2.uml.Realization newBase_Realization) {
		org.eclipse.uml2.uml.Realization oldBase_Realization = base_Realization;
		base_Realization = newBase_Realization;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ElementsPackage.REALIZATION__BASE_REALIZATION, oldBase_Realization, base_Realization));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ElementsPackage.REALIZATION__REALIZED:
			return ((InternalEList<?>) getRealized()).basicRemove(otherEnd, msgs);
		case ElementsPackage.REALIZATION__REALIZED_BY:
			return ((InternalEList<?>) getRealizedBy()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

} // RealizationImpl
