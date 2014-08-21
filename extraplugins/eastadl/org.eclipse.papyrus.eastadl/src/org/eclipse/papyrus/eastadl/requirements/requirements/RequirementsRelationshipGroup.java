/**
 */
package org.eclipse.papyrus.eastadl.requirements.requirements;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.infrastructure.elements.TraceableSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * RequirementsRelationGroup represents a group of relations between Requirements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationshipGroup#getRequirementsRelationship <em>Requirements Relationship</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationshipGroup#getBase_Class <em>Base Class</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationshipGroup#getBase_Package <em>Base Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getRequirementsRelationshipGroup()
 * @model
 * @generated
 */
public interface RequirementsRelationshipGroup extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Requirements Relationship</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relations that are grouped by this relation group. Note that this is not a containment association, i.e. a single relation may be grouped by several ReqRelationGroups.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Requirements Relationship</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getRequirementsRelationshipGroup_RequirementsRelationship()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<RequirementsRelationship> getRequirementsRelationship();

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
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getRequirementsRelationshipGroup_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationshipGroup#getBase_Class <em>Base Class</em>}' reference.
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
	 * Returns the value of the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Base Package</em>' reference.
	 * @see #setBase_Package(org.eclipse.uml2.uml.Package)
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getRequirementsRelationshipGroup_Base_Package()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getBase_Package();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationshipGroup#getBase_Package <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Base Package</em>' reference.
	 * @see #getBase_Package()
	 * @generated
	 */
	void setBase_Package(org.eclipse.uml2.uml.Package value);

} // RequirementsRelationshipGroup
