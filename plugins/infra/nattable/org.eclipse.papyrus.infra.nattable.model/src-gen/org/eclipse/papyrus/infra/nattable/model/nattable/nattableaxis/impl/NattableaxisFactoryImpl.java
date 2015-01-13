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
package org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.AxisGroup;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EObjectAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EObjectTreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EStructuralFeatureAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EStructuralFeatureTreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.FeatureIdAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.FeatureIdTreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.FeatureTreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IdTreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.NattableaxisFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.NattableaxisPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ObjectIdAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ObjectIdTreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ObjectTreeItemAxis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NattableaxisFactoryImpl extends EFactoryImpl implements NattableaxisFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static NattableaxisFactory init() {
		try {
			NattableaxisFactory theNattableaxisFactory = (NattableaxisFactory) EPackage.Registry.INSTANCE.getEFactory(NattableaxisPackage.eNS_URI);
			if (theNattableaxisFactory != null) {
				return theNattableaxisFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NattableaxisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NattableaxisFactoryImpl() {
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
		case NattableaxisPackage.ID_TREE_ITEM_AXIS:
			return createIdTreeItemAxis();
		case NattableaxisPackage.EOBJECT_AXIS:
			return createEObjectAxis();
		case NattableaxisPackage.EOBJECT_TREE_ITEM_AXIS:
			return createEObjectTreeItemAxis();
		case NattableaxisPackage.FEATURE_TREE_ITEM_AXIS:
			return createFeatureTreeItemAxis();
		case NattableaxisPackage.OBJECT_TREE_ITEM_AXIS:
			return createObjectTreeItemAxis();
		case NattableaxisPackage.FEATURE_ID_AXIS:
			return createFeatureIdAxis();
		case NattableaxisPackage.FEATURE_ID_TREE_ITEM_AXIS:
			return createFeatureIdTreeItemAxis();
		case NattableaxisPackage.ESTRUCTURAL_FEATURE_AXIS:
			return createEStructuralFeatureAxis();
		case NattableaxisPackage.ESTRUCTURAL_FEATURE_TREE_ITEM_AXIS:
			return createEStructuralFeatureTreeItemAxis();
		case NattableaxisPackage.OBJECT_ID_AXIS:
			return createObjectIdAxis();
		case NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS:
			return createObjectIdTreeItemAxis();
		case NattableaxisPackage.AXIS_GROUP:
			return createAxisGroup();
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
	public IdTreeItemAxis createIdTreeItemAxis() {
		IdTreeItemAxisImpl idTreeItemAxis = new IdTreeItemAxisImpl();
		return idTreeItemAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObjectAxis createEObjectAxis() {
		EObjectAxisImpl eObjectAxis = new EObjectAxisImpl();
		return eObjectAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObjectTreeItemAxis createEObjectTreeItemAxis() {
		EObjectTreeItemAxisImpl eObjectTreeItemAxis = new EObjectTreeItemAxisImpl();
		return eObjectTreeItemAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public FeatureTreeItemAxis createFeatureTreeItemAxis() {
		FeatureTreeItemAxisImpl featureTreeItemAxis = new FeatureTreeItemAxisImpl();
		return featureTreeItemAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ObjectTreeItemAxis createObjectTreeItemAxis() {
		ObjectTreeItemAxisImpl objectTreeItemAxis = new ObjectTreeItemAxisImpl();
		return objectTreeItemAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public FeatureIdAxis createFeatureIdAxis() {
		FeatureIdAxisImpl featureIdAxis = new FeatureIdAxisImpl();
		return featureIdAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public FeatureIdTreeItemAxis createFeatureIdTreeItemAxis() {
		FeatureIdTreeItemAxisImpl featureIdTreeItemAxis = new FeatureIdTreeItemAxisImpl();
		return featureIdTreeItemAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EStructuralFeatureAxis createEStructuralFeatureAxis() {
		EStructuralFeatureAxisImpl eStructuralFeatureAxis = new EStructuralFeatureAxisImpl();
		return eStructuralFeatureAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EStructuralFeatureTreeItemAxis createEStructuralFeatureTreeItemAxis() {
		EStructuralFeatureTreeItemAxisImpl eStructuralFeatureTreeItemAxis = new EStructuralFeatureTreeItemAxisImpl();
		return eStructuralFeatureTreeItemAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ObjectIdAxis createObjectIdAxis() {
		ObjectIdAxisImpl objectIdAxis = new ObjectIdAxisImpl();
		return objectIdAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ObjectIdTreeItemAxis createObjectIdTreeItemAxis() {
		ObjectIdTreeItemAxisImpl objectIdTreeItemAxis = new ObjectIdTreeItemAxisImpl();
		return objectIdTreeItemAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public AxisGroup createAxisGroup() {
		AxisGroupImpl axisGroup = new AxisGroupImpl();
		return axisGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NattableaxisPackage getNattableaxisPackage() {
		return (NattableaxisPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NattableaxisPackage getPackage() {
		return NattableaxisPackage.eINSTANCE;
	}

} // NattableaxisFactoryImpl
