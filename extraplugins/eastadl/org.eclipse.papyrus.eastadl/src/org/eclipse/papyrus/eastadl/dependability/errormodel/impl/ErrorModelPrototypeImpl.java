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
package org.eclipse.papyrus.eastadl.dependability.errormodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrorModelPrototype;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrorModelType;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrormodelPackage;
import org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_functionTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_hwTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAPrototype;
import org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAElementImpl;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;


/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Error Model Prototype</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.impl.ErrorModelPrototypeImpl#getBase_Property <em>Base Property</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.impl.ErrorModelPrototypeImpl#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.impl.ErrorModelPrototypeImpl#getTarget <em>Target</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.impl.ErrorModelPrototypeImpl#getFunctionTarget <em>Function Target</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.impl.ErrorModelPrototypeImpl#getHwTarget <em>Hw Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorModelPrototypeImpl extends EAElementImpl implements ErrorModelPrototype {

	/**
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected Property base_Property;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected NamedElement target;

	/**
	 * The cached value of the '{@link #getFunctionTarget() <em>Function Target</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getFunctionTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorModelPrototype_functionTargetInstanceRef> functionTarget;

	/**
	 * The cached value of the '{@link #getHwTarget() <em>Hw Target</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getHwTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorModelPrototype_hwTargetInstanceRef> hwTarget;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ErrorModelPrototypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NamedElement basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public ErrorModelType basicGetType() {

		ErrorModelType type = null;

		if (getBase_Property() != null) {
			// Retrieve the type of the
			Type basicType = getBase_Property().getType();

			if (basicType != null) {
				type = UMLUtil.getStereotypeApplication(basicType, ErrorModelType.class);
			}
		}

		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__BASE_PROPERTY:
			if (resolve)
				return getBase_Property();
			return basicGetBase_Property();
		case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__FUNCTION_TARGET:
			return getFunctionTarget();
		case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__HW_TARGET:
			return getHwTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__FUNCTION_TARGET:
			return ((InternalEList<?>) getFunctionTarget()).basicRemove(otherEnd, msgs);
		case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__HW_TARGET:
			return ((InternalEList<?>) getHwTarget()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__BASE_PROPERTY:
			return base_Property != null;
		case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__TYPE:
			return basicGetType() != null;
		case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__TARGET:
			return target != null;
		case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__FUNCTION_TARGET:
			return functionTarget != null && !functionTarget.isEmpty();
		case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__HW_TARGET:
			return hwTarget != null && !hwTarget.isEmpty();
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
		if (baseClass == EAPrototype.class) {
			switch (derivedFeatureID) {
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__BASE_PROPERTY:
				return ElementsPackage.EA_PROTOTYPE__BASE_PROPERTY;
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
		if (baseClass == EAPrototype.class) {
			switch (baseFeatureID) {
			case ElementsPackage.EA_PROTOTYPE__BASE_PROPERTY:
				return ErrormodelPackage.ERROR_MODEL_PROTOTYPE__BASE_PROPERTY;
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
		case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__BASE_PROPERTY:
			setBase_Property((Property) newValue);
			return;
		case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__TARGET:
			setTarget((NamedElement) newValue);
			return;
		case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__FUNCTION_TARGET:
			getFunctionTarget().clear();
			getFunctionTarget().addAll((Collection<? extends ErrorModelPrototype_functionTargetInstanceRef>) newValue);
			return;
		case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__HW_TARGET:
			getHwTarget().clear();
			getHwTarget().addAll((Collection<? extends ErrorModelPrototype_hwTargetInstanceRef>) newValue);
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
		return ErrormodelPackage.Literals.ERROR_MODEL_PROTOTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject) base_Property;
			base_Property = (Property) eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrormodelPackage.ERROR_MODEL_PROTOTYPE__BASE_PROPERTY, oldBase_Property, base_Property));
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Property basicGetBase_Property() {
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setBase_Property(Property newBase_Property) {
		Property oldBase_Property = base_Property;
		base_Property = newBase_Property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrormodelPackage.ERROR_MODEL_PROTOTYPE__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__BASE_PROPERTY:
			setBase_Property((Property) null);
			return;
		case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__TARGET:
			setTarget((NamedElement) null);
			return;
		case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__FUNCTION_TARGET:
			getFunctionTarget().clear();
			return;
		case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__HW_TARGET:
			getHwTarget().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<ErrorModelPrototype_functionTargetInstanceRef> getFunctionTarget() {
		if (functionTarget == null) {
			functionTarget = new EObjectContainmentEList<ErrorModelPrototype_functionTargetInstanceRef>(ErrorModelPrototype_functionTargetInstanceRef.class, this, ErrormodelPackage.ERROR_MODEL_PROTOTYPE__FUNCTION_TARGET);
		}
		return functionTarget;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<ErrorModelPrototype_hwTargetInstanceRef> getHwTarget() {
		if (hwTarget == null) {
			hwTarget = new EObjectContainmentEList<ErrorModelPrototype_hwTargetInstanceRef>(ErrorModelPrototype_hwTargetInstanceRef.class, this, ErrormodelPackage.ERROR_MODEL_PROTOTYPE__HW_TARGET);
		}
		return hwTarget;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NamedElement getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (NamedElement) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrormodelPackage.ERROR_MODEL_PROTOTYPE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ErrorModelType getType() {
		ErrorModelType type = basicGetType();
		return type != null && type.eIsProxy() ? (ErrorModelType) eResolveProxy((InternalEObject) type) : type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setTarget(NamedElement newTarget) {
		NamedElement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrormodelPackage.ERROR_MODEL_PROTOTYPE__TARGET, oldTarget, target));
	}

} // ErrorModelPrototypeImpl
