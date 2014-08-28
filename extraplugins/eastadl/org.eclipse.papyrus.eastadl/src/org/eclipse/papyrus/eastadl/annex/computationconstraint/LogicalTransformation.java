/**
 */
package org.eclipse.papyrus.eastadl.annex.computationconstraint;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAExpression;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#isIsClientServerInterface <em>Is Client Server Interface</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getClientServerinterfaceOperation <em>Client Serverinterface Operation</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getContained <em>Contained</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getOut <em>Out</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getIn <em>In</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getExpression <em>Expression</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getQuantificationInvariant <em>Quantification Invariant</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getPreCondition <em>Pre Condition</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getPostCondition <em>Post Condition</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getTimeInvariant <em>Time Invariant</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getLogicalTransformation()
 * @model
 * @generated
 */
public interface LogicalTransformation extends EAElement {
	/**
	 * Returns the value of the '<em><b>Is Client Server Interface</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Client Server Interface</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Is Client Server Interface</em>' attribute.
	 * @see #setIsClientServerInterface(boolean)
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getLogicalTransformation_IsClientServerInterface()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsClientServerInterface();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#isIsClientServerInterface <em>Is Client Server Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Is Client Server Interface</em>' attribute.
	 * @see #isIsClientServerInterface()
	 * @generated
	 */
	void setIsClientServerInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>Client Serverinterface Operation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.functionmodeling.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Serverinterface Operation</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Client Serverinterface Operation</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getLogicalTransformation_ClientServerinterfaceOperation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Operation> getClientServerinterfaceOperation();

	/**
	 * Returns the value of the '<em><b>Contained</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Contained</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getLogicalTransformation_Contained()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Attribute> getContained();

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getLogicalTransformation_Out()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Attribute> getOut();

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>In</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getLogicalTransformation_In()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Attribute> getIn();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(EAExpression)
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getLogicalTransformation_Expression()
	 * @model ordered="false"
	 * @generated
	 */
	EAExpression getExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(EAExpression value);

	/**
	 * Returns the value of the '<em><b>Quantification Invariant</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantification Invariant</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Quantification Invariant</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getLogicalTransformation_QuantificationInvariant()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Quantification> getQuantificationInvariant();

	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Condition</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Pre Condition</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getLogicalTransformation_PreCondition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Quantification> getPreCondition();

	/**
	 * Returns the value of the '<em><b>Post Condition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Condition</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Post Condition</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getLogicalTransformation_PostCondition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Quantification> getPostCondition();

	/**
	 * Returns the value of the '<em><b>Time Invariant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Invariant</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Time Invariant</em>' reference.
	 * @see #setTimeInvariant(LogicalTimeCondition)
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getLogicalTransformation_TimeInvariant()
	 * @model ordered="false"
	 * @generated
	 */
	LogicalTimeCondition getTimeInvariant();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getTimeInvariant <em>Time Invariant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Time Invariant</em>' reference.
	 * @see #getTimeInvariant()
	 * @generated
	 */
	void setTimeInvariant(LogicalTimeCondition value);

} // LogicalTransformation
