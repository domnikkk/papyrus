/**
 */
package org.eclipse.papyrus.eastadl.timing.timingconstraints;

import org.eclipse.papyrus.eastadl.timing.Event;
import org.eclipse.papyrus.eastadl.timing.TimingConstraint;
import org.eclipse.papyrus.eastadl.timing.TimingExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Burst Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.BurstConstraint#getMaxOccurrences <em>Max Occurrences</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.BurstConstraint#getEvent <em>Event</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.BurstConstraint#getLenght <em>Lenght</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.BurstConstraint#getMinimum <em>Minimum</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getBurstConstraint()
 * @model
 * @generated
 */
public interface BurstConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Max Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Occurrences</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Max Occurrences</em>' attribute.
	 * @see #setMaxOccurrences(int)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getBurstConstraint_MaxOccurrences()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getMaxOccurrences();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.BurstConstraint#getMaxOccurrences <em>Max Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Max Occurrences</em>' attribute.
	 * @see #getMaxOccurrences()
	 * @generated
	 */
	void setMaxOccurrences(int value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getBurstConstraint_Event()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.BurstConstraint#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Lenght</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lenght</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Lenght</em>' reference.
	 * @see #setLenght(TimingExpression)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getBurstConstraint_Lenght()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TimingExpression getLenght();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.BurstConstraint#getLenght <em>Lenght</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Lenght</em>' reference.
	 * @see #getLenght()
	 * @generated
	 */
	void setLenght(TimingExpression value);

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Minimum</em>' reference.
	 * @see #setMinimum(TimingExpression)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getBurstConstraint_Minimum()
	 * @model ordered="false"
	 * @generated
	 */
	TimingExpression getMinimum();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.BurstConstraint#getMinimum <em>Minimum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Minimum</em>' reference.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(TimingExpression value);

} // BurstConstraint
