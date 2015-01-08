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
package org.eclipse.papyrus.eastadl.structure.functionmodeling.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.papyrus.eastadl.infrastructure.FunctionConnectorPortInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAConnector;
import org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAElementImpl;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.AllocateableElement;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionConnector;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionmodelingPackage;
import org.eclipse.uml2.uml.Connector;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Function Connector</b></em> '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.functionmodeling.impl.FunctionConnectorImpl#getBase_Connector <em>Base Connector</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.functionmodeling.impl.FunctionConnectorImpl#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionConnectorImpl extends EAElementImpl implements FunctionConnector {

	/**
	 * The cached value of the '{@link #getBase_Connector() <em>Base Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBase_Connector()
	 * @generated
	 * @ordered
	 */
	protected Connector base_Connector;
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionConnectorPortInstanceRef> port;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected FunctionConnectorImpl() {
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
		case FunctionmodelingPackage.FUNCTION_CONNECTOR__BASE_CONNECTOR:
			if (resolve)
				return getBase_Connector();
			return basicGetBase_Connector();
		case FunctionmodelingPackage.FUNCTION_CONNECTOR__PORT:
			return getPort();
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
		case FunctionmodelingPackage.FUNCTION_CONNECTOR__BASE_CONNECTOR:
			return base_Connector != null;
		case FunctionmodelingPackage.FUNCTION_CONNECTOR__PORT:
			return port != null && !port.isEmpty();
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EAConnector.class) {
			switch (derivedFeatureID) {
			case FunctionmodelingPackage.FUNCTION_CONNECTOR__BASE_CONNECTOR:
				return ElementsPackage.EA_CONNECTOR__BASE_CONNECTOR;
			default:
				return -1;
			}
		}
		if (baseClass == AllocateableElement.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EAConnector.class) {
			switch (baseFeatureID) {
			case ElementsPackage.EA_CONNECTOR__BASE_CONNECTOR:
				return FunctionmodelingPackage.FUNCTION_CONNECTOR__BASE_CONNECTOR;
			default:
				return -1;
			}
		}
		if (baseClass == AllocateableElement.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		case FunctionmodelingPackage.FUNCTION_CONNECTOR__BASE_CONNECTOR:
			setBase_Connector((Connector) newValue);
			return;
		case FunctionmodelingPackage.FUNCTION_CONNECTOR__PORT:
			getPort().clear();
			getPort().addAll((Collection<? extends FunctionConnectorPortInstanceRef>) newValue);
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
		return FunctionmodelingPackage.Literals.FUNCTION_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Connector getBase_Connector() {
		if (base_Connector != null && base_Connector.eIsProxy()) {
			InternalEObject oldBase_Connector = (InternalEObject) base_Connector;
			base_Connector = (Connector) eResolveProxy(oldBase_Connector);
			if (base_Connector != oldBase_Connector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionmodelingPackage.FUNCTION_CONNECTOR__BASE_CONNECTOR, oldBase_Connector, base_Connector));
			}
		}
		return base_Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Connector basicGetBase_Connector() {
		return base_Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setBase_Connector(Connector newBase_Connector) {
		Connector oldBase_Connector = base_Connector;
		base_Connector = newBase_Connector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionmodelingPackage.FUNCTION_CONNECTOR__BASE_CONNECTOR, oldBase_Connector, base_Connector));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FunctionmodelingPackage.FUNCTION_CONNECTOR__BASE_CONNECTOR:
			setBase_Connector((Connector) null);
			return;
		case FunctionmodelingPackage.FUNCTION_CONNECTOR__PORT:
			getPort().clear();
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
	public EList<FunctionConnectorPortInstanceRef> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<FunctionConnectorPortInstanceRef>(FunctionConnectorPortInstanceRef.class, this, FunctionmodelingPackage.FUNCTION_CONNECTOR__PORT);
		}
		return port;
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
		case FunctionmodelingPackage.FUNCTION_CONNECTOR__PORT:
			return ((InternalEList<?>) getPort()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

} // FunctionConnectorImpl
