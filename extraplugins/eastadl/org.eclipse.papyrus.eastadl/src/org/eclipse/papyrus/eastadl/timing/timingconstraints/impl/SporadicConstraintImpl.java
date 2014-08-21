/**
 */
package org.eclipse.papyrus.eastadl.timing.timingconstraints.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.eastadl.timing.Event;
import org.eclipse.papyrus.eastadl.timing.TimingExpression;
import org.eclipse.papyrus.eastadl.timing.impl.TimingConstraintImpl;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.SporadicConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sporadic Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.SporadicConstraintImpl#getEvent <em>Event</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.SporadicConstraintImpl#getLower <em>Lower</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.SporadicConstraintImpl#getUpper <em>Upper</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.SporadicConstraintImpl#getJitter <em>Jitter</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.SporadicConstraintImpl#getMinimum <em>Minimum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SporadicConstraintImpl extends TimingConstraintImpl implements SporadicConstraint {
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
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected TimingExpression lower;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected TimingExpression upper;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SporadicConstraintImpl() {
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
		return TimingconstraintsPackage.Literals.SPORADIC_CONSTRAINT;
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
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.SPORADIC_CONSTRAINT__EVENT, oldEvent, event));
				}
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
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.SPORADIC_CONSTRAINT__EVENT, oldEvent, event));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public TimingExpression getLower() {
		if (lower != null && lower.eIsProxy()) {
			InternalEObject oldLower = (InternalEObject) lower;
			lower = (TimingExpression) eResolveProxy(oldLower);
			if (lower != oldLower) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.SPORADIC_CONSTRAINT__LOWER, oldLower, lower));
				}
			}
		}
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TimingExpression basicGetLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLower(TimingExpression newLower) {
		TimingExpression oldLower = lower;
		lower = newLower;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.SPORADIC_CONSTRAINT__LOWER, oldLower, lower));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public TimingExpression getUpper() {
		if (upper != null && upper.eIsProxy()) {
			InternalEObject oldUpper = (InternalEObject) upper;
			upper = (TimingExpression) eResolveProxy(oldUpper);
			if (upper != oldUpper) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.SPORADIC_CONSTRAINT__UPPER, oldUpper, upper));
				}
			}
		}
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TimingExpression basicGetUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setUpper(TimingExpression newUpper) {
		TimingExpression oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.SPORADIC_CONSTRAINT__UPPER, oldUpper, upper));
		}
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
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.SPORADIC_CONSTRAINT__JITTER, oldJitter, jitter));
				}
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
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.SPORADIC_CONSTRAINT__JITTER, oldJitter, jitter));
		}
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
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.SPORADIC_CONSTRAINT__MINIMUM, oldMinimum, minimum));
				}
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
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.SPORADIC_CONSTRAINT__MINIMUM, oldMinimum, minimum));
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
		case TimingconstraintsPackage.SPORADIC_CONSTRAINT__EVENT:
			if (resolve) {
				return getEvent();
			}
			return basicGetEvent();
		case TimingconstraintsPackage.SPORADIC_CONSTRAINT__LOWER:
			if (resolve) {
				return getLower();
			}
			return basicGetLower();
		case TimingconstraintsPackage.SPORADIC_CONSTRAINT__UPPER:
			if (resolve) {
				return getUpper();
			}
			return basicGetUpper();
		case TimingconstraintsPackage.SPORADIC_CONSTRAINT__JITTER:
			if (resolve) {
				return getJitter();
			}
			return basicGetJitter();
		case TimingconstraintsPackage.SPORADIC_CONSTRAINT__MINIMUM:
			if (resolve) {
				return getMinimum();
			}
			return basicGetMinimum();
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
		case TimingconstraintsPackage.SPORADIC_CONSTRAINT__EVENT:
			setEvent((Event) newValue);
			return;
		case TimingconstraintsPackage.SPORADIC_CONSTRAINT__LOWER:
			setLower((TimingExpression) newValue);
			return;
		case TimingconstraintsPackage.SPORADIC_CONSTRAINT__UPPER:
			setUpper((TimingExpression) newValue);
			return;
		case TimingconstraintsPackage.SPORADIC_CONSTRAINT__JITTER:
			setJitter((TimingExpression) newValue);
			return;
		case TimingconstraintsPackage.SPORADIC_CONSTRAINT__MINIMUM:
			setMinimum((TimingExpression) newValue);
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
		case TimingconstraintsPackage.SPORADIC_CONSTRAINT__EVENT:
			setEvent((Event) null);
			return;
		case TimingconstraintsPackage.SPORADIC_CONSTRAINT__LOWER:
			setLower((TimingExpression) null);
			return;
		case TimingconstraintsPackage.SPORADIC_CONSTRAINT__UPPER:
			setUpper((TimingExpression) null);
			return;
		case TimingconstraintsPackage.SPORADIC_CONSTRAINT__JITTER:
			setJitter((TimingExpression) null);
			return;
		case TimingconstraintsPackage.SPORADIC_CONSTRAINT__MINIMUM:
			setMinimum((TimingExpression) null);
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
		case TimingconstraintsPackage.SPORADIC_CONSTRAINT__EVENT:
			return event != null;
		case TimingconstraintsPackage.SPORADIC_CONSTRAINT__LOWER:
			return lower != null;
		case TimingconstraintsPackage.SPORADIC_CONSTRAINT__UPPER:
			return upper != null;
		case TimingconstraintsPackage.SPORADIC_CONSTRAINT__JITTER:
			return jitter != null;
		case TimingconstraintsPackage.SPORADIC_CONSTRAINT__MINIMUM:
			return minimum != null;
		}
		return super.eIsSet(featureID);
	}

} // SporadicConstraintImpl
