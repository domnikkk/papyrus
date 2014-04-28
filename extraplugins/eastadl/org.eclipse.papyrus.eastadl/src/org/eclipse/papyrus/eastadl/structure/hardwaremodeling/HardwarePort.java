/**
 */
package org.eclipse.papyrus.eastadl.structure.hardwaremodeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePort#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePort#isIsShield <em>Is Shield</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePort#getContainedPin <em>Contained Pin</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePort#getReferencedPin <em>Referenced Pin</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePort#getContainedPort <em>Contained Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage#getHardwarePort()
 * @model
 * @generated
 */
public interface HardwarePort extends AllocationTarget, EAPort {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage#getHardwarePort_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePort#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Is Shield</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Shield</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Shield</em>' attribute.
	 * @see #setIsShield(boolean)
	 * @see org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage#getHardwarePort_IsShield()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsShield();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePort#isIsShield <em>Is Shield</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Shield</em>' attribute.
	 * @see #isIsShield()
	 * @generated
	 */
	void setIsShield(boolean value);

	/**
	 * Returns the value of the '<em><b>Contained Pin</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Pin</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Pin</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage#getHardwarePort_ContainedPin()
	 * @model ordered="false"
	 * @generated
	 */
	EList<HardwarePin> getContainedPin();

	/**
	 * Returns the value of the '<em><b>Referenced Pin</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Pin</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Pin</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage#getHardwarePort_ReferencedPin()
	 * @model ordered="false"
	 * @generated
	 */
	EList<HardwarePin> getReferencedPin();

	/**
	 * Returns the value of the '<em><b>Contained Port</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Port</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage#getHardwarePort_ContainedPort()
	 * @model ordered="false"
	 * @generated
	 */
	EList<HardwarePort> getContainedPort();

} // HardwarePort
