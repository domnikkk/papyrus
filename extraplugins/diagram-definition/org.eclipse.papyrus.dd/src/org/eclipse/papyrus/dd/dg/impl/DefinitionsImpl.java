/**
 * Copyright (c) 2014 CEA LIST.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.dd.dg.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.Definition;
import org.eclipse.papyrus.dd.dg.Definitions;
import org.eclipse.papyrus.dd.dg.StyleSheet;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Definitions</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.DefinitionsImpl#getDefnition <em>
 * Defnition</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.DefinitionsImpl#getStyleSheet <em>
 * Style Sheet</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DefinitionsImpl extends MinimalEObjectImpl.Container implements
		Definitions {
	/**
	 * The cached value of the '{@link #getDefnition() <em>Defnition</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDefnition()
	 * @generated
	 * @ordered
	 */
	protected EList<Definition> defnition;

	/**
	 * The cached value of the '{@link #getStyleSheet() <em>Style Sheet</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStyleSheet()
	 * @generated
	 * @ordered
	 */
	protected StyleSheet styleSheet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.DEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Definition> getDefnition() {
		if (defnition == null) {
			defnition = new EObjectContainmentEList<Definition>(
					Definition.class, this, DGPackage.DEFINITIONS__DEFNITION);
		}
		return defnition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StyleSheet getStyleSheet() {
		return styleSheet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStyleSheet(StyleSheet newStyleSheet,
			NotificationChain msgs) {
		StyleSheet oldStyleSheet = styleSheet;
		styleSheet = newStyleSheet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, DGPackage.DEFINITIONS__STYLE_SHEET,
					oldStyleSheet, newStyleSheet);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStyleSheet(StyleSheet newStyleSheet) {
		if (newStyleSheet != styleSheet) {
			NotificationChain msgs = null;
			if (styleSheet != null)
				msgs = ((InternalEObject) styleSheet).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- DGPackage.DEFINITIONS__STYLE_SHEET, null,
						msgs);
			if (newStyleSheet != null)
				msgs = ((InternalEObject) newStyleSheet).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- DGPackage.DEFINITIONS__STYLE_SHEET, null,
						msgs);
			msgs = basicSetStyleSheet(newStyleSheet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DGPackage.DEFINITIONS__STYLE_SHEET, newStyleSheet,
					newStyleSheet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DGPackage.DEFINITIONS__DEFNITION:
			return ((InternalEList<?>) getDefnition()).basicRemove(otherEnd,
					msgs);
		case DGPackage.DEFINITIONS__STYLE_SHEET:
			return basicSetStyleSheet(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DGPackage.DEFINITIONS__DEFNITION:
			return getDefnition();
		case DGPackage.DEFINITIONS__STYLE_SHEET:
			return getStyleSheet();
		}
		return super.eGet(featureID, resolve, coreType);
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
		case DGPackage.DEFINITIONS__DEFNITION:
			getDefnition().clear();
			getDefnition().addAll((Collection<? extends Definition>) newValue);
			return;
		case DGPackage.DEFINITIONS__STYLE_SHEET:
			setStyleSheet((StyleSheet) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case DGPackage.DEFINITIONS__DEFNITION:
			getDefnition().clear();
			return;
		case DGPackage.DEFINITIONS__STYLE_SHEET:
			setStyleSheet((StyleSheet) null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DGPackage.DEFINITIONS__DEFNITION:
			return defnition != null && !defnition.isEmpty();
		case DGPackage.DEFINITIONS__STYLE_SHEET:
			return styleSheet != null;
		}
		return super.eIsSet(featureID);
	}

} // DefinitionsImpl
