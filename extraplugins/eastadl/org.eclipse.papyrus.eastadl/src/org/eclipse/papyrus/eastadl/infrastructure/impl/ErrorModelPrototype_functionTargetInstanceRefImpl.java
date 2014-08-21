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
import org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_functionTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPrototype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Model Prototype function Target Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.ErrorModelPrototype_functionTargetInstanceRefImpl#getFunctionPrototype <em>Function Prototype</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.ErrorModelPrototype_functionTargetInstanceRefImpl#getFunctionPrototype_context <em>Function Prototype context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorModelPrototype_functionTargetInstanceRefImpl extends InstanceRefImpl implements ErrorModelPrototype_functionTargetInstanceRef {
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
	 * The cached value of the '{@link #getFunctionPrototype_context() <em>Function Prototype context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFunctionPrototype_context()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionPrototype> functionPrototype_context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ErrorModelPrototype_functionTargetInstanceRefImpl() {
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
		return InfrastructurePackage.Literals.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE, oldFunctionPrototype, functionPrototype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE, oldFunctionPrototype, functionPrototype));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<FunctionPrototype> getFunctionPrototype_context() {
		if (functionPrototype_context == null) {
			functionPrototype_context = new EObjectResolvingEList<FunctionPrototype>(FunctionPrototype.class, this, InfrastructurePackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT);
		}
		return functionPrototype_context;
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
		case InfrastructurePackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE:
			if (resolve) {
				return getFunctionPrototype();
			}
			return basicGetFunctionPrototype();
		case InfrastructurePackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT:
			return getFunctionPrototype_context();
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
		case InfrastructurePackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE:
			setFunctionPrototype((FunctionPrototype) newValue);
			return;
		case InfrastructurePackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT:
			getFunctionPrototype_context().clear();
			getFunctionPrototype_context().addAll((Collection<? extends FunctionPrototype>) newValue);
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
		case InfrastructurePackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE:
			setFunctionPrototype((FunctionPrototype) null);
			return;
		case InfrastructurePackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT:
			getFunctionPrototype_context().clear();
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
		case InfrastructurePackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE:
			return functionPrototype != null;
		case InfrastructurePackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT:
			return functionPrototype_context != null && !functionPrototype_context.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ErrorModelPrototype_functionTargetInstanceRefImpl
