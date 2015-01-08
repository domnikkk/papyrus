/**
 */
package org.eclipse.papyrus.eastadl.timing.timingconstraints.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.eastadl.timing.EventChain;
import org.eclipse.papyrus.eastadl.timing.TimingExpression;
import org.eclipse.papyrus.eastadl.timing.impl.TimingConstraintImpl;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.AgeConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Age Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.AgeConstraintImpl#getMaximum <em>Maximum</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.AgeConstraintImpl#getMinimum <em>Minimum</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.AgeConstraintImpl#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgeConstraintImpl extends TimingConstraintImpl implements AgeConstraint {
	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected TimingExpression maximum;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected TimingExpression minimum;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected EventChain scope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected AgeConstraintImpl() {
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
		return TimingconstraintsPackage.Literals.AGE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TimingExpression getMaximum() {
		if (maximum != null && maximum.eIsProxy()) {
			InternalEObject oldMaximum = (InternalEObject) maximum;
			maximum = (TimingExpression) eResolveProxy(oldMaximum);
			if (maximum != oldMaximum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.AGE_CONSTRAINT__MAXIMUM, oldMaximum, maximum));
			}
		}
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public TimingExpression basicGetMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setMaximum(TimingExpression newMaximum) {
		TimingExpression oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.AGE_CONSTRAINT__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TimingExpression getMinimum() {
		if (minimum != null && minimum.eIsProxy()) {
			InternalEObject oldMinimum = (InternalEObject) minimum;
			minimum = (TimingExpression) eResolveProxy(oldMinimum);
			if (minimum != oldMinimum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.AGE_CONSTRAINT__MINIMUM, oldMinimum, minimum));
			}
		}
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public TimingExpression basicGetMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setMinimum(TimingExpression newMinimum) {
		TimingExpression oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.AGE_CONSTRAINT__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EventChain getScope() {
		if (scope != null && scope.eIsProxy()) {
			InternalEObject oldScope = (InternalEObject) scope;
			scope = (EventChain) eResolveProxy(oldScope);
			if (scope != oldScope) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.AGE_CONSTRAINT__SCOPE, oldScope, scope));
			}
		}
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EventChain basicGetScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setScope(EventChain newScope) {
		EventChain oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.AGE_CONSTRAINT__SCOPE, oldScope, scope));
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
		case TimingconstraintsPackage.AGE_CONSTRAINT__MAXIMUM:
			if (resolve)
				return getMaximum();
			return basicGetMaximum();
		case TimingconstraintsPackage.AGE_CONSTRAINT__MINIMUM:
			if (resolve)
				return getMinimum();
			return basicGetMinimum();
		case TimingconstraintsPackage.AGE_CONSTRAINT__SCOPE:
			if (resolve)
				return getScope();
			return basicGetScope();
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
		case TimingconstraintsPackage.AGE_CONSTRAINT__MAXIMUM:
			setMaximum((TimingExpression) newValue);
			return;
		case TimingconstraintsPackage.AGE_CONSTRAINT__MINIMUM:
			setMinimum((TimingExpression) newValue);
			return;
		case TimingconstraintsPackage.AGE_CONSTRAINT__SCOPE:
			setScope((EventChain) newValue);
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
		case TimingconstraintsPackage.AGE_CONSTRAINT__MAXIMUM:
			setMaximum((TimingExpression) null);
			return;
		case TimingconstraintsPackage.AGE_CONSTRAINT__MINIMUM:
			setMinimum((TimingExpression) null);
			return;
		case TimingconstraintsPackage.AGE_CONSTRAINT__SCOPE:
			setScope((EventChain) null);
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
		case TimingconstraintsPackage.AGE_CONSTRAINT__MAXIMUM:
			return maximum != null;
		case TimingconstraintsPackage.AGE_CONSTRAINT__MINIMUM:
			return minimum != null;
		case TimingconstraintsPackage.AGE_CONSTRAINT__SCOPE:
			return scope != null;
		}
		return super.eIsSet(featureID);
	}

} // AgeConstraintImpl
