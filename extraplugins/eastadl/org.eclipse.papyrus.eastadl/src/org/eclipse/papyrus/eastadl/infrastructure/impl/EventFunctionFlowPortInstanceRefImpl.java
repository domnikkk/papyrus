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
import org.eclipse.papyrus.eastadl.infrastructure.EventFunctionFlowPortInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionFlowPort;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPrototype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Function Flow Port Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.EventFunctionFlowPortInstanceRefImpl#getFunctionFlowPort <em>Function Flow Port</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.EventFunctionFlowPortInstanceRefImpl#getFunctionPrototype <em>Function Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventFunctionFlowPortInstanceRefImpl extends InstanceRefImpl implements EventFunctionFlowPortInstanceRef {
	/**
	 * The cached value of the '{@link #getFunctionFlowPort() <em>Function Flow Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFunctionFlowPort()
	 * @generated
	 * @ordered
	 */
	protected FunctionFlowPort functionFlowPort;

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
	protected EventFunctionFlowPortInstanceRefImpl() {
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
		return InfrastructurePackage.Literals.EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public FunctionFlowPort getFunctionFlowPort() {
		if (functionFlowPort != null && functionFlowPort.eIsProxy()) {
			InternalEObject oldFunctionFlowPort = (InternalEObject) functionFlowPort;
			functionFlowPort = (FunctionFlowPort) eResolveProxy(oldFunctionFlowPort);
			if (functionFlowPort != oldFunctionFlowPort) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF__FUNCTION_FLOW_PORT, oldFunctionFlowPort, functionFlowPort));
				}
			}
		}
		return functionFlowPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public FunctionFlowPort basicGetFunctionFlowPort() {
		return functionFlowPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setFunctionFlowPort(FunctionFlowPort newFunctionFlowPort) {
		FunctionFlowPort oldFunctionFlowPort = functionFlowPort;
		functionFlowPort = newFunctionFlowPort;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF__FUNCTION_FLOW_PORT, oldFunctionFlowPort, functionFlowPort));
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
			functionPrototype = new EObjectResolvingEList<FunctionPrototype>(FunctionPrototype.class, this, InfrastructurePackage.EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE);
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
		case InfrastructurePackage.EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF__FUNCTION_FLOW_PORT:
			if (resolve) {
				return getFunctionFlowPort();
			}
			return basicGetFunctionFlowPort();
		case InfrastructurePackage.EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE:
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
		case InfrastructurePackage.EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF__FUNCTION_FLOW_PORT:
			setFunctionFlowPort((FunctionFlowPort) newValue);
			return;
		case InfrastructurePackage.EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE:
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
		case InfrastructurePackage.EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF__FUNCTION_FLOW_PORT:
			setFunctionFlowPort((FunctionFlowPort) null);
			return;
		case InfrastructurePackage.EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE:
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
		case InfrastructurePackage.EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF__FUNCTION_FLOW_PORT:
			return functionFlowPort != null;
		case InfrastructurePackage.EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE:
			return functionPrototype != null && !functionPrototype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // EventFunctionFlowPortInstanceRefImpl
