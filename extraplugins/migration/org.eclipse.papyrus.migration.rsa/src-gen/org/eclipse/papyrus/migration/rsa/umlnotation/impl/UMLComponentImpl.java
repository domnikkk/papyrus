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
package org.eclipse.papyrus.migration.rsa.umlnotation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.migration.rsa.umlnotation.PapyrusUMLNotationPackage;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLComponentImpl#isShowWhitebox <em>Show Whitebox</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLComponentImpl extends UMLShapeImpl implements UMLComponent {

	/**
	 * The default value of the '{@link #isShowWhitebox() <em>Show Whitebox</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isShowWhitebox()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_WHITEBOX_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isShowWhitebox() <em>Show Whitebox</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isShowWhitebox()
	 * @generated
	 * @ordered
	 */
	protected boolean showWhitebox = SHOW_WHITEBOX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected UMLComponentImpl() {
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
		return PapyrusUMLNotationPackage.Literals.UML_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isShowWhitebox() {
		return showWhitebox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setShowWhitebox(boolean newShowWhitebox) {
		boolean oldShowWhitebox = showWhitebox;
		showWhitebox = newShowWhitebox;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusUMLNotationPackage.UML_COMPONENT__SHOW_WHITEBOX, oldShowWhitebox, showWhitebox));
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
		case PapyrusUMLNotationPackage.UML_COMPONENT__SHOW_WHITEBOX:
			return isShowWhitebox();
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
		case PapyrusUMLNotationPackage.UML_COMPONENT__SHOW_WHITEBOX:
			setShowWhitebox((Boolean) newValue);
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
		case PapyrusUMLNotationPackage.UML_COMPONENT__SHOW_WHITEBOX:
			setShowWhitebox(SHOW_WHITEBOX_EDEFAULT);
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
		case PapyrusUMLNotationPackage.UML_COMPONENT__SHOW_WHITEBOX:
			return showWhitebox != SHOW_WHITEBOX_EDEFAULT;
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
		result.append(" (showWhitebox: ");
		result.append(showWhitebox);
		result.append(')');
		return result.toString();
	}

} // UMLComponentImpl
