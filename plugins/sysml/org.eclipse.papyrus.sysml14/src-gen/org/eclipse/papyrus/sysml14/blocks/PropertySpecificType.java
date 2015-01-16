/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.blocks;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Specific Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The PropertySpecificType stereotype should automatically be applied to the classifier which types a property with a propertyspecific type. This classifier can contain definitions of new or redefined features which extend the original classifier referenced by the property-specific type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.PropertySpecificType#getBase_Classifier <em>Base Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getPropertySpecificType()
 * @model
 * @generated
 */
public interface PropertySpecificType extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Classifier</em>' reference.
	 * @see #setBase_Classifier(Classifier)
	 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getPropertySpecificType_Base_Classifier()
	 * @model ordered="false"
	 * @generated
	 */
	Classifier getBase_Classifier();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.blocks.PropertySpecificType#getBase_Classifier <em>Base Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Classifier</em>' reference.
	 * @see #getBase_Classifier()
	 * @generated
	 */
	void setBase_Classifier(Classifier value);

} // PropertySpecificType
