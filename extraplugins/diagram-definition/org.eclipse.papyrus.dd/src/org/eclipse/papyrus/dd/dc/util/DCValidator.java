/**
 * Copyright (c) 2014 CEA LIST.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.dd.dc.util;

import java.awt.Color;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.papyrus.dd.dc.*;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc
 * -->
 * 
 * @see org.eclipse.papyrus.dd.dc.DCPackage
 * @generated
 */
public class DCValidator extends EObjectValidator {

	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final DCValidator INSTANCE = new DCValidator();

	/**
	 * A constant for the
	 * {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of
	 * diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes}
	 * from this package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.papyrus.dd.dc";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Non Negative Dimension' of 'Dimension'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DIMENSION__NON_NEGATIVE_DIMENSION = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Non Negative Size' of 'Bounds'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int BOUNDS__NON_NEGATIVE_SIZE = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for
	 * additional hand written constants. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for
	 * additional hand written constants in a derived class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Delegates evaluation of the given invariant expression against the object
	 * in the given context. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static boolean validate(EClass eClass, EObject eObject,
			DiagnosticChain diagnostics, Map<Object, Object> context,
			String validationDelegate, EOperation invariant, String expression,
			int severity, String source, int code) {
		return EObjectValidator.validate(eClass, eObject, diagnostics, context,
				validationDelegate, invariant, expression, severity, source,
				code);
	}

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public DCValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return DCPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the
	 * model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
		case DCPackage.POINT:
			return validatePoint((Point) value, diagnostics, context);
		case DCPackage.DIMENSION:
			return validateDimension((Dimension) value, diagnostics, context);
		case DCPackage.BOUNDS:
			return validateBounds((Bounds) value, diagnostics, context);
		case DCPackage.KNOWN_COLOR:
			return validateKnownColor((KnownColor) value, diagnostics, context);
		case DCPackage.ALIGNMENT_KIND:
			return validateAlignmentKind((AlignmentKind) value, diagnostics,
					context);
		case DCPackage.BOOLEAN:
			return validateBoolean((Boolean) value, diagnostics, context);
		case DCPackage.INTEGER:
			return validateInteger((Integer) value, diagnostics, context);
		case DCPackage.REAL:
			return validateReal((Double) value, diagnostics, context);
		case DCPackage.STRING:
			return validateString((String) value, diagnostics, context);
		case DCPackage.COLOR:
			return validateColor((Color) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePoint(Point point, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(point, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDimension(Dimension dimension,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dimension, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dimension,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dimension, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dimension,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(dimension,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dimension, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dimension, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dimension, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dimension, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateDimension_nonNegativeDimension(dimension,
					diagnostics, context);
		return result;
	}

	/**
	 * Validates the nonNegativeDimension constraint of '<em>Dimension</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDimension_nonNegativeDimension(Dimension dimension,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dimension.nonNegativeDimension(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBounds(Bounds bounds, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bounds, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(bounds,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(bounds, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(bounds, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(bounds,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(bounds, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(bounds, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(bounds, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(bounds, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBounds_nonNegativeSize(bounds, diagnostics,
					context);
		return result;
	}

	/**
	 * Validates the nonNegativeSize constraint of '<em>Bounds</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBounds_nonNegativeSize(Bounds bounds,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bounds.nonNegativeSize(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateKnownColor(KnownColor knownColor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAlignmentKind(AlignmentKind alignmentKind,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBoolean(boolean boolean_,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateInteger(int integer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateReal(double real, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateString(String string, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateColor(Color color, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this
	 * validator's diagnostics. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to
		// this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} // DCValidator
