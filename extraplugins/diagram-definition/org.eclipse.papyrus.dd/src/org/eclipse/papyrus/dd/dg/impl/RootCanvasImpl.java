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

import java.awt.Color;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.Definitions;
import org.eclipse.papyrus.dd.dg.RootCanvas;
import org.eclipse.papyrus.dd.dg.StyleSheet;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Root Canvas</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.dd.dg.impl.RootCanvasImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.impl.RootCanvasImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.impl.RootCanvasImpl#getExternalStyleSheets <em>External Style Sheet</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.impl.RootCanvasImpl#getScripts <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootCanvasImpl extends CanvasImpl implements RootCanvas {
	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color BACKGROUND_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected Color backgroundColor = BACKGROUND_COLOR_EDEFAULT;

	/**
	 * This is true if the Background Color attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean backgroundColorESet;

	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected Definitions definitions;

	/**
	 * The cached value of the '{@link #getExternalStyleSheets() <em>External Style Sheet</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalStyleSheets()
	 * @generated
	 * @ordered
	 */
	protected EList<StyleSheet> externalStyleSheets;

	/**
	 * The cached value of the '{@link #getScripts() <em>Script</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScripts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> scripts;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RootCanvasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.ROOT_CANVAS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Color getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(Color newBackgroundColor) {
		Color oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		boolean oldBackgroundColorESet = backgroundColorESet;
		backgroundColorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.ROOT_CANVAS__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor, !oldBackgroundColorESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBackgroundColor() {
		Color oldBackgroundColor = backgroundColor;
		boolean oldBackgroundColorESet = backgroundColorESet;
		backgroundColor = BACKGROUND_COLOR_EDEFAULT;
		backgroundColorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DGPackage.ROOT_CANVAS__BACKGROUND_COLOR, oldBackgroundColor, BACKGROUND_COLOR_EDEFAULT, oldBackgroundColorESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBackgroundColor() {
		return backgroundColorESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Definitions getDefinitions() {
		return definitions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitions(Definitions newDefinitions,
			NotificationChain msgs) {
		Definitions oldDefinitions = definitions;
		definitions = newDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.ROOT_CANVAS__DEFINITIONS, oldDefinitions, newDefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitions(Definitions newDefinitions) {
		if (newDefinitions != definitions) {
			NotificationChain msgs = null;
			if (definitions != null)
				msgs = ((InternalEObject)definitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.ROOT_CANVAS__DEFINITIONS, null, msgs);
			if (newDefinitions != null)
				msgs = ((InternalEObject)newDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.ROOT_CANVAS__DEFINITIONS, null, msgs);
			msgs = basicSetDefinitions(newDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.ROOT_CANVAS__DEFINITIONS, newDefinitions, newDefinitions));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StyleSheet> getExternalStyleSheets() {
		if (externalStyleSheets == null) {
			externalStyleSheets = new EObjectResolvingEList<StyleSheet>(StyleSheet.class, this, DGPackage.ROOT_CANVAS__EXTERNAL_STYLE_SHEET);
		}
		return externalStyleSheets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getScripts() {
		if (scripts == null) {
			scripts = new EDataTypeUniqueEList<String>(String.class, this, DGPackage.ROOT_CANVAS__SCRIPT);
		}
		return scripts;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DGPackage.ROOT_CANVAS__DEFINITIONS:
				return basicSetDefinitions(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DGPackage.ROOT_CANVAS__BACKGROUND_COLOR:
				return getBackgroundColor();
			case DGPackage.ROOT_CANVAS__DEFINITIONS:
				return getDefinitions();
			case DGPackage.ROOT_CANVAS__EXTERNAL_STYLE_SHEET:
				return getExternalStyleSheets();
			case DGPackage.ROOT_CANVAS__SCRIPT:
				return getScripts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DGPackage.ROOT_CANVAS__BACKGROUND_COLOR:
				setBackgroundColor((Color)newValue);
				return;
			case DGPackage.ROOT_CANVAS__DEFINITIONS:
				setDefinitions((Definitions)newValue);
				return;
			case DGPackage.ROOT_CANVAS__EXTERNAL_STYLE_SHEET:
				getExternalStyleSheets().clear();
				getExternalStyleSheets().addAll((Collection<? extends StyleSheet>)newValue);
				return;
			case DGPackage.ROOT_CANVAS__SCRIPT:
				getScripts().clear();
				getScripts().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DGPackage.ROOT_CANVAS__BACKGROUND_COLOR:
				unsetBackgroundColor();
				return;
			case DGPackage.ROOT_CANVAS__DEFINITIONS:
				setDefinitions((Definitions)null);
				return;
			case DGPackage.ROOT_CANVAS__EXTERNAL_STYLE_SHEET:
				getExternalStyleSheets().clear();
				return;
			case DGPackage.ROOT_CANVAS__SCRIPT:
				getScripts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DGPackage.ROOT_CANVAS__BACKGROUND_COLOR:
				return isSetBackgroundColor();
			case DGPackage.ROOT_CANVAS__DEFINITIONS:
				return definitions != null;
			case DGPackage.ROOT_CANVAS__EXTERNAL_STYLE_SHEET:
				return externalStyleSheets != null && !externalStyleSheets.isEmpty();
			case DGPackage.ROOT_CANVAS__SCRIPT:
				return scripts != null && !scripts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (backgroundColor: ");
		if (backgroundColorESet) result.append(backgroundColor); else result.append("<unset>");
		result.append(", script: ");
		result.append(scripts);
		result.append(')');
		return result.toString();
	}

} // RootCanvasImpl
