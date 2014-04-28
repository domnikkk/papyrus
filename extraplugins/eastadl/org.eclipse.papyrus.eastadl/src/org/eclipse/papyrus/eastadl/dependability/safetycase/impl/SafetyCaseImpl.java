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
package org.eclipse.papyrus.eastadl.dependability.safetycase.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.papyrus.eastadl.dependability.safetycase.Claim;
import org.eclipse.papyrus.eastadl.dependability.safetycase.Ground;
import org.eclipse.papyrus.eastadl.dependability.safetycase.LifecycleStageKind;
import org.eclipse.papyrus.eastadl.dependability.safetycase.SafetyCase;
import org.eclipse.papyrus.eastadl.dependability.safetycase.SafetycasePackage;
import org.eclipse.papyrus.eastadl.dependability.safetycase.Warrant;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.TraceableSpecificationImpl;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.dependability.safetycase.impl.SafetyCaseImpl#getSafetyCase <em>Safety Case</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.dependability.safetycase.impl.SafetyCaseImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.dependability.safetycase.impl.SafetyCaseImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.dependability.safetycase.impl.SafetyCaseImpl#getGround <em>Ground</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.dependability.safetycase.impl.SafetyCaseImpl#getWarrant <em>Warrant</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.dependability.safetycase.impl.SafetyCaseImpl#getClaim <em>Claim</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.dependability.safetycase.impl.SafetyCaseImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SafetyCaseImpl extends TraceableSpecificationImpl implements SafetyCase {
	/**
	 * The default value of the '{@link #getStage() <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected static final LifecycleStageKind STAGE_EDEFAULT = LifecycleStageKind.PRELIMINARY_SAFETY_CASE;

	/**
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected LifecycleStageKind stage = STAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyCaseImpl() {
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
			case SafetycasePackage.SAFETY_CASE__SAFETY_CASE:
				return getSafetyCase();
			case SafetycasePackage.SAFETY_CASE__STAGE:
				return getStage();
			case SafetycasePackage.SAFETY_CASE__CONTEXT:
				return getContext();
			case SafetycasePackage.SAFETY_CASE__GROUND:
				return getGround();
			case SafetycasePackage.SAFETY_CASE__WARRANT:
				return getWarrant();
			case SafetycasePackage.SAFETY_CASE__CLAIM:
				return getClaim();
			case SafetycasePackage.SAFETY_CASE__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
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
			case SafetycasePackage.SAFETY_CASE__SAFETY_CASE:
				return !getSafetyCase().isEmpty();
			case SafetycasePackage.SAFETY_CASE__STAGE:
				return stage != STAGE_EDEFAULT;
			case SafetycasePackage.SAFETY_CASE__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case SafetycasePackage.SAFETY_CASE__GROUND:
				return !getGround().isEmpty();
			case SafetycasePackage.SAFETY_CASE__WARRANT:
				return !getWarrant().isEmpty();
			case SafetycasePackage.SAFETY_CASE__CLAIM:
				return !getClaim().isEmpty();
			case SafetycasePackage.SAFETY_CASE__BASE_CLASS:
				return base_Class != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SafetycasePackage.SAFETY_CASE__STAGE:
				setStage((LifecycleStageKind)newValue);
				return;
			case SafetycasePackage.SAFETY_CASE__CONTEXT:
				setContext((String)newValue);
				return;
			case SafetycasePackage.SAFETY_CASE__WARRANT:
				getWarrant().clear();
				getWarrant().addAll((Collection<? extends Warrant>)newValue);
				return;
			case SafetycasePackage.SAFETY_CASE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
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
		return SafetycasePackage.Literals.SAFETY_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SafetycasePackage.SAFETY_CASE__STAGE:
				setStage(STAGE_EDEFAULT);
				return;
			case SafetycasePackage.SAFETY_CASE__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case SafetycasePackage.SAFETY_CASE__WARRANT:
				getWarrant().clear();
				return;
			case SafetycasePackage.SAFETY_CASE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Claim> getClaim() {
		EList<Claim> results = new BasicEList<Claim>();
		Claim adlClaim = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();
			
			while (it.hasNext()) {
				Element element = it.next();
				adlClaim = (Claim )UMLUtil.getStereotypeApplication(element, Claim.class);
				if (adlClaim != null)
					results.add(adlClaim);
			}
		}
		
		return new BasicInternalEList<Claim>(Claim.class, results.size(), results.toArray());
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SafetycasePackage.SAFETY_CASE__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SafetycasePackage.SAFETY_CASE__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Ground> getGround() {
		EList<Ground> results = new BasicEList<Ground>();
		Ground adlGround = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();
			
			while (it.hasNext()) {
				Element element = it.next();
				adlGround = (Ground )UMLUtil.getStereotypeApplication(element, Ground.class);
				if (adlGround != null)
					results.add(adlGround);
			}
		}
		
		return new BasicInternalEList<Ground>(Ground.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<SafetyCase> getSafetyCase() {
		EList<SafetyCase> results = new BasicEList<SafetyCase>();
		SafetyCase adlSafetyCase = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();
			
			while (it.hasNext()) {
				Element element = it.next();
				adlSafetyCase = (SafetyCase )UMLUtil.getStereotypeApplication(element, SafetyCase.class);
				if (adlSafetyCase != null)
					results.add(adlSafetyCase);
			}
		}
		
		return new BasicInternalEList<SafetyCase>(SafetyCase.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifecycleStageKind getStage() {
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Warrant> getWarrant() {
		EList<Warrant> results = new BasicEList<Warrant>();
		Warrant adlWarrant = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();
			
			while (it.hasNext()) {
				Element element = it.next();
				adlWarrant = (Warrant )UMLUtil.getStereotypeApplication(element, Warrant.class);
				if (adlWarrant != null)
					results.add(adlWarrant);
			}
		}
		
		return new BasicInternalEList<Warrant>(Warrant.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SafetycasePackage.SAFETY_CASE__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStage(LifecycleStageKind newStage) {
		LifecycleStageKind oldStage = stage;
		stage = newStage == null ? STAGE_EDEFAULT : newStage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SafetycasePackage.SAFETY_CASE__STAGE, oldStage, stage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (stage: ");
		result.append(stage);
		result.append(", context: ");
		result.append(context);
		result.append(')');
		return result.toString();
	}

} //SafetyCaseImpl
