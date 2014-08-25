/**
 */
package org.eclipse.papyrus.eastadl.infrastructure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentPrototype;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareConnector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Constraint Internal Binding through Hardware Connector Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef#getHardwareConnector <em>Hardware Connector</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef()
 * @model
 * @generated
 */
public interface BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef extends InstanceRef {
	/**
	 * Returns the value of the '<em><b>Hardware Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Connector</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Hardware Connector</em>' reference.
	 * @see #setHardwareConnector(HardwareConnector)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef_HardwareConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	HardwareConnector getHardwareConnector();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef#getHardwareConnector <em>Hardware Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Hardware Connector</em>' reference.
	 * @see #getHardwareConnector()
	 * @generated
	 */
	void setHardwareConnector(HardwareConnector value);

	/**
	 * Returns the value of the '<em><b>Hardware Component Prototype</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Component Prototype</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Hardware Component Prototype</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef_HardwareComponentPrototype()
	 * @model ordered="false"
	 * @generated
	 */
	EList<HardwareComponentPrototype> getHardwareComponentPrototype();

} // BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef
