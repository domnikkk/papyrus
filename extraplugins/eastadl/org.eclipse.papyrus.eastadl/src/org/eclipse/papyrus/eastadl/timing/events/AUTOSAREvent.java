/**
 */
package org.eclipse.papyrus.eastadl.timing.events;

import org.eclipse.papyrus.eastadl.timing.Event;
import org.eclipse.uml2.uml.TimeEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AUTOSAR Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.events.AUTOSAREvent#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.timing.events.EventsPackage#getAUTOSAREvent()
 * @model
 * @generated
 */
public interface AUTOSAREvent extends Event {

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(TimeEvent)
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventsPackage#getAUTOSAREvent_Ref()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TimeEvent getRef();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.events.AUTOSAREvent#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(TimeEvent value);
} // AUTOSAREvent
