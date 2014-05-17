/**
 */
package org.eclipse.papyrus.umlrt.UMLRealTime;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.SignalEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.TriggerEvent#getEvType <em>Ev Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.TriggerEvent#getBase_SignalEvent <em>Base Signal Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage#getTriggerEvent()
 * @model
 * @generated
 */
public interface TriggerEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Ev Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.umlrt.UMLRealTime.EventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ev Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ev Type</em>' attribute.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.EventType
	 * @see #setEvType(EventType)
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage#getTriggerEvent_EvType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EventType getEvType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.TriggerEvent#getEvType <em>Ev Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ev Type</em>' attribute.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.EventType
	 * @see #getEvType()
	 * @generated
	 */
	void setEvType(EventType value);

	/**
	 * Returns the value of the '<em><b>Base Signal Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Signal Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Signal Event</em>' reference.
	 * @see #setBase_SignalEvent(SignalEvent)
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage#getTriggerEvent_Base_SignalEvent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SignalEvent getBase_SignalEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.TriggerEvent#getBase_SignalEvent <em>Base Signal Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Signal Event</em>' reference.
	 * @see #getBase_SignalEvent()
	 * @generated
	 */
	void setBase_SignalEvent(SignalEvent value);

} // TriggerEvent
