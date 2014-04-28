/**
 */
package org.eclipse.papyrus.eastadl.requirements.requirements;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.sysml.requirements.DeriveReqt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derive Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ADLDeriveReqt signifies a dependency relationship in-between two sets of ADL requirements, showing the relationship when a set of derived client ADL requirement (client requirement) is derived from a set of ADL requirements (supplier requirement). It inherits from SysML::DeriveReqt which extends Dependency.
 * 
 * Semantics:
 * ADLDeriveReqt signifies a derived/derived by relationship between ADLRequirements, where the modification of the supplierADLRequirement may impact the derived client ADLRequirement. ADLDeriveReqt implies the semantics that the derived client ADLRequirement is not complete, without the supplier ADLRequirement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.DeriveRequirement#getDerived <em>Derived</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.DeriveRequirement#getDerivedFrom <em>Derived From</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getDeriveRequirement()
 * @model
 * @generated
 */
public interface DeriveRequirement extends RequirementsRelationship, DeriveReqt {
	/**
	 * Returns the value of the '<em><b>Derived</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.requirements.requirements.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of ADL requirements derived from the supplier ADL requirement.
	 * {derived from UML::DirectedRelationship::target}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getDeriveRequirement_Derived()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Requirement> getDerived();

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.requirements.requirements.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of ADL requirements that the client ADL requirement are derived from.
	 * {derived from UML::DirectedRelationship::source}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived From</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getDeriveRequirement_DerivedFrom()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Requirement> getDerivedFrom();

} // DeriveRequirement
