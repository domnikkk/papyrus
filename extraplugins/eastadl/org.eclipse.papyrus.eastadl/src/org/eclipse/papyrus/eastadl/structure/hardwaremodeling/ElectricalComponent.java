/**
 */
package org.eclipse.papyrus.eastadl.structure.hardwaremodeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electrical Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Electrical component represents a hardware element as e.g. relays, batteries, capacitors and other non-computational, non-interactional (with plant) elements.
 * 
 * Semantics:
 * Electrical component may be active (e.g., a battery) or passive (main relay).
 * 
 * Notation:
 * ElectricalComponentis shown as a solid-outline rectangle. The rectangle contains the name, and its ports or port groups on the perimeter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.ElectricalComponent#isIsActive <em>Is Active</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage#getElectricalComponent()
 * @model
 * @generated
 */
public interface ElectricalComponent extends HardwareComponentType {
	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if the PowerSupply is active or passive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage#getElectricalComponent_IsActive()
	 * @model unique="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.ElectricalComponent#isIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */
	void setIsActive(boolean value);

} // ElectricalComponent
