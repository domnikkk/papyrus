/**
 */
package org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage#getQuantification()
 * @model
 * @generated
 */
public interface Quantification extends EAElement, EAExpression {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Operand</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage#getQuantification_Operand()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Attribute> getOperand();

} // Quantification
