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
import org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Time Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ExecutionTimeConstraintImpl#getStart <em>Start</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ExecutionTimeConstraintImpl#getStop <em>Stop</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ExecutionTimeConstraintImpl#getPreemption <em>Preemption</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ExecutionTimeConstraintImpl#getResume <em>Resume</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ExecutionTimeConstraintImpl#getUpper <em>Upper</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ExecutionTimeConstraintImpl#getLower <em>Lower</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionTimeConstraintImpl extends TimingConstraintImpl implements ExecutionTimeConstraint {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Event start;

	/**
	 * The cached value of the '{@link #getStop() <em>Stop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getStop()
	 * @generated
	 * @ordered
	 */
	protected Event stop;

	/**
	 * The cached value of the '{@link #getPreemption() <em>Preemption</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getPreemption()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> preemption;

	/**
	 * The cached value of the '{@link #getResume() <em>Resume</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getResume()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> resume;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ExecutionTimeConstraintImpl() {
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
		return TimingconstraintsPackage.Literals.EXECUTION_TIME_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Event getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject) start;
			start = (Event) eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Event basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setStart(Event newStart) {
		Event oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Event getStop() {
		if (stop != null && stop.eIsProxy()) {
			InternalEObject oldStop = (InternalEObject) stop;
			stop = (Event) eResolveProxy(oldStop);
			if (stop != oldStop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__STOP, oldStop, stop));
			}
		}
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Event basicGetStop() {
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setStop(Event newStop) {
		Event oldStop = stop;
		stop = newStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__STOP, oldStop, stop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Event> getPreemption() {
		if (preemption == null) {
			preemption = new EObjectResolvingEList<Event>(Event.class, this, TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__PREEMPTION);
		}
		return preemption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Event> getResume() {
		if (resume == null) {
			resume = new EObjectResolvingEList<Event>(Event.class, this, TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__RESUME);
		}
		return resume;
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__UPPER, oldUpper, upper));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__UPPER, oldUpper, upper));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__LOWER, oldLower, lower));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__LOWER, oldLower, lower));
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
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__START:
			if (resolve)
				return getStart();
			return basicGetStart();
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__STOP:
			if (resolve)
				return getStop();
			return basicGetStop();
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__PREEMPTION:
			return getPreemption();
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__RESUME:
			return getResume();
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__UPPER:
			if (resolve)
				return getUpper();
			return basicGetUpper();
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__LOWER:
			if (resolve)
				return getLower();
			return basicGetLower();
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
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__START:
			setStart((Event) newValue);
			return;
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__STOP:
			setStop((Event) newValue);
			return;
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__PREEMPTION:
			getPreemption().clear();
			getPreemption().addAll((Collection<? extends Event>) newValue);
			return;
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__RESUME:
			getResume().clear();
			getResume().addAll((Collection<? extends Event>) newValue);
			return;
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__UPPER:
			setUpper((TimingExpression) newValue);
			return;
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__LOWER:
			setLower((TimingExpression) newValue);
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
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__START:
			setStart((Event) null);
			return;
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__STOP:
			setStop((Event) null);
			return;
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__PREEMPTION:
			getPreemption().clear();
			return;
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__RESUME:
			getResume().clear();
			return;
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__UPPER:
			setUpper((TimingExpression) null);
			return;
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__LOWER:
			setLower((TimingExpression) null);
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
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__START:
			return start != null;
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__STOP:
			return stop != null;
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__PREEMPTION:
			return preemption != null && !preemption.isEmpty();
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__RESUME:
			return resume != null && !resume.isEmpty();
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__UPPER:
			return upper != null;
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT__LOWER:
			return lower != null;
		}
		return super.eIsSet(featureID);
	}

} // ExecutionTimeConstraintImpl
