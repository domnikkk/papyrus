/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.activities;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * When the «probability» stereotype is applied to edges coming out of decision nodes and object nodes, it provides an expression for the probability that the edge will be traversed. These must be between zero and one inclusive, and add up to one for edges with same source at the time the probabilities are used.
 * When the «probability» stereotype is applied to output parameter sets, it gives the probability the parameter set will be given values at runtime. These must be between zero and one inclusive, and add up to one for output parameter sets of the same behavior at the time the probabilities are used.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.activities.Probability#getBase_ActivityEdge <em>Base Activity Edge</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.activities.Probability#getBase_ParameterSet <em>Base Parameter Set</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.activities.Probability#getProbability <em>Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.sysml14.activities.ActivitiesPackage#getProbability()
 * @model
 * @generated
 */
public interface Probability extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Activity Edge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Activity Edge</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Activity Edge</em>' reference.
	 * @see #setBase_ActivityEdge(ActivityEdge)
	 * @see org.eclipse.papyrus.sysml14.activities.ActivitiesPackage#getProbability_Base_ActivityEdge()
	 * @model ordered="false"
	 * @generated
	 */
	ActivityEdge getBase_ActivityEdge();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.activities.Probability#getBase_ActivityEdge <em>Base Activity Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Activity Edge</em>' reference.
	 * @see #getBase_ActivityEdge()
	 * @generated
	 */
	void setBase_ActivityEdge(ActivityEdge value);

	/**
	 * Returns the value of the '<em><b>Base Parameter Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Parameter Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Parameter Set</em>' reference.
	 * @see #setBase_ParameterSet(ParameterSet)
	 * @see org.eclipse.papyrus.sysml14.activities.ActivitiesPackage#getProbability_Base_ParameterSet()
	 * @model ordered="false"
	 * @generated
	 */
	ParameterSet getBase_ParameterSet();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.activities.Probability#getBase_ParameterSet <em>Base Parameter Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Parameter Set</em>' reference.
	 * @see #getBase_ParameterSet()
	 * @generated
	 */
	void setBase_ParameterSet(ParameterSet value);

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' reference.
	 * @see #setProbability(ValueSpecification)
	 * @see org.eclipse.papyrus.sysml14.activities.ActivitiesPackage#getProbability_Probability()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getProbability();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.activities.Probability#getProbability <em>Probability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' reference.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(ValueSpecification value);

} // Probability
