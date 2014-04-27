/**
 */
package org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.State;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TransitionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TransitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TransitionImpl#getQuantificationGuard <em>Quantification Guard</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TransitionImpl#getTimeGuard <em>Time Guard</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TransitionImpl#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends EAElementImpl implements Transition {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected State from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected State to;

	/**
	 * The cached value of the '{@link #getQuantificationGuard() <em>Quantification Guard</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantificationGuard()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantification> quantificationGuard;

	/**
	 * The cached value of the '{@link #getTimeGuard() <em>Time Guard</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeGuard()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalTimeCondition> timeGuard;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected TransformationOccurrence effect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemporalconstraintPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (State)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemporalconstraintPackage.TRANSITION__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(State newFrom) {
		State oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalconstraintPackage.TRANSITION__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (State)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemporalconstraintPackage.TRANSITION__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(State newTo) {
		State oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalconstraintPackage.TRANSITION__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Quantification> getQuantificationGuard() {
		if (quantificationGuard == null) {
			quantificationGuard = new EObjectResolvingEList<Quantification>(Quantification.class, this, TemporalconstraintPackage.TRANSITION__QUANTIFICATION_GUARD);
		}
		return quantificationGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalTimeCondition> getTimeGuard() {
		if (timeGuard == null) {
			timeGuard = new EObjectResolvingEList<LogicalTimeCondition>(LogicalTimeCondition.class, this, TemporalconstraintPackage.TRANSITION__TIME_GUARD);
		}
		return timeGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationOccurrence getEffect() {
		if (effect != null && effect.eIsProxy()) {
			InternalEObject oldEffect = (InternalEObject)effect;
			effect = (TransformationOccurrence)eResolveProxy(oldEffect);
			if (effect != oldEffect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemporalconstraintPackage.TRANSITION__EFFECT, oldEffect, effect));
			}
		}
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationOccurrence basicGetEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(TransformationOccurrence newEffect) {
		TransformationOccurrence oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalconstraintPackage.TRANSITION__EFFECT, oldEffect, effect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TemporalconstraintPackage.TRANSITION__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case TemporalconstraintPackage.TRANSITION__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case TemporalconstraintPackage.TRANSITION__QUANTIFICATION_GUARD:
				return getQuantificationGuard();
			case TemporalconstraintPackage.TRANSITION__TIME_GUARD:
				return getTimeGuard();
			case TemporalconstraintPackage.TRANSITION__EFFECT:
				if (resolve) return getEffect();
				return basicGetEffect();
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
			case TemporalconstraintPackage.TRANSITION__FROM:
				setFrom((State)newValue);
				return;
			case TemporalconstraintPackage.TRANSITION__TO:
				setTo((State)newValue);
				return;
			case TemporalconstraintPackage.TRANSITION__QUANTIFICATION_GUARD:
				getQuantificationGuard().clear();
				getQuantificationGuard().addAll((Collection<? extends Quantification>)newValue);
				return;
			case TemporalconstraintPackage.TRANSITION__TIME_GUARD:
				getTimeGuard().clear();
				getTimeGuard().addAll((Collection<? extends LogicalTimeCondition>)newValue);
				return;
			case TemporalconstraintPackage.TRANSITION__EFFECT:
				setEffect((TransformationOccurrence)newValue);
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
			case TemporalconstraintPackage.TRANSITION__FROM:
				setFrom((State)null);
				return;
			case TemporalconstraintPackage.TRANSITION__TO:
				setTo((State)null);
				return;
			case TemporalconstraintPackage.TRANSITION__QUANTIFICATION_GUARD:
				getQuantificationGuard().clear();
				return;
			case TemporalconstraintPackage.TRANSITION__TIME_GUARD:
				getTimeGuard().clear();
				return;
			case TemporalconstraintPackage.TRANSITION__EFFECT:
				setEffect((TransformationOccurrence)null);
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
			case TemporalconstraintPackage.TRANSITION__FROM:
				return from != null;
			case TemporalconstraintPackage.TRANSITION__TO:
				return to != null;
			case TemporalconstraintPackage.TRANSITION__QUANTIFICATION_GUARD:
				return quantificationGuard != null && !quantificationGuard.isEmpty();
			case TemporalconstraintPackage.TRANSITION__TIME_GUARD:
				return timeGuard != null && !timeGuard.isEmpty();
			case TemporalconstraintPackage.TRANSITION__EFFECT:
				return effect != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
