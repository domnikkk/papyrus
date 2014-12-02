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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.MappingParameters;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.ConfigImpl#getMappingParameters <em>Mapping Parameters</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.ConfigImpl#getMaxThreads <em>Max Threads</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.ConfigImpl#isRemoveUnmappedDiagrams <em>Remove Unmapped Diagrams</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.ConfigImpl#isConvertOpaqueExpressionToLiteralString <em>Convert Opaque Expression To Literal String</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.ConfigImpl#isRemoveUnmappedProfilesAndStereotypes <em>Remove Unmapped Profiles And Stereotypes</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.ConfigImpl#isRemoveUnmappedAnnotations <em>Remove Unmapped Annotations</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.ConfigImpl#isAlwaysAcceptSuggestedMappings <em>Always Accept Suggested Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigImpl extends MinimalEObjectImpl.Container implements Config {
	/**
	 * The cached value of the '{@link #getMappingParameters() <em>Mapping Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getMappingParameters()
	 * @generated
	 * @ordered
	 */
	protected MappingParameters mappingParameters;

	/**
	 * The default value of the '{@link #getMaxThreads() <em>Max Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getMaxThreads()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_THREADS_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getMaxThreads() <em>Max Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getMaxThreads()
	 * @generated
	 * @ordered
	 */
	protected int maxThreads = MAX_THREADS_EDEFAULT;

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
	 * The default value of the '{@link #isAlwaysAcceptSuggestedMappings() <em>Always Accept Suggested Mappings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isAlwaysAcceptSuggestedMappings()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALWAYS_ACCEPT_SUGGESTED_MAPPINGS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAlwaysAcceptSuggestedMappings() <em>Always Accept Suggested Mappings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isAlwaysAcceptSuggestedMappings()
	 * @generated
	 * @ordered
	 */
	protected boolean alwaysAcceptSuggestedMappings = ALWAYS_ACCEPT_SUGGESTED_MAPPINGS_EDEFAULT;

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
	public MappingParameters getMappingParameters() {
		return mappingParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetMappingParameters(MappingParameters newMappingParameters, NotificationChain msgs) {
		MappingParameters oldMappingParameters = mappingParameters;
		mappingParameters = newMappingParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSAToPapyrusParametersPackage.CONFIG__MAPPING_PARAMETERS, oldMappingParameters, newMappingParameters);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setMappingParameters(MappingParameters newMappingParameters) {
		if (newMappingParameters != mappingParameters) {
			NotificationChain msgs = null;
			if (mappingParameters != null) {
				msgs = ((InternalEObject) mappingParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSAToPapyrusParametersPackage.CONFIG__MAPPING_PARAMETERS, null, msgs);
			}
			if (newMappingParameters != null) {
				msgs = ((InternalEObject) newMappingParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSAToPapyrusParametersPackage.CONFIG__MAPPING_PARAMETERS, null, msgs);
			}
			msgs = basicSetMappingParameters(newMappingParameters, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, RSAToPapyrusParametersPackage.CONFIG__MAPPING_PARAMETERS, newMappingParameters, newMappingParameters));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int getMaxThreads() {
		return maxThreads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setMaxThreads(int newMaxThreads) {
		int oldMaxThreads = maxThreads;
		maxThreads = newMaxThreads;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, RSAToPapyrusParametersPackage.CONFIG__MAX_THREADS, oldMaxThreads, maxThreads));
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
	public boolean isAlwaysAcceptSuggestedMappings() {
		return alwaysAcceptSuggestedMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setAlwaysAcceptSuggestedMappings(boolean newAlwaysAcceptSuggestedMappings) {
		boolean oldAlwaysAcceptSuggestedMappings = alwaysAcceptSuggestedMappings;
		alwaysAcceptSuggestedMappings = newAlwaysAcceptSuggestedMappings;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, RSAToPapyrusParametersPackage.CONFIG__ALWAYS_ACCEPT_SUGGESTED_MAPPINGS, oldAlwaysAcceptSuggestedMappings, alwaysAcceptSuggestedMappings));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RSAToPapyrusParametersPackage.CONFIG__MAPPING_PARAMETERS:
			return basicSetMappingParameters(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
		case RSAToPapyrusParametersPackage.CONFIG__MAPPING_PARAMETERS:
			return getMappingParameters();
		case RSAToPapyrusParametersPackage.CONFIG__MAX_THREADS:
			return getMaxThreads();
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_DIAGRAMS:
			return isRemoveUnmappedDiagrams();
		case RSAToPapyrusParametersPackage.CONFIG__CONVERT_OPAQUE_EXPRESSION_TO_LITERAL_STRING:
			return isConvertOpaqueExpressionToLiteralString();
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_PROFILES_AND_STEREOTYPES:
			return isRemoveUnmappedProfilesAndStereotypes();
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_ANNOTATIONS:
			return isRemoveUnmappedAnnotations();
		case RSAToPapyrusParametersPackage.CONFIG__ALWAYS_ACCEPT_SUGGESTED_MAPPINGS:
			return isAlwaysAcceptSuggestedMappings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RSAToPapyrusParametersPackage.CONFIG__MAPPING_PARAMETERS:
			setMappingParameters((MappingParameters) newValue);
			return;
		case RSAToPapyrusParametersPackage.CONFIG__MAX_THREADS:
			setMaxThreads((Integer) newValue);
			return;
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_DIAGRAMS:
			setRemoveUnmappedDiagrams((Boolean) newValue);
			return;
		case RSAToPapyrusParametersPackage.CONFIG__CONVERT_OPAQUE_EXPRESSION_TO_LITERAL_STRING:
			setConvertOpaqueExpressionToLiteralString((Boolean) newValue);
			return;
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_PROFILES_AND_STEREOTYPES:
			setRemoveUnmappedProfilesAndStereotypes((Boolean) newValue);
			return;
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_ANNOTATIONS:
			setRemoveUnmappedAnnotations((Boolean) newValue);
			return;
		case RSAToPapyrusParametersPackage.CONFIG__ALWAYS_ACCEPT_SUGGESTED_MAPPINGS:
			setAlwaysAcceptSuggestedMappings((Boolean) newValue);
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
		case RSAToPapyrusParametersPackage.CONFIG__MAPPING_PARAMETERS:
			setMappingParameters((MappingParameters) null);
			return;
		case RSAToPapyrusParametersPackage.CONFIG__MAX_THREADS:
			setMaxThreads(MAX_THREADS_EDEFAULT);
			return;
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_DIAGRAMS:
			setRemoveUnmappedDiagrams(REMOVE_UNMAPPED_DIAGRAMS_EDEFAULT);
			return;
		case RSAToPapyrusParametersPackage.CONFIG__CONVERT_OPAQUE_EXPRESSION_TO_LITERAL_STRING:
			setConvertOpaqueExpressionToLiteralString(CONVERT_OPAQUE_EXPRESSION_TO_LITERAL_STRING_EDEFAULT);
			return;
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_PROFILES_AND_STEREOTYPES:
			setRemoveUnmappedProfilesAndStereotypes(REMOVE_UNMAPPED_PROFILES_AND_STEREOTYPES_EDEFAULT);
			return;
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_ANNOTATIONS:
			setRemoveUnmappedAnnotations(REMOVE_UNMAPPED_ANNOTATIONS_EDEFAULT);
			return;
		case RSAToPapyrusParametersPackage.CONFIG__ALWAYS_ACCEPT_SUGGESTED_MAPPINGS:
			setAlwaysAcceptSuggestedMappings(ALWAYS_ACCEPT_SUGGESTED_MAPPINGS_EDEFAULT);
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
		case RSAToPapyrusParametersPackage.CONFIG__MAPPING_PARAMETERS:
			return mappingParameters != null;
		case RSAToPapyrusParametersPackage.CONFIG__MAX_THREADS:
			return maxThreads != MAX_THREADS_EDEFAULT;
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_DIAGRAMS:
			return removeUnmappedDiagrams != REMOVE_UNMAPPED_DIAGRAMS_EDEFAULT;
		case RSAToPapyrusParametersPackage.CONFIG__CONVERT_OPAQUE_EXPRESSION_TO_LITERAL_STRING:
			return convertOpaqueExpressionToLiteralString != CONVERT_OPAQUE_EXPRESSION_TO_LITERAL_STRING_EDEFAULT;
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_PROFILES_AND_STEREOTYPES:
			return removeUnmappedProfilesAndStereotypes != REMOVE_UNMAPPED_PROFILES_AND_STEREOTYPES_EDEFAULT;
		case RSAToPapyrusParametersPackage.CONFIG__REMOVE_UNMAPPED_ANNOTATIONS:
			return removeUnmappedAnnotations != REMOVE_UNMAPPED_ANNOTATIONS_EDEFAULT;
		case RSAToPapyrusParametersPackage.CONFIG__ALWAYS_ACCEPT_SUGGESTED_MAPPINGS:
			return alwaysAcceptSuggestedMappings != ALWAYS_ACCEPT_SUGGESTED_MAPPINGS_EDEFAULT;
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
		result.append(" (maxThreads: ");
		result.append(maxThreads);
		result.append(", removeUnmappedDiagrams: ");
		result.append(removeUnmappedDiagrams);
		result.append(", convertOpaqueExpressionToLiteralString: ");
		result.append(convertOpaqueExpressionToLiteralString);
		result.append(", removeUnmappedProfilesAndStereotypes: ");
		result.append(removeUnmappedProfilesAndStereotypes);
		result.append(", removeUnmappedAnnotations: ");
		result.append(removeUnmappedAnnotations);
		result.append(", alwaysAcceptSuggestedMappings: ");
		result.append(alwaysAcceptSuggestedMappings);
		result.append(')');
		return result.toString();
	}

} // ConfigImpl
