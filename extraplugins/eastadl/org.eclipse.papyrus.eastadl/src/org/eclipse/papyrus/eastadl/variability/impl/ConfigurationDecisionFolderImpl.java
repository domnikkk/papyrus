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

import java.util.Iterator;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.papyrus.eastadl.variability.ConfigurationDecisionFolder;
import org.eclipse.papyrus.eastadl.variability.ConfigurationDecisionModelEntry;
import org.eclipse.papyrus.eastadl.variability.VariabilityPackage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Decision Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.variability.impl.ConfigurationDecisionFolderImpl#getChildEntry <em>Child Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationDecisionFolderImpl extends ConfigurationDecisionModelEntryImpl implements ConfigurationDecisionFolder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationDecisionFolderImpl() {
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
			case VariabilityPackage.CONFIGURATION_DECISION_FOLDER__CHILD_ENTRY:
				return getChildEntry();
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
			case VariabilityPackage.CONFIGURATION_DECISION_FOLDER__CHILD_ENTRY:
				return !getChildEntry().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.CONFIGURATION_DECISION_FOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ConfigurationDecisionModelEntry> getChildEntry() {
		EList<ConfigurationDecisionModelEntry> results = new BasicEList<ConfigurationDecisionModelEntry>();
		ConfigurationDecisionModelEntry adlBehavior = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();
			
			while (it.hasNext()) {
				Element element = it.next();
				adlBehavior = (ConfigurationDecisionModelEntry )UMLUtil.getStereotypeApplication(element, ConfigurationDecisionModelEntry.class);
				if (adlBehavior != null)
					results.add(adlBehavior);
			}
		}
		
		return new BasicInternalEList<ConfigurationDecisionModelEntry>(ConfigurationDecisionModelEntry.class, results.size(), results.toArray());
	}

} //ConfigurationDecisionFolderImpl
