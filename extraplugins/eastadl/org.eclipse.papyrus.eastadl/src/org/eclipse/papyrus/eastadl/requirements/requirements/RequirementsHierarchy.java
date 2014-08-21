/**
 */
package org.eclipse.papyrus.eastadl.requirements.requirements;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.infrastructure.elements.TraceableSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * RequirementContainer represents a larger unit or module of specification information. It is used to share several Requirements which are semantically related to each other. Also, a RequirementContainer structure will be used for structuring requirement
 * specification objects (Requirements, Rationals etc.). Thus, to preserve the ordering of requirement specification objects the ordering of child containers is very important here.
 *
 * In addition to sharing related Requirements, the RequirementContainer allows to define relations between its contained Requirements and also a grouping of them.
 *
 * Furthermore, the RequirementContainer allows introducing additional user attribute definitions by way of UserAttributeElementTypes or UserAttributeTemplates which are valid only locally inside this RequirementContainer. These are additional in that they are
 * used in addition to the user attribute definitions which are provided globally for the entire EAST-ADL2 repository.
 *
 * An EAST-ADL2 system model may contain a forest of RequirementContainer (see parent child relationship). Only non root RequirementContainer which have a parentContainer are allowed to reference a RequirementSpecificationObject.
 * The RequirementContainer with its parent child containment relationship and the reference to RequirementSpecificationObject is the basis element for structuring requirement information into a forest structure.
 *
 * Constraints:
 * [1] Only non root RequirementContainer (parentContainer must be set) which have a parentContainer are allowed to reference a RequirementSpecificationObject.
 *
 * Notation:
 * RequirementContainer is shown as a solid-outline rectangle containing the name. Contained entities may also be shown inside (White-box view)
 *
 * Extension: Package
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsHierarchy#getChildHierarchy <em>Child Hierarchy</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsHierarchy#getBase_Class <em>Base Class</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsHierarchy#getBase_Package <em>Base Package</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsHierarchy#getContainedRequirement <em>Contained Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getRequirementsHierarchy()
 * @model
 * @generated
 */
public interface RequirementsHierarchy extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Child Hierarchy</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsHierarchy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sub hierarchy of a requirement hierarchy.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Child Hierarchy</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getRequirementsHierarchy_ChildHierarchy()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<RequirementsHierarchy> getChildHierarchy();

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
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getRequirementsHierarchy_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsHierarchy#getBase_Class <em>Base Class</em>}' reference.
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
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getRequirementsHierarchy_Base_Package()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getBase_Package();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsHierarchy#getBase_Package <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Base Package</em>' reference.
	 * @see #getBase_Package()
	 * @generated
	 */
	void setBase_Package(org.eclipse.uml2.uml.Package value);

	/**
	 * Returns the value of the '<em><b>Contained Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Requirement</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Contained Requirement</em>' reference.
	 * @see #setContainedRequirement(Requirement)
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getRequirementsHierarchy_ContainedRequirement()
	 * @model ordered="false"
	 * @generated
	 */
	Requirement getContainedRequirement();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsHierarchy#getContainedRequirement <em>Contained Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Contained Requirement</em>' reference.
	 * @see #getContainedRequirement()
	 * @generated
	 */
	void setContainedRequirement(Requirement value);

} // RequirementsHierarchy
