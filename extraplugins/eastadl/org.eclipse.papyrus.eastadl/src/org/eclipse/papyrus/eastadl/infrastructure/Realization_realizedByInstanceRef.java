/**
 */
package org.eclipse.papyrus.eastadl.infrastructure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realization realized By Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedByInstanceRef#getIdentifiable_target <em>Identifiable target</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedByInstanceRef#getIdentifiable_context <em>Identifiable context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getRealization_realizedByInstanceRef()
 * @model
 * @generated
 */
public interface Realization_realizedByInstanceRef extends InstanceRef {
	/**
	 * Returns the value of the '<em><b>Identifiable target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiable target</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Identifiable target</em>' reference.
	 * @see #setIdentifiable_target(NamedElement)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getRealization_realizedByInstanceRef_Identifiable_target()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NamedElement getIdentifiable_target();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedByInstanceRef#getIdentifiable_target <em>Identifiable target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Identifiable target</em>' reference.
	 * @see #getIdentifiable_target()
	 * @generated
	 */
	void setIdentifiable_target(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Identifiable context</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiable context</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Identifiable context</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getRealization_realizedByInstanceRef_Identifiable_context()
	 * @model ordered="false"
	 * @generated
	 */
	EList<NamedElement> getIdentifiable_context();

} // Realization_realizedByInstanceRef
