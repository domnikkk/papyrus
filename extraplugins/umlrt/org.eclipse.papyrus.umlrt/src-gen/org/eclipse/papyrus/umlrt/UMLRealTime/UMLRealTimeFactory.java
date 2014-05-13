/**
 */
package org.eclipse.papyrus.umlrt.UMLRealTime;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage
 * @generated
 */
public interface UMLRealTimeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UMLRealTimeFactory eINSTANCE = org.eclipse.papyrus.umlrt.UMLRealTime.impl.UMLRealTimeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Capsule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capsule</em>'.
	 * @generated
	 */
	Capsule createCapsule();

	/**
	 * Returns a new object of class '<em>Capsule Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capsule Part</em>'.
	 * @generated
	 */
	CapsulePart createCapsulePart();

	/**
	 * Returns a new object of class '<em>Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol</em>'.
	 * @generated
	 */
	Protocol createProtocol();

	/**
	 * Returns a new object of class '<em>RT Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RT Port</em>'.
	 * @generated
	 */
	RTPort createRTPort();

	/**
	 * Returns a new object of class '<em>RT Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RT Connector</em>'.
	 * @generated
	 */
	RTConnector createRTConnector();

	/**
	 * Returns a new object of class '<em>Protocol Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Package</em>'.
	 * @generated
	 */
	ProtocolPackage createProtocolPackage();

	/**
	 * Returns a new object of class '<em>RTR Excluded Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RTR Excluded Element</em>'.
	 * @generated
	 */
	RTRExcludedElement createRTRExcludedElement();

	/**
	 * Returns a new object of class '<em>Message Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Set</em>'.
	 * @generated
	 */
	MessageSet createMessageSet();

	/**
	 * Returns a new object of class '<em>Trigger Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Event</em>'.
	 * @generated
	 */
	TriggerEvent createTriggerEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UMLRealTimePackage getUMLRealTimePackage();

} //UMLRealTimeFactory
