/**
 */
package org.eclipse.papyrus.eastadl.timing.timingconstraints;

import org.eclipse.papyrus.eastadl.timing.TimingConstraint;
import org.eclipse.papyrus.eastadl.timing.TimingExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonConstraint#getRightOperand <em>Right Operand</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonConstraint#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonConstraint#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getComparisonConstraint()
 * @model
 * @generated
 */
public interface ComparisonConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' reference.
	 * @see #setRightOperand(TimingExpression)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getComparisonConstraint_RightOperand()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TimingExpression getRightOperand();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonConstraint#getRightOperand <em>Right Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Operand</em>' reference.
	 * @see #getRightOperand()
	 * @generated
	 */
	void setRightOperand(TimingExpression value);

	/**
	 * Returns the value of the '<em><b>Left Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operand</em>' reference.
	 * @see #setLeftOperand(TimingExpression)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getComparisonConstraint_LeftOperand()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TimingExpression getLeftOperand();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonConstraint#getLeftOperand <em>Left Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Operand</em>' reference.
	 * @see #getLeftOperand()
	 * @generated
	 */
	void setLeftOperand(TimingExpression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonKind
	 * @see #setOperator(ComparisonKind)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getComparisonConstraint_Operator()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComparisonKind getOperator();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonConstraint#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonKind
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparisonKind value);

} // ComparisonConstraint
