/**
 */
package org.eclipse.papyrus.eastadl.timing.events;

import org.eclipse.papyrus.eastadl.dependability.FeatureFlaw;
import org.eclipse.papyrus.eastadl.timing.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Feature Flaw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.events.EventFeatureFlaw#getFeatureFlaw <em>Feature Flaw</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.timing.events.EventsPackage#getEventFeatureFlaw()
 * @model
 * @generated
 */
public interface EventFeatureFlaw extends Event {
	/**
	 * Returns the value of the '<em><b>Feature Flaw</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Flaw</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Feature Flaw</em>' reference.
	 * @see #setFeatureFlaw(FeatureFlaw)
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventsPackage#getEventFeatureFlaw_FeatureFlaw()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FeatureFlaw getFeatureFlaw();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.events.EventFeatureFlaw#getFeatureFlaw <em>Feature Flaw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Feature Flaw</em>' reference.
	 * @see #getFeatureFlaw()
	 * @generated
	 */
	void setFeatureFlaw(FeatureFlaw value);

} // EventFeatureFlaw
