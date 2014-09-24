/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.ConfigImpl#isConvertOpaqueExpressionToLiteralString <em>Convert Opaque Expression To Literal String</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.ConfigImpl#isRemoveUnmappedProfilesAndStereotypes <em>Remove Unmapped Profiles And Stereotypes</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.ConfigImpl#isRemoveUnmappedAnnotations <em>Remove Unmapped Annotations</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.ConfigImpl#isRemoveUnmappedDiagrams <em>Remove Unmapped Diagrams</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigImpl extends MinimalEObjectImpl.Container implements Config {
	/**
	 * The default value of the '{@link #isConvertOpaqueExpressionToLiteralString() <em>Convert Opaque Expression To Literal String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isConvertOpaqueExpressionToLiteralString()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONVERT_OPAQUE_EXPRESSION_TO_LITERAL_STRING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isConvertOpaqueExpressionToLiteralString() <em>Convert Opaque Expression To Literal String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isConvertOpaqueExpressionToLiteralString()
	 * @generated
	 * @ordered
	 */
	protected boolean convertOpaqueExpressionToLiteralString = CONVERT_OPAQUE_EXPRESSION_TO_LITERAL_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemoveUnmappedProfilesAndStereotypes() <em>Remove Unmapped Profiles And Stereotypes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isRemoveUnmappedProfilesAndStereotypes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOVE_UNMAPPED_PROFILES_AND_STEREOTYPES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRemoveUnmappedProfilesAndStereotypes() <em>Remove Unmapped Profiles And Stereotypes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isRemoveUnmappedProfilesAndStereotypes()
	 * @generated
	 * @ordered
	 */
	protected boolean removeUnmappedProfilesAndStereotypes = REMOVE_UNMAPPED_PROFILES_AND_STEREOTYPES_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemoveUnmappedAnnotations() <em>Remove Unmapped Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isRemoveUnmappedAnnotations()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOVE_UNMAPPED_ANNOTATIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoveUnmappedAnnotations() <em>Remove Unmapped Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isRemoveUnmappedAnnotations()
	 * @generated
	 * @ordered
	 */
	protected boolean removeUnmappedAnnotations = REMOVE_UNMAPPED_ANNOTATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemoveUnmappedDiagrams() <em>Remove Unmapped Diagrams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isRemoveUnmappedDiagrams()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOVE_UNMAPPED_DIAGRAMS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoveUnmappedDiagrams() <em>Remove Unmapped Diagrams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isRemoveUnmappedDiagrams()
	 * @generated
	 * @ordered
	 */
	protected boolean removeUnmappedDiagrams = REMOVE_UNMAPPED_DIAGRAMS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ConfigImpl() {
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
		return RSAToPapyrusParametersPackage.Literals.CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isConvertOpaqueExpressionToLiteralString() {
		return convertOpaqueExpressionToLiteralString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setConvertOpaqueExpressionToLiteralString(boolean newConvertOpaqueExpressionToLiteralString) {
		boolean oldConvertOpaqueExpressionToLiteralString = convertOpaqueExpressionToLiteralString;
		convertOpaqueExpressionToLiteralString = newConvertOpaqueExpressionToLiteralString;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, RSAToPapyrusParametersPackage.CONFIG__CONVERT_OPAQUE_EXPRESSION_TO_LITERAL_STRING, oldConvertOpaqueExpressionToLiteralString, convertOpaqueExpressionToLiteralString));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isRemoveUnmappedProfilesAndStereotypes() {
		return removeUnmappedProfilesAndStereotypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setRemoveUnmappedProfilesAndStereotypes(boolean newRemoveUnmappedProfilesAndStereotypes) {
		boolean oldRemoveUnmappedProfilesAndStereotypes = removeUnmappedProfilesAndStereotypes;
		removeUnmappedProfilesAndStereotypes = newRemoveUnmappedProfilesAndStereotypes;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_PROFILES_AND_STEREOTYPES, oldRemoveUnmappedProfilesAndStereotypes, removeUnmappedProfilesAndStereotypes));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isRemoveUnmappedAnnotations() {
		return removeUnmappedAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setRemoveUnmappedAnnotations(boolean newRemoveUnmappedAnnotations) {
		boolean oldRemoveUnmappedAnnotations = removeUnmappedAnnotations;
		removeUnmappedAnnotations = newRemoveUnmappedAnnotations;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_ANNOTATIONS, oldRemoveUnmappedAnnotations, removeUnmappedAnnotations));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isRemoveUnmappedDiagrams() {
		return removeUnmappedDiagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setRemoveUnmappedDiagrams(boolean newRemoveUnmappedDiagrams) {
		boolean oldRemoveUnmappedDiagrams = removeUnmappedDiagrams;
		removeUnmappedDiagrams = newRemoveUnmappedDiagrams;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_DIAGRAMS, oldRemoveUnmappedDiagrams, removeUnmappedDiagrams));
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
		case RSAToPapyrusParametersPackage.CONFIG__CONVERT_OPAQUE_EXPRESSION_TO_LITERAL_STRING:
			return isConvertOpaqueExpressionToLiteralString();
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_PROFILES_AND_STEREOTYPES:
			return isRemoveUnmappedProfilesAndStereotypes();
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_ANNOTATIONS:
			return isRemoveUnmappedAnnotations();
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_DIAGRAMS:
			return isRemoveUnmappedDiagrams();
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
		case RSAToPapyrusParametersPackage.CONFIG__CONVERT_OPAQUE_EXPRESSION_TO_LITERAL_STRING:
			setConvertOpaqueExpressionToLiteralString((Boolean) newValue);
			return;
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_PROFILES_AND_STEREOTYPES:
			setRemoveUnmappedProfilesAndStereotypes((Boolean) newValue);
			return;
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_ANNOTATIONS:
			setRemoveUnmappedAnnotations((Boolean) newValue);
			return;
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_DIAGRAMS:
			setRemoveUnmappedDiagrams((Boolean) newValue);
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
		case RSAToPapyrusParametersPackage.CONFIG__CONVERT_OPAQUE_EXPRESSION_TO_LITERAL_STRING:
			setConvertOpaqueExpressionToLiteralString(CONVERT_OPAQUE_EXPRESSION_TO_LITERAL_STRING_EDEFAULT);
			return;
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_PROFILES_AND_STEREOTYPES:
			setRemoveUnmappedProfilesAndStereotypes(REMOVE_UNMAPPED_PROFILES_AND_STEREOTYPES_EDEFAULT);
			return;
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_ANNOTATIONS:
			setRemoveUnmappedAnnotations(REMOVE_UNMAPPED_ANNOTATIONS_EDEFAULT);
			return;
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_DIAGRAMS:
			setRemoveUnmappedDiagrams(REMOVE_UNMAPPED_DIAGRAMS_EDEFAULT);
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
		case RSAToPapyrusParametersPackage.CONFIG__CONVERT_OPAQUE_EXPRESSION_TO_LITERAL_STRING:
			return convertOpaqueExpressionToLiteralString != CONVERT_OPAQUE_EXPRESSION_TO_LITERAL_STRING_EDEFAULT;
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_PROFILES_AND_STEREOTYPES:
			return removeUnmappedProfilesAndStereotypes != REMOVE_UNMAPPED_PROFILES_AND_STEREOTYPES_EDEFAULT;
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_ANNOTATIONS:
			return removeUnmappedAnnotations != REMOVE_UNMAPPED_ANNOTATIONS_EDEFAULT;
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_DIAGRAMS:
			return removeUnmappedDiagrams != REMOVE_UNMAPPED_DIAGRAMS_EDEFAULT;
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
		result.append(" (convertOpaqueExpressionToLiteralString: ");
		result.append(convertOpaqueExpressionToLiteralString);
		result.append(", removeUnmappedProfilesAndStereotypes: ");
		result.append(removeUnmappedProfilesAndStereotypes);
		result.append(", removeUnmappedAnnotations: ");
		result.append(removeUnmappedAnnotations);
		result.append(", removeUnmappedDiagrams: ");
		result.append(removeUnmappedDiagrams);
		result.append(')');
		return result.toString();
	}

} // ConfigImpl
