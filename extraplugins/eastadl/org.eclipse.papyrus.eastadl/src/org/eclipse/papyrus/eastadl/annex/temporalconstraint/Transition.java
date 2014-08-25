/**
 */
package org.eclipse.papyrus.eastadl.annex.temporalconstraint;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition#getFrom <em>From</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition#getTo <em>To</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition#getQuantificationGuard <em>Quantification Guard</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition#getTimeGuard <em>Time Guard</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EAElement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(State)
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getTransition_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	State getFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(State value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(State)
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getTransition_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	State getTo();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(State value);

	/**
	 * Returns the value of the '<em><b>Quantification Guard</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantification Guard</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Quantification Guard</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getTransition_QuantificationGuard()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Quantification> getQuantificationGuard();

	/**
	 * Returns the value of the '<em><b>Time Guard</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Guard</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Time Guard</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getTransition_TimeGuard()
	 * @model ordered="false"
	 * @generated
	 */
	EList<LogicalTimeCondition> getTimeGuard();

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Effect</em>' reference.
	 * @see #setEffect(TransformationOccurrence)
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getTransition_Effect()
	 * @model ordered="false"
	 * @generated
	 */
	TransformationOccurrence getEffect();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition#getEffect <em>Effect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Effect</em>' reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(TransformationOccurrence value);

} // Transition
