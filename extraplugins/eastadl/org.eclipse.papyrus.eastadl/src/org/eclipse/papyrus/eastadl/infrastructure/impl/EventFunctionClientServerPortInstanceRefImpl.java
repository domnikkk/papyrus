/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.infrastructure.EventFunctionClientServerPortInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionClientServerPort;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPrototype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Function Client Server Port Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.EventFunctionClientServerPortInstanceRefImpl#getFunctionClientServerPort <em>Function Client Server Port</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.EventFunctionClientServerPortInstanceRefImpl#getFunctionPrototype <em>Function Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventFunctionClientServerPortInstanceRefImpl extends InstanceRefImpl implements EventFunctionClientServerPortInstanceRef {
	/**
	 * The cached value of the '{@link #getFunctionClientServerPort() <em>Function Client Server Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFunctionClientServerPort()
	 * @generated
	 * @ordered
	 */
	protected FunctionClientServerPort functionClientServerPort;

	/**
	 * The cached value of the '{@link #getFunctionPrototype() <em>Function Prototype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFunctionPrototype()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionPrototype> functionPrototype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EventFunctionClientServerPortInstanceRefImpl() {
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
		return InfrastructurePackage.Literals.EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public FunctionClientServerPort getFunctionClientServerPort() {
		if (functionClientServerPort != null && functionClientServerPort.eIsProxy()) {
			InternalEObject oldFunctionClientServerPort = (InternalEObject) functionClientServerPort;
			functionClientServerPort = (FunctionClientServerPort) eResolveProxy(oldFunctionClientServerPort);
			if (functionClientServerPort != oldFunctionClientServerPort) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF__FUNCTION_CLIENT_SERVER_PORT, oldFunctionClientServerPort, functionClientServerPort));
				}
			}
		}
		return functionClientServerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public FunctionClientServerPort basicGetFunctionClientServerPort() {
		return functionClientServerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setFunctionClientServerPort(FunctionClientServerPort newFunctionClientServerPort) {
		FunctionClientServerPort oldFunctionClientServerPort = functionClientServerPort;
		functionClientServerPort = newFunctionClientServerPort;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF__FUNCTION_CLIENT_SERVER_PORT, oldFunctionClientServerPort, functionClientServerPort));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<FunctionPrototype> getFunctionPrototype() {
		if (functionPrototype == null) {
			functionPrototype = new EObjectResolvingEList<FunctionPrototype>(FunctionPrototype.class, this, InfrastructurePackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE);
		}
		return functionPrototype;
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
		case InfrastructurePackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF__FUNCTION_CLIENT_SERVER_PORT:
			if (resolve) {
				return getFunctionClientServerPort();
			}
			return basicGetFunctionClientServerPort();
		case InfrastructurePackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE:
			return getFunctionPrototype();
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
		case InfrastructurePackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF__FUNCTION_CLIENT_SERVER_PORT:
			setFunctionClientServerPort((FunctionClientServerPort) newValue);
			return;
		case InfrastructurePackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE:
			getFunctionPrototype().clear();
			getFunctionPrototype().addAll((Collection<? extends FunctionPrototype>) newValue);
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
		case InfrastructurePackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF__FUNCTION_CLIENT_SERVER_PORT:
			setFunctionClientServerPort((FunctionClientServerPort) null);
			return;
		case InfrastructurePackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE:
			getFunctionPrototype().clear();
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
		case InfrastructurePackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF__FUNCTION_CLIENT_SERVER_PORT:
			return functionClientServerPort != null;
		case InfrastructurePackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE:
			return functionPrototype != null && !functionPrototype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // EventFunctionClientServerPortInstanceRefImpl
