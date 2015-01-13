/**
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EModelElementImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DisplayStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.TableDisplayStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Display Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.TableDisplayStyleImpl#getDisplayStyle <em>Display Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableDisplayStyleImpl extends EModelElementImpl implements TableDisplayStyle {
	/**
	 * The default value of the '{@link #getDisplayStyle() <em>Display Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDisplayStyle()
	 * @generated
	 * @ordered
	 */
	protected static final DisplayStyle DISPLAY_STYLE_EDEFAULT = DisplayStyle.NORMAL;

	/**
	 * The cached value of the '{@link #getDisplayStyle() <em>Display Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDisplayStyle()
	 * @generated
	 * @ordered
	 */
	protected DisplayStyle displayStyle = DISPLAY_STYLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TableDisplayStyleImpl() {
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
		return NattablestylePackage.Literals.TABLE_DISPLAY_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DisplayStyle getDisplayStyle() {
		return displayStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDisplayStyle(DisplayStyle newDisplayStyle) {
		DisplayStyle oldDisplayStyle = displayStyle;
		displayStyle = newDisplayStyle == null ? DISPLAY_STYLE_EDEFAULT : newDisplayStyle;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, NattablestylePackage.TABLE_DISPLAY_STYLE__DISPLAY_STYLE, oldDisplayStyle, displayStyle));
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
		case NattablestylePackage.TABLE_DISPLAY_STYLE__DISPLAY_STYLE:
			return getDisplayStyle();
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
		case NattablestylePackage.TABLE_DISPLAY_STYLE__DISPLAY_STYLE:
			setDisplayStyle((DisplayStyle) newValue);
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
		case NattablestylePackage.TABLE_DISPLAY_STYLE__DISPLAY_STYLE:
			setDisplayStyle(DISPLAY_STYLE_EDEFAULT);
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
		case NattablestylePackage.TABLE_DISPLAY_STYLE__DISPLAY_STYLE:
			return displayStyle != DISPLAY_STYLE_EDEFAULT;
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
		result.append(" (displayStyle: "); //$NON-NLS-1$
		result.append(displayStyle);
		result.append(')');
		return result.toString();
	}

} // TableDisplayStyleImpl
