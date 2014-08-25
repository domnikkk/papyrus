/**
 */
package org.eclipse.papyrus.eastadl.requirements.requirements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * QualityRequirements are the kind of requirements that are used to introduce externally visible properties of the system considered as a whole.
 * The attribute qualityRequirementType allows a more specific classification.
 *
 *
 *
 * Extension:
 * Class, specializes Requirement
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.QualityRequirement#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getQualityRequirement()
 * @model
 * @generated
 */
public interface QualityRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.eastadl.requirements.requirements.QualityRequirementKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.QualityRequirementKind
	 * @see #setKind(QualityRequirementKind)
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage#getQualityRequirement_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	QualityRequirementKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.QualityRequirement#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.QualityRequirementKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(QualityRequirementKind value);

} // QualityRequirement
