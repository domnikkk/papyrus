/**
 */
package org.eclipse.papyrus.eastadl.annex.temporalconstraint;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint#getTransitionEvent <em>Transition Event</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint#getTimeCondition <em>Time Condition</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint#getTransition <em>Transition</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint#getState <em>State</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint#getInitState <em>Init State</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint#getAssertion <em>Assertion</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getTemporalConstraint()
 * @model
 * @generated
 */
public interface TemporalConstraint extends EAElement {
	/**
	 * Returns the value of the '<em><b>Transition Event</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Event</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Transition Event</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getTemporalConstraint_TransitionEvent()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TransitionEvent> getTransitionEvent();

	/**
	 * Returns the value of the '<em><b>Time Condition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Condition</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Time Condition</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getTemporalConstraint_TimeCondition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<LogicalTimeCondition> getTimeCondition();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Transition</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getTemporalConstraint_Transition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Transition> getTransition();

	/**
	 * Returns the value of the '<em><b>State</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>State</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getTemporalConstraint_State()
	 * @model ordered="false"
	 * @generated
	 */
	EList<State> getState();

	/**
	 * Returns the value of the '<em><b>Init State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init State</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Init State</em>' reference.
	 * @see #setInitState(State)
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getTemporalConstraint_InitState()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	State getInitState();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint#getInitState <em>Init State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Init State</em>' reference.
	 * @see #getInitState()
	 * @generated
	 */
	void setInitState(State value);

	/**
	 * Returns the value of the '<em><b>Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assertion</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Assertion</em>' reference.
	 * @see #setAssertion(EAExpression)
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getTemporalConstraint_Assertion()
	 * @model ordered="false"
	 * @generated
	 */
	EAExpression getAssertion();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint#getAssertion <em>Assertion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Assertion</em>' reference.
	 * @see #getAssertion()
	 * @generated
	 */
	void setAssertion(EAExpression value);

} // TemporalConstraint
