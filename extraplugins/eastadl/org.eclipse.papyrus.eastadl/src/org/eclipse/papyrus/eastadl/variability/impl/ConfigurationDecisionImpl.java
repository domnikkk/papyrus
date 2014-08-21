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
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.variability.ConfigurationDecision;
import org.eclipse.papyrus.eastadl.variability.SelectionCriterion;
import org.eclipse.papyrus.eastadl.variability.VariabilityPackage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.variability.impl.ConfigurationDecisionImpl#getEffect <em>Effect</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.variability.impl.ConfigurationDecisionImpl#getCriterion <em>Criterion</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.variability.impl.ConfigurationDecisionImpl#isIsEquivalence <em>Is Equivalence</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.variability.impl.ConfigurationDecisionImpl#getTarget <em>Target</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.variability.impl.ConfigurationDecisionImpl#getSelectionCriterion <em>Selection Criterion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationDecisionImpl extends ConfigurationDecisionModelEntryImpl implements ConfigurationDecision {
	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected String effect = EFFECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCriterion() <em>Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCriterion()
	 * @generated
	 * @ordered
	 */
	protected static final String CRITERION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCriterion() <em>Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCriterion()
	 * @generated
	 * @ordered
	 */
	protected String criterion = CRITERION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsEquivalence() <em>Is Equivalence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isIsEquivalence()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EQUIVALENCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEquivalence() <em>Is Equivalence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isIsEquivalence()
	 * @generated
	 * @ordered
	 */
	protected boolean isEquivalence = IS_EQUIVALENCE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ConfigurationDecisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public SelectionCriterion basicGetSelectionCriterion() {
		SelectionCriterion adlSelectionCriterion = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element element = it.next();
				adlSelectionCriterion = UMLUtil.getStereotypeApplication(element, SelectionCriterion.class);
				if (adlSelectionCriterion != null) {
					return adlSelectionCriterion;
				}
			}
		}

		return adlSelectionCriterion;
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
		case VariabilityPackage.CONFIGURATION_DECISION__EFFECT:
			return getEffect();
		case VariabilityPackage.CONFIGURATION_DECISION__CRITERION:
			return getCriterion();
		case VariabilityPackage.CONFIGURATION_DECISION__IS_EQUIVALENCE:
			return isIsEquivalence();
		case VariabilityPackage.CONFIGURATION_DECISION__TARGET:
			return getTarget();
		case VariabilityPackage.CONFIGURATION_DECISION__SELECTION_CRITERION:
			if (resolve) {
				return getSelectionCriterion();
			}
			return basicGetSelectionCriterion();
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
		case VariabilityPackage.CONFIGURATION_DECISION__EFFECT:
			return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
		case VariabilityPackage.CONFIGURATION_DECISION__CRITERION:
			return CRITERION_EDEFAULT == null ? criterion != null : !CRITERION_EDEFAULT.equals(criterion);
		case VariabilityPackage.CONFIGURATION_DECISION__IS_EQUIVALENCE:
			return isEquivalence != IS_EQUIVALENCE_EDEFAULT;
		case VariabilityPackage.CONFIGURATION_DECISION__TARGET:
			return target != null && !target.isEmpty();
		case VariabilityPackage.CONFIGURATION_DECISION__SELECTION_CRITERION:
			return basicGetSelectionCriterion() != null;
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
		case VariabilityPackage.CONFIGURATION_DECISION__EFFECT:
			setEffect((String) newValue);
			return;
		case VariabilityPackage.CONFIGURATION_DECISION__CRITERION:
			setCriterion((String) newValue);
			return;
		case VariabilityPackage.CONFIGURATION_DECISION__IS_EQUIVALENCE:
			setIsEquivalence((Boolean) newValue);
			return;
		case VariabilityPackage.CONFIGURATION_DECISION__TARGET:
			getTarget().clear();
			getTarget().addAll((Collection<? extends NamedElement>) newValue);
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
		return VariabilityPackage.Literals.CONFIGURATION_DECISION;
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
		case VariabilityPackage.CONFIGURATION_DECISION__EFFECT:
			setEffect(EFFECT_EDEFAULT);
			return;
		case VariabilityPackage.CONFIGURATION_DECISION__CRITERION:
			setCriterion(CRITERION_EDEFAULT);
			return;
		case VariabilityPackage.CONFIGURATION_DECISION__IS_EQUIVALENCE:
			setIsEquivalence(IS_EQUIVALENCE_EDEFAULT);
			return;
		case VariabilityPackage.CONFIGURATION_DECISION__TARGET:
			getTarget().clear();
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
	public String getCriterion() {
		return criterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public SelectionCriterion getSelectionCriterion() {
		SelectionCriterion selectionCriterion = basicGetSelectionCriterion();
		return selectionCriterion != null && selectionCriterion.eIsProxy() ? (SelectionCriterion) eResolveProxy((InternalEObject) selectionCriterion) : selectionCriterion;
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
			target = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, VariabilityPackage.CONFIGURATION_DECISION__TARGET);
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
	public boolean isIsEquivalence() {
		return isEquivalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setCriterion(String newCriterion) {
		String oldCriterion = criterion;
		criterion = newCriterion;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.CONFIGURATION_DECISION__CRITERION, oldCriterion, criterion));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setEffect(String newEffect) {
		String oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.CONFIGURATION_DECISION__EFFECT, oldEffect, effect));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setIsEquivalence(boolean newIsEquivalence) {
		boolean oldIsEquivalence = isEquivalence;
		isEquivalence = newIsEquivalence;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.CONFIGURATION_DECISION__IS_EQUIVALENCE, oldIsEquivalence, isEquivalence));
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
		result.append(" (effect: ");
		result.append(effect);
		result.append(", criterion: ");
		result.append(criterion);
		result.append(", isEquivalence: ");
		result.append(isEquivalence);
		result.append(')');
		return result.toString();
	}

} // ConfigurationDecisionImpl
