/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.values;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.papyrus.eastadl.infrastructure.values.ValuesPackage
 * @generated
 */
public interface ValuesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ValuesFactory eINSTANCE = org.eclipse.papyrus.eastadl.infrastructure.values.impl.ValuesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EA Array Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EA Array Value</em>'.
	 * @generated
	 */
	EAArrayValue createEAArrayValue();

	/**
	 * Returns a new object of class '<em>EA Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EA Boolean Value</em>'.
	 * @generated
	 */
	EABooleanValue createEABooleanValue();

	/**
	 * Returns a new object of class '<em>EA Composite Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EA Composite Value</em>'.
	 * @generated
	 */
	EACompositeValue createEACompositeValue();

	/**
	 * Returns a new object of class '<em>EA Enumeration Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EA Enumeration Value</em>'.
	 * @generated
	 */
	EAEnumerationValue createEAEnumerationValue();

	/**
	 * Returns a new object of class '<em>EA Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EA Expression</em>'.
	 * @generated
	 */
	EAExpression createEAExpression();

	/**
	 * Returns a new object of class '<em>EA Numerical Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EA Numerical Value</em>'.
	 * @generated
	 */
	EANumericalValue createEANumericalValue();

	/**
	 * Returns a new object of class '<em>EA String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EA String Value</em>'.
	 * @generated
	 */
	EAStringValue createEAStringValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	ValuesPackage getValuesPackage();

} // ValuesFactory
