/**
 */
package org.eclipse.papyrus.eastadl.annex.temporalconstraint;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronoustransition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Synchronoustransition#getReadTransitionEvent <em>Read Transition Event</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Synchronoustransition#getWriteTransitionEvent <em>Write Transition Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getSynchronoustransition()
 * @model
 * @generated
 */
public interface Synchronoustransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Read Transition Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Transition Event</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Read Transition Event</em>' reference.
	 * @see #setReadTransitionEvent(TransitionEvent)
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getSynchronoustransition_ReadTransitionEvent()
	 * @model ordered="false"
	 * @generated
	 */
	TransitionEvent getReadTransitionEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Synchronoustransition#getReadTransitionEvent <em>Read Transition Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Read Transition Event</em>' reference.
	 * @see #getReadTransitionEvent()
	 * @generated
	 */
	void setReadTransitionEvent(TransitionEvent value);

	/**
	 * Returns the value of the '<em><b>Write Transition Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Transition Event</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Write Transition Event</em>' reference.
	 * @see #setWriteTransitionEvent(TransitionEvent)
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getSynchronoustransition_WriteTransitionEvent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TransitionEvent getWriteTransitionEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Synchronoustransition#getWriteTransitionEvent <em>Write Transition Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Write Transition Event</em>' reference.
	 * @see #getWriteTransitionEvent()
	 * @generated
	 */
	void setWriteTransitionEvent(TransitionEvent value);

} // Synchronoustransition
