/**
 */
package org.eclipse.papyrus.eastadl.timing.timingconstraints;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.timing.Event;
import org.eclipse.papyrus.eastadl.timing.TimingConstraint;
import org.eclipse.papyrus.eastadl.timing.TimingExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The [Concrete] Pattern Event Constraint describes that an event occurs following a known pattern. The pattern event model is characterized by the following parameters:
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint#getPeriod <em>Period</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint#getMinimum <em>Minimum</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint#getOffset <em>Offset</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint#getJitter <em>Jitter</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getPatternConstraint()
 * @model
 * @generated
 */
public interface PatternConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period specifies the time interval within the event occurs any number of times following a pattern.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Period</em>' reference.
	 * @see #setPeriod(TimingExpression)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getPatternConstraint_Period()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TimingExpression getPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint#getPeriod <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Period</em>' reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(TimingExpression value);

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum inter-arrival time specifies the minimal possible time interval between two consecutive occurrences of the event within the given period.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Minimum</em>' reference.
	 * @see #setMinimum(TimingExpression)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getPatternConstraint_Minimum()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TimingExpression getMinimum();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint#getMinimum <em>Minimum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Minimum</em>' reference.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(TimingExpression value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.timing.TimingExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set occurrence (1..n) specifies the offset for each occurrence of the event in the specified period. Each occurrence is specified from the beginning of the period
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Offset</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getPatternConstraint_Offset()
	 * @model required="true"
	 * @generated
	 */
	EList<TimingExpression> getOffset();

	/**
	 * Returns the value of the '<em><b>Jitter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The jitter specifies maximal possible time interval the occurrence of the events within the given period can vary (formerly: can be delayed).
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Jitter</em>' reference.
	 * @see #setJitter(TimingExpression)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getPatternConstraint_Jitter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TimingExpression getJitter();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint#getJitter <em>Jitter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Jitter</em>' reference.
	 * @see #getJitter()
	 * @generated
	 */
	void setJitter(TimingExpression value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getPatternConstraint_Event()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

} // PatternConstraint
