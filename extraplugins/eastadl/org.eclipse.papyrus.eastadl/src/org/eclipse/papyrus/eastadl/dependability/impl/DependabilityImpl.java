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
package org.eclipse.papyrus.eastadl.dependability.impl;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.papyrus.eastadl.dependability.Dependability;
import org.eclipse.papyrus.eastadl.dependability.DependabilityPackage;
import org.eclipse.papyrus.eastadl.dependability.FeatureFlaw;
import org.eclipse.papyrus.eastadl.dependability.Hazard;
import org.eclipse.papyrus.eastadl.dependability.HazardousEvent;
import org.eclipse.papyrus.eastadl.dependability.Item;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrorModelType;
import org.eclipse.papyrus.eastadl.dependability.safetycase.SafetyCase;
import org.eclipse.papyrus.eastadl.dependability.safetyconstraints.FaultFailure;
import org.eclipse.papyrus.eastadl.dependability.safetyconstraints.QuantitativeSafetyConstraint;
import org.eclipse.papyrus.eastadl.dependability.safetyconstraints.SafetyConstraint;
import org.eclipse.papyrus.eastadl.dependability.safetyrequirement.FunctionalSafetyConcept;
import org.eclipse.papyrus.eastadl.dependability.safetyrequirement.SafetyGoal;
import org.eclipse.papyrus.eastadl.dependability.safetyrequirement.TechnicalSafetyConcept;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatype;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ContextImpl;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.impl.DependabilityImpl#getBase_Class <em>Base Class</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.impl.DependabilityImpl#getBase_Package <em>Base Package</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.impl.DependabilityImpl#getFunctionalSafetyConcept <em>Functional Safety Concept</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.impl.DependabilityImpl#getSafetyGoal <em>Safety Goal</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.impl.DependabilityImpl#getTechnicalSafetyConcept <em>Technical Safety Concept</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.impl.DependabilityImpl#getHazardousEvent <em>Hazardous Event</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.impl.DependabilityImpl#getFeatureFlaw <em>Feature Flaw</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.impl.DependabilityImpl#getItem <em>Item</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.impl.DependabilityImpl#getEADatatype <em>EA Datatype</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.impl.DependabilityImpl#getFaultFailure <em>Fault Failure</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.impl.DependabilityImpl#getQuantitativeSafetyConstraint <em>Quantitative Safety Constraint</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.impl.DependabilityImpl#getSafetyConstraint <em>Safety Constraint</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.impl.DependabilityImpl#getSafetyCase <em>Safety Case</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.impl.DependabilityImpl#getErrorModelType <em>Error Model Type</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.impl.DependabilityImpl#getHazard <em>Hazard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependabilityImpl extends ContextImpl implements Dependability {
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
	protected DependabilityImpl() {
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
		case DependabilityPackage.DEPENDABILITY__BASE_CLASS:
			if (resolve) {
				return getBase_Class();
			}
			return basicGetBase_Class();
		case DependabilityPackage.DEPENDABILITY__BASE_PACKAGE:
			if (resolve) {
				return getBase_Package();
			}
			return basicGetBase_Package();
		case DependabilityPackage.DEPENDABILITY__FUNCTIONAL_SAFETY_CONCEPT:
			return getFunctionalSafetyConcept();
		case DependabilityPackage.DEPENDABILITY__SAFETY_GOAL:
			return getSafetyGoal();
		case DependabilityPackage.DEPENDABILITY__TECHNICAL_SAFETY_CONCEPT:
			return getTechnicalSafetyConcept();
		case DependabilityPackage.DEPENDABILITY__HAZARDOUS_EVENT:
			return getHazardousEvent();
		case DependabilityPackage.DEPENDABILITY__FEATURE_FLAW:
			return getFeatureFlaw();
		case DependabilityPackage.DEPENDABILITY__ITEM:
			return getItem();
		case DependabilityPackage.DEPENDABILITY__EA_DATATYPE:
			return getEADatatype();
		case DependabilityPackage.DEPENDABILITY__FAULT_FAILURE:
			return getFaultFailure();
		case DependabilityPackage.DEPENDABILITY__QUANTITATIVE_SAFETY_CONSTRAINT:
			return getQuantitativeSafetyConstraint();
		case DependabilityPackage.DEPENDABILITY__SAFETY_CONSTRAINT:
			return getSafetyConstraint();
		case DependabilityPackage.DEPENDABILITY__SAFETY_CASE:
			return getSafetyCase();
		case DependabilityPackage.DEPENDABILITY__ERROR_MODEL_TYPE:
			return getErrorModelType();
		case DependabilityPackage.DEPENDABILITY__HAZARD:
			return getHazard();
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
		case DependabilityPackage.DEPENDABILITY__BASE_CLASS:
			return base_Class != null;
		case DependabilityPackage.DEPENDABILITY__BASE_PACKAGE:
			return base_Package != null;
		case DependabilityPackage.DEPENDABILITY__FUNCTIONAL_SAFETY_CONCEPT:
			return !getFunctionalSafetyConcept().isEmpty();
		case DependabilityPackage.DEPENDABILITY__SAFETY_GOAL:
			return !getSafetyGoal().isEmpty();
		case DependabilityPackage.DEPENDABILITY__TECHNICAL_SAFETY_CONCEPT:
			return !getTechnicalSafetyConcept().isEmpty();
		case DependabilityPackage.DEPENDABILITY__HAZARDOUS_EVENT:
			return !getHazardousEvent().isEmpty();
		case DependabilityPackage.DEPENDABILITY__FEATURE_FLAW:
			return !getFeatureFlaw().isEmpty();
		case DependabilityPackage.DEPENDABILITY__ITEM:
			return !getItem().isEmpty();
		case DependabilityPackage.DEPENDABILITY__EA_DATATYPE:
			return !getEADatatype().isEmpty();
		case DependabilityPackage.DEPENDABILITY__FAULT_FAILURE:
			return !getFaultFailure().isEmpty();
		case DependabilityPackage.DEPENDABILITY__QUANTITATIVE_SAFETY_CONSTRAINT:
			return !getQuantitativeSafetyConstraint().isEmpty();
		case DependabilityPackage.DEPENDABILITY__SAFETY_CONSTRAINT:
			return !getSafetyConstraint().isEmpty();
		case DependabilityPackage.DEPENDABILITY__SAFETY_CASE:
			return !getSafetyCase().isEmpty();
		case DependabilityPackage.DEPENDABILITY__ERROR_MODEL_TYPE:
			return !getErrorModelType().isEmpty();
		case DependabilityPackage.DEPENDABILITY__HAZARD:
			return !getHazard().isEmpty();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DependabilityPackage.DEPENDABILITY__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) newValue);
			return;
		case DependabilityPackage.DEPENDABILITY__BASE_PACKAGE:
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
		return DependabilityPackage.Literals.DEPENDABILITY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependabilityPackage.DEPENDABILITY__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DependabilityPackage.DEPENDABILITY__BASE_CLASS, oldBase_Class, base_Class));
		}
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
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependabilityPackage.DEPENDABILITY__BASE_PACKAGE, oldBase_Package, base_Package));
				}
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
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DependabilityPackage.DEPENDABILITY__BASE_PACKAGE, oldBase_Package, base_Package));
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
		case DependabilityPackage.DEPENDABILITY__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) null);
			return;
		case DependabilityPackage.DEPENDABILITY__BASE_PACKAGE:
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
	public EList<ErrorModelType> getErrorModelType() {
		EList<ErrorModelType> results = new BasicEList<ErrorModelType>();
		ErrorModelType adlErrorModelType = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element element = it.next();
				adlErrorModelType = UMLUtil.getStereotypeApplication(element, ErrorModelType.class);
				if (adlErrorModelType != null) {
					results.add(adlErrorModelType);
				}
			}
		}

		return new BasicInternalEList<ErrorModelType>(ErrorModelType.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<Hazard> getHazard() {
		EList<Hazard> results = new BasicEList<Hazard>();
		Hazard adlHazard = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element element = it.next();
				adlHazard = UMLUtil.getStereotypeApplication(element, Hazard.class);
				if (adlHazard != null) {
					results.add(adlHazard);
				}
			}
		}

		return new BasicInternalEList<Hazard>(Hazard.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<FaultFailure> getFaultFailure() {
		EList<FaultFailure> results = new BasicEList<FaultFailure>();
		FaultFailure adlFaultFailure = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element element = it.next();
				adlFaultFailure = UMLUtil.getStereotypeApplication(element, FaultFailure.class);
				if (adlFaultFailure != null) {
					results.add(adlFaultFailure);
				}
			}
		}

		return new BasicInternalEList<FaultFailure>(FaultFailure.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<FeatureFlaw> getFeatureFlaw() {
		EList<FeatureFlaw> results = new BasicEList<FeatureFlaw>();
		FeatureFlaw adlFeatureFlaw = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element element = it.next();
				adlFeatureFlaw = UMLUtil.getStereotypeApplication(element, FeatureFlaw.class);
				if (adlFeatureFlaw != null) {
					results.add(adlFeatureFlaw);
				}
			}
		}

		return new BasicInternalEList<FeatureFlaw>(FeatureFlaw.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<FunctionalSafetyConcept> getFunctionalSafetyConcept() {
		EList<FunctionalSafetyConcept> results = new BasicEList<FunctionalSafetyConcept>();
		FunctionalSafetyConcept adlFunctionalSafetyConcept = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element element = it.next();
				adlFunctionalSafetyConcept = UMLUtil.getStereotypeApplication(element, FunctionalSafetyConcept.class);
				if (adlFunctionalSafetyConcept != null) {
					results.add(adlFunctionalSafetyConcept);
				}
			}
		}

		return new BasicInternalEList<FunctionalSafetyConcept>(FunctionalSafetyConcept.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<HazardousEvent> getHazardousEvent() {
		EList<HazardousEvent> results = new BasicEList<HazardousEvent>();
		HazardousEvent adlHazardousEvent = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element element = it.next();
				adlHazardousEvent = UMLUtil.getStereotypeApplication(element, HazardousEvent.class);
				if (adlHazardousEvent != null) {
					results.add(adlHazardousEvent);
				}
			}
		}

		return new BasicInternalEList<HazardousEvent>(HazardousEvent.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<Item> getItem() {
		EList<Item> results = new BasicEList<Item>();
		Item adlItem = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element element = it.next();
				adlItem = UMLUtil.getStereotypeApplication(element, Item.class);
				if (adlItem != null) {
					results.add(adlItem);
				}
			}
		}

		return new BasicInternalEList<Item>(Item.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<EADatatype> getEADatatype() {
		EList<EADatatype> results = new BasicEList<EADatatype>();
		EADatatype adlEADatatype = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element element = it.next();
				adlEADatatype = UMLUtil.getStereotypeApplication(element, EADatatype.class);
				if (adlEADatatype != null) {
					results.add(adlEADatatype);
				}
			}
		}

		return new BasicInternalEList<EADatatype>(EADatatype.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<QuantitativeSafetyConstraint> getQuantitativeSafetyConstraint() {
		EList<QuantitativeSafetyConstraint> results = new BasicEList<QuantitativeSafetyConstraint>();
		QuantitativeSafetyConstraint adlQuantitativeSafetyConstraint = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element element = it.next();
				adlQuantitativeSafetyConstraint = UMLUtil.getStereotypeApplication(element, QuantitativeSafetyConstraint.class);
				if (adlQuantitativeSafetyConstraint != null) {
					results.add(adlQuantitativeSafetyConstraint);
				}
			}
		}

		return new BasicInternalEList<QuantitativeSafetyConstraint>(QuantitativeSafetyConstraint.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<SafetyCase> getSafetyCase() {
		EList<SafetyCase> results = new BasicEList<SafetyCase>();
		SafetyCase adlSafetyCase = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element element = it.next();
				adlSafetyCase = UMLUtil.getStereotypeApplication(element, SafetyCase.class);
				if (adlSafetyCase != null) {
					results.add(adlSafetyCase);
				}
			}
		}

		return new BasicInternalEList<SafetyCase>(SafetyCase.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<SafetyConstraint> getSafetyConstraint() {
		EList<SafetyConstraint> results = new BasicEList<SafetyConstraint>();
		SafetyConstraint adlSafetyConstraint = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element element = it.next();
				adlSafetyConstraint = UMLUtil.getStereotypeApplication(element, SafetyConstraint.class);
				if (adlSafetyConstraint != null) {
					results.add(adlSafetyConstraint);
				}
			}
		}

		return new BasicInternalEList<SafetyConstraint>(SafetyConstraint.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<SafetyGoal> getSafetyGoal() {
		EList<SafetyGoal> results = new BasicEList<SafetyGoal>();
		SafetyGoal adlSafetyGoal = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element element = it.next();
				adlSafetyGoal = UMLUtil.getStereotypeApplication(element, SafetyGoal.class);
				if (adlSafetyGoal != null) {
					results.add(adlSafetyGoal);
				}
			}
		}

		return new BasicInternalEList<SafetyGoal>(SafetyGoal.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<TechnicalSafetyConcept> getTechnicalSafetyConcept() {
		EList<TechnicalSafetyConcept> results = new BasicEList<TechnicalSafetyConcept>();
		TechnicalSafetyConcept adlTechnicalSafetyConcept = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element element = it.next();
				adlTechnicalSafetyConcept = UMLUtil.getStereotypeApplication(element, TechnicalSafetyConcept.class);
				if (adlTechnicalSafetyConcept != null) {
					results.add(adlTechnicalSafetyConcept);
				}
			}
		}

		return new BasicInternalEList<TechnicalSafetyConcept>(TechnicalSafetyConcept.class, results.size(), results.toArray());
	}

} // DependabilityImpl
