/**
 */
package org.eclipse.papyrus.eastadl.requirements.verificationvalidation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.requirements.requirements.Requirement;
import org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Verify is a relationship metaclass, which signifies a dependency relationship between a Requirement and a VVCase, showing the relationship when a client VVCase verifies the supplier Requirement.
 *
 * Semantics:
 * The Verify metaclass signifies a refined requirement/verified by relationship between a Requirement and a VVCase, where the modification of the supplier Requirement may impact the verifying client VVCase. The Verify metaclass implies the semantics that the
 * verifying client VVCase is not complete, without the supplier Requirement.
 *
 * Notation:
 * A Verify relationship is shown as a dashed arrow between the Requirements and VVCase.
 *
 * Extension:
 * To specializes SysML::Verify, which specializes the UML stereotype Trace, which extends Dependency.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.Verify#getVerifiedByProcedure <em>Verified By Procedure</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.Verify#getVerifiedByCase <em>Verified By Case</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.Verify#getVerifiedRequirement <em>Verified Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VerificationvalidationPackage#getVerify()
 * @model
 * @generated
 */
public interface Verify extends RequirementsRelationship, org.eclipse.papyrus.sysml.requirements.Verify {
	/**
	 * Returns the value of the '<em><b>Verified By Procedure</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VVProcedure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The procedures used to verify the requirements.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Verified By Procedure</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VerificationvalidationPackage#getVerify_VerifiedByProcedure()
	 * @model ordered="false"
	 * @generated
	 */
	EList<VVProcedure> getVerifiedByProcedure();

	/**
	 * Returns the value of the '<em><b>Verified By Case</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VVCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The verification that verifies the supplier requirement(s).
	 * {derived from UML::DirectedRelationship::source}
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Verified By Case</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VerificationvalidationPackage#getVerify_VerifiedByCase()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<VVCase> getVerifiedByCase();

	/**
	 * Returns the value of the '<em><b>Verified Requirement</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.requirements.requirements.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of ADL requirements which the client VV cases verify.
	 * {derived from UML::DirectedRelationship::target}
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Verified Requirement</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VerificationvalidationPackage#getVerify_VerifiedRequirement()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='verifiedRequirement '"
	 * @generated
	 */
	EList<Requirement> getVerifiedRequirement();

} // Verify
