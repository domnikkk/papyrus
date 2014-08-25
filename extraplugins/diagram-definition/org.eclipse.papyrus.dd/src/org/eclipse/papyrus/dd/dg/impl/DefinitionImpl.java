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

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.Definition;
import org.eclipse.papyrus.dd.dg.util.DGValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Definition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.DefinitionImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DefinitionImpl extends MinimalEObjectImpl.Container implements Definition {

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected DefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.DEFINITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.DEFINITION__ID, oldId, id));
		}
	}

	/**
	 * The cached validation expression for the '{@link #idCannotBeEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Id Cannot Be Empty</em>}' invariant operation.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #idCannotBeEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String ID_CANNOT_BE_EMPTY_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "id->notEmpty() implies id.size() > 0";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean idCannotBeEmpty(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DGValidator.validate(DGPackage.Literals.DEFINITION, this, diagnostics, context, "http://www.eclipse.org/emf/2002/Ecore/OCL", DGPackage.Literals.DEFINITION___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP,
				ID_CANNOT_BE_EMPTY_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR, DGValidator.DIAGNOSTIC_SOURCE, DGValidator.DEFINITION__ID_CANNOT_BE_EMPTY);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DGPackage.DEFINITION__ID:
			return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DGPackage.DEFINITION__ID:
			setId((String) newValue);
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
		case DGPackage.DEFINITION__ID:
			setId(ID_EDEFAULT);
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
		case DGPackage.DEFINITION__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case DGPackage.DEFINITION___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP:
			return idCannotBeEmpty((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}
} // DefinitionImpl
