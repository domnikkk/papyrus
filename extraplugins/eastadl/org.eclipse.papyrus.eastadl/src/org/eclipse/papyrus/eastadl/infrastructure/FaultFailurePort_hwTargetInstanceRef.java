/**
 */
package org.eclipse.papyrus.eastadl.infrastructure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentPrototype;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Failure Port hw Target Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_hwTargetInstanceRef#getHardwarePort <em>Hardware Port</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_hwTargetInstanceRef#getHardwareComponentProtype <em>Hardware Component Protype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getFaultFailurePort_hwTargetInstanceRef()
 * @model
 * @generated
 */
public interface FaultFailurePort_hwTargetInstanceRef extends InstanceRef {
	/**
	 * Returns the value of the '<em><b>Hardware Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Port</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Hardware Port</em>' reference.
	 * @see #setHardwarePort(HardwarePin)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getFaultFailurePort_hwTargetInstanceRef_HardwarePort()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	HardwarePin getHardwarePort();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_hwTargetInstanceRef#getHardwarePort <em>Hardware Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Hardware Port</em>' reference.
	 * @see #getHardwarePort()
	 * @generated
	 */
	void setHardwarePort(HardwarePin value);

	/**
	 * Returns the value of the '<em><b>Hardware Component Protype</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Component Protype</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Hardware Component Protype</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getFaultFailurePort_hwTargetInstanceRef_HardwareComponentProtype()
	 * @model ordered="false"
	 * @generated
	 */
	EList<HardwareComponentPrototype> getHardwareComponentProtype();

} // FaultFailurePort_hwTargetInstanceRef
