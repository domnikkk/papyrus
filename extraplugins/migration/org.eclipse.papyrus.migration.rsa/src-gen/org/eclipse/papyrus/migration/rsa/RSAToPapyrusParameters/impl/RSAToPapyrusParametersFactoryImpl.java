/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.*;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersFactory;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersPackage;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.URIMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RSAToPapyrusParametersFactoryImpl extends EFactoryImpl implements RSAToPapyrusParametersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static RSAToPapyrusParametersFactory init() {
		try {
			RSAToPapyrusParametersFactory theRSAToPapyrusParametersFactory = (RSAToPapyrusParametersFactory) EPackage.Registry.INSTANCE.getEFactory(RSAToPapyrusParametersPackage.eNS_URI);
			if (theRSAToPapyrusParametersFactory != null) {
				return theRSAToPapyrusParametersFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RSAToPapyrusParametersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public RSAToPapyrusParametersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RSAToPapyrusParametersPackage.CONFIG:
			return createConfig();
		case RSAToPapyrusParametersPackage.MAPPING_PARAMETERS:
			return createMappingParameters();
		case RSAToPapyrusParametersPackage.URI_MAPPING:
			return createURIMapping();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Config createConfig() {
		ConfigImpl config = new ConfigImpl();
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public MappingParameters createMappingParameters() {
		MappingParametersImpl mappingParameters = new MappingParametersImpl();
		return mappingParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public URIMapping createURIMapping() {
		URIMappingImpl uriMapping = new URIMappingImpl();
		return uriMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public RSAToPapyrusParametersPackage getRSAToPapyrusParametersPackage() {
		return (RSAToPapyrusParametersPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RSAToPapyrusParametersPackage getPackage() {
		return RSAToPapyrusParametersPackage.eINSTANCE;
	}

} // RSAToPapyrusParametersFactoryImpl
