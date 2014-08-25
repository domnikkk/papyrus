/**
 */
package org.eclipse.papyrus.eastadl.timing.timingconstraints.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.eastadl.timing.TimingExpression;
import org.eclipse.papyrus.eastadl.timing.impl.TimingConstraintImpl;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonKind;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ComparisonConstraintImpl#getRightOperand <em>Right Operand</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ComparisonConstraintImpl#getLeftOperand <em>Left Operand</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ComparisonConstraintImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComparisonConstraintImpl extends TimingConstraintImpl implements ComparisonConstraint {
	/**
	 * The cached value of the '{@link #getRightOperand() <em>Right Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getRightOperand()
	 * @generated
	 * @ordered
	 */
	protected TimingExpression rightOperand;

	/**
	 * The cached value of the '{@link #getLeftOperand() <em>Left Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getLeftOperand()
	 * @generated
	 * @ordered
	 */
	protected TimingExpression leftOperand;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonKind OPERATOR_EDEFAULT = ComparisonKind.EQUAL;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparisonKind operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ComparisonConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingconstraintsPackage.Literals.COMPARISON_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TimingExpression getRightOperand() {
		if (rightOperand != null && rightOperand.eIsProxy()) {
			InternalEObject oldRightOperand = (InternalEObject) rightOperand;
			rightOperand = (TimingExpression) eResolveProxy(oldRightOperand);
			if (rightOperand != oldRightOperand) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.COMPARISON_CONSTRAINT__RIGHT_OPERAND, oldRightOperand, rightOperand));
				}
			}
		}
		return rightOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public TimingExpression basicGetRightOperand() {
		return rightOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setRightOperand(TimingExpression newRightOperand) {
		TimingExpression oldRightOperand = rightOperand;
		rightOperand = newRightOperand;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.COMPARISON_CONSTRAINT__RIGHT_OPERAND, oldRightOperand, rightOperand));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TimingExpression getLeftOperand() {
		if (leftOperand != null && leftOperand.eIsProxy()) {
			InternalEObject oldLeftOperand = (InternalEObject) leftOperand;
			leftOperand = (TimingExpression) eResolveProxy(oldLeftOperand);
			if (leftOperand != oldLeftOperand) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.COMPARISON_CONSTRAINT__LEFT_OPERAND, oldLeftOperand, leftOperand));
				}
			}
		}
		return leftOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public TimingExpression basicGetLeftOperand() {
		return leftOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setLeftOperand(TimingExpression newLeftOperand) {
		TimingExpression oldLeftOperand = leftOperand;
		leftOperand = newLeftOperand;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.COMPARISON_CONSTRAINT__LEFT_OPERAND, oldLeftOperand, leftOperand));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ComparisonKind getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setOperator(ComparisonKind newOperator) {
		ComparisonKind oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.COMPARISON_CONSTRAINT__OPERATOR, oldOperator, operator));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TimingconstraintsPackage.COMPARISON_CONSTRAINT__RIGHT_OPERAND:
			if (resolve) {
				return getRightOperand();
			}
			return basicGetRightOperand();
		case TimingconstraintsPackage.COMPARISON_CONSTRAINT__LEFT_OPERAND:
			if (resolve) {
				return getLeftOperand();
			}
			return basicGetLeftOperand();
		case TimingconstraintsPackage.COMPARISON_CONSTRAINT__OPERATOR:
			return getOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TimingconstraintsPackage.COMPARISON_CONSTRAINT__RIGHT_OPERAND:
			setRightOperand((TimingExpression) newValue);
			return;
		case TimingconstraintsPackage.COMPARISON_CONSTRAINT__LEFT_OPERAND:
			setLeftOperand((TimingExpression) newValue);
			return;
		case TimingconstraintsPackage.COMPARISON_CONSTRAINT__OPERATOR:
			setOperator((ComparisonKind) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TimingconstraintsPackage.COMPARISON_CONSTRAINT__RIGHT_OPERAND:
			setRightOperand((TimingExpression) null);
			return;
		case TimingconstraintsPackage.COMPARISON_CONSTRAINT__LEFT_OPERAND:
			setLeftOperand((TimingExpression) null);
			return;
		case TimingconstraintsPackage.COMPARISON_CONSTRAINT__OPERATOR:
			setOperator(OPERATOR_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TimingconstraintsPackage.COMPARISON_CONSTRAINT__RIGHT_OPERAND:
			return rightOperand != null;
		case TimingconstraintsPackage.COMPARISON_CONSTRAINT__LEFT_OPERAND:
			return leftOperand != null;
		case TimingconstraintsPackage.COMPARISON_CONSTRAINT__OPERATOR:
			return operator != OPERATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} // ComparisonConstraintImpl
