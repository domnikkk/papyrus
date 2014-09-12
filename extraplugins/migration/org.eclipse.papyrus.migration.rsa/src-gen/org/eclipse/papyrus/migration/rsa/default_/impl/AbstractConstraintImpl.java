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
package org.eclipse.papyrus.migration.rsa.default_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.papyrus.migration.rsa.default_.AbstractConstraint;
import org.eclipse.papyrus.migration.rsa.default_.DefaultPackage;
import org.eclipse.papyrus.migration.rsa.default_.Mode;
import org.eclipse.papyrus.migration.rsa.default_.Severity;
import org.eclipse.uml2.uml.Constraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.migration.rsa.default_.impl.AbstractConstraintImpl#getBase_Constraint <em>Base Constraint</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.default_.impl.AbstractConstraintImpl#getEvaluationMode <em>Evaluation Mode</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.default_.impl.AbstractConstraintImpl#getSeverity <em>Severity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractConstraintImpl extends MinimalEObjectImpl.Container implements AbstractConstraint {
	/**
	 * The cached value of the '{@link #getBase_Constraint() <em>Base Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBase_Constraint()
	 * @generated
	 * @ordered
	 */
	protected Constraint base_Constraint;

	/**
	 * The default value of the '{@link #getEvaluationMode() <em>Evaluation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getEvaluationMode()
	 * @generated
	 * @ordered
	 */
	protected static final Mode EVALUATION_MODE_EDEFAULT = Mode.BATCH;

	/**
	 * The cached value of the '{@link #getEvaluationMode() <em>Evaluation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getEvaluationMode()
	 * @generated
	 * @ordered
	 */
	protected Mode evaluationMode = EVALUATION_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final Severity SEVERITY_EDEFAULT = Severity.ERROR;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected Severity severity = SEVERITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected AbstractConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DefaultPackage.Literals.ABSTRACT_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Constraint getBase_Constraint() {
		if (base_Constraint != null && base_Constraint.eIsProxy()) {
			InternalEObject oldBase_Constraint = (InternalEObject) base_Constraint;
			base_Constraint = (Constraint) eResolveProxy(oldBase_Constraint);
			if (base_Constraint != oldBase_Constraint) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DefaultPackage.ABSTRACT_CONSTRAINT__BASE_CONSTRAINT, oldBase_Constraint, base_Constraint));
				}
			}
		}
		return base_Constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Constraint basicGetBase_Constraint() {
		return base_Constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setBase_Constraint(Constraint newBase_Constraint) {
		Constraint oldBase_Constraint = base_Constraint;
		base_Constraint = newBase_Constraint;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultPackage.ABSTRACT_CONSTRAINT__BASE_CONSTRAINT, oldBase_Constraint, base_Constraint));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Mode getEvaluationMode() {
		return evaluationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setEvaluationMode(Mode newEvaluationMode) {
		Mode oldEvaluationMode = evaluationMode;
		evaluationMode = newEvaluationMode == null ? EVALUATION_MODE_EDEFAULT : newEvaluationMode;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultPackage.ABSTRACT_CONSTRAINT__EVALUATION_MODE, oldEvaluationMode, evaluationMode));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Severity getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setSeverity(Severity newSeverity) {
		Severity oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultPackage.ABSTRACT_CONSTRAINT__SEVERITY, oldSeverity, severity));
		}
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
		case DefaultPackage.ABSTRACT_CONSTRAINT__BASE_CONSTRAINT:
			if (resolve) {
				return getBase_Constraint();
			}
			return basicGetBase_Constraint();
		case DefaultPackage.ABSTRACT_CONSTRAINT__EVALUATION_MODE:
			return getEvaluationMode();
		case DefaultPackage.ABSTRACT_CONSTRAINT__SEVERITY:
			return getSeverity();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DefaultPackage.ABSTRACT_CONSTRAINT__BASE_CONSTRAINT:
			setBase_Constraint((Constraint) newValue);
			return;
		case DefaultPackage.ABSTRACT_CONSTRAINT__EVALUATION_MODE:
			setEvaluationMode((Mode) newValue);
			return;
		case DefaultPackage.ABSTRACT_CONSTRAINT__SEVERITY:
			setSeverity((Severity) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case DefaultPackage.ABSTRACT_CONSTRAINT__BASE_CONSTRAINT:
			setBase_Constraint((Constraint) null);
			return;
		case DefaultPackage.ABSTRACT_CONSTRAINT__EVALUATION_MODE:
			setEvaluationMode(EVALUATION_MODE_EDEFAULT);
			return;
		case DefaultPackage.ABSTRACT_CONSTRAINT__SEVERITY:
			setSeverity(SEVERITY_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DefaultPackage.ABSTRACT_CONSTRAINT__BASE_CONSTRAINT:
			return base_Constraint != null;
		case DefaultPackage.ABSTRACT_CONSTRAINT__EVALUATION_MODE:
			return evaluationMode != EVALUATION_MODE_EDEFAULT;
		case DefaultPackage.ABSTRACT_CONSTRAINT__SEVERITY:
			return severity != SEVERITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (evaluationMode: ");
		result.append(evaluationMode);
		result.append(", severity: ");
		result.append(severity);
		result.append(')');
		return result.toString();
	}

} // AbstractConstraintImpl
