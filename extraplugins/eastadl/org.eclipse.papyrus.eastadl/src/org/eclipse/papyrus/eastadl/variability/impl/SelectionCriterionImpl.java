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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatype;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAElementImpl;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAExpression;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.ValuesPackage;
import org.eclipse.papyrus.eastadl.variability.SelectionCriterion;
import org.eclipse.papyrus.eastadl.variability.VariabilityPackage;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.ValueSpecification;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.variability.impl.SelectionCriterionImpl#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.variability.impl.SelectionCriterionImpl#getBase_ValueSpecification <em>Base Value Specification</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.variability.impl.SelectionCriterionImpl#getSource <em>Source</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.variability.impl.SelectionCriterionImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectionCriterionImpl extends EAElementImpl implements SelectionCriterion {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EADatatype type;

	/**
	 * The cached value of the '{@link #getBase_ValueSpecification() <em>Base Value Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBase_ValueSpecification()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification base_ValueSpecification;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> source;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected SelectionCriterionImpl() {
		super();
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
		case VariabilityPackage.SELECTION_CRITERION__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case VariabilityPackage.SELECTION_CRITERION__BASE_VALUE_SPECIFICATION:
			if (resolve)
				return getBase_ValueSpecification();
			return basicGetBase_ValueSpecification();
		case VariabilityPackage.SELECTION_CRITERION__SOURCE:
			return getSource();
		case VariabilityPackage.SELECTION_CRITERION__BASE_CLASS:
			if (resolve)
				return getBase_Class();
			return basicGetBase_Class();
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
		case VariabilityPackage.SELECTION_CRITERION__TYPE:
			return type != null;
		case VariabilityPackage.SELECTION_CRITERION__BASE_VALUE_SPECIFICATION:
			return base_ValueSpecification != null;
		case VariabilityPackage.SELECTION_CRITERION__SOURCE:
			return source != null && !source.isEmpty();
		case VariabilityPackage.SELECTION_CRITERION__BASE_CLASS:
			return base_Class != null;
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
		if (baseClass == EAValue.class) {
			switch (derivedFeatureID) {
			case VariabilityPackage.SELECTION_CRITERION__TYPE:
				return ValuesPackage.EA_VALUE__TYPE;
			case VariabilityPackage.SELECTION_CRITERION__BASE_VALUE_SPECIFICATION:
				return ValuesPackage.EA_VALUE__BASE_VALUE_SPECIFICATION;
			default:
				return -1;
			}
		}
		if (baseClass == EAExpression.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == EAValue.class) {
			switch (baseFeatureID) {
			case ValuesPackage.EA_VALUE__TYPE:
				return VariabilityPackage.SELECTION_CRITERION__TYPE;
			case ValuesPackage.EA_VALUE__BASE_VALUE_SPECIFICATION:
				return VariabilityPackage.SELECTION_CRITERION__BASE_VALUE_SPECIFICATION;
			default:
				return -1;
			}
		}
		if (baseClass == EAExpression.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		case VariabilityPackage.SELECTION_CRITERION__TYPE:
			setType((EADatatype) newValue);
			return;
		case VariabilityPackage.SELECTION_CRITERION__BASE_VALUE_SPECIFICATION:
			setBase_ValueSpecification((ValueSpecification) newValue);
			return;
		case VariabilityPackage.SELECTION_CRITERION__SOURCE:
			getSource().clear();
			getSource().addAll((Collection<? extends NamedElement>) newValue);
			return;
		case VariabilityPackage.SELECTION_CRITERION__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) newValue);
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
		return VariabilityPackage.Literals.SELECTION_CRITERION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EADatatype getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (EADatatype) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariabilityPackage.SELECTION_CRITERION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EADatatype basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setType(EADatatype newType) {
		EADatatype oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.SELECTION_CRITERION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ValueSpecification getBase_ValueSpecification() {
		if (base_ValueSpecification != null && base_ValueSpecification.eIsProxy()) {
			InternalEObject oldBase_ValueSpecification = (InternalEObject) base_ValueSpecification;
			base_ValueSpecification = (ValueSpecification) eResolveProxy(oldBase_ValueSpecification);
			if (base_ValueSpecification != oldBase_ValueSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariabilityPackage.SELECTION_CRITERION__BASE_VALUE_SPECIFICATION, oldBase_ValueSpecification, base_ValueSpecification));
			}
		}
		return base_ValueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ValueSpecification basicGetBase_ValueSpecification() {
		return base_ValueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setBase_ValueSpecification(ValueSpecification newBase_ValueSpecification) {
		ValueSpecification oldBase_ValueSpecification = base_ValueSpecification;
		base_ValueSpecification = newBase_ValueSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.SELECTION_CRITERION__BASE_VALUE_SPECIFICATION, oldBase_ValueSpecification, base_ValueSpecification));
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
		case VariabilityPackage.SELECTION_CRITERION__TYPE:
			setType((EADatatype) null);
			return;
		case VariabilityPackage.SELECTION_CRITERION__BASE_VALUE_SPECIFICATION:
			setBase_ValueSpecification((ValueSpecification) null);
			return;
		case VariabilityPackage.SELECTION_CRITERION__SOURCE:
			getSource().clear();
			return;
		case VariabilityPackage.SELECTION_CRITERION__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<NamedElement> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, VariabilityPackage.SELECTION_CRITERION__SOURCE);
		}
		return source;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariabilityPackage.SELECTION_CRITERION__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.SELECTION_CRITERION__BASE_CLASS, oldBase_Class, base_Class));
	}

} // SelectionCriterionImpl
