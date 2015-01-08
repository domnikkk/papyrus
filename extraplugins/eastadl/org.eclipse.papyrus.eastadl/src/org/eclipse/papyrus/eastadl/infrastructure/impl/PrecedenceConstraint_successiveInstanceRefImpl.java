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
import org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage;
import org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_successiveInstanceRef;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPrototype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precedence Constraint successive Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.PrecedenceConstraint_successiveInstanceRefImpl#getFunctionPrototype_target <em>Function Prototype target</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.PrecedenceConstraint_successiveInstanceRefImpl#getFunctionPrototype_context <em>Function Prototype context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrecedenceConstraint_successiveInstanceRefImpl extends InstanceRefImpl implements PrecedenceConstraint_successiveInstanceRef {
	/**
	 * The cached value of the '{@link #getFunctionPrototype_target() <em>Function Prototype target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFunctionPrototype_target()
	 * @generated
	 * @ordered
	 */
	protected FunctionPrototype functionPrototype_target;

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
	protected PrecedenceConstraint_successiveInstanceRefImpl() {
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
		return InfrastructurePackage.Literals.PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public FunctionPrototype getFunctionPrototype_target() {
		if (functionPrototype_target != null && functionPrototype_target.eIsProxy()) {
			InternalEObject oldFunctionPrototype_target = (InternalEObject) functionPrototype_target;
			functionPrototype_target = (FunctionPrototype) eResolveProxy(oldFunctionPrototype_target);
			if (functionPrototype_target != oldFunctionPrototype_target) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF__FUNCTION_PROTOTYPE_TARGET, oldFunctionPrototype_target, functionPrototype_target));
			}
		}
		return functionPrototype_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public FunctionPrototype basicGetFunctionPrototype_target() {
		return functionPrototype_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setFunctionPrototype_target(FunctionPrototype newFunctionPrototype_target) {
		FunctionPrototype oldFunctionPrototype_target = functionPrototype_target;
		functionPrototype_target = newFunctionPrototype_target;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF__FUNCTION_PROTOTYPE_TARGET, oldFunctionPrototype_target, functionPrototype_target));
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
			functionPrototype_context = new EObjectResolvingEList<FunctionPrototype>(FunctionPrototype.class, this, InfrastructurePackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT);
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
		case InfrastructurePackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF__FUNCTION_PROTOTYPE_TARGET:
			if (resolve)
				return getFunctionPrototype_target();
			return basicGetFunctionPrototype_target();
		case InfrastructurePackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT:
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
		case InfrastructurePackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF__FUNCTION_PROTOTYPE_TARGET:
			setFunctionPrototype_target((FunctionPrototype) newValue);
			return;
		case InfrastructurePackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT:
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
		case InfrastructurePackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF__FUNCTION_PROTOTYPE_TARGET:
			setFunctionPrototype_target((FunctionPrototype) null);
			return;
		case InfrastructurePackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT:
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
		case InfrastructurePackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF__FUNCTION_PROTOTYPE_TARGET:
			return functionPrototype_target != null;
		case InfrastructurePackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT:
			return functionPrototype_context != null && !functionPrototype_context.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // PrecedenceConstraint_successiveInstanceRefImpl
