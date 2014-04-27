/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Sara TUCCI (CEA LIST) sara.tucci@cea.fr - Initial API and implementation
 *  Chokri MRAIDHA (CEA LIST) chokri.mraidha@cea.fr - Initial API and implementation
 *  David SERVAT (CEA LIST) david.servat@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.eastadl.timing;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage;
import org.eclipse.papyrus.eastadl.infrastructure.values.ValuesPackage;


/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.eastadl.timing.TimingFactory
 * @model kind="package"
 * @generated
 */
public interface TimingPackage extends EPackage {

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.impl.TimingDescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.eastadl.timing.impl.TimingDescriptionImpl
		 * @see org.eclipse.papyrus.eastadl.timing.impl.TimingPackageImpl#getTimingDescription()
		 * @generated
		 */
		EClass TIMING_DESCRIPTION = eINSTANCE.getTimingDescription();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TIMING_DESCRIPTION__BASE_CLASS = eINSTANCE.getTimingDescription_Base_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.impl.TimingConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.eastadl.timing.impl.TimingConstraintImpl
		 * @see org.eclipse.papyrus.eastadl.timing.impl.TimingPackageImpl#getTimingConstraint()
		 * @generated
		 */
		EClass TIMING_CONSTRAINT = eINSTANCE.getTimingConstraint();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TIMING_CONSTRAINT__MODE = eINSTANCE.getTimingConstraint_Mode();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_CONSTRAINT__BASE_CLASS = eINSTANCE.getTimingConstraint_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_CONSTRAINT__BASE_CONSTRAINT = eINSTANCE.getTimingConstraint_Base_Constraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.impl.EventChainImpl <em>Event Chain</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.eastadl.timing.impl.EventChainImpl
		 * @see org.eclipse.papyrus.eastadl.timing.impl.TimingPackageImpl#getEventChain()
		 * @generated
		 */
		EClass EVENT_CHAIN = eINSTANCE.getEventChain();

		/**
		 * The meta object literal for the '<em><b>Segment</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EVENT_CHAIN__SEGMENT = eINSTANCE.getEventChain_Segment();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EVENT_CHAIN__RESPONSE = eINSTANCE.getEventChain_Response();

		/**
		 * The meta object literal for the '<em><b>Stimulus</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EVENT_CHAIN__STIMULUS = eINSTANCE.getEventChain_Stimulus();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.eastadl.timing.impl.EventImpl
		 * @see org.eclipse.papyrus.eastadl.timing.impl.TimingPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.impl.TimingExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.eastadl.timing.impl.TimingExpressionImpl
		 * @see org.eclipse.papyrus.eastadl.timing.impl.TimingPackageImpl#getTimingExpression()
		 * @generated
		 */
		EClass TIMING_EXPRESSION = eINSTANCE.getTimingExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.impl.PrecedenceConstraintImpl <em>Precedence Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.eastadl.timing.impl.PrecedenceConstraintImpl
		 * @see org.eclipse.papyrus.eastadl.timing.impl.TimingPackageImpl#getPrecedenceConstraint()
		 * @generated
		 */
		EClass PRECEDENCE_CONSTRAINT = eINSTANCE.getPrecedenceConstraint();

		/**
		 * The meta object literal for the '<em><b>Successive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_CONSTRAINT__SUCCESSIVE = eINSTANCE.getPrecedenceConstraint_Successive();

		/**
		 * The meta object literal for the '<em><b>Preceding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_CONSTRAINT__PRECEDING = eINSTANCE.getPrecedenceConstraint_Preceding();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.impl.TimingImpl <em>Timing</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.eastadl.timing.impl.TimingImpl
		 * @see org.eclipse.papyrus.eastadl.timing.impl.TimingPackageImpl#getTiming()
		 * @generated
		 */
		EClass TIMING = eINSTANCE.getTiming();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__CONSTRAINT = eINSTANCE.getTiming_Constraint();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__DESCRIPTION = eINSTANCE.getTiming_Description();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TIMING__BASE_CLASS = eINSTANCE.getTiming_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__BASE_PACKAGE = eINSTANCE.getTiming_Base_Package();

	}

	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "timing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.papyrusuml.org/EAST-ADL2/Timing/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Timing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	TimingPackage eINSTANCE = org.eclipse.papyrus.eastadl.timing.impl.TimingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.impl.TimingDescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.eastadl.timing.impl.TimingDescriptionImpl
	 * @see org.eclipse.papyrus.eastadl.timing.impl.TimingPackageImpl#getTimingDescription()
	 * @generated
	 */
	int TIMING_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_DESCRIPTION__BASE_NAMED_ELEMENT = ElementsPackage.EA_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_DESCRIPTION__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_DESCRIPTION__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_DESCRIPTION__BASE_CLASS = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_DESCRIPTION_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_DESCRIPTION_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.impl.TimingConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.eastadl.timing.impl.TimingConstraintImpl
	 * @see org.eclipse.papyrus.eastadl.timing.impl.TimingPackageImpl#getTimingConstraint()
	 * @generated
	 */
	int TIMING_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__BASE_NAMED_ELEMENT = ElementsPackage.EA_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__MODE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__BASE_CLASS = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__BASE_CONSTRAINT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.impl.EventChainImpl <em>Event Chain</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.eastadl.timing.impl.EventChainImpl
	 * @see org.eclipse.papyrus.eastadl.timing.impl.TimingPackageImpl#getEventChain()
	 * @generated
	 */
	int EVENT_CHAIN = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.eastadl.timing.impl.EventImpl
	 * @see org.eclipse.papyrus.eastadl.timing.impl.TimingPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.impl.TimingImpl <em>Timing</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.eastadl.timing.impl.TimingImpl
	 * @see org.eclipse.papyrus.eastadl.timing.impl.TimingPackageImpl#getTiming()
	 * @generated
	 */
	int TIMING = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.impl.PrecedenceConstraintImpl <em>Precedence Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.eastadl.timing.impl.PrecedenceConstraintImpl
	 * @see org.eclipse.papyrus.eastadl.timing.impl.TimingPackageImpl#getPrecedenceConstraint()
	 * @generated
	 */
	int PRECEDENCE_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__BASE_NAMED_ELEMENT = ElementsPackage.CONTEXT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__NAME = ElementsPackage.CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__OWNED_COMMENT = ElementsPackage.CONTEXT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__BASE_PACKAGEABLE_ELEMENT = ElementsPackage.CONTEXT__BASE_PACKAGEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__TRACEABLE_SPECIFICATION = ElementsPackage.CONTEXT__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__OWNED_RELATIONSHIP = ElementsPackage.CONTEXT__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__CONSTRAINT = ElementsPackage.CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__DESCRIPTION = ElementsPackage.CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__BASE_CLASS = ElementsPackage.CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__BASE_PACKAGE = ElementsPackage.CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Timing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_FEATURE_COUNT = ElementsPackage.CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Timing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_OPERATION_COUNT = ElementsPackage.CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__BASE_NAMED_ELEMENT = TIMING_DESCRIPTION__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__NAME = TIMING_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__OWNED_COMMENT = TIMING_DESCRIPTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__BASE_CLASS = TIMING_DESCRIPTION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Segment</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__SEGMENT = TIMING_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__RESPONSE = TIMING_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stimulus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__STIMULUS = TIMING_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Event Chain</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_FEATURE_COUNT = TIMING_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Event Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_OPERATION_COUNT = TIMING_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__BASE_NAMED_ELEMENT = TIMING_DESCRIPTION__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = TIMING_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OWNED_COMMENT = TIMING_DESCRIPTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__BASE_CLASS = TIMING_DESCRIPTION__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = TIMING_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = TIMING_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.impl.TimingExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.eastadl.timing.impl.TimingExpressionImpl
	 * @see org.eclipse.papyrus.eastadl.timing.impl.TimingPackageImpl#getTimingExpression()
	 * @generated
	 */
	int TIMING_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_EXPRESSION__TYPE = ValuesPackage.EA_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Base Value Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_EXPRESSION__BASE_VALUE_SPECIFICATION = ValuesPackage.EA_EXPRESSION__BASE_VALUE_SPECIFICATION;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_EXPRESSION_FEATURE_COUNT = ValuesPackage.EA_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_EXPRESSION_OPERATION_COUNT = ValuesPackage.EA_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__BASE_NAMED_ELEMENT = TIMING_CONSTRAINT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__NAME = TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__OWNED_COMMENT = TIMING_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__MODE = TIMING_CONSTRAINT__MODE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__BASE_CLASS = TIMING_CONSTRAINT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__BASE_CONSTRAINT = TIMING_CONSTRAINT__BASE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Preceding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__PRECEDING = TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__SUCCESSIVE = TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Precedence Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT_FEATURE_COUNT = TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Precedence Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT_OPERATION_COUNT = TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.Event <em>Event</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.TimingExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.TimingExpression
	 * @generated
	 */
	EClass getTimingExpression();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.eastadl.timing.EventChain <em>Event Chain</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Event Chain</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.EventChain
	 * @generated
	 */
	EClass getEventChain();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.EventChain#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.EventChain#getResponse()
	 * @see #getEventChain()
	 * @generated
	 */
	EReference getEventChain_Response();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.timing.EventChain#getSegment <em>Segment</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Segment</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.EventChain#getSegment()
	 * @see #getEventChain()
	 * @generated
	 */
	EReference getEventChain_Segment();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.EventChain#getStimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stimulus</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.EventChain#getStimulus()
	 * @see #getEventChain()
	 * @generated
	 */
	EReference getEventChain_Stimulus();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.PrecedenceConstraint <em>Precedence Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.PrecedenceConstraint
	 * @generated
	 */
	EClass getPrecedenceConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.eastadl.timing.PrecedenceConstraint#getPreceding <em>Preceding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preceding</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.PrecedenceConstraint#getPreceding()
	 * @see #getPrecedenceConstraint()
	 * @generated
	 */
	EReference getPrecedenceConstraint_Preceding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.eastadl.timing.PrecedenceConstraint#getSuccessive <em>Successive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Successive</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.PrecedenceConstraint#getSuccessive()
	 * @see #getPrecedenceConstraint()
	 * @generated
	 */
	EReference getPrecedenceConstraint_Successive();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.Timing <em>Timing</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.Timing
	 * @generated
	 */
	EClass getTiming();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.timing.Timing#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.Timing#getConstraint()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Constraint();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.timing.Timing#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Description</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.Timing#getDescription()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Description();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.Timing#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.Timing#getBase_Class()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.Timing#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.Timing#getBase_Package()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Base_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.TimingConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.TimingConstraint
	 * @generated
	 */
	EClass getTimingConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.TimingConstraint#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.TimingConstraint#getBase_Class()
	 * @see #getTimingConstraint()
	 * @generated
	 */
	EReference getTimingConstraint_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.TimingConstraint#getBase_Constraint <em>Base Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.TimingConstraint#getBase_Constraint()
	 * @see #getTimingConstraint()
	 * @generated
	 */
	EReference getTimingConstraint_Base_Constraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.TimingConstraint#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mode</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.TimingConstraint#getMode()
	 * @see #getTimingConstraint()
	 * @generated
	 */
	EReference getTimingConstraint_Mode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.TimingDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.TimingDescription
	 * @generated
	 */
	EClass getTimingDescription();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.TimingDescription#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.TimingDescription#getBase_Class()
	 * @see #getTimingDescription()
	 * @generated
	 */
	EReference getTimingDescription_Base_Class();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimingFactory getTimingFactory();

} // TimingPackage
