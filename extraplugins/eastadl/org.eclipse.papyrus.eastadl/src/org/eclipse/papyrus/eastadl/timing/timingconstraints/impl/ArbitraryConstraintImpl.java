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
import org.eclipse.papyrus.eastadl.timing.timingconstraints.ArbitraryConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arbitrary Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ArbitraryConstraintImpl#getMinimum <em>Minimum</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ArbitraryConstraintImpl#getMaximum <em>Maximum</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ArbitraryConstraintImpl#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArbitraryConstraintImpl extends TimingConstraintImpl implements ArbitraryConstraint {
	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected EList<TimingExpression> minimum;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected EList<TimingExpression> maximum;

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
	protected ArbitraryConstraintImpl() {
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
		return TimingconstraintsPackage.Literals.ARBITRARY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<TimingExpression> getMinimum() {
		if (minimum == null) {
			minimum = new EObjectResolvingEList<TimingExpression>(TimingExpression.class, this, TimingconstraintsPackage.ARBITRARY_CONSTRAINT__MINIMUM);
		}
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<TimingExpression> getMaximum() {
		if (maximum == null) {
			maximum = new EObjectResolvingEList<TimingExpression>(TimingExpression.class, this, TimingconstraintsPackage.ARBITRARY_CONSTRAINT__MAXIMUM);
		}
		return maximum;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.ARBITRARY_CONSTRAINT__EVENT, oldEvent, event));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.ARBITRARY_CONSTRAINT__EVENT, oldEvent, event));
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
		case TimingconstraintsPackage.ARBITRARY_CONSTRAINT__MINIMUM:
			return getMinimum();
		case TimingconstraintsPackage.ARBITRARY_CONSTRAINT__MAXIMUM:
			return getMaximum();
		case TimingconstraintsPackage.ARBITRARY_CONSTRAINT__EVENT:
			if (resolve) {
				return getEvent();
			}
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
		case TimingconstraintsPackage.ARBITRARY_CONSTRAINT__MINIMUM:
			getMinimum().clear();
			getMinimum().addAll((Collection<? extends TimingExpression>) newValue);
			return;
		case TimingconstraintsPackage.ARBITRARY_CONSTRAINT__MAXIMUM:
			getMaximum().clear();
			getMaximum().addAll((Collection<? extends TimingExpression>) newValue);
			return;
		case TimingconstraintsPackage.ARBITRARY_CONSTRAINT__EVENT:
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
		case TimingconstraintsPackage.ARBITRARY_CONSTRAINT__MINIMUM:
			getMinimum().clear();
			return;
		case TimingconstraintsPackage.ARBITRARY_CONSTRAINT__MAXIMUM:
			getMaximum().clear();
			return;
		case TimingconstraintsPackage.ARBITRARY_CONSTRAINT__EVENT:
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
		case TimingconstraintsPackage.ARBITRARY_CONSTRAINT__MINIMUM:
			return minimum != null && !minimum.isEmpty();
		case TimingconstraintsPackage.ARBITRARY_CONSTRAINT__MAXIMUM:
			return maximum != null && !maximum.isEmpty();
		case TimingconstraintsPackage.ARBITRARY_CONSTRAINT__EVENT:
			return event != null;
		}
		return super.eIsSet(featureID);
	}

} // ArbitraryConstraintImpl
