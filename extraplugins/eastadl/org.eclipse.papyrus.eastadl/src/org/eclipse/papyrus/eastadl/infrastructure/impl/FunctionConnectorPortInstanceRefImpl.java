/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.eastadl.infrastructure.FunctionConnectorPortInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPort;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPrototype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Connector Port Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.FunctionConnectorPortInstanceRefImpl#getFunctionPort <em>Function Port</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.FunctionConnectorPortInstanceRefImpl#getFunctionPrototype <em>Function Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionConnectorPortInstanceRefImpl extends InstanceRefImpl implements FunctionConnectorPortInstanceRef {
	/**
	 * The cached value of the '{@link #getFunctionPort() <em>Function Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFunctionPort()
	 * @generated
	 * @ordered
	 */
	protected FunctionPort functionPort;

	/**
	 * The cached value of the '{@link #getFunctionPrototype() <em>Function Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFunctionPrototype()
	 * @generated
	 * @ordered
	 */
	protected FunctionPrototype functionPrototype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FunctionConnectorPortInstanceRefImpl() {
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
		return InfrastructurePackage.Literals.FUNCTION_CONNECTOR_PORT_INSTANCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public FunctionPort getFunctionPort() {
		if (functionPort != null && functionPort.eIsProxy()) {
			InternalEObject oldFunctionPort = (InternalEObject) functionPort;
			functionPort = (FunctionPort) eResolveProxy(oldFunctionPort);
			if (functionPort != oldFunctionPort) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.FUNCTION_CONNECTOR_PORT_INSTANCE_REF__FUNCTION_PORT, oldFunctionPort, functionPort));
				}
			}
		}
		return functionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FunctionPort basicGetFunctionPort() {
		return functionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setFunctionPort(FunctionPort newFunctionPort) {
		FunctionPort oldFunctionPort = functionPort;
		functionPort = newFunctionPort;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.FUNCTION_CONNECTOR_PORT_INSTANCE_REF__FUNCTION_PORT, oldFunctionPort, functionPort));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public FunctionPrototype getFunctionPrototype() {
		if (functionPrototype != null && functionPrototype.eIsProxy()) {
			InternalEObject oldFunctionPrototype = (InternalEObject) functionPrototype;
			functionPrototype = (FunctionPrototype) eResolveProxy(oldFunctionPrototype);
			if (functionPrototype != oldFunctionPrototype) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.FUNCTION_CONNECTOR_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE, oldFunctionPrototype, functionPrototype));
				}
			}
		}
		return functionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FunctionPrototype basicGetFunctionPrototype() {
		return functionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setFunctionPrototype(FunctionPrototype newFunctionPrototype) {
		FunctionPrototype oldFunctionPrototype = functionPrototype;
		functionPrototype = newFunctionPrototype;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.FUNCTION_CONNECTOR_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE, oldFunctionPrototype, functionPrototype));
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
		case InfrastructurePackage.FUNCTION_CONNECTOR_PORT_INSTANCE_REF__FUNCTION_PORT:
			if (resolve) {
				return getFunctionPort();
			}
			return basicGetFunctionPort();
		case InfrastructurePackage.FUNCTION_CONNECTOR_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE:
			if (resolve) {
				return getFunctionPrototype();
			}
			return basicGetFunctionPrototype();
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
		case InfrastructurePackage.FUNCTION_CONNECTOR_PORT_INSTANCE_REF__FUNCTION_PORT:
			setFunctionPort((FunctionPort) newValue);
			return;
		case InfrastructurePackage.FUNCTION_CONNECTOR_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE:
			setFunctionPrototype((FunctionPrototype) newValue);
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
		case InfrastructurePackage.FUNCTION_CONNECTOR_PORT_INSTANCE_REF__FUNCTION_PORT:
			setFunctionPort((FunctionPort) null);
			return;
		case InfrastructurePackage.FUNCTION_CONNECTOR_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE:
			setFunctionPrototype((FunctionPrototype) null);
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
		case InfrastructurePackage.FUNCTION_CONNECTOR_PORT_INSTANCE_REF__FUNCTION_PORT:
			return functionPort != null;
		case InfrastructurePackage.FUNCTION_CONNECTOR_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE:
			return functionPrototype != null;
		}
		return super.eIsSet(featureID);
	}

} // FunctionConnectorPortInstanceRefImpl
