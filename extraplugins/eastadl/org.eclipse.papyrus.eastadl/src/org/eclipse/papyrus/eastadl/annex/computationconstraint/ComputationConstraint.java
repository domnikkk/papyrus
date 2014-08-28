/**
 */
package org.eclipse.papyrus.eastadl.annex.computationconstraint;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computation Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationConstraint#getLogicalPath <em>Logical Path</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationConstraint#getLogicalTransformation <em>Logical Transformation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getComputationConstraint()
 * @model
 * @generated
 */
public interface ComputationConstraint extends EAElement {
	/**
	 * Returns the value of the '<em><b>Logical Path</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Path</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Logical Path</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getComputationConstraint_LogicalPath()
	 * @model ordered="false"
	 * @generated
	 */
	EList<LogicalPath> getLogicalPath();

	/**
	 * Returns the value of the '<em><b>Logical Transformation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Transformation</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Logical Transformation</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage#getComputationConstraint_LogicalTransformation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<LogicalTransformation> getLogicalTransformation();

} // ComputationConstraint
