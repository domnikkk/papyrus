/**
 */
package org.eclipse.papyrus.eastadl.timing.timingconstraints;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.timing.Event;
import org.eclipse.papyrus.eastadl.timing.TimingConstraint;
import org.eclipse.papyrus.eastadl.timing.TimingExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Time Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ExecutionTimeConstraint expresses the execution time of a function under the assumption of a nominal CPU that executes 1 "function second" per second. Function allocation will decide the actual execution time by multiplication with the relative speed of the
 * host CPU.
 *
 * Example:
 * The ECU is 20% faster than a standard ECU (e.g. in a certain context, execution times are given assuming a nominal speed of 100 MHz; Our CPU is then 120 MHz)
 *
 * The function is activated by a time trigger or a port trigger. The function starts execution some time after activation, depending on e.g. interference and blocking from other functions on the same resource
 * Immediately on start, the function reads input data on all ports. Functions write data at the latest when the execution time has elapsed (which is after the execution time plus any blocking and interference time).
 *
 * Constraints:
 * [1] An ExecutionTimeConstraint either identifies a FunctionType or a FunctionPrototype as its target function.
 * [2] variation shall be a value between 0 and upper-lower.
 *
 * Semantics:
 * lower (from TimingConstraint) denotes the minimal best case execution time.
 * upper (from TimingConstraint) denotes the maximal worst case execution time.
 * variation denotes the allowed variation in execution time, i.e. maximal minimal execution time.
 *
 * Example:
 * lower=5
 * upper=10
 * variation=2
 * best case execution time of 6 and worst case of 7 is within this constraint
 * best case execution time of 6 and worst case of 9 violates this constraint
 *
 * If a measured value is characterized, variation is not used, as it is always upper-lower, e.g. lower=6 and upper=9 above. In this example, the ExecutionTimeConstraint would be a Realization of a VVActualOutcome.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint#getStart <em>Start</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint#getStop <em>Stop</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint#getPreemption <em>Preemption</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint#getResume <em>Resume</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint#getUpper <em>Upper</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint#getLower <em>Lower</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getExecutionTimeConstraint()
 * @model
 * @generated
 */
public interface ExecutionTimeConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(Event)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getExecutionTimeConstraint_Start()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Event getStart();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Event value);

	/**
	 * Returns the value of the '<em><b>Stop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Stop</em>' reference.
	 * @see #setStop(Event)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getExecutionTimeConstraint_Stop()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Event getStop();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint#getStop <em>Stop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Stop</em>' reference.
	 * @see #getStop()
	 * @generated
	 */
	void setStop(Event value);

	/**
	 * Returns the value of the '<em><b>Preemption</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.timing.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preemption</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Preemption</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getExecutionTimeConstraint_Preemption()
	 * @model
	 * @generated
	 */
	EList<Event> getPreemption();

	/**
	 * Returns the value of the '<em><b>Resume</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.timing.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resume</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Resume</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getExecutionTimeConstraint_Resume()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Event> getResume();

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Upper</em>' reference.
	 * @see #setUpper(TimingExpression)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getExecutionTimeConstraint_Upper()
	 * @model ordered="false"
	 * @generated
	 */
	TimingExpression getUpper();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint#getUpper <em>Upper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Upper</em>' reference.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(TimingExpression value);

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Lower</em>' reference.
	 * @see #setLower(TimingExpression)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getExecutionTimeConstraint_Lower()
	 * @model ordered="false"
	 * @generated
	 */
	TimingExpression getLower();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint#getLower <em>Lower</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Lower</em>' reference.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(TimingExpression value);

} // ExecutionTimeConstraint
