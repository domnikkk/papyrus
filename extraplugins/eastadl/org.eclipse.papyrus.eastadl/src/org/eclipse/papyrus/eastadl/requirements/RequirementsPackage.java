/**
 */
package org.eclipse.papyrus.eastadl.requirements;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A requirement expresses a condition or capability that must be met or possessed by a system or system component to satisfy a contract, standard, specification or other formally imposed properties.
 *
 * Requirements can be introduced in different phases of the development process for different reasons. They could be introduced by marketing people, control engineers, system engineers, software engineers, Driver/OS developers, basic software developers or
 * hardware engineers. This leads to the fact that requirements have many sources, and requirements are of many types (at different level of detail) and have several relations between them. Under these conditions the number of requirements can become quickly
 * unmanageable if appropriate management does not exist. Note that, requirements can change during the project development and the changes should be taken into account. Requirements are organized hierarchically through several kinds of refinement relations.
 *
 * EAST-ADL2 has constructs that deal with these problems. Some of these constructs deals with general issues in software development and have been already addressed in the past by general processes. As done for the structure part of EAST-ADL2, the
 * requirements part will be compliant with UML2. The EAST-ADL2 adapts existing concepts whenever possible and develops new ones otherwise. Support for requirements modeling is provided by the EAST-ADL2 on two levels: a generic level and specializing levels
 * (e.g. Dependability.SafetyRequirement) where specialized requirement entities are provided which are intended for certain special uses.
 *
 * Elements inspired by SysML are Requirement, Satisfy, Refine, DeriveRequirement, (Verify)
 * <!-- end-model-doc -->
 *
 * @see org.eclipse.papyrus.eastadl.requirements.RequirementsFactory
 * @model kind="package"
 * @generated
 */
public interface RequirementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "requirements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.papyrusuml.org/EAST-ADL2/Requirements/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "Requirements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	RequirementsPackage eINSTANCE = org.eclipse.papyrus.eastadl.requirements.impl.RequirementsPackageImpl.init();

	/**
	 * The meta object id for the '<em>Dummy</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see java.lang.String
	 * @see org.eclipse.papyrus.eastadl.requirements.impl.RequirementsPackageImpl#getDummy()
	 * @generated
	 */
	int DUMMY = 0;


	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Dummy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for data type '<em>Dummy</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getDummy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementsFactory getRequirementsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '<em>Dummy</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see java.lang.String
		 * @see org.eclipse.papyrus.eastadl.requirements.impl.RequirementsPackageImpl#getDummy()
		 * @generated
		 */
		EDataType DUMMY = eINSTANCE.getDummy();

	}

} // RequirementsPackage
