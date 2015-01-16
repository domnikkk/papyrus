/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.modelelements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.modelelements.Stakeholder#getBase_Classifier <em>Base Classifier</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.modelelements.Stakeholder#getConcern <em>Concern</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.modelelements.Stakeholder#getConcernList <em>Concern List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.sysml14.modelelements.ModelelementsPackage#getStakeholder()
 * @model
 * @generated
 */
public interface Stakeholder extends EObject {
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
	 * @see org.eclipse.papyrus.sysml14.modelelements.ModelelementsPackage#getStakeholder_Base_Classifier()
	 * @model ordered="false"
	 * @generated
	 */
	Classifier getBase_Classifier();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.modelelements.Stakeholder#getBase_Classifier <em>Base Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Classifier</em>' reference.
	 * @see #getBase_Classifier()
	 * @generated
	 */
	void setBase_Classifier(Classifier value);

	/**
	 * Returns the value of the '<em><b>Concern</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concern</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concern</em>' reference list.
	 * @see org.eclipse.papyrus.sysml14.modelelements.ModelelementsPackage#getStakeholder_Concern()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Comment> getConcern();

	/**
	 * Returns the value of the '<em><b>Concern List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concern List</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concern List</em>' reference.
	 * @see #setConcernList(Comment)
	 * @see org.eclipse.papyrus.sysml14.modelelements.ModelelementsPackage#getStakeholder_ConcernList()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Comment getConcernList();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.modelelements.Stakeholder#getConcernList <em>Concern List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concern List</em>' reference.
	 * @see #getConcernList()
	 * @generated
	 */
	void setConcernList(Comment value);

} // Stakeholder
