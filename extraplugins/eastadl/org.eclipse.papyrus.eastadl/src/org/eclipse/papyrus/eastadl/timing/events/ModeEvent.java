/**
 */
package org.eclipse.papyrus.eastadl.timing.events;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.behavior.Mode;
import org.eclipse.papyrus.eastadl.timing.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.events.ModeEvent#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.events.ModeEvent#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.timing.events.EventsPackage#getModeEvent()
 * @model
 * @generated
 */
public interface ModeEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.behavior.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventsPackage#getModeEvent_Start()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Mode> getStart();

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.behavior.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventsPackage#getModeEvent_End()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Mode> getEnd();

} // ModeEvent
