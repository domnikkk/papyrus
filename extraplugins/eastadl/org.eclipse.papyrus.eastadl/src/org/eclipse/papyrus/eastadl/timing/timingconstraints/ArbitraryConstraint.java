/**
 */
package org.eclipse.papyrus.eastadl.timing.timingconstraints;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.timing.Event;
import org.eclipse.papyrus.eastadl.timing.TimingConstraint;
import org.eclipse.papyrus.eastadl.timing.TimingExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arbitrary Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Arbitrary Event Model describes that an event occurs occasionally, singly, irregular or randomly. The primary purpose of this event model is to abstract event occurrences captured by data acquisition tools (background debugger, trace analyzer, etc.) during the operation of a system.
 * 
 * Constraints:
 * [1] The number of elements in the sets minimum inter-arrival time and maximum inter-arrival time must be the same. Rationale: Consistent specification of arrival times.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ArbitraryConstraint#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ArbitraryConstraint#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ArbitraryConstraint#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getArbitraryConstraint()
 * @model
 * @generated
 */
public interface ArbitraryConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.timing.TimingExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of minimum inter-arrival times specifies the minimum inter-arrival time between two and more subsequent occurrences of the event. The first element in the set specifies the minimum inter-arrival time between two subsequent occurrences of the event among the given occurrences. The second element in the set specifies the minimum inter-arrival time between three subsequent occurrences of the event among the given occurrences; and so forth.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getArbitraryConstraint_Minimum()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<TimingExpression> getMinimum();

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.timing.TimingExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of maximum inter-arrival times specifies the maximum inter-arrival time between two and more subsequent occurrences of the event. The first element in the set specifies the maximum inter-arrival time between two subsequent occurrences of the event among the given occurrences. The second element in the set specifies the maximum inter-arrival time between three subsequent occurrences of the event among the given occurrences; and so forth.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getArbitraryConstraint_Maximum()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<TimingExpression> getMaximum();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getArbitraryConstraint_Event()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ArbitraryConstraint#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

} // ArbitraryConstraint
