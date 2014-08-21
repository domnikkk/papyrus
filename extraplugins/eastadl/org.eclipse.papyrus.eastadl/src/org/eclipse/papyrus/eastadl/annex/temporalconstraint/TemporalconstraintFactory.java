/**
 */
package org.eclipse.papyrus.eastadl.annex.temporalconstraint;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage
 * @generated
 */
public interface TemporalconstraintFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	TemporalconstraintFactory eINSTANCE = org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalconstraintFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Temporal Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Temporal Constraint</em>'.
	 * @generated
	 */
	TemporalConstraint createTemporalConstraint();

	/**
	 * Returns a new object of class '<em>Logical Time Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Logical Time Condition</em>'.
	 * @generated
	 */
	LogicalTimeCondition createLogicalTimeCondition();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>State Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>State Event</em>'.
	 * @generated
	 */
	StateEvent createStateEvent();

	/**
	 * Returns a new object of class '<em>Synchronoustransition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Synchronoustransition</em>'.
	 * @generated
	 */
	Synchronoustransition createSynchronoustransition();

	/**
	 * Returns a new object of class '<em>Transition Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Transition Event</em>'.
	 * @generated
	 */
	TransitionEvent createTransitionEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	TemporalconstraintPackage getTemporalconstraintPackage();

} // TemporalconstraintFactory
