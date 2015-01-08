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
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionConnector;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPrototype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Constraint Internal Binding through Function Connector Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRefImpl#getFunctionConnector <em>Function Connector</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRefImpl#getFunctionPrototype <em>Function Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRefImpl extends InstanceRefImpl implements BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef {
	/**
	 * The cached value of the '{@link #getFunctionConnector() <em>Function Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFunctionConnector()
	 * @generated
	 * @ordered
	 */
	protected FunctionConnector functionConnector;

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
	protected BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRefImpl() {
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
		return InfrastructurePackage.Literals.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public FunctionConnector getFunctionConnector() {
		if (functionConnector != null && functionConnector.eIsProxy()) {
			InternalEObject oldFunctionConnector = (InternalEObject) functionConnector;
			functionConnector = (FunctionConnector) eResolveProxy(oldFunctionConnector);
			if (functionConnector != oldFunctionConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF__FUNCTION_CONNECTOR, oldFunctionConnector, functionConnector));
			}
		}
		return functionConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public FunctionConnector basicGetFunctionConnector() {
		return functionConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setFunctionConnector(FunctionConnector newFunctionConnector) {
		FunctionConnector oldFunctionConnector = functionConnector;
		functionConnector = newFunctionConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF__FUNCTION_CONNECTOR, oldFunctionConnector, functionConnector));
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
			functionPrototype = new EObjectResolvingEList<FunctionPrototype>(FunctionPrototype.class, this, InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF__FUNCTION_PROTOTYPE);
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
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF__FUNCTION_CONNECTOR:
			if (resolve)
				return getFunctionConnector();
			return basicGetFunctionConnector();
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF__FUNCTION_PROTOTYPE:
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
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF__FUNCTION_CONNECTOR:
			setFunctionConnector((FunctionConnector) newValue);
			return;
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF__FUNCTION_PROTOTYPE:
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
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF__FUNCTION_CONNECTOR:
			setFunctionConnector((FunctionConnector) null);
			return;
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF__FUNCTION_PROTOTYPE:
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
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF__FUNCTION_CONNECTOR:
			return functionConnector != null;
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF__FUNCTION_PROTOTYPE:
			return functionPrototype != null && !functionPrototype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRefImpl
