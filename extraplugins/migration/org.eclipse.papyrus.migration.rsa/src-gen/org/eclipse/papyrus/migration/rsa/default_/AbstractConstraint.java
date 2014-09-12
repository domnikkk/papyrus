/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.default_;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.migration.rsa.default_.AbstractConstraint#getBase_Constraint <em>Base Constraint</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.default_.AbstractConstraint#getEvaluationMode <em>Evaluation Mode</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.default_.AbstractConstraint#getSeverity <em>Severity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.migration.rsa.default_.DefaultPackage#getAbstractConstraint()
 * @model abstract="true"
 * @generated
 */
public interface AbstractConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Constraint</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Base Constraint</em>' reference.
	 * @see #setBase_Constraint(Constraint)
	 * @see org.eclipse.papyrus.migration.rsa.default_.DefaultPackage#getAbstractConstraint_Base_Constraint()
	 * @model required="true"
	 * @generated
	 */
	Constraint getBase_Constraint();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rsa.default_.AbstractConstraint#getBase_Constraint <em>Base Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Base Constraint</em>' reference.
	 * @see #getBase_Constraint()
	 * @generated
	 */
	void setBase_Constraint(Constraint value);

	/**
	 * Returns the value of the '<em><b>Evaluation Mode</b></em>' attribute.
	 * The default value is <code>"batch"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.migration.rsa.default_.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Mode</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Evaluation Mode</em>' attribute.
	 * @see org.eclipse.papyrus.migration.rsa.default_.Mode
	 * @see #setEvaluationMode(Mode)
	 * @see org.eclipse.papyrus.migration.rsa.default_.DefaultPackage#getAbstractConstraint_EvaluationMode()
	 * @model default="batch" required="true"
	 * @generated
	 */
	Mode getEvaluationMode();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rsa.default_.AbstractConstraint#getEvaluationMode <em>Evaluation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Evaluation Mode</em>' attribute.
	 * @see org.eclipse.papyrus.migration.rsa.default_.Mode
	 * @see #getEvaluationMode()
	 * @generated
	 */
	void setEvaluationMode(Mode value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The default value is <code>"error"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.migration.rsa.default_.Severity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.eclipse.papyrus.migration.rsa.default_.Severity
	 * @see #setSeverity(Severity)
	 * @see org.eclipse.papyrus.migration.rsa.default_.DefaultPackage#getAbstractConstraint_Severity()
	 * @model default="error" required="true"
	 * @generated
	 */
	Severity getSeverity();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rsa.default_.AbstractConstraint#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Severity</em>' attribute.
	 * @see org.eclipse.papyrus.migration.rsa.default_.Severity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Severity value);

} // AbstractConstraint
