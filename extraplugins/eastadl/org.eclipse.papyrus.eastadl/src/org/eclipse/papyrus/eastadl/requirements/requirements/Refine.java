/**
 */
package org.eclipse.papyrus.eastadl.requirements.requirements;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.infrastructure.RefineInstanceRef;
import org.eclipse.uml2.uml.Dependency;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Refine is a relationship metaclass, which signifies a dependency relationship in-between Requirements and EAElements, showing the relationship when a client EAElement refines the supplier Requirement.
 *
 * Semantics:
 * The Refine metaclass signifies a refined requirement/refined by relationship between a Requirement and an EAElement, where the modification of the supplier Requirement may impact the refining client EAElement. The Refine metaclass implies the semantics that
 * the refining client EAElement is not complete, without the supplier Requirement.
 *
 * Constraints:
 * [1] The property refinedBy must not have the types Requirement or RequirementContainer.
 *
 * Notation:
 * A Refine relationship is shown as a dashed arrow between the Requirements and EAElement. The entity at the tail of the arrow (the refining EAElement) depends on the Requirement at the arrowhead (the refined Requirement).
 *
 * Extension: specializes UML2 stereotype Refine, which extends Dependency.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.Refine#getRefinedRequirement <em>Refined Requirement</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.Refine#getBase_Dependency <em>Base Dependency</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.Refine#getRefinedBy <em>Refined By</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getRefine()
 * @model
 * @generated
 */
public interface Refine extends RequirementsRelationship, org.eclipse.uml2.uml.profile.standard.Refine {
	/**
	 * Returns the value of the '<em><b>Refined Requirement</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.requirements.requirements.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of refined requirements.
	 * {derived from UML::DirectedRelationship::target}
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Refined Requirement</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getRefine_RefinedRequirement()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Requirement> getRefinedRequirement();

	/**
	 * Returns the value of the '<em><b>Refined By</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.infrastructure.RefineInstanceRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Refined By</em>' containment reference list.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getRefine_RefinedBy()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<RefineInstanceRef> getRefinedBy();

	/**
	 * Returns the value of the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Dependency</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Base Dependency</em>' reference.
	 * @see #setBase_Dependency(Dependency)
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getRefine_Base_Dependency()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Dependency getBase_Dependency();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.Refine#getBase_Dependency <em>Base Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Base Dependency</em>' reference.
	 * @see #getBase_Dependency()
	 * @generated
	 */
	void setBase_Dependency(Dependency value);

} // Refine
