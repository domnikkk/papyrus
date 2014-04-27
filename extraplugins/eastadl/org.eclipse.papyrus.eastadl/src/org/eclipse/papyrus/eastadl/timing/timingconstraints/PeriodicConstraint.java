/**
 */
package org.eclipse.papyrus.eastadl.timing.timingconstraints;

import org.eclipse.papyrus.eastadl.timing.Event;
import org.eclipse.papyrus.eastadl.timing.TimingConstraint;
import org.eclipse.papyrus.eastadl.timing.TimingExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodic Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The PeriodicEventConstraint describes that an event occurs periodically.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PeriodicConstraint#getJitter <em>Jitter</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PeriodicConstraint#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PeriodicConstraint#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PeriodicConstraint#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getPeriodicConstraint()
 * @model
 * @generated
 */
public interface PeriodicConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Jitter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The jitter specifies the maximal possible time interval the occurrence of an event can vary (formerly: be delayed).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jitter</em>' reference.
	 * @see #setJitter(TimingExpression)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getPeriodicConstraint_Jitter()
	 * @model ordered="false"
	 * @generated
	 */
	TimingExpression getJitter();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PeriodicConstraint#getJitter <em>Jitter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jitter</em>' reference.
	 * @see #getJitter()
	 * @generated
	 */
	void setJitter(TimingExpression value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period specifies the ideal time interval between two subsequent occurrences of the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' reference.
	 * @see #setPeriod(TimingExpression)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getPeriodicConstraint_Period()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TimingExpression getPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PeriodicConstraint#getPeriod <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(TimingExpression value);

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum inter-arrival time specifies the minimal possible time interval between two consecutive occurrences of an event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum</em>' reference.
	 * @see #setMinimum(TimingExpression)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getPeriodicConstraint_Minimum()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TimingExpression getMinimum();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PeriodicConstraint#getMinimum <em>Minimum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' reference.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(TimingExpression value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getPeriodicConstraint_Event()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PeriodicConstraint#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

} // PeriodicConstraint
