/**
 * Copyright (c) 2014 Christian W. Damus and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 */
package org.eclipse.papyrus.uml.decoratormodel.profileExternalization.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.papyrus.uml.decoratormodel.profileExternalization.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ProfileExternalizationPackage
 * @generated
 */
public class ProfileExternalizationValidator extends EObjectValidator
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final ProfileExternalizationValidator INSTANCE = new ProfileExternalizationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.papyrus.uml.decoratormodel.profileExternalization"; //$NON-NLS-1$

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ProfileExternalizationValidator()
	{
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EPackage getEPackage()
	{
		return ProfileExternalizationPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		switch (classifierID)
		{
		case ProfileExternalizationPackage.APPLY_PROFILES:
			return validateApplyProfiles((ApplyProfiles) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateApplyProfiles(ApplyProfiles applyProfiles, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(applyProfiles, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(applyProfiles, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(applyProfiles, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(applyProfiles, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(applyProfiles, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(applyProfiles, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(applyProfiles, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(applyProfiles, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(applyProfiles, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateApplyProfiles_suppliers_are_packages(applyProfiles, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateApplyProfiles_clients_are_packages(applyProfiles, diagnostics, context);
		}
		return result;
	}

	/**
	 * The cached validation expression for the suppliers_are_packages constraint of '<em>Apply Profiles</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static final String APPLY_PROFILES__SUPPLIERS_ARE_PACKAGES__EEXPRESSION = "base_Dependency.supplier->forAll(oclIsKindOf(uml::Package))"; //$NON-NLS-1$

	/**
	 * Validates the suppliers_are_packages constraint of '<em>Apply Profiles</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateApplyProfiles_suppliers_are_packages(ApplyProfiles applyProfiles, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate(ProfileExternalizationPackage.Literals.APPLY_PROFILES,
				applyProfiles,
				diagnostics,
				context, "http://www.eclipse.org/emf/2002/Ecore/OCL", //$NON-NLS-1$
				"suppliers_are_packages", //$NON-NLS-1$
				APPLY_PROFILES__SUPPLIERS_ARE_PACKAGES__EEXPRESSION,
				Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * The cached validation expression for the clients_are_packages constraint of '<em>Apply Profiles</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static final String APPLY_PROFILES__CLIENTS_ARE_PACKAGES__EEXPRESSION = "base_Dependency.client->forAll(oclIsKindOf(uml::Package))"; //$NON-NLS-1$

	/**
	 * Validates the clients_are_packages constraint of '<em>Apply Profiles</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateApplyProfiles_clients_are_packages(ApplyProfiles applyProfiles, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate(ProfileExternalizationPackage.Literals.APPLY_PROFILES,
				applyProfiles,
				diagnostics,
				context, "http://www.eclipse.org/emf/2002/Ecore/OCL", //$NON-NLS-1$
				"clients_are_packages", //$NON-NLS-1$
				APPLY_PROFILES__CLIENTS_ARE_PACKAGES__EEXPRESSION,
				Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} // ProfileExternalizationValidator
