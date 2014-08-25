/**
 */
package org.eclipse.papyrus.eastadl.annex.computationconstraint;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.LogicalEvent;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement;
import org.eclipse.papyrus.eastadl.timing.EventChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getStrand <em>Strand</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getSegment <em>Segment</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getTransformationOccurrence <em>Transformation Occurrence</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getPrecedingExecutionEventChain <em>Preceding Execution Event Chain</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getSucceedingExecutionEventChain <em>Succeeding Execution Event Chain</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getCorrespondingExecutionEventChain <em>Corresponding Execution Event Chain</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getLogicalResponse <em>Logical Response</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getLogicalStimulus <em>Logical Stimulus</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getLogicalPath()
 * @model
 * @generated
 */
public interface LogicalPath extends EAElement {
	/**
	 * Returns the value of the '<em><b>Strand</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strand</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Strand</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getLogicalPath_Strand()
	 * @model ordered="false"
	 * @generated
	 */
	EList<LogicalPath> getStrand();

	/**
	 * Returns the value of the '<em><b>Segment</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Segment</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getLogicalPath_Segment()
	 * @model ordered="false"
	 * @generated
	 */
	EList<LogicalPath> getSegment();

	/**
	 * Returns the value of the '<em><b>Transformation Occurrence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Occurrence</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Transformation Occurrence</em>' reference.
	 * @see #setTransformationOccurrence(TransformationOccurrence)
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getLogicalPath_TransformationOccurrence()
	 * @model ordered="false"
	 * @generated
	 */
	TransformationOccurrence getTransformationOccurrence();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getTransformationOccurrence <em>Transformation Occurrence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Transformation Occurrence</em>' reference.
	 * @see #getTransformationOccurrence()
	 * @generated
	 */
	void setTransformationOccurrence(TransformationOccurrence value);

	/**
	 * Returns the value of the '<em><b>Preceding Execution Event Chain</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.timing.EventChain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preceding Execution Event Chain</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Preceding Execution Event Chain</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getLogicalPath_PrecedingExecutionEventChain()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EventChain> getPrecedingExecutionEventChain();

	/**
	 * Returns the value of the '<em><b>Succeeding Execution Event Chain</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.timing.EventChain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Succeeding Execution Event Chain</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Succeeding Execution Event Chain</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getLogicalPath_SucceedingExecutionEventChain()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EventChain> getSucceedingExecutionEventChain();

	/**
	 * Returns the value of the '<em><b>Corresponding Execution Event Chain</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.timing.EventChain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corresponding Execution Event Chain</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Corresponding Execution Event Chain</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getLogicalPath_CorrespondingExecutionEventChain()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EventChain> getCorrespondingExecutionEventChain();

	/**
	 * Returns the value of the '<em><b>Logical Response</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.LogicalEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Response</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Logical Response</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getLogicalPath_LogicalResponse()
	 * @model ordered="false"
	 * @generated
	 */
	EList<LogicalEvent> getLogicalResponse();

	/**
	 * Returns the value of the '<em><b>Logical Stimulus</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.LogicalEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Stimulus</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Logical Stimulus</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getLogicalPath_LogicalStimulus()
	 * @model ordered="false"
	 * @generated
	 */
	EList<LogicalEvent> getLogicalStimulus();

} // LogicalPath
