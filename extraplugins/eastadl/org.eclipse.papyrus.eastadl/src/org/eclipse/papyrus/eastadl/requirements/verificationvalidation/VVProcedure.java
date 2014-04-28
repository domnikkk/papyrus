/**
 */
package org.eclipse.papyrus.eastadl.requirements.verificationvalidation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.infrastructure.elements.TraceableSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VV Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * VVProcedure represents an individual task in the context of an overall V&V effort (represented by a VVCase), which has to be performed in order to achieve that effort's overall objective. Just as is the case for VVCases, the definition of VVProcedures is separated in two levels: an abstract and a concrete level represented by the entities AbstractVVProcedure and ConcreteVVProcedure.
 * 
 * The concreteVVProcedure metaclass represents such a task on a concrete level, i.e. it is defined with a concrete testing environment in mind and provides stimuli and an expected outcome of the procedure in a form which is directly applicable to this testing environment.
 * 
 * Extension: Class
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VVProcedure#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VVProcedure#getAbstractVVProcedure <em>Abstract VV Procedure</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VVProcedure#getVvIntendedOutcome <em>Vv Intended Outcome</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VVProcedure#getVvStimuli <em>Vv Stimuli</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VerificationvalidationPackage#getVVProcedure()
 * @model
 * @generated
 */
public interface VVProcedure extends TraceableSpecification {
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
	 * @see org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VerificationvalidationPackage#getVVProcedure_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VVProcedure#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Abstract VV Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract VV Procedure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract VV Procedure</em>' reference.
	 * @see #setAbstractVVProcedure(VVProcedure)
	 * @see org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VerificationvalidationPackage#getVVProcedure_AbstractVVProcedure()
	 * @model ordered="false"
	 * @generated
	 */
	VVProcedure getAbstractVVProcedure();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VVProcedure#getAbstractVVProcedure <em>Abstract VV Procedure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract VV Procedure</em>' reference.
	 * @see #getAbstractVVProcedure()
	 * @generated
	 */
	void setAbstractVVProcedure(VVProcedure value);

	/**
	 * Returns the value of the '<em><b>Vv Intended Outcome</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VVIntendedOutcome}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vv Intended Outcome</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vv Intended Outcome</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VerificationvalidationPackage#getVVProcedure_VvIntendedOutcome()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<VVIntendedOutcome> getVvIntendedOutcome();

	/**
	 * Returns the value of the '<em><b>Vv Stimuli</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VVStimuli}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vv Stimuli</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vv Stimuli</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VerificationvalidationPackage#getVVProcedure_VvStimuli()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<VVStimuli> getVvStimuli();

} // VVProcedure
