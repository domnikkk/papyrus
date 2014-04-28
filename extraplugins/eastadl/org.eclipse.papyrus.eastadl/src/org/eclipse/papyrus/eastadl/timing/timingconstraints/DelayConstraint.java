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
package org.eclipse.papyrus.eastadl.timing.timingconstraints;

import org.eclipse.papyrus.eastadl.timing.Event;
import org.eclipse.papyrus.eastadl.timing.TimingConstraint;
import org.eclipse.papyrus.eastadl.timing.TimingExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DelayConstraints give bounds on system timing attributes, i.e. end-to-end delays, periods, etc.
 * 
 * A DelayConstraint can specify one or several of an upper bound, a lower bound or a nominal value and jitter. The jitter is evenly distributed around the nominal (nominal - jitter/2 .. nominal + jitter/2). The bound will be measured in a given unit.
 * 
 * Constraints:
 * [1] At least Upper or Nominal must be specified. Rationale: At least one value is needed to work with.
 * 
 * Semantics:
 * Lower (from TimingConstraint) denotes the minimum value of the given bound.
 * Upper (from TimingConstraint) denotes the maximum value of the given bound.
 * Variation around the nominal value can be expressed by means of an upper and lower bound, or by means of a jitter value.
 * For example, [lower=10, upper=20, nominal=15] is equal to [nominal=15, jitter=10].
 * 
 * 
 * Extension:
 * abstract, no extension
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.DelayConstraint#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.DelayConstraint#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.DelayConstraint#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.DelayConstraint#getUpper <em>Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getDelayConstraint()
 * @model
 * @generated
 */
public interface DelayConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Event)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getDelayConstraint_Target()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Event getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.DelayConstraint#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Event value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Event)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getDelayConstraint_Source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Event getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.DelayConstraint#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Event value);

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' reference.
	 * @see #setLower(TimingExpression)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getDelayConstraint_Lower()
	 * @model ordered="false"
	 * @generated
	 */
	TimingExpression getLower();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.DelayConstraint#getLower <em>Lower</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' reference.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(TimingExpression value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' reference.
	 * @see #setUpper(TimingExpression)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getDelayConstraint_Upper()
	 * @model ordered="false"
	 * @generated
	 */
	TimingExpression getUpper();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.DelayConstraint#getUpper <em>Upper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' reference.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(TimingExpression value);

} // DelayConstraint
