/**
 */
package org.eclipse.papyrus.eastadl.requirements.requirements;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.infrastructure.elements.Context;
import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The collection of requirements, their relationships, and usecases. This collection can be done across the EAST-ADL2 abstraction levels.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsModel#getUseCase <em>Use Case</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsModel#getRequirementsHierachy <em>Requirements Hierachy</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsModel#getOperationalSituation <em>Operational Situation</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsModel#getBase_Package <em>Base Package</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsModel#getRequirementsRelationshipGroup <em>Requirements Relationship Group</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsModel#getRequirement <em>Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getRequirementsModel()
 * @model
 * @generated
 */
public interface RequirementsModel extends Context {
	/**
	 * Returns the value of the '<em><b>Use Case</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.UseCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Case</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Use Case</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getRequirementsModel_UseCase()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<UseCase> getUseCase();

	/**
	 * Returns the value of the '<em><b>Requirements Hierachy</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsHierarchy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements Hierachy</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Requirements Hierachy</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getRequirementsModel_RequirementsHierachy()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<RequirementsHierarchy> getRequirementsHierachy();

	/**
	 * Returns the value of the '<em><b>Operational Situation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.requirements.requirements.OperationalSituation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Situation</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Operational Situation</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getRequirementsModel_OperationalSituation()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<OperationalSituation> getOperationalSituation();

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
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getRequirementsModel_Base_Package()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getBase_Package();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsModel#getBase_Package <em>Base Package</em>}' reference.
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
	 * Returns the value of the '<em><b>Requirements Relationship Group</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationshipGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements Relationship Group</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Requirements Relationship Group</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getRequirementsModel_RequirementsRelationshipGroup()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<RequirementsRelationshipGroup> getRequirementsRelationshipGroup();

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.requirements.requirements.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Requirement</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getRequirementsModel_Requirement()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Requirement> getRequirement();

} // RequirementsModel
