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
package org.eclipse.papyrus.eastadl.annex.needs.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.annex.needs.ArchitecturalModel;
import org.eclipse.papyrus.eastadl.annex.needs.NeedsPackage;
import org.eclipse.papyrus.eastadl.structure.systemmodeling.SystemModel;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architectural Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.needs.impl.ArchitecturalModelImpl#getIsConceptFor <em>Is Concept For</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchitecturalModelImpl extends ConceptImpl implements ArchitecturalModel {
	/**
	 * The cached value of the '{@link #getIsConceptFor() <em>Is Concept For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConceptFor()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemModel> isConceptFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitecturalModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeedsPackage.Literals.ARCHITECTURAL_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemModel> getIsConceptFor() {
		if (isConceptFor == null) {
			isConceptFor = new EObjectResolvingEList<SystemModel>(SystemModel.class, this, NeedsPackage.ARCHITECTURAL_MODEL__IS_CONCEPT_FOR);
		}
		return isConceptFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NeedsPackage.ARCHITECTURAL_MODEL__IS_CONCEPT_FOR:
				return getIsConceptFor();
		}
		return super.eGet(featureID, resolve, coreType);
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
			case NeedsPackage.ARCHITECTURAL_MODEL__IS_CONCEPT_FOR:
				getIsConceptFor().clear();
				getIsConceptFor().addAll((Collection<? extends SystemModel>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case NeedsPackage.ARCHITECTURAL_MODEL__IS_CONCEPT_FOR:
				getIsConceptFor().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NeedsPackage.ARCHITECTURAL_MODEL__IS_CONCEPT_FOR:
				return isConceptFor != null && !isConceptFor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArchitecturalModelImpl
