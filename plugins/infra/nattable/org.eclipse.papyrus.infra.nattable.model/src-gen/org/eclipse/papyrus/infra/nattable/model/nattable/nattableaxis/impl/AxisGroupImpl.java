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
package org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.AxisGroup;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.NattableaxisPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AxisManagerRepresentation;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablelabelprovider.ILabelProviderConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.StyledElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axis Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.AxisGroupImpl#getManager <em>Manager</em>}</li>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.AxisGroupImpl#getAlias <em>Alias</em>}</li>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.AxisGroupImpl#getGroupedAxis <em>Grouped Axis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AxisGroupImpl extends StyledElementImpl implements AxisGroup {
	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected AxisManagerRepresentation manager;

	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroupedAxis() <em>Grouped Axis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getGroupedAxis()
	 * @generated
	 * @ordered
	 */
	protected EList<IAxis> groupedAxis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected AxisGroupImpl() {
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
		return NattableaxisPackage.Literals.AXIS_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public AxisManagerRepresentation getManager() {
		if (manager != null && manager.eIsProxy()) {
			InternalEObject oldManager = (InternalEObject) manager;
			manager = (AxisManagerRepresentation) eResolveProxy(oldManager);
			if (manager != oldManager) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NattableaxisPackage.AXIS_GROUP__MANAGER, oldManager, manager));
				}
			}
		}
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public AxisManagerRepresentation basicGetManager() {
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setManager(AxisManagerRepresentation newManager) {
		AxisManagerRepresentation oldManager = manager;
		manager = newManager;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, NattableaxisPackage.AXIS_GROUP__MANAGER, oldManager, manager));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, NattableaxisPackage.AXIS_GROUP__ALIAS, oldAlias, alias));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<IAxis> getGroupedAxis() {
		if (groupedAxis == null) {
			groupedAxis = new EObjectResolvingEList<IAxis>(IAxis.class, this, NattableaxisPackage.AXIS_GROUP__GROUPED_AXIS);
		}
		return groupedAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object getElement() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ILabelProviderConfiguration getLocalLabelConfiguration() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
		case NattableaxisPackage.AXIS_GROUP__MANAGER:
			if (resolve) {
				return getManager();
			}
			return basicGetManager();
		case NattableaxisPackage.AXIS_GROUP__ALIAS:
			return getAlias();
		case NattableaxisPackage.AXIS_GROUP__GROUPED_AXIS:
			return getGroupedAxis();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NattableaxisPackage.AXIS_GROUP__MANAGER:
			setManager((AxisManagerRepresentation) newValue);
			return;
		case NattableaxisPackage.AXIS_GROUP__ALIAS:
			setAlias((String) newValue);
			return;
		case NattableaxisPackage.AXIS_GROUP__GROUPED_AXIS:
			getGroupedAxis().clear();
			getGroupedAxis().addAll((Collection<? extends IAxis>) newValue);
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
		case NattableaxisPackage.AXIS_GROUP__MANAGER:
			setManager((AxisManagerRepresentation) null);
			return;
		case NattableaxisPackage.AXIS_GROUP__ALIAS:
			setAlias(ALIAS_EDEFAULT);
			return;
		case NattableaxisPackage.AXIS_GROUP__GROUPED_AXIS:
			getGroupedAxis().clear();
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
		case NattableaxisPackage.AXIS_GROUP__MANAGER:
			return manager != null;
		case NattableaxisPackage.AXIS_GROUP__ALIAS:
			return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
		case NattableaxisPackage.AXIS_GROUP__GROUPED_AXIS:
			return groupedAxis != null && !groupedAxis.isEmpty();
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case NattableaxisPackage.AXIS_GROUP___GET_ELEMENT:
			return getElement();
		case NattableaxisPackage.AXIS_GROUP___GET_LOCAL_LABEL_CONFIGURATION:
			return getLocalLabelConfiguration();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (alias: "); //$NON-NLS-1$
		result.append(alias);
		result.append(')');
		return result.toString();
	}

} // AxisGroupImpl
