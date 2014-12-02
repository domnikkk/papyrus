/**
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersPackage;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.URIMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>URI Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.URIMappingImpl#getSourceURI <em>Source URI</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.URIMappingImpl#getTargetURI <em>Target URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class URIMappingImpl extends MinimalEObjectImpl.Container implements URIMapping {
	/**
	 * The default value of the '{@link #getSourceURI() <em>Source URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getSourceURI()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceURI() <em>Source URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getSourceURI()
	 * @generated
	 * @ordered
	 */
	protected String sourceURI = SOURCE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetURI() <em>Target URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getTargetURI()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetURI() <em>Target URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getTargetURI()
	 * @generated
	 * @ordered
	 */
	protected String targetURI = TARGET_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected URIMappingImpl() {
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
		return RSAToPapyrusParametersPackage.Literals.URI_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getSourceURI() {
		return sourceURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setSourceURI(String newSourceURI) {
		String oldSourceURI = sourceURI;
		sourceURI = newSourceURI;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, RSAToPapyrusParametersPackage.URI_MAPPING__SOURCE_URI, oldSourceURI, sourceURI));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getTargetURI() {
		return targetURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setTargetURI(String newTargetURI) {
		String oldTargetURI = targetURI;
		targetURI = newTargetURI;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, RSAToPapyrusParametersPackage.URI_MAPPING__TARGET_URI, oldTargetURI, targetURI));
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
		case RSAToPapyrusParametersPackage.URI_MAPPING__SOURCE_URI:
			return getSourceURI();
		case RSAToPapyrusParametersPackage.URI_MAPPING__TARGET_URI:
			return getTargetURI();
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
		case RSAToPapyrusParametersPackage.URI_MAPPING__SOURCE_URI:
			setSourceURI((String) newValue);
			return;
		case RSAToPapyrusParametersPackage.URI_MAPPING__TARGET_URI:
			setTargetURI((String) newValue);
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
		case RSAToPapyrusParametersPackage.URI_MAPPING__SOURCE_URI:
			setSourceURI(SOURCE_URI_EDEFAULT);
			return;
		case RSAToPapyrusParametersPackage.URI_MAPPING__TARGET_URI:
			setTargetURI(TARGET_URI_EDEFAULT);
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
		case RSAToPapyrusParametersPackage.URI_MAPPING__SOURCE_URI:
			return SOURCE_URI_EDEFAULT == null ? sourceURI != null : !SOURCE_URI_EDEFAULT.equals(sourceURI);
		case RSAToPapyrusParametersPackage.URI_MAPPING__TARGET_URI:
			return TARGET_URI_EDEFAULT == null ? targetURI != null : !TARGET_URI_EDEFAULT.equals(targetURI);
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
		result.append(" (sourceURI: ");
		result.append(sourceURI);
		result.append(", targetURI: ");
		result.append(targetURI);
		result.append(')');
		return result.toString();
	}

} // URIMappingImpl
