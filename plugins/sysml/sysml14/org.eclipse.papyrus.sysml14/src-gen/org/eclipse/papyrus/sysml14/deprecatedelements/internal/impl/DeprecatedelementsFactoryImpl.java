/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.sysml14.deprecatedelements.Allocated;
import org.eclipse.papyrus.sysml14.deprecatedelements.DeprecatedelementsFactory;
import org.eclipse.papyrus.sysml14.deprecatedelements.DeprecatedelementsPackage;
import org.eclipse.papyrus.sysml14.deprecatedelements.FlowPort;
import org.eclipse.papyrus.sysml14.deprecatedelements.FlowSpecification;
import org.eclipse.papyrus.sysml14.deprecatedelements.RequirementRelated;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeprecatedelementsFactoryImpl extends EFactoryImpl implements DeprecatedelementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeprecatedelementsFactory init() {
		try {
			DeprecatedelementsFactory theDeprecatedelementsFactory = (DeprecatedelementsFactory)EPackage.Registry.INSTANCE.getEFactory(DeprecatedelementsPackage.eNS_URI);
			if (theDeprecatedelementsFactory != null) {
				return theDeprecatedelementsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeprecatedelementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeprecatedelementsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DeprecatedelementsPackage.FLOW_PORT: return createFlowPort();
			case DeprecatedelementsPackage.FLOW_SPECIFICATION: return createFlowSpecification();
			case DeprecatedelementsPackage.ALLOCATED: return createAllocated();
			case DeprecatedelementsPackage.REQUIREMENT_RELATED: return createRequirementRelated();
			case DeprecatedelementsPackage.DEPRECATED: return createDeprecated();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowPort createFlowPort() {
		FlowPortImpl flowPort = new FlowPortImpl();
		return flowPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowSpecification createFlowSpecification() {
		FlowSpecificationImpl flowSpecification = new FlowSpecificationImpl();
		return flowSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allocated createAllocated() {
		AllocatedImpl allocated = new AllocatedImpl();
		return allocated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementRelated createRequirementRelated() {
		RequirementRelatedImpl requirementRelated = new RequirementRelatedImpl();
		return requirementRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated createDeprecated() {
		DeprecatedImpl deprecated = new DeprecatedImpl();
		return deprecated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeprecatedelementsPackage getDeprecatedelementsPackage() {
		return (DeprecatedelementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeprecatedelementsPackage getPackage() {
		return DeprecatedelementsPackage.eINSTANCE;
	}

} //DeprecatedelementsFactoryImpl
