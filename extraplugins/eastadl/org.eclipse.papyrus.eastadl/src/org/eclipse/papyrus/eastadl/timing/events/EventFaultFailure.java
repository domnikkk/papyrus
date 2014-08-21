/**
 */
package org.eclipse.papyrus.eastadl.timing.events;

import org.eclipse.papyrus.eastadl.dependability.safetyconstraints.FaultFailure;
import org.eclipse.papyrus.eastadl.timing.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Fault Failure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.events.EventFaultFailure#getFaultFailure <em>Fault Failure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.timing.events.EventsPackage#getEventFaultFailure()
 * @model
 * @generated
 */
public interface EventFaultFailure extends Event {
	/**
	 * Returns the value of the '<em><b>Fault Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Failure</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Fault Failure</em>' reference.
	 * @see #setFaultFailure(FaultFailure)
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventsPackage#getEventFaultFailure_FaultFailure()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FaultFailure getFaultFailure();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.events.EventFaultFailure#getFaultFailure <em>Fault Failure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Fault Failure</em>' reference.
	 * @see #getFaultFailure()
	 * @generated
	 */
	void setFaultFailure(FaultFailure value);

} // EventFaultFailure
