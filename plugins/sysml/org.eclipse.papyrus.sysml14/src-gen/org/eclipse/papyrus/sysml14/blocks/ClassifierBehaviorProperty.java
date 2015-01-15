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

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Behavior Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ClassifierBehaviorProperty stereotype can be applied to properties to constrain their values to be the executions of classifier behaviors.  The value of properties with ClassifierBehaviorProperty  applied are the executions of classifier behaviors invoked by instantiation of the block that owns the stereotyped property or one of its specializations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.ClassifierBehaviorProperty#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getClassifierBehaviorProperty()
 * @model
 * @generated
 */
public interface ClassifierBehaviorProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getClassifierBehaviorProperty_Base_Property()
	 * @model ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.blocks.ClassifierBehaviorProperty#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

} // ClassifierBehaviorProperty
