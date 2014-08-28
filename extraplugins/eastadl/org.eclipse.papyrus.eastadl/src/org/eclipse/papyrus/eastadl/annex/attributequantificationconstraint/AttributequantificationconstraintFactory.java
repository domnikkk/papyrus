/**
 */
package org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage
 * @generated
 */
public interface AttributequantificationconstraintFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	AttributequantificationconstraintFactory eINSTANCE = org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributequantificationconstraintFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attribute Quantificationconstraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Attribute Quantificationconstraint</em>'.
	 * @generated
	 */
	AttributeQuantificationconstraint createAttributeQuantificationconstraint();

	/**
	 * Returns a new object of class '<em>Quantification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Quantification</em>'.
	 * @generated
	 */
	Quantification createQuantification();

	/**
	 * Returns a new object of class '<em>Behavior Attribute Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Behavior Attribute Binding</em>'.
	 * @generated
	 */
	BehaviorAttributeBinding createBehaviorAttributeBinding();

	/**
	 * Returns a new object of class '<em>Logical Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Logical Event</em>'.
	 * @generated
	 */
	LogicalEvent createLogicalEvent();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the package supported by this factory.
	 * @generated
	 */
	AttributequantificationconstraintPackage getAttributequantificationconstraintPackage();

} // AttributequantificationconstraintFactory
