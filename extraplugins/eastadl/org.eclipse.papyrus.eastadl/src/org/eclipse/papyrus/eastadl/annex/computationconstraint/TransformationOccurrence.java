/**
 */
package org.eclipse.papyrus.eastadl.annex.computationconstraint;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence#getInQuantification <em>In Quantification</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence#getOutQuantification <em>Out Quantification</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence#getInvokedLogicalTransformation <em>Invoked Logical Transformation</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence#getTimeCondition <em>Time Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getTransformationOccurrence()
 * @model
 * @generated
 */
public interface TransformationOccurrence extends EAElement {
	/**
	 * Returns the value of the '<em><b>In Quantification</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Quantification</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>In Quantification</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getTransformationOccurrence_InQuantification()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Quantification> getInQuantification();

	/**
	 * Returns the value of the '<em><b>Out Quantification</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Quantification</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Out Quantification</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getTransformationOccurrence_OutQuantification()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Quantification> getOutQuantification();

	/**
	 * Returns the value of the '<em><b>Invoked Logical Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoked Logical Transformation</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Invoked Logical Transformation</em>' reference.
	 * @see #setInvokedLogicalTransformation(LogicalTransformation)
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getTransformationOccurrence_InvokedLogicalTransformation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LogicalTransformation getInvokedLogicalTransformation();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence#getInvokedLogicalTransformation <em>Invoked Logical Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Invoked Logical Transformation</em>' reference.
	 * @see #getInvokedLogicalTransformation()
	 * @generated
	 */
	void setInvokedLogicalTransformation(LogicalTransformation value);

	/**
	 * Returns the value of the '<em><b>Time Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Condition</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Time Condition</em>' reference.
	 * @see #setTimeCondition(LogicalTimeCondition)
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getTransformationOccurrence_TimeCondition()
	 * @model ordered="false"
	 * @generated
	 */
	LogicalTimeCondition getTimeCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence#getTimeCondition <em>Time Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Time Condition</em>' reference.
	 * @see #getTimeCondition()
	 * @generated
	 */
	void setTimeCondition(LogicalTimeCondition value);

} // TransformationOccurrence
