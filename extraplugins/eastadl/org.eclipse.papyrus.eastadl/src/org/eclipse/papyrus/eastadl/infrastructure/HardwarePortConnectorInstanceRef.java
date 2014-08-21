/**
 */
package org.eclipse.papyrus.eastadl.infrastructure;

import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentPrototype;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Port Connector Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.HardwarePortConnectorInstanceRef#getHardwarePort <em>Hardware Port</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.HardwarePortConnectorInstanceRef#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getHardwarePortConnectorInstanceRef()
 * @model
 * @generated
 */
public interface HardwarePortConnectorInstanceRef extends InstanceRef {
	/**
	 * Returns the value of the '<em><b>Hardware Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Port</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Hardware Port</em>' reference.
	 * @see #setHardwarePort(HardwarePort)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getHardwarePortConnectorInstanceRef_HardwarePort()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	HardwarePort getHardwarePort();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.HardwarePortConnectorInstanceRef#getHardwarePort <em>Hardware Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Hardware Port</em>' reference.
	 * @see #getHardwarePort()
	 * @generated
	 */
	void setHardwarePort(HardwarePort value);

	/**
	 * Returns the value of the '<em><b>Hardware Component Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Component Prototype</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Hardware Component Prototype</em>' reference.
	 * @see #setHardwareComponentPrototype(HardwareComponentPrototype)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getHardwarePortConnectorInstanceRef_HardwareComponentPrototype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	HardwareComponentPrototype getHardwareComponentPrototype();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.HardwarePortConnectorInstanceRef#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Hardware Component Prototype</em>' reference.
	 * @see #getHardwareComponentPrototype()
	 * @generated
	 */
	void setHardwareComponentPrototype(HardwareComponentPrototype value);

} // HardwarePortConnectorInstanceRef
