/**
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AxisIndexStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AxisManagerConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AxisManagerRepresentation;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.EStructuralFeatureValueFillingConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.FeatureAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.IPasteConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.LocalTableHeaderAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.NattableaxisconfigurationFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.NattableaxisconfigurationPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.PasteEObjectConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TableHeaderAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TreeFillingConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NattableaxisconfigurationFactoryImpl extends EFactoryImpl implements NattableaxisconfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static NattableaxisconfigurationFactory init() {
		try {
			NattableaxisconfigurationFactory theNattableaxisconfigurationFactory = (NattableaxisconfigurationFactory) EPackage.Registry.INSTANCE.getEFactory(NattableaxisconfigurationPackage.eNS_URI);
			if (theNattableaxisconfigurationFactory != null) {
				return theNattableaxisconfigurationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NattableaxisconfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NattableaxisconfigurationFactoryImpl() {
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
		case NattableaxisconfigurationPackage.AXIS_MANAGER_REPRESENTATION:
			return createAxisManagerRepresentation();
		case NattableaxisconfigurationPackage.AXIS_MANAGER_CONFIGURATION:
			return createAxisManagerConfiguration();
		case NattableaxisconfigurationPackage.TABLE_HEADER_AXIS_CONFIGURATION:
			return createTableHeaderAxisConfiguration();
		case NattableaxisconfigurationPackage.LOCAL_TABLE_HEADER_AXIS_CONFIGURATION:
			return createLocalTableHeaderAxisConfiguration();
		case NattableaxisconfigurationPackage.FEATURE_AXIS_CONFIGURATION:
			return createFeatureAxisConfiguration();
		case NattableaxisconfigurationPackage.ESTRUCTURAL_FEATURE_VALUE_FILLING_CONFIGURATION:
			return createEStructuralFeatureValueFillingConfiguration();
		case NattableaxisconfigurationPackage.IPASTE_CONFIGURATION:
			return createIPasteConfiguration();
		case NattableaxisconfigurationPackage.PASTE_EOBJECT_CONFIGURATION:
			return createPasteEObjectConfiguration();
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION:
			return createTreeFillingConfiguration();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case NattableaxisconfigurationPackage.AXIS_INDEX_STYLE:
			return createAxisIndexStyleFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case NattableaxisconfigurationPackage.AXIS_INDEX_STYLE:
			return convertAxisIndexStyleToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public AxisManagerRepresentation createAxisManagerRepresentation() {
		AxisManagerRepresentationImpl axisManagerRepresentation = new AxisManagerRepresentationImpl();
		return axisManagerRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public AxisManagerConfiguration createAxisManagerConfiguration() {
		AxisManagerConfigurationImpl axisManagerConfiguration = new AxisManagerConfigurationImpl();
		return axisManagerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TableHeaderAxisConfiguration createTableHeaderAxisConfiguration() {
		TableHeaderAxisConfigurationImpl tableHeaderAxisConfiguration = new TableHeaderAxisConfigurationImpl();
		return tableHeaderAxisConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public LocalTableHeaderAxisConfiguration createLocalTableHeaderAxisConfiguration() {
		LocalTableHeaderAxisConfigurationImpl localTableHeaderAxisConfiguration = new LocalTableHeaderAxisConfigurationImpl();
		return localTableHeaderAxisConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public FeatureAxisConfiguration createFeatureAxisConfiguration() {
		FeatureAxisConfigurationImpl featureAxisConfiguration = new FeatureAxisConfigurationImpl();
		return featureAxisConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EStructuralFeatureValueFillingConfiguration createEStructuralFeatureValueFillingConfiguration() {
		EStructuralFeatureValueFillingConfigurationImpl eStructuralFeatureValueFillingConfiguration = new EStructuralFeatureValueFillingConfigurationImpl();
		return eStructuralFeatureValueFillingConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public IPasteConfiguration createIPasteConfiguration() {
		IPasteConfigurationImpl iPasteConfiguration = new IPasteConfigurationImpl();
		return iPasteConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public PasteEObjectConfiguration createPasteEObjectConfiguration() {
		PasteEObjectConfigurationImpl pasteEObjectConfiguration = new PasteEObjectConfigurationImpl();
		return pasteEObjectConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TreeFillingConfiguration createTreeFillingConfiguration() {
		TreeFillingConfigurationImpl treeFillingConfiguration = new TreeFillingConfigurationImpl();
		return treeFillingConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public AxisIndexStyle createAxisIndexStyleFromString(EDataType eDataType, String initialValue) {
		AxisIndexStyle result = AxisIndexStyle.get(initialValue);
		if (result == null)
		{
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertAxisIndexStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NattableaxisconfigurationPackage getNattableaxisconfigurationPackage() {
		return (NattableaxisconfigurationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NattableaxisconfigurationPackage getPackage() {
		return NattableaxisconfigurationPackage.eINSTANCE;
	}

} // NattableaxisconfigurationFactoryImpl
