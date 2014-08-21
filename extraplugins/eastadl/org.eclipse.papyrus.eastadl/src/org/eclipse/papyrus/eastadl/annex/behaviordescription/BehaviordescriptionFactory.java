/**
 */
package org.eclipse.papyrus.eastadl.annex.behaviordescription;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage
 * @generated
 */
public interface BehaviordescriptionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	BehaviordescriptionFactory eINSTANCE = org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviordescriptionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Behavior Constraint Binding Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Behavior Constraint Binding Attribute</em>'.
	 * @generated
	 */
	BehaviorConstraintBindingAttribute createBehaviorConstraintBindingAttribute();

	/**
	 * Returns a new object of class '<em>Behavior Constraint Binding Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Behavior Constraint Binding Event</em>'.
	 * @generated
	 */
	BehaviorConstraintBindingEvent createBehaviorConstraintBindingEvent();

	/**
	 * Returns a new object of class '<em>Behavior Constraint Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Behavior Constraint Prototype</em>'.
	 * @generated
	 */
	BehaviorConstraintPrototype createBehaviorConstraintPrototype();

	/**
	 * Returns a new object of class '<em>Behavior Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Behavior Constraint Type</em>'.
	 * @generated
	 */
	BehaviorConstraintType createBehaviorConstraintType();

	/**
	 * Returns a new object of class '<em>Behavior Constraint Target Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Behavior Constraint Target Binding</em>'.
	 * @generated
	 */
	BehaviorConstraintTargetBinding createBehaviorConstraintTargetBinding();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	BehaviordescriptionPackage getBehaviordescriptionPackage();

} // BehaviordescriptionFactory
