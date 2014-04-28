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
package org.eclipse.papyrus.eastadl.timing.timingconstraints.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.timing.EventChain;
import org.eclipse.papyrus.eastadl.timing.TimingExpression;
import org.eclipse.papyrus.eastadl.timing.impl.TimingConstraintImpl;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.OutputSynchronizationConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Synchronization Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.OutputSynchronizationConstraintImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.OutputSynchronizationConstraintImpl#getTolerance <em>Tolerance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputSynchronizationConstraintImpl extends TimingConstraintImpl implements OutputSynchronizationConstraint {
	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected EList<EventChain> scope;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputSynchronizationConstraintImpl() {
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
			case TimingconstraintsPackage.OUTPUT_SYNCHRONIZATION_CONSTRAINT__SCOPE:
				return getScope();
			case TimingconstraintsPackage.OUTPUT_SYNCHRONIZATION_CONSTRAINT__TOLERANCE:
				if (resolve) return getTolerance();
				return basicGetTolerance();
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
			case TimingconstraintsPackage.OUTPUT_SYNCHRONIZATION_CONSTRAINT__SCOPE:
				return scope != null && !scope.isEmpty();
			case TimingconstraintsPackage.OUTPUT_SYNCHRONIZATION_CONSTRAINT__TOLERANCE:
				return basicGetTolerance() != null;
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
			case TimingconstraintsPackage.OUTPUT_SYNCHRONIZATION_CONSTRAINT__SCOPE:
				getScope().clear();
				getScope().addAll((Collection<? extends EventChain>)newValue);
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
		return TimingconstraintsPackage.Literals.OUTPUT_SYNCHRONIZATION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventChain> getScope() {
		if (scope == null) {
			scope = new EObjectResolvingEList<EventChain>(EventChain.class, this, TimingconstraintsPackage.OUTPUT_SYNCHRONIZATION_CONSTRAINT__SCOPE);
		}
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingExpression getTolerance() {
		TimingExpression tolerance = basicGetTolerance();
		return tolerance != null && tolerance.eIsProxy() ? (TimingExpression)eResolveProxy((InternalEObject)tolerance) : tolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TimingExpression basicGetTolerance() {
		TimingExpression adlBehavior = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();
			
			while (it.hasNext()) {
				Element element = it.next();
				adlBehavior = (TimingExpression )UMLUtil.getStereotypeApplication(element, TimingExpression.class);
				if (adlBehavior != null)
					return adlBehavior;
			}
		}
		
		return adlBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TimingconstraintsPackage.OUTPUT_SYNCHRONIZATION_CONSTRAINT__SCOPE:
				getScope().clear();
				return;
		}
		super.eUnset(featureID);
	}

} //OutputSynchronizationConstraintImpl
