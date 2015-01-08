/**
 */
package org.eclipse.papyrus.eastadl.timing.timingconstraints.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.timing.Event;
import org.eclipse.papyrus.eastadl.timing.TimingExpression;
import org.eclipse.papyrus.eastadl.timing.impl.TimingConstraintImpl;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.PatternConstraintImpl#getPeriod <em>Period</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.PatternConstraintImpl#getMinimum <em>Minimum</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.PatternConstraintImpl#getOffset <em>Offset</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.PatternConstraintImpl#getJitter <em>Jitter</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.PatternConstraintImpl#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternConstraintImpl extends TimingConstraintImpl implements PatternConstraint {
	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected TimingExpression period;

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
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected EList<TimingExpression> offset;

	/**
	 * The cached value of the '{@link #getJitter() <em>Jitter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getJitter()
	 * @generated
	 * @ordered
	 */
	protected TimingExpression jitter;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected Event event;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected PatternConstraintImpl() {
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
		return TimingconstraintsPackage.Literals.PATTERN_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TimingExpression getPeriod() {
		if (period != null && period.eIsProxy()) {
			InternalEObject oldPeriod = (InternalEObject) period;
			period = (TimingExpression) eResolveProxy(oldPeriod);
			if (period != oldPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.PATTERN_CONSTRAINT__PERIOD, oldPeriod, period));
			}
		}
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public TimingExpression basicGetPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setPeriod(TimingExpression newPeriod) {
		TimingExpression oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.PATTERN_CONSTRAINT__PERIOD, oldPeriod, period));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.PATTERN_CONSTRAINT__MINIMUM, oldMinimum, minimum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.PATTERN_CONSTRAINT__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<TimingExpression> getOffset() {
		if (offset == null) {
			offset = new EObjectResolvingEList<TimingExpression>(TimingExpression.class, this, TimingconstraintsPackage.PATTERN_CONSTRAINT__OFFSET);
		}
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TimingExpression getJitter() {
		if (jitter != null && jitter.eIsProxy()) {
			InternalEObject oldJitter = (InternalEObject) jitter;
			jitter = (TimingExpression) eResolveProxy(oldJitter);
			if (jitter != oldJitter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.PATTERN_CONSTRAINT__JITTER, oldJitter, jitter));
			}
		}
		return jitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public TimingExpression basicGetJitter() {
		return jitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setJitter(TimingExpression newJitter) {
		TimingExpression oldJitter = jitter;
		jitter = newJitter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.PATTERN_CONSTRAINT__JITTER, oldJitter, jitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Event getEvent() {
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject) event;
			event = (Event) eResolveProxy(oldEvent);
			if (event != oldEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.PATTERN_CONSTRAINT__EVENT, oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Event basicGetEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setEvent(Event newEvent) {
		Event oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.PATTERN_CONSTRAINT__EVENT, oldEvent, event));
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
		case TimingconstraintsPackage.PATTERN_CONSTRAINT__PERIOD:
			if (resolve)
				return getPeriod();
			return basicGetPeriod();
		case TimingconstraintsPackage.PATTERN_CONSTRAINT__MINIMUM:
			if (resolve)
				return getMinimum();
			return basicGetMinimum();
		case TimingconstraintsPackage.PATTERN_CONSTRAINT__OFFSET:
			return getOffset();
		case TimingconstraintsPackage.PATTERN_CONSTRAINT__JITTER:
			if (resolve)
				return getJitter();
			return basicGetJitter();
		case TimingconstraintsPackage.PATTERN_CONSTRAINT__EVENT:
			if (resolve)
				return getEvent();
			return basicGetEvent();
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
		case TimingconstraintsPackage.PATTERN_CONSTRAINT__PERIOD:
			setPeriod((TimingExpression) newValue);
			return;
		case TimingconstraintsPackage.PATTERN_CONSTRAINT__MINIMUM:
			setMinimum((TimingExpression) newValue);
			return;
		case TimingconstraintsPackage.PATTERN_CONSTRAINT__OFFSET:
			getOffset().clear();
			getOffset().addAll((Collection<? extends TimingExpression>) newValue);
			return;
		case TimingconstraintsPackage.PATTERN_CONSTRAINT__JITTER:
			setJitter((TimingExpression) newValue);
			return;
		case TimingconstraintsPackage.PATTERN_CONSTRAINT__EVENT:
			setEvent((Event) newValue);
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
		case TimingconstraintsPackage.PATTERN_CONSTRAINT__PERIOD:
			setPeriod((TimingExpression) null);
			return;
		case TimingconstraintsPackage.PATTERN_CONSTRAINT__MINIMUM:
			setMinimum((TimingExpression) null);
			return;
		case TimingconstraintsPackage.PATTERN_CONSTRAINT__OFFSET:
			getOffset().clear();
			return;
		case TimingconstraintsPackage.PATTERN_CONSTRAINT__JITTER:
			setJitter((TimingExpression) null);
			return;
		case TimingconstraintsPackage.PATTERN_CONSTRAINT__EVENT:
			setEvent((Event) null);
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
		case TimingconstraintsPackage.PATTERN_CONSTRAINT__PERIOD:
			return period != null;
		case TimingconstraintsPackage.PATTERN_CONSTRAINT__MINIMUM:
			return minimum != null;
		case TimingconstraintsPackage.PATTERN_CONSTRAINT__OFFSET:
			return offset != null && !offset.isEmpty();
		case TimingconstraintsPackage.PATTERN_CONSTRAINT__JITTER:
			return jitter != null;
		case TimingconstraintsPackage.PATTERN_CONSTRAINT__EVENT:
			return event != null;
		}
		return super.eIsSet(featureID);
	}

} // PatternConstraintImpl
