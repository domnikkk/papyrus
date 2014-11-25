/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Laurent Wouters laurent.wouters@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.viewpoints.configuration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.papyrus.infra.viewpoints.configuration.*;
import org.eclipse.papyrus.infra.viewpoints.configuration.Category;
import org.eclipse.papyrus.infra.viewpoints.configuration.ChildRule;
import org.eclipse.papyrus.infra.viewpoints.configuration.ConfigurationFactory;
import org.eclipse.papyrus.infra.viewpoints.configuration.ConfigurationPackage;
import org.eclipse.papyrus.infra.viewpoints.configuration.ModelAutoCreate;
import org.eclipse.papyrus.infra.viewpoints.configuration.ModelRule;
import org.eclipse.papyrus.infra.viewpoints.configuration.OwningRule;
import org.eclipse.papyrus.infra.viewpoints.configuration.PaletteRule;
import org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusConfiguration;
import org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusDiagram;
import org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusSyncTable;
import org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusTable;
import org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusView;
import org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusViewpoint;
import org.eclipse.papyrus.infra.viewpoints.configuration.PathElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationFactoryImpl extends EFactoryImpl implements ConfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigurationFactory init() {
		try {
			ConfigurationFactory theConfigurationFactory = (ConfigurationFactory)EPackage.Registry.INSTANCE.getEFactory(ConfigurationPackage.eNS_URI);
			if (theConfigurationFactory != null) {
				return theConfigurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationFactoryImpl() {
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
			case ConfigurationPackage.PAPYRUS_CONFIGURATION: return createPapyrusConfiguration();
			case ConfigurationPackage.PAPYRUS_VIEWPOINT: return createPapyrusViewpoint();
			case ConfigurationPackage.PAPYRUS_VIEW: return createPapyrusView();
			case ConfigurationPackage.PAPYRUS_DIAGRAM: return createPapyrusDiagram();
			case ConfigurationPackage.PAPYRUS_SYNC_TABLE: return createPapyrusSyncTable();
			case ConfigurationPackage.PAPYRUS_TABLE: return createPapyrusTable();
			case ConfigurationPackage.MODEL_RULE: return createModelRule();
			case ConfigurationPackage.OWNING_RULE: return createOwningRule();
			case ConfigurationPackage.CHILD_RULE: return createChildRule();
			case ConfigurationPackage.PALETTE_RULE: return createPaletteRule();
			case ConfigurationPackage.PATH_ELEMENT: return createPathElement();
			case ConfigurationPackage.CATEGORY: return createCategory();
			case ConfigurationPackage.MODEL_AUTO_CREATE: return createModelAutoCreate();
			case ConfigurationPackage.ROOT_AUTO_SELECT: return createRootAutoSelect();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PapyrusConfiguration createPapyrusConfiguration() {
		PapyrusConfigurationImpl papyrusConfiguration = new PapyrusConfigurationImpl();
		return papyrusConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PapyrusViewpoint createPapyrusViewpoint() {
		PapyrusViewpointImpl papyrusViewpoint = new PapyrusViewpointImpl();
		return papyrusViewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PapyrusView createPapyrusView() {
		PapyrusViewImpl papyrusView = new PapyrusViewImpl();
		return papyrusView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PapyrusDiagram createPapyrusDiagram() {
		PapyrusDiagramImpl papyrusDiagram = new PapyrusDiagramImpl();
		return papyrusDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PapyrusSyncTable createPapyrusSyncTable() {
		PapyrusSyncTableImpl papyrusSyncTable = new PapyrusSyncTableImpl();
		return papyrusSyncTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PapyrusTable createPapyrusTable() {
		PapyrusTableImpl papyrusTable = new PapyrusTableImpl();
		return papyrusTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRule createModelRule() {
		ModelRuleImpl modelRule = new ModelRuleImpl();
		return modelRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwningRule createOwningRule() {
		OwningRuleImpl owningRule = new OwningRuleImpl();
		return owningRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildRule createChildRule() {
		ChildRuleImpl childRule = new ChildRuleImpl();
		return childRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaletteRule createPaletteRule() {
		PaletteRuleImpl paletteRule = new PaletteRuleImpl();
		return paletteRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathElement createPathElement() {
		PathElementImpl pathElement = new PathElementImpl();
		return pathElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAutoCreate createModelAutoCreate() {
		ModelAutoCreateImpl modelAutoCreate = new ModelAutoCreateImpl();
		return modelAutoCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootAutoSelect createRootAutoSelect() {
		RootAutoSelectImpl rootAutoSelect = new RootAutoSelectImpl();
		return rootAutoSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPackage getConfigurationPackage() {
		return (ConfigurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfigurationPackage getPackage() {
		return ConfigurationPackage.eINSTANCE;
	}

} // ConfigurationFactoryImpl
