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
import org.eclipse.papyrus.eastadl.timing.timingconstraints.BurstConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Burst Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.BurstConstraintImpl#getMaxOccurrences <em>Max Occurrences</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.BurstConstraintImpl#getEvent <em>Event</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.BurstConstraintImpl#getLenght <em>Lenght</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.BurstConstraintImpl#getMinimum <em>Minimum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BurstConstraintImpl extends TimingConstraintImpl implements BurstConstraint {
	/**
	 * The default value of the '{@link #getMaxOccurrences() <em>Max Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMaxOccurrences()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_OCCURRENCES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxOccurrences() <em>Max Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMaxOccurrences()
	 * @generated
	 * @ordered
	 */
	protected int maxOccurrences = MAX_OCCURRENCES_EDEFAULT;

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
	 * The cached value of the '{@link #getLenght() <em>Lenght</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLenght()
	 * @generated
	 * @ordered
	 */
	protected TimingExpression lenght;

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
	protected BurstConstraintImpl() {
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
		return TimingconstraintsPackage.Literals.BURST_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getMaxOccurrences() {
		return maxOccurrences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setMaxOccurrences(int newMaxOccurrences) {
		int oldMaxOccurrences = maxOccurrences;
		maxOccurrences = newMaxOccurrences;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.BURST_CONSTRAINT__MAX_OCCURRENCES, oldMaxOccurrences, maxOccurrences));
		}
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.BURST_CONSTRAINT__EVENT, oldEvent, event));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.BURST_CONSTRAINT__EVENT, oldEvent, event));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public TimingExpression getLenght() {
		if (lenght != null && lenght.eIsProxy()) {
			InternalEObject oldLenght = (InternalEObject) lenght;
			lenght = (TimingExpression) eResolveProxy(oldLenght);
			if (lenght != oldLenght) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.BURST_CONSTRAINT__LENGHT, oldLenght, lenght));
				}
			}
		}
		return lenght;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TimingExpression basicGetLenght() {
		return lenght;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLenght(TimingExpression newLenght) {
		TimingExpression oldLenght = lenght;
		lenght = newLenght;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.BURST_CONSTRAINT__LENGHT, oldLenght, lenght));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.BURST_CONSTRAINT__MINIMUM, oldMinimum, minimum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.BURST_CONSTRAINT__MINIMUM, oldMinimum, minimum));
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
		case TimingconstraintsPackage.BURST_CONSTRAINT__MAX_OCCURRENCES:
			return getMaxOccurrences();
		case TimingconstraintsPackage.BURST_CONSTRAINT__EVENT:
			if (resolve) {
				return getEvent();
			}
			return basicGetEvent();
		case TimingconstraintsPackage.BURST_CONSTRAINT__LENGHT:
			if (resolve) {
				return getLenght();
			}
			return basicGetLenght();
		case TimingconstraintsPackage.BURST_CONSTRAINT__MINIMUM:
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
		case TimingconstraintsPackage.BURST_CONSTRAINT__MAX_OCCURRENCES:
			setMaxOccurrences((Integer) newValue);
			return;
		case TimingconstraintsPackage.BURST_CONSTRAINT__EVENT:
			setEvent((Event) newValue);
			return;
		case TimingconstraintsPackage.BURST_CONSTRAINT__LENGHT:
			setLenght((TimingExpression) newValue);
			return;
		case TimingconstraintsPackage.BURST_CONSTRAINT__MINIMUM:
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
		case TimingconstraintsPackage.BURST_CONSTRAINT__MAX_OCCURRENCES:
			setMaxOccurrences(MAX_OCCURRENCES_EDEFAULT);
			return;
		case TimingconstraintsPackage.BURST_CONSTRAINT__EVENT:
			setEvent((Event) null);
			return;
		case TimingconstraintsPackage.BURST_CONSTRAINT__LENGHT:
			setLenght((TimingExpression) null);
			return;
		case TimingconstraintsPackage.BURST_CONSTRAINT__MINIMUM:
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
		case TimingconstraintsPackage.BURST_CONSTRAINT__MAX_OCCURRENCES:
			return maxOccurrences != MAX_OCCURRENCES_EDEFAULT;
		case TimingconstraintsPackage.BURST_CONSTRAINT__EVENT:
			return event != null;
		case TimingconstraintsPackage.BURST_CONSTRAINT__LENGHT:
			return lenght != null;
		case TimingconstraintsPackage.BURST_CONSTRAINT__MINIMUM:
			return minimum != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maxOccurrences: ");
		result.append(maxOccurrences);
		result.append(')');
		return result.toString();
	}

} // BurstConstraintImpl
