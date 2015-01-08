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
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrorModelPrototype;
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_errorModelTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Constraint Prototype error Model Target Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintPrototype_errorModelTargetInstanceRefImpl#getErrorModelPrototype_target <em>Error Model Prototype target</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintPrototype_errorModelTargetInstanceRefImpl#getErrorModelPrototype_context <em>Error Model Prototype context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorConstraintPrototype_errorModelTargetInstanceRefImpl extends InstanceRefImpl implements BehaviorConstraintPrototype_errorModelTargetInstanceRef {
	/**
	 * The cached value of the '{@link #getErrorModelPrototype_target() <em>Error Model Prototype target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getErrorModelPrototype_target()
	 * @generated
	 * @ordered
	 */
	protected ErrorModelPrototype errorModelPrototype_target;

	/**
	 * The cached value of the '{@link #getErrorModelPrototype_context() <em>Error Model Prototype context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getErrorModelPrototype_context()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorModelPrototype> errorModelPrototype_context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected BehaviorConstraintPrototype_errorModelTargetInstanceRefImpl() {
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
		return InfrastructurePackage.Literals.BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ErrorModelPrototype getErrorModelPrototype_target() {
		if (errorModelPrototype_target != null && errorModelPrototype_target.eIsProxy()) {
			InternalEObject oldErrorModelPrototype_target = (InternalEObject) errorModelPrototype_target;
			errorModelPrototype_target = (ErrorModelPrototype) eResolveProxy(oldErrorModelPrototype_target);
			if (errorModelPrototype_target != oldErrorModelPrototype_target) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF__ERROR_MODEL_PROTOTYPE_TARGET, oldErrorModelPrototype_target, errorModelPrototype_target));
			}
		}
		return errorModelPrototype_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ErrorModelPrototype basicGetErrorModelPrototype_target() {
		return errorModelPrototype_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setErrorModelPrototype_target(ErrorModelPrototype newErrorModelPrototype_target) {
		ErrorModelPrototype oldErrorModelPrototype_target = errorModelPrototype_target;
		errorModelPrototype_target = newErrorModelPrototype_target;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF__ERROR_MODEL_PROTOTYPE_TARGET, oldErrorModelPrototype_target, errorModelPrototype_target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<ErrorModelPrototype> getErrorModelPrototype_context() {
		if (errorModelPrototype_context == null) {
			errorModelPrototype_context = new EObjectResolvingEList<ErrorModelPrototype>(ErrorModelPrototype.class, this, InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF__ERROR_MODEL_PROTOTYPE_CONTEXT);
		}
		return errorModelPrototype_context;
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
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF__ERROR_MODEL_PROTOTYPE_TARGET:
			if (resolve)
				return getErrorModelPrototype_target();
			return basicGetErrorModelPrototype_target();
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF__ERROR_MODEL_PROTOTYPE_CONTEXT:
			return getErrorModelPrototype_context();
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
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF__ERROR_MODEL_PROTOTYPE_TARGET:
			setErrorModelPrototype_target((ErrorModelPrototype) newValue);
			return;
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF__ERROR_MODEL_PROTOTYPE_CONTEXT:
			getErrorModelPrototype_context().clear();
			getErrorModelPrototype_context().addAll((Collection<? extends ErrorModelPrototype>) newValue);
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
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF__ERROR_MODEL_PROTOTYPE_TARGET:
			setErrorModelPrototype_target((ErrorModelPrototype) null);
			return;
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF__ERROR_MODEL_PROTOTYPE_CONTEXT:
			getErrorModelPrototype_context().clear();
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
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF__ERROR_MODEL_PROTOTYPE_TARGET:
			return errorModelPrototype_target != null;
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF__ERROR_MODEL_PROTOTYPE_CONTEXT:
			return errorModelPrototype_context != null && !errorModelPrototype_context.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // BehaviorConstraintPrototype_errorModelTargetInstanceRefImpl
