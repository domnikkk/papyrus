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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.ClientServerKind;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionClientServerInterface;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionClientServerPort;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionmodelingPackage;
//import org.eclipse.papyrus.uml.tools.utils.UMLUtil;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;


/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Function Client Server Port</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.functionmodeling.impl.FunctionClientServerPortImpl#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.functionmodeling.impl.FunctionClientServerPortImpl#getClientServerKind <em>Client Server Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionClientServerPortImpl extends FunctionPortImpl implements FunctionClientServerPort {

	/**
	 * The default value of the '{@link #getClientServerKind() <em>Client Server Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getClientServerKind()
	 * @generated
	 * @ordered
	 */
	protected static final ClientServerKind CLIENT_SERVER_KIND_EDEFAULT = ClientServerKind.CLIENT;

	/**
	 * The cached value of the '{@link #getClientServerKind() <em>Client Server Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getClientServerKind()
	 * @generated
	 * @ordered
	 */
	protected ClientServerKind clientServerKind = CLIENT_SERVER_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FunctionClientServerPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public FunctionClientServerInterface basicGetType() {
		// Implementation for basicGetType() defined on ADLClientServerPortImpl
		FunctionClientServerInterface adlInterface = null;

		if (getBase_Port() != null) {
			Type umlType = getBase_Port().getType();
			if (umlType != null) {
				adlInterface = UMLUtil.getStereotypeApplication(umlType, FunctionClientServerInterface.class);
			}


		}

		return adlInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ClientServerKind getClientServerKind() {
		return clientServerKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setClientServerKind(ClientServerKind newClientServerKind) {
		ClientServerKind oldClientServerKind = clientServerKind;
		clientServerKind = newClientServerKind == null ? CLIENT_SERVER_KIND_EDEFAULT : newClientServerKind;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionmodelingPackage.FUNCTION_CLIENT_SERVER_PORT__CLIENT_SERVER_KIND, oldClientServerKind, clientServerKind));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FunctionmodelingPackage.FUNCTION_CLIENT_SERVER_PORT__TYPE:
			if (resolve) {
				return getType();
			}
			return basicGetType();
		case FunctionmodelingPackage.FUNCTION_CLIENT_SERVER_PORT__CLIENT_SERVER_KIND:
			return getClientServerKind();
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
		case FunctionmodelingPackage.FUNCTION_CLIENT_SERVER_PORT__TYPE:
			return basicGetType() != null;
		case FunctionmodelingPackage.FUNCTION_CLIENT_SERVER_PORT__CLIENT_SERVER_KIND:
			return clientServerKind != CLIENT_SERVER_KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FunctionmodelingPackage.FUNCTION_CLIENT_SERVER_PORT__CLIENT_SERVER_KIND:
			setClientServerKind((ClientServerKind) newValue);
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
		return FunctionmodelingPackage.Literals.FUNCTION_CLIENT_SERVER_PORT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FunctionmodelingPackage.FUNCTION_CLIENT_SERVER_PORT__CLIENT_SERVER_KIND:
			setClientServerKind(CLIENT_SERVER_KIND_EDEFAULT);
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
	public FunctionClientServerInterface getType() {
		FunctionClientServerInterface type = basicGetType();
		return type != null && type.eIsProxy() ? (FunctionClientServerInterface) eResolveProxy((InternalEObject) type) : type;
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
		result.append(" (clientServerKind: ");
		result.append(clientServerKind);
		result.append(')');
		return result.toString();
	}

} // FunctionClientServerPortImpl
