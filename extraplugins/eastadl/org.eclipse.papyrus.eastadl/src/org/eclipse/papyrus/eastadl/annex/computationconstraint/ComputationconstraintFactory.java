/**
 */
package org.eclipse.papyrus.eastadl.annex.computationconstraint;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage
 * @generated
 */
public interface ComputationconstraintFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	ComputationconstraintFactory eINSTANCE = org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.ComputationconstraintFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Computation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Computation Constraint</em>'.
	 * @generated
	 */
	ComputationConstraint createComputationConstraint();

	/**
	 * Returns a new object of class '<em>Logical Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Logical Path</em>'.
	 * @generated
	 */
	LogicalPath createLogicalPath();

	/**
	 * Returns a new object of class '<em>Logical Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Logical Transformation</em>'.
	 * @generated
	 */
	LogicalTransformation createLogicalTransformation();

	/**
	 * Returns a new object of class '<em>Transformation Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Transformation Occurrence</em>'.
	 * @generated
	 */
	TransformationOccurrence createTransformationOccurrence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComputationconstraintPackage getComputationconstraintPackage();

} // ComputationconstraintFactory
