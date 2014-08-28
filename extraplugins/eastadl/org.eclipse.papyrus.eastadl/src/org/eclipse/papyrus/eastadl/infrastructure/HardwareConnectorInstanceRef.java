/**
 */
package org.eclipse.papyrus.eastadl.infrastructure;

import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentPrototype;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Connector Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.HardwareConnectorInstanceRef#getHardwarePin <em>Hardware Pin</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.HardwareConnectorInstanceRef#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getHardwareConnectorInstanceRef()
 * @model
 * @generated
 */
public interface HardwareConnectorInstanceRef extends InstanceRef {
	/**
	 * Returns the value of the '<em><b>Hardware Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Pin</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Hardware Pin</em>' reference.
	 * @see #setHardwarePin(HardwarePin)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getHardwareConnectorInstanceRef_HardwarePin()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	HardwarePin getHardwarePin();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.HardwareConnectorInstanceRef#getHardwarePin <em>Hardware Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Hardware Pin</em>' reference.
	 * @see #getHardwarePin()
	 * @generated
	 */
	void setHardwarePin(HardwarePin value);

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
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getHardwareConnectorInstanceRef_HardwareComponentPrototype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	HardwareComponentPrototype getHardwareComponentPrototype();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.HardwareConnectorInstanceRef#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Hardware Component Prototype</em>' reference.
	 * @see #getHardwareComponentPrototype()
	 * @generated
	 */
	void setHardwareComponentPrototype(HardwareComponentPrototype value);

} // HardwareConnectorInstanceRef
