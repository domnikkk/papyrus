/**
 */
package org.eclipse.papyrus.eastadl.requirements.usecases;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.eastadl.requirements.usecases.UsecasesPackage
 * @generated
 */
public interface UsecasesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	UsecasesFactory eINSTANCE = org.eclipse.papyrus.eastadl.requirements.usecases.impl.UsecasesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Extend</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Extend</em>'.
	 * @generated
	 */
	Extend createExtend();

	/**
	 * Returns a new object of class '<em>Extension Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Extension Point</em>'.
	 * @generated
	 */
	ExtensionPoint createExtensionPoint();

	/**
	 * Returns a new object of class '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Use Case</em>'.
	 * @generated
	 */
	UseCase createUseCase();

	/**
	 * Returns a new object of class '<em>Include</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Include</em>'.
	 * @generated
	 */
	Include createInclude();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the package supported by this factory.
	 * @generated
	 */
	UsecasesPackage getUsecasesPackage();

} // UsecasesFactory
