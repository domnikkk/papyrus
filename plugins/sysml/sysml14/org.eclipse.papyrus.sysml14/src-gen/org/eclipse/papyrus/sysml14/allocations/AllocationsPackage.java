/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.allocations;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.papyrus.sysml14.blocks.BlocksPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.sysml14.allocations.AllocationsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Allocations'"
 * @generated
 */
public interface AllocationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "allocations"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/1.4/SysML/Allocations"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Allocations"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AllocationsPackage eINSTANCE = org.eclipse.papyrus.sysml14.allocations.internal.impl.AllocationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.allocations.internal.impl.AllocateActivityPartitionImpl <em>Allocate Activity Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.allocations.internal.impl.AllocateActivityPartitionImpl
	 * @see org.eclipse.papyrus.sysml14.allocations.internal.impl.AllocationsPackageImpl#getAllocateActivityPartition()
	 * @generated
	 */
	int ALLOCATE_ACTIVITY_PARTITION = 0;

	/**
	 * The feature id for the '<em><b>Base Activity Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_ACTIVITY_PARTITION__BASE_ACTIVITY_PARTITION = 0;

	/**
	 * The number of structural features of the '<em>Allocate Activity Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_ACTIVITY_PARTITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Allocate Activity Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_ACTIVITY_PARTITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.allocations.internal.impl.AllocateImpl <em>Allocate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.allocations.internal.impl.AllocateImpl
	 * @see org.eclipse.papyrus.sysml14.allocations.internal.impl.AllocationsPackageImpl#getAllocate()
	 * @generated
	 */
	int ALLOCATE = 1;

	/**
	 * The feature id for the '<em><b>Base Directed Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE__BASE_DIRECTED_RELATIONSHIP = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__BASE_DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Source Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE__SOURCE_PROPERTY_PATH = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Target Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE__TARGET_PROPERTY_PATH = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Source Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE__SOURCE_CONTEXT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Target Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE__TARGET_CONTEXT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_CONTEXT;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE__BASE_ABSTRACTION = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Allocate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_FEATURE_COUNT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Allocated From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE___GET_ALLOCATED_FROM__NAMEDELEMENT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Allocated To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE___GET_ALLOCATED_TO__NAMEDELEMENT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Allocate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_OPERATION_COUNT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH_OPERATION_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.allocations.AllocateActivityPartition <em>Allocate Activity Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocate Activity Partition</em>'.
	 * @see org.eclipse.papyrus.sysml14.allocations.AllocateActivityPartition
	 * @generated
	 */
	EClass getAllocateActivityPartition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.allocations.AllocateActivityPartition#getBase_ActivityPartition <em>Base Activity Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Activity Partition</em>'.
	 * @see org.eclipse.papyrus.sysml14.allocations.AllocateActivityPartition#getBase_ActivityPartition()
	 * @see #getAllocateActivityPartition()
	 * @generated
	 */
	EReference getAllocateActivityPartition_Base_ActivityPartition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.allocations.Allocate <em>Allocate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocate</em>'.
	 * @see org.eclipse.papyrus.sysml14.allocations.Allocate
	 * @generated
	 */
	EClass getAllocate();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.allocations.Allocate#getBase_Abstraction <em>Base Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Abstraction</em>'.
	 * @see org.eclipse.papyrus.sysml14.allocations.Allocate#getBase_Abstraction()
	 * @see #getAllocate()
	 * @generated
	 */
	EReference getAllocate_Base_Abstraction();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml14.allocations.Allocate#getAllocatedFrom(org.eclipse.uml2.uml.NamedElement) <em>Get Allocated From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Allocated From</em>' operation.
	 * @see org.eclipse.papyrus.sysml14.allocations.Allocate#getAllocatedFrom(org.eclipse.uml2.uml.NamedElement)
	 * @generated
	 */
	EOperation getAllocate__GetAllocatedFrom__NamedElement();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml14.allocations.Allocate#getAllocatedTo(org.eclipse.uml2.uml.NamedElement) <em>Get Allocated To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Allocated To</em>' operation.
	 * @see org.eclipse.papyrus.sysml14.allocations.Allocate#getAllocatedTo(org.eclipse.uml2.uml.NamedElement)
	 * @generated
	 */
	EOperation getAllocate__GetAllocatedTo__NamedElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AllocationsFactory getAllocationsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.allocations.internal.impl.AllocateActivityPartitionImpl <em>Allocate Activity Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.allocations.internal.impl.AllocateActivityPartitionImpl
		 * @see org.eclipse.papyrus.sysml14.allocations.internal.impl.AllocationsPackageImpl#getAllocateActivityPartition()
		 * @generated
		 */
		EClass ALLOCATE_ACTIVITY_PARTITION = eINSTANCE.getAllocateActivityPartition();

		/**
		 * The meta object literal for the '<em><b>Base Activity Partition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATE_ACTIVITY_PARTITION__BASE_ACTIVITY_PARTITION = eINSTANCE.getAllocateActivityPartition_Base_ActivityPartition();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.allocations.internal.impl.AllocateImpl <em>Allocate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.allocations.internal.impl.AllocateImpl
		 * @see org.eclipse.papyrus.sysml14.allocations.internal.impl.AllocationsPackageImpl#getAllocate()
		 * @generated
		 */
		EClass ALLOCATE = eINSTANCE.getAllocate();

		/**
		 * The meta object literal for the '<em><b>Base Abstraction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATE__BASE_ABSTRACTION = eINSTANCE.getAllocate_Base_Abstraction();

		/**
		 * The meta object literal for the '<em><b>Get Allocated From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALLOCATE___GET_ALLOCATED_FROM__NAMEDELEMENT = eINSTANCE.getAllocate__GetAllocatedFrom__NamedElement();

		/**
		 * The meta object literal for the '<em><b>Get Allocated To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALLOCATE___GET_ALLOCATED_TO__NAMEDELEMENT = eINSTANCE.getAllocate__GetAllocatedTo__NamedElement();

	}

} //AllocationsPackage
