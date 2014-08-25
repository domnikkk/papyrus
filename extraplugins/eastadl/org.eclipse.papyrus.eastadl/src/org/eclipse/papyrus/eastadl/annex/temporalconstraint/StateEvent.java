/**
 */
package org.eclipse.papyrus.eastadl.annex.temporalconstraint;

import org.eclipse.papyrus.eastadl.timing.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.StateEvent#getEnd <em>End</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.StateEvent#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getStateEvent()
 * @model
 * @generated
 */
public interface StateEvent extends Event {
	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(State)
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getStateEvent_End()
	 * @model ordered="false"
	 * @generated
	 */
	State getEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.StateEvent#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(State value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(State)
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getStateEvent_Start()
	 * @model ordered="false"
	 * @generated
	 */
	State getStart();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.StateEvent#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(State value);

} // StateEvent
