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
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextAlignment;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell Text Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.CellTextStyleImpl#getAlignment <em>Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CellTextStyleImpl extends EModelElementImpl implements CellTextStyle {
	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final CellTextAlignment ALIGNMENT_EDEFAULT = CellTextAlignment.MIDDLE_LEFT;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected CellTextAlignment alignment = ALIGNMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected CellTextStyleImpl() {
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
		return NattablestylePackage.Literals.CELL_TEXT_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public CellTextAlignment getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setAlignment(CellTextAlignment newAlignment) {
		CellTextAlignment oldAlignment = alignment;
		alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, NattablestylePackage.CELL_TEXT_STYLE__ALIGNMENT, oldAlignment, alignment));
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
		case NattablestylePackage.CELL_TEXT_STYLE__ALIGNMENT:
			return getAlignment();
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
		case NattablestylePackage.CELL_TEXT_STYLE__ALIGNMENT:
			setAlignment((CellTextAlignment) newValue);
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
		case NattablestylePackage.CELL_TEXT_STYLE__ALIGNMENT:
			setAlignment(ALIGNMENT_EDEFAULT);
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
		case NattablestylePackage.CELL_TEXT_STYLE__ALIGNMENT:
			return alignment != ALIGNMENT_EDEFAULT;
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
		result.append(" (alignment: "); //$NON-NLS-1$
		result.append(alignment);
		result.append(')');
		return result.toString();
	}

} // CellTextStyleImpl
