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
package org.eclipse.papyrus.eastadl.dependability.errormodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrormodelPackage;
import org.eclipse.papyrus.eastadl.dependability.errormodel.FaultFailurePort;
import org.eclipse.papyrus.eastadl.dependability.errormodel.FaultFailurePropagationLink;
import org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_fromPortInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_toPortInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAConnector;
import org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAElementImpl;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Fault Failure Propagation Link</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.impl.FaultFailurePropagationLinkImpl#getBase_Connector <em>Base Connector</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.impl.FaultFailurePropagationLinkImpl#isImmediatePropagation <em>Immediate Propagation</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.impl.FaultFailurePropagationLinkImpl#getToPort <em>To Port</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.impl.FaultFailurePropagationLinkImpl#getFromPort <em>From Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FaultFailurePropagationLinkImpl extends EAElementImpl implements FaultFailurePropagationLink {

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
	 * The default value of the '{@link #isImmediatePropagation() <em>Immediate Propagation</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isImmediatePropagation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMMEDIATE_PROPAGATION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isImmediatePropagation() <em>Immediate Propagation</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isImmediatePropagation()
	 * @generated
	 * @ordered
	 */
	protected boolean immediatePropagation = IMMEDIATE_PROPAGATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToPort() <em>To Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getToPort()
	 * @generated
	 * @ordered
	 */
	protected FaultFailurePropagationLink_toPortInstanceRef toPort;

	/**
	 * The cached value of the '{@link #getFromPort() <em>From Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFromPort()
	 * @generated
	 * @ordered
	 */
	protected FaultFailurePropagationLink_fromPortInstanceRef fromPort;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected FaultFailurePropagationLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public FaultFailurePort basicGetFromPort() {
		FaultFailurePort currentFlowPort = null;

		if (getBase_Connector() != null) {
			// Parse owned Connectors
			if (getBase_Connector().getEnds().size() >= 2) {
				ConnectorEnd current = getBase_Connector().getEnds().get(0);
				ConnectableElement ce = current.getRole();

				if ((ce != null) && (ce instanceof Port)) {
					// Test if ConnectableElement ce is FaultFailurePort
					currentFlowPort = UMLUtil.getStereotypeApplication(ce,
							FaultFailurePort.class);
				}
			}
		}
		return currentFlowPort;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public FaultFailurePort basicGetToPort() {
		FaultFailurePort currentFlowPort = null;

		if (getBase_Connector() != null) {
			// Parse owned Connectors
			if (getBase_Connector().getEnds().size() >= 2) {
				ConnectorEnd current = getBase_Connector().getEnds().get(1);
				ConnectableElement ce = current.getRole();

				if ((ce != null) && (ce instanceof Port)) {
					// Test if ce is stereotyped FaultFailurePort
					currentFlowPort = UMLUtil.getStereotypeApplication(ce, FaultFailurePort.class);
				}
			}
		}
		return currentFlowPort;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__BASE_CONNECTOR:
			if (resolve) {
				return getBase_Connector();
			}
			return basicGetBase_Connector();
		case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__IMMEDIATE_PROPAGATION:
			return isImmediatePropagation();
		case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__TO_PORT:
			return getToPort();
		case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT:
			return getFromPort();
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
		case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__BASE_CONNECTOR:
			return base_Connector != null;
		case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__IMMEDIATE_PROPAGATION:
			return immediatePropagation != IMMEDIATE_PROPAGATION_EDEFAULT;
		case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__TO_PORT:
			return toPort != null;
		case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT:
			return fromPort != null;
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
			case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__BASE_CONNECTOR:
				return ElementsPackage.EA_CONNECTOR__BASE_CONNECTOR;
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
				return ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__BASE_CONNECTOR;
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__BASE_CONNECTOR:
			setBase_Connector((Connector) newValue);
			return;
		case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__IMMEDIATE_PROPAGATION:
			setImmediatePropagation((Boolean) newValue);
			return;
		case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__TO_PORT:
			setToPort((FaultFailurePropagationLink_toPortInstanceRef) newValue);
			return;
		case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT:
			setFromPort((FaultFailurePropagationLink_fromPortInstanceRef) newValue);
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
		return ErrormodelPackage.Literals.FAULT_FAILURE_PROPAGATION_LINK;
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
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__BASE_CONNECTOR, oldBase_Connector, base_Connector));
				}
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
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__BASE_CONNECTOR, oldBase_Connector, base_Connector));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__BASE_CONNECTOR:
			setBase_Connector((Connector) null);
			return;
		case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__IMMEDIATE_PROPAGATION:
			setImmediatePropagation(IMMEDIATE_PROPAGATION_EDEFAULT);
			return;
		case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__TO_PORT:
			setToPort((FaultFailurePropagationLink_toPortInstanceRef) null);
			return;
		case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT:
			setFromPort((FaultFailurePropagationLink_fromPortInstanceRef) null);
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
	public FaultFailurePropagationLink_fromPortInstanceRef getFromPort() {
		return fromPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetFromPort(FaultFailurePropagationLink_fromPortInstanceRef newFromPort, NotificationChain msgs) {
		FaultFailurePropagationLink_fromPortInstanceRef oldFromPort = fromPort;
		fromPort = newFromPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT, oldFromPort, newFromPort);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setFromPort(FaultFailurePropagationLink_fromPortInstanceRef newFromPort) {
		if (newFromPort != fromPort) {
			NotificationChain msgs = null;
			if (fromPort != null) {
				msgs = ((InternalEObject) fromPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT, null, msgs);
			}
			if (newFromPort != null) {
				msgs = ((InternalEObject) newFromPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT, null, msgs);
			}
			msgs = basicSetFromPort(newFromPort, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT, newFromPort, newFromPort));
		}
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
		case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__TO_PORT:
			return basicSetToPort(null, msgs);
		case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT:
			return basicSetFromPort(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public FaultFailurePropagationLink_toPortInstanceRef getToPort() {
		return toPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetToPort(FaultFailurePropagationLink_toPortInstanceRef newToPort, NotificationChain msgs) {
		FaultFailurePropagationLink_toPortInstanceRef oldToPort = toPort;
		toPort = newToPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__TO_PORT, oldToPort, newToPort);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setToPort(FaultFailurePropagationLink_toPortInstanceRef newToPort) {
		if (newToPort != toPort) {
			NotificationChain msgs = null;
			if (toPort != null) {
				msgs = ((InternalEObject) toPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__TO_PORT, null, msgs);
			}
			if (newToPort != null) {
				msgs = ((InternalEObject) newToPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__TO_PORT, null, msgs);
			}
			msgs = basicSetToPort(newToPort, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__TO_PORT, newToPort, newToPort));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isImmediatePropagation() {
		return immediatePropagation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setImmediatePropagation(boolean newImmediatePropagation) {
		boolean oldImmediatePropagation = immediatePropagation;
		immediatePropagation = newImmediatePropagation;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__IMMEDIATE_PROPAGATION, oldImmediatePropagation, immediatePropagation));
		}
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
		result.append(" (immediatePropagation: ");
		result.append(immediatePropagation);
		result.append(')');
		return result.toString();
	}

} // FaultFailurePropagationLinkImpl
