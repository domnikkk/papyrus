/**
 */
package org.eclipse.papyrus.eastadl.annex.temporalconstraint;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.LogicalEvent;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintParameter;
import org.eclipse.papyrus.eastadl.dependability.FeatureFlaw;
import org.eclipse.papyrus.eastadl.dependability.HazardousEvent;
import org.eclipse.papyrus.eastadl.dependability.safetyconstraints.FaultFailure;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement;
import org.eclipse.papyrus.eastadl.timing.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent#getOccurredFeatureFlaw <em>Occurred Feature Flaw</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent#getOccurredHazardousEvent <em>Occurred Hazardous Event</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent#getOccurredFaultFailure <em>Occurred Fault Failure</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent#getOccurredExecutionEvent <em>Occurred Execution Event</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent#getOccurredLogicalEvent <em>Occurred Logical Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getTransitionEvent()
 * @model
 * @generated
 */
public interface TransitionEvent extends EAElement, BehaviorConstraintParameter {
	/**
	 * Returns the value of the '<em><b>Occurred Feature Flaw</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.dependability.FeatureFlaw}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurred Feature Flaw</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Occurred Feature Flaw</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getTransitionEvent_OccurredFeatureFlaw()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FeatureFlaw> getOccurredFeatureFlaw();

	/**
	 * Returns the value of the '<em><b>Occurred Hazardous Event</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.dependability.HazardousEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurred Hazardous Event</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Occurred Hazardous Event</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getTransitionEvent_OccurredHazardousEvent()
	 * @model ordered="false"
	 * @generated
	 */
	EList<HazardousEvent> getOccurredHazardousEvent();

	/**
	 * Returns the value of the '<em><b>Occurred Fault Failure</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.dependability.safetyconstraints.FaultFailure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurred Fault Failure</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Occurred Fault Failure</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getTransitionEvent_OccurredFaultFailure()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FaultFailure> getOccurredFaultFailure();

	/**
	 * Returns the value of the '<em><b>Occurred Execution Event</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.timing.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurred Execution Event</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Occurred Execution Event</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getTransitionEvent_OccurredExecutionEvent()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Event> getOccurredExecutionEvent();

	/**
	 * Returns the value of the '<em><b>Occurred Logical Event</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.LogicalEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurred Logical Event</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Occurred Logical Event</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getTransitionEvent_OccurredLogicalEvent()
	 * @model ordered="false"
	 * @generated
	 */
	EList<LogicalEvent> getOccurredLogicalEvent();

} // TransitionEvent
