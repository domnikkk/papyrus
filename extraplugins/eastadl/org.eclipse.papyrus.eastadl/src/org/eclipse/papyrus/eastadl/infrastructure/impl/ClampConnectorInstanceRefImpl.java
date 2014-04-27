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
import org.eclipse.papyrus.eastadl.infrastructure.ClampConnectorInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPort;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPrototype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clamp Connector Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.ClampConnectorInstanceRefImpl#getFunctionPort <em>Function Port</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.ClampConnectorInstanceRefImpl#getFunctionPrototype <em>Function Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClampConnectorInstanceRefImpl extends InstanceRefImpl implements ClampConnectorInstanceRef {
	/**
	 * The cached value of the '{@link #getFunctionPort() <em>Function Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionPort()
	 * @generated
	 * @ordered
	 */
	protected FunctionPort functionPort;

	/**
	 * The cached value of the '{@link #getFunctionPrototype() <em>Function Prototype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionPrototype()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionPrototype> functionPrototype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClampConnectorInstanceRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.CLAMP_CONNECTOR_INSTANCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPort getFunctionPort() {
		if (functionPort != null && functionPort.eIsProxy()) {
			InternalEObject oldFunctionPort = (InternalEObject)functionPort;
			functionPort = (FunctionPort)eResolveProxy(oldFunctionPort);
			if (functionPort != oldFunctionPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.CLAMP_CONNECTOR_INSTANCE_REF__FUNCTION_PORT, oldFunctionPort, functionPort));
			}
		}
		return functionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPort basicGetFunctionPort() {
		return functionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionPort(FunctionPort newFunctionPort) {
		FunctionPort oldFunctionPort = functionPort;
		functionPort = newFunctionPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.CLAMP_CONNECTOR_INSTANCE_REF__FUNCTION_PORT, oldFunctionPort, functionPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionPrototype> getFunctionPrototype() {
		if (functionPrototype == null) {
			functionPrototype = new EObjectResolvingEList<FunctionPrototype>(FunctionPrototype.class, this, InfrastructurePackage.CLAMP_CONNECTOR_INSTANCE_REF__FUNCTION_PROTOTYPE);
		}
		return functionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfrastructurePackage.CLAMP_CONNECTOR_INSTANCE_REF__FUNCTION_PORT:
				if (resolve) return getFunctionPort();
				return basicGetFunctionPort();
			case InfrastructurePackage.CLAMP_CONNECTOR_INSTANCE_REF__FUNCTION_PROTOTYPE:
				return getFunctionPrototype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfrastructurePackage.CLAMP_CONNECTOR_INSTANCE_REF__FUNCTION_PORT:
				setFunctionPort((FunctionPort)newValue);
				return;
			case InfrastructurePackage.CLAMP_CONNECTOR_INSTANCE_REF__FUNCTION_PROTOTYPE:
				getFunctionPrototype().clear();
				getFunctionPrototype().addAll((Collection<? extends FunctionPrototype>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InfrastructurePackage.CLAMP_CONNECTOR_INSTANCE_REF__FUNCTION_PORT:
				setFunctionPort((FunctionPort)null);
				return;
			case InfrastructurePackage.CLAMP_CONNECTOR_INSTANCE_REF__FUNCTION_PROTOTYPE:
				getFunctionPrototype().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InfrastructurePackage.CLAMP_CONNECTOR_INSTANCE_REF__FUNCTION_PORT:
				return functionPort != null;
			case InfrastructurePackage.CLAMP_CONNECTOR_INSTANCE_REF__FUNCTION_PROTOTYPE:
				return functionPrototype != null && !functionPrototype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClampConnectorInstanceRefImpl
