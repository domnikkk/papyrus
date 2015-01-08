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
package org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAType;
import org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ContextImpl;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentPrototype;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentType;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareConnector;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePin;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePort;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePortConnector;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLUtil;


/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Hardware Component Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl.HardwareComponentTypeImpl#getBase_Class <em>Base Class</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl.HardwareComponentTypeImpl#getConnector <em>Connector</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl.HardwareComponentTypeImpl#getPin <em>Pin</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl.HardwareComponentTypeImpl#getPart <em>Part</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl.HardwareComponentTypeImpl#getPortConnector <em>Port Connector</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl.HardwareComponentTypeImpl#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwareComponentTypeImpl extends ContextImpl implements HardwareComponentType {

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HardwareComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__BASE_CLASS:
			if (resolve)
				return getBase_Class();
			return basicGetBase_Class();
		case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__CONNECTOR:
			return getConnector();
		case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PIN:
			return getPin();
		case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PART:
			return getPart();
		case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PORT_CONNECTOR:
			return getPortConnector();
		case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PORT:
			return getPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__BASE_CLASS:
			return base_Class != null;
		case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__CONNECTOR:
			return !getConnector().isEmpty();
		case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PIN:
			return !getPin().isEmpty();
		case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PART:
			return !getPart().isEmpty();
		case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PORT_CONNECTOR:
			return !getPortConnector().isEmpty();
		case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PORT:
			return !getPort().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EAType.class) {
			switch (derivedFeatureID) {
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__BASE_CLASS:
				return ElementsPackage.EA_TYPE__BASE_CLASS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EAType.class) {
			switch (baseFeatureID) {
			case ElementsPackage.EA_TYPE__BASE_CLASS:
				return HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__BASE_CLASS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) newValue);
			return;
		case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PORT_CONNECTOR:
			getPortConnector().clear();
			getPortConnector().addAll((Collection<? extends HardwarePortConnector>) newValue);
			return;
		case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PORT:
			getPort().clear();
			getPort().addAll((Collection<? extends HardwarePort>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwaremodelingPackage.Literals.HARDWARE_COMPONENT_TYPE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) null);
			return;
		case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PORT_CONNECTOR:
			getPortConnector().clear();
			return;
		case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PORT:
			getPort().clear();
			return;
		case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PIN:
			getPin().clear();
		case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PART:
			getPart().clear();
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<HardwareConnector> getConnector() {
		EList<HardwareConnector> results = new BasicEList<HardwareConnector>();
		HardwareConnector currentHW = null;

		if (getBase_Class() != null) {
			Iterator<NamedElement> it = getBase_Class().getOwnedMembers().iterator();

			while (it.hasNext()) {
				NamedElement current = it.next();
				currentHW = UMLUtil.getStereotypeApplication(current, HardwareConnector.class);

				if (currentHW != null) {
					results.add(currentHW);
				}
			}
		}
		// Convert to InternalEList<?>
		return new BasicInternalEList<HardwareConnector>(HardwareConnector.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<HardwarePin> getPin() {
		EList<HardwarePin> results = new BasicEList<HardwarePin>();
		HardwarePin currentHW = null;

		if (getBase_Class() != null) {
			Iterator<Port> it = getBase_Class().getOwnedPorts().iterator();

			while (it.hasNext()) {
				Port current = it.next();
				currentHW = UMLUtil.getStereotypeApplication(current, HardwarePin.class);

				if (currentHW != null) {
					results.add(currentHW);
				}
			}
		}
		// Convert to InternalEList<?>
		return new BasicInternalEList<HardwarePin>(HardwarePin.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<HardwareComponentPrototype> getPart() {
		EList<HardwareComponentPrototype> results = new BasicEList<HardwareComponentPrototype>();
		HardwareComponentPrototype currentHW = null;

		if (getBase_Class() != null) {
			Iterator<Property> it = getBase_Class().getOwnedAttributes().iterator();

			while (it.hasNext()) {
				Property current = it.next();
				currentHW = UMLUtil.getStereotypeApplication(current,
						HardwareComponentPrototype.class);

				if (currentHW != null) {
					results.add(currentHW);
				}
			}
		}
		// Convert to InternalEList<?>
		return new BasicInternalEList<HardwareComponentPrototype>(HardwareComponentPrototype.class, results.size(),
				results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<HardwarePortConnector> getPortConnector() {
		EList<HardwarePortConnector> results = new BasicEList<HardwarePortConnector>();
		HardwarePortConnector currentHW = null;

		if (getBase_Class() != null) {
			Iterator<NamedElement> it = getBase_Class().getOwnedMembers().iterator();

			while (it.hasNext()) {
				NamedElement current = it.next();
				currentHW = UMLUtil.getStereotypeApplication(current, HardwarePortConnector.class);

				if (currentHW != null) {
					results.add(currentHW);
				}
			}
		}
		// Convert to InternalEList<?>
		return new BasicInternalEList<HardwarePortConnector>(HardwarePortConnector.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<HardwarePort> getPort() {
		EList<HardwarePort> results = new BasicEList<HardwarePort>();
		HardwarePort currentHW = null;

		if (getBase_Class() != null) {
			Iterator<Port> it = getBase_Class().getOwnedPorts().iterator();

			while (it.hasNext()) {
				Port current = it.next();
				currentHW = UMLUtil.getStereotypeApplication(current, HardwarePort.class);

				if (currentHW != null) {
					results.add(currentHW);
				}
			}
		}
		// Convert to InternalEList<?>
		return new BasicInternalEList<HardwarePort>(HardwarePort.class, results.size(), results.toArray());
	}

} // HardwareComponentTypeImpl
