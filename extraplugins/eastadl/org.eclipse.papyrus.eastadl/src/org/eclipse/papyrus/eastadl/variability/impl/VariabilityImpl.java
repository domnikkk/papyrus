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
package org.eclipse.papyrus.eastadl.variability.impl;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ContextImpl;
import org.eclipse.papyrus.eastadl.structure.featuremodeling.FeatureModel;
import org.eclipse.papyrus.eastadl.variability.ConfigurableContainer;
import org.eclipse.papyrus.eastadl.variability.FeatureConfiguration;
import org.eclipse.papyrus.eastadl.variability.Variability;
import org.eclipse.papyrus.eastadl.variability.VariabilityPackage;
import org.eclipse.papyrus.eastadl.variability.VariableElement;
import org.eclipse.papyrus.eastadl.variability.VehicleLevelBinding;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.variability.impl.VariabilityImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.variability.impl.VariabilityImpl#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.variability.impl.VariabilityImpl#getConfigurableContainer <em>Configurable Container</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.variability.impl.VariabilityImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.variability.impl.VariabilityImpl#getProductFeatureModel <em>Product Feature Model</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.variability.impl.VariabilityImpl#getDecisionModel <em>Decision Model</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.variability.impl.VariabilityImpl#getVariableElement <em>Variable Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariabilityImpl extends ContextImpl implements Variability {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getBase_Package() <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Package()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Package base_Package;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VariabilityPackage.VARIABILITY__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case VariabilityPackage.VARIABILITY__BASE_PACKAGE:
				if (resolve) return getBase_Package();
				return basicGetBase_Package();
			case VariabilityPackage.VARIABILITY__CONFIGURABLE_CONTAINER:
				return getConfigurableContainer();
			case VariabilityPackage.VARIABILITY__CONFIGURATION:
				return getConfiguration();
			case VariabilityPackage.VARIABILITY__PRODUCT_FEATURE_MODEL:
				return getProductFeatureModel();
			case VariabilityPackage.VARIABILITY__DECISION_MODEL:
				return getDecisionModel();
			case VariabilityPackage.VARIABILITY__VARIABLE_ELEMENT:
				return getVariableElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VariabilityPackage.VARIABILITY__BASE_CLASS:
				return base_Class != null;
			case VariabilityPackage.VARIABILITY__BASE_PACKAGE:
				return base_Package != null;
			case VariabilityPackage.VARIABILITY__CONFIGURABLE_CONTAINER:
				return !getConfigurableContainer().isEmpty();
			case VariabilityPackage.VARIABILITY__CONFIGURATION:
				return !getConfiguration().isEmpty();
			case VariabilityPackage.VARIABILITY__PRODUCT_FEATURE_MODEL:
				return !getProductFeatureModel().isEmpty();
			case VariabilityPackage.VARIABILITY__DECISION_MODEL:
				return !getDecisionModel().isEmpty();
			case VariabilityPackage.VARIABILITY__VARIABLE_ELEMENT:
				return !getVariableElement().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VariabilityPackage.VARIABILITY__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case VariabilityPackage.VARIABILITY__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.VARIABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariabilityPackage.VARIABILITY__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.VARIABILITY__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getBase_Package() {
		if (base_Package != null && base_Package.eIsProxy()) {
			InternalEObject oldBase_Package = (InternalEObject)base_Package;
			base_Package = (org.eclipse.uml2.uml.Package)eResolveProxy(oldBase_Package);
			if (base_Package != oldBase_Package) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariabilityPackage.VARIABILITY__BASE_PACKAGE, oldBase_Package, base_Package));
			}
		}
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package basicGetBase_Package() {
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Package(org.eclipse.uml2.uml.Package newBase_Package) {
		org.eclipse.uml2.uml.Package oldBase_Package = base_Package;
		base_Package = newBase_Package;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.VARIABILITY__BASE_PACKAGE, oldBase_Package, base_Package));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VariabilityPackage.VARIABILITY__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case VariabilityPackage.VARIABILITY__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ConfigurableContainer> getConfigurableContainer() {
		EList<ConfigurableContainer> results = new BasicEList<ConfigurableContainer>();
		ConfigurableContainer adlBehavior = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();
			
			while (it.hasNext()) {
				Element element = it.next();
				adlBehavior = (ConfigurableContainer )UMLUtil.getStereotypeApplication(element, ConfigurableContainer.class);
				if (adlBehavior != null)
					results.add(adlBehavior);
			}
		}
		
		return new BasicInternalEList<ConfigurableContainer>(ConfigurableContainer.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<FeatureConfiguration> getConfiguration() {
		EList<FeatureConfiguration> results = new BasicEList<FeatureConfiguration>();
		FeatureConfiguration adlBehavior = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();
			
			while (it.hasNext()) {
				Element element = it.next();
				adlBehavior = (FeatureConfiguration )UMLUtil.getStereotypeApplication(element, FeatureConfiguration.class);
				if (adlBehavior != null)
					results.add(adlBehavior);
			}
		}
		
		return new BasicInternalEList<FeatureConfiguration>(FeatureConfiguration.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<VehicleLevelBinding> getDecisionModel() {
		EList<VehicleLevelBinding> results = new BasicEList<VehicleLevelBinding>();
		VehicleLevelBinding adlBehavior = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();
			
			while (it.hasNext()) {
				Element element = it.next();
				adlBehavior = (VehicleLevelBinding )UMLUtil.getStereotypeApplication(element, VehicleLevelBinding.class);
				if (adlBehavior != null)
					results.add(adlBehavior);
			}
		}
		
		return new BasicInternalEList<VehicleLevelBinding>(VehicleLevelBinding.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<FeatureModel> getProductFeatureModel() {
		EList<FeatureModel> results = new BasicEList<FeatureModel>();
		FeatureModel adlBehavior = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();
			
			while (it.hasNext()) {
				Element element = it.next();
				adlBehavior = (FeatureModel )UMLUtil.getStereotypeApplication(element, FeatureModel.class);
				if (adlBehavior != null)
					results.add(adlBehavior);
			}
		}
		
		return new BasicInternalEList<FeatureModel>(FeatureModel.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<VariableElement> getVariableElement() {
		EList<VariableElement> results = new BasicEList<VariableElement>();
		VariableElement adlBehavior = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();
			
			while (it.hasNext()) {
				Element element = it.next();
				adlBehavior = (VariableElement )UMLUtil.getStereotypeApplication(element, VariableElement.class);
				if (adlBehavior != null)
					results.add(adlBehavior);
			}
		}
		
		return new BasicInternalEList<VariableElement>(VariableElement.class, results.size(), results.toArray());
	}

} //VariabilityImpl
