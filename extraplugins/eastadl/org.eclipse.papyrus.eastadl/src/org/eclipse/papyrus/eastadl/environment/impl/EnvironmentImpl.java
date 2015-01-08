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
package org.eclipse.papyrus.eastadl.environment.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.papyrus.eastadl.environment.ClampConnector;
import org.eclipse.papyrus.eastadl.environment.Environment;
import org.eclipse.papyrus.eastadl.environment.EnvironmentPackage;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ContextImpl;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPrototype;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.util.UMLUtil;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.environment.impl.EnvironmentImpl#getEnvironmentModel <em>Environment Model</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.environment.impl.EnvironmentImpl#getClampConnector <em>Clamp Connector</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.environment.impl.EnvironmentImpl#getBase_Class <em>Base Class</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.environment.impl.EnvironmentImpl#getBase_Package <em>Base Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvironmentImpl extends ContextImpl implements Environment {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getBase_Package() <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBase_Package()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Package base_Package;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public FunctionPrototype basicGetEnvironmentModel() {
		FunctionPrototype adlFunctionPrototype = null;

		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();
			while (it.hasNext()) {
				Element element = it.next();
				adlFunctionPrototype = UMLUtil.getStereotypeApplication(element, FunctionPrototype.class);
				if (adlFunctionPrototype != null) {
					return adlFunctionPrototype;
				}
			}
		}

		return adlFunctionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EnvironmentPackage.ENVIRONMENT__ENVIRONMENT_MODEL:
			if (resolve)
				return getEnvironmentModel();
			return basicGetEnvironmentModel();
		case EnvironmentPackage.ENVIRONMENT__CLAMP_CONNECTOR:
			return getClampConnector();
		case EnvironmentPackage.ENVIRONMENT__BASE_CLASS:
			if (resolve)
				return getBase_Class();
			return basicGetBase_Class();
		case EnvironmentPackage.ENVIRONMENT__BASE_PACKAGE:
			if (resolve)
				return getBase_Package();
			return basicGetBase_Package();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EnvironmentPackage.ENVIRONMENT__ENVIRONMENT_MODEL:
			return basicGetEnvironmentModel() != null;
		case EnvironmentPackage.ENVIRONMENT__CLAMP_CONNECTOR:
			return !getClampConnector().isEmpty();
		case EnvironmentPackage.ENVIRONMENT__BASE_CLASS:
			return base_Class != null;
		case EnvironmentPackage.ENVIRONMENT__BASE_PACKAGE:
			return base_Package != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EnvironmentPackage.ENVIRONMENT__ENVIRONMENT_MODEL:
			setEnvironmentModel((FunctionPrototype) newValue);
			return;
		case EnvironmentPackage.ENVIRONMENT__CLAMP_CONNECTOR:
			getClampConnector().clear();
			getClampConnector().addAll((Collection<? extends ClampConnector>) newValue);
			return;
		case EnvironmentPackage.ENVIRONMENT__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) newValue);
			return;
		case EnvironmentPackage.ENVIRONMENT__BASE_PACKAGE:
			setBase_Package((org.eclipse.uml2.uml.Package) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EnvironmentPackage.ENVIRONMENT__ENVIRONMENT_MODEL:
			setEnvironmentModel((FunctionPrototype) null);
			return;
		case EnvironmentPackage.ENVIRONMENT__CLAMP_CONNECTOR:
			getClampConnector().clear();
			return;
		case EnvironmentPackage.ENVIRONMENT__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) null);
			return;
		case EnvironmentPackage.ENVIRONMENT__BASE_PACKAGE:
			setBase_Package((org.eclipse.uml2.uml.Package) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<ClampConnector> getClampConnector() {
		EList<ClampConnector> results = new BasicEList<ClampConnector>();
		ClampConnector clampConnector = null;

		if (getBase_Class() != null) {
			Iterator<Port> it = getBase_Class().getOwnedPorts().iterator();

			while (it.hasNext()) {
				Port current = it.next();
				clampConnector = UMLUtil.getStereotypeApplication(current, ClampConnector.class);

				if (clampConnector != null) {
					results.add(clampConnector);
				}
			}
		}
		// Convert to InternalEList<?>
		return new BasicInternalEList<ClampConnector>(ClampConnector.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject) base_Class;
			base_Class = (org.eclipse.uml2.uml.Class) eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnvironmentPackage.ENVIRONMENT__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.ENVIRONMENT__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public org.eclipse.uml2.uml.Package getBase_Package() {
		if (base_Package != null && base_Package.eIsProxy()) {
			InternalEObject oldBase_Package = (InternalEObject) base_Package;
			base_Package = (org.eclipse.uml2.uml.Package) eResolveProxy(oldBase_Package);
			if (base_Package != oldBase_Package) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnvironmentPackage.ENVIRONMENT__BASE_PACKAGE, oldBase_Package, base_Package));
			}
		}
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package basicGetBase_Package() {
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setBase_Package(org.eclipse.uml2.uml.Package newBase_Package) {
		org.eclipse.uml2.uml.Package oldBase_Package = base_Package;
		base_Package = newBase_Package;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.ENVIRONMENT__BASE_PACKAGE, oldBase_Package, base_Package));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public FunctionPrototype getEnvironmentModel() {
		FunctionPrototype environmentModel = basicGetEnvironmentModel();
		return environmentModel != null && environmentModel.eIsProxy() ? (FunctionPrototype) eResolveProxy((InternalEObject) environmentModel) : environmentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setEnvironmentModel(FunctionPrototype newEnvironmentModel) {
		// TODO: implement this method to set the 'Environment Model' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // EnvironmentImpl
