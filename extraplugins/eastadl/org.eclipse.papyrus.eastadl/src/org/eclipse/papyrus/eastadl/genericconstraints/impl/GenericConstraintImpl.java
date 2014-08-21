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
package org.eclipse.papyrus.eastadl.genericconstraints.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.behavior.Mode;
import org.eclipse.papyrus.eastadl.genericconstraints.GenericConstraint;
import org.eclipse.papyrus.eastadl.genericconstraints.GenericConstraintKind;
import org.eclipse.papyrus.eastadl.genericconstraints.GenericconstraintsPackage;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.TraceableSpecificationImpl;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAValue;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.genericconstraints.impl.GenericConstraintImpl#getKind <em>Kind</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.genericconstraints.impl.GenericConstraintImpl#getBase_Constraint <em>Base Constraint</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.genericconstraints.impl.GenericConstraintImpl#getBase_Class <em>Base Class</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.genericconstraints.impl.GenericConstraintImpl#getTarget <em>Target</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.genericconstraints.impl.GenericConstraintImpl#getMode <em>Mode</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.genericconstraints.impl.GenericConstraintImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericConstraintImpl extends TraceableSpecificationImpl implements GenericConstraint {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final GenericConstraintKind KIND_EDEFAULT = GenericConstraintKind.CABLE_LENGTH;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected GenericConstraintKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Constraint() <em>Base Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBase_Constraint()
	 * @generated
	 * @ordered
	 */
	protected Constraint base_Constraint;

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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> target;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> mode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GenericConstraintImpl() {
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
		case GenericconstraintsPackage.GENERIC_CONSTRAINT__KIND:
			return getKind();
		case GenericconstraintsPackage.GENERIC_CONSTRAINT__BASE_CONSTRAINT:
			if (resolve) {
				return getBase_Constraint();
			}
			return basicGetBase_Constraint();
		case GenericconstraintsPackage.GENERIC_CONSTRAINT__BASE_CLASS:
			if (resolve) {
				return getBase_Class();
			}
			return basicGetBase_Class();
		case GenericconstraintsPackage.GENERIC_CONSTRAINT__TARGET:
			return getTarget();
		case GenericconstraintsPackage.GENERIC_CONSTRAINT__MODE:
			return getMode();
		case GenericconstraintsPackage.GENERIC_CONSTRAINT__VALUE:
			if (resolve) {
				return getValue();
			}
			return basicGetValue();
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
		case GenericconstraintsPackage.GENERIC_CONSTRAINT__KIND:
			return kind != KIND_EDEFAULT;
		case GenericconstraintsPackage.GENERIC_CONSTRAINT__BASE_CONSTRAINT:
			return base_Constraint != null;
		case GenericconstraintsPackage.GENERIC_CONSTRAINT__BASE_CLASS:
			return base_Class != null;
		case GenericconstraintsPackage.GENERIC_CONSTRAINT__TARGET:
			return target != null && !target.isEmpty();
		case GenericconstraintsPackage.GENERIC_CONSTRAINT__MODE:
			return mode != null && !mode.isEmpty();
		case GenericconstraintsPackage.GENERIC_CONSTRAINT__VALUE:
			return basicGetValue() != null;
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
		case GenericconstraintsPackage.GENERIC_CONSTRAINT__KIND:
			setKind((GenericConstraintKind) newValue);
			return;
		case GenericconstraintsPackage.GENERIC_CONSTRAINT__BASE_CONSTRAINT:
			setBase_Constraint((Constraint) newValue);
			return;
		case GenericconstraintsPackage.GENERIC_CONSTRAINT__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) newValue);
			return;
		case GenericconstraintsPackage.GENERIC_CONSTRAINT__TARGET:
			getTarget().clear();
			getTarget().addAll((Collection<? extends NamedElement>) newValue);
			return;
		case GenericconstraintsPackage.GENERIC_CONSTRAINT__MODE:
			getMode().clear();
			getMode().addAll((Collection<? extends Mode>) newValue);
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
		return GenericconstraintsPackage.Literals.GENERIC_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public GenericConstraintKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setKind(GenericConstraintKind newKind) {
		GenericConstraintKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, GenericconstraintsPackage.GENERIC_CONSTRAINT__KIND, oldKind, kind));
		}
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
		case GenericconstraintsPackage.GENERIC_CONSTRAINT__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case GenericconstraintsPackage.GENERIC_CONSTRAINT__BASE_CONSTRAINT:
			setBase_Constraint((Constraint) null);
			return;
		case GenericconstraintsPackage.GENERIC_CONSTRAINT__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) null);
			return;
		case GenericconstraintsPackage.GENERIC_CONSTRAINT__TARGET:
			getTarget().clear();
			return;
		case GenericconstraintsPackage.GENERIC_CONSTRAINT__MODE:
			getMode().clear();
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
	public EList<Mode> getMode() {
		if (mode == null) {
			mode = new EObjectResolvingEList<Mode>(Mode.class, this, GenericconstraintsPackage.GENERIC_CONSTRAINT__MODE);
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAValue getValue() {
		EAValue value = basicGetValue();
		return value != null && value.eIsProxy() ? (EAValue) eResolveProxy((InternalEObject) value) : value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EAValue basicGetValue() {
		EAValue adlEAValue = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element element = it.next();
				adlEAValue = UMLUtil.getStereotypeApplication(element, EAValue.class);
				if (adlEAValue != null) {
					return adlEAValue;
				}
			}
		}

		return adlEAValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<NamedElement> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, GenericconstraintsPackage.GENERIC_CONSTRAINT__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Constraint getBase_Constraint() {
		if (base_Constraint != null && base_Constraint.eIsProxy()) {
			InternalEObject oldBase_Constraint = (InternalEObject) base_Constraint;
			base_Constraint = (Constraint) eResolveProxy(oldBase_Constraint);
			if (base_Constraint != oldBase_Constraint) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenericconstraintsPackage.GENERIC_CONSTRAINT__BASE_CONSTRAINT, oldBase_Constraint, base_Constraint));
				}
			}
		}
		return base_Constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Constraint basicGetBase_Constraint() {
		return base_Constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setBase_Constraint(Constraint newBase_Constraint) {
		Constraint oldBase_Constraint = base_Constraint;
		base_Constraint = newBase_Constraint;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, GenericconstraintsPackage.GENERIC_CONSTRAINT__BASE_CONSTRAINT, oldBase_Constraint, base_Constraint));
		}
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
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenericconstraintsPackage.GENERIC_CONSTRAINT__BASE_CLASS, oldBase_Class, base_Class));
				}
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
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, GenericconstraintsPackage.GENERIC_CONSTRAINT__BASE_CLASS, oldBase_Class, base_Class));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} // GenericConstraintImpl
