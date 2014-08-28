/**
 */
package org.eclipse.papyrus.eastadl.structure.hardwaremodeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.infrastructure.HardwarePortConnectorInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAConnector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Port Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The HardwarePortConnector represents a logical connector. It serves as an allocation target for connectors, i.e. the data exchanged between functions in the FunctionalDesignArchitecture.
 *
 *
 * Semantics:
 * The HardwarePortConnectors represents a logical connection that carries data from any sender to all receivers. Senders and receivers are identified by the connectors of the HardwarePortConnector, i.e. the associated HardwareConnectors. The available
 * busSpeed represents the maximum amount of useful data that can be carried. The busSpeed has already deducted speed reduction resulting from frame overhead, timing effects, etc.
 *
 * Extension:
 * Class
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePortConnector#getBase_Class <em>Base Class</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePortConnector#getBusSpeed <em>Bus Speed</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePortConnector#getBusType <em>Bus Type</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePortConnector#getConnector <em>Connector</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePortConnector#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage#getHardwarePortConnector()
 * @model
 * @generated
 */
public interface HardwarePortConnector extends AllocationTarget, EAConnector {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage#getHardwarePortConnector_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePortConnector#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Bus Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Speed</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Bus Speed</em>' attribute.
	 * @see #setBusSpeed(Float)
	 * @see org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage#getHardwarePortConnector_BusSpeed()
	 * @model unique="false" dataType="org.eclipse.papyrus.eastadl.infrastructure.datatypes.javalangFloat" required="true" ordered="false"
	 * @generated
	 */
	Float getBusSpeed();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePortConnector#getBusSpeed <em>Bus Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Bus Speed</em>' attribute.
	 * @see #getBusSpeed()
	 * @generated
	 */
	void setBusSpeed(Float value);

	/**
	 * Returns the value of the '<em><b>Bus Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareBusKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Type</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Bus Type</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareBusKind
	 * @see #setBusType(HardwareBusKind)
	 * @see org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage#getHardwarePortConnector_BusType()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	HardwareBusKind getBusType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePortConnector#getBusType <em>Bus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Bus Type</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareBusKind
	 * @see #getBusType()
	 * @generated
	 */
	void setBusType(HardwareBusKind value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Connector</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage#getHardwarePortConnector_Connector()
	 * @model ordered="false"
	 * @generated
	 */
	EList<HardwareConnector> getConnector();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.infrastructure.HardwarePortConnectorInstanceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage#getHardwarePortConnector_Port()
	 * @model containment="true" lower="2" upper="2" ordered="false"
	 * @generated
	 */
	EList<HardwarePortConnectorInstanceRef> getPort();

} // HardwarePortConnector
